package com.water.Mulbburi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.water.Mulbburi.member.service.AuthenticationService;



@EnableWebSecurity
public class SecurityConfig {
	
	private final AuthenticationService authenticationService;
	
	public SecurityConfig(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
        return http
        		.csrf().disable()
                .authorizeRequests()
//                .antMatchers("/board/**", "/thumbnail/**", "/member/update", "/member/delete").hasRole("MEMBER")
                // 관리자만 사용 가능한 기능은 현재는 없음
                .anyRequest().permitAll()
                .and()
                    .formLogin()
                    .loginPage("/member/login/login")             
                    .defaultSuccessUrl("/")  
                    .failureForwardUrl("/member/login/loginFalse")
                    .usernameParameter("memberId")			// 아이디 파라미터명 설정
                    .passwordParameter("memberPwd")			// 패스워드 파라미터명 설정
                .and()
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                    .deleteCookies("JSESSIONID")
                    .invalidateHttpSession(true)
                    .logoutSuccessUrl("/")
                // 따라서 인가 오류 처리는 생략하였음
    			.and()
    				.build();
    }
	
	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {
		
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(authenticationService)
				.passwordEncoder(passwordEncoder())
				.and()
				.build();
	}
	
	/* 아이디 저장 */
	protected void configure(HttpSecurity http, WebSecurity web) throws Exception {
		http.authorizeRequests()
			.and()
			.rememberMe()
			.rememberMeParameter("remember")
			.tokenValiditySeconds(86400);
		
		web.httpFirewall(defaultHttpFirewall());
	}
	
	@Bean
	public HttpFirewall defaultHttpFirewall() {
		return new DefaultHttpFirewall();
	}
}

















