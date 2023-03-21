package com.water.Mulbburi.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
	
	/* 로그인 페이지 이동 */
	@GetMapping("/login/login")
	public String goLogin() {
		
		return "member/login/login";
	}
	
	/* 아이디 찾기 페이지 이동 */
	@GetMapping("/login/idSearch")
	public String idSearch() {
		
		return "member/login/idsearch";
	}

	/* 회원가입 접근페이지 이동 */
	@GetMapping("/regist/registOpen")
	public String registOpen() {
		
		return "member/regist/registOpen";
	}
	
	/* 개인회원 회원가입 페이지 이동 */
	@GetMapping("/regist/Conmembership")
	public String Conmembership() {
		
		return "/member/regist/ConMembership";
	}
	
	/* 사업자회원 회원가입 페이지 이동 */
	@GetMapping("/regist/Selmembership")
	public String Selmembership() {
		
		return "/member/regist/SelMembership";
	}
	
	
}
