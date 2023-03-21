package com.water.Mulbburi.member.controller;

import java.util.Map;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.water.Mulbburi.member.dto.MemberDTO;
import com.water.Mulbburi.member.exception.MemberRegistException;
import com.water.Mulbburi.member.service.AuthenticationService;
import com.water.Mulbburi.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
	
	private final PasswordEncoder passwordEncoder;
    private final MessageSourceAccessor messageSourceAccessor;
    private final MemberService memberService;
    private final AuthenticationService authenticationService;

    public MemberController(MessageSourceAccessor messageSourceAccessor, MemberService memberService, PasswordEncoder passwordEncoder, AuthenticationService authenticationService) {
        this.messageSourceAccessor = messageSourceAccessor;
        this.memberService = memberService;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
    }
	
	/* 로그인 페이지 이동 */
	@GetMapping("/login/login")
	public String goLogin() {
		
		return "member/login/login";
	}
	
	/* 로그인 실패 시 */
	@PostMapping("/loginfail")
	public String loginFailed() {
		
		return "member/login/loginFalse";
	}
	
	/* 아이디 찾기 페이지 이동 */
	@GetMapping("/login/idSearch")
	public String showIdSearch() {
		
		return "member/login/idsearch";
	}
	
	/* 아이디 찾기 */
	@PostMapping("/login/idSearch")
	public String doFindIdSearch(@ModelAttribute MemberDTO member) {
		
		String result = "";
			
		if(memberService.findLoginId(member) != null) {
			
			result = "member/login/idSuccess";
		} else {
			
			result = "member/login/idFalse";
		}
		
		return result;

	}

	/* 회원가입 접근페이지 이동 */
	@GetMapping("/regist/registOpen")
	public String registOpen() {
		
		return "member/regist/registOpen";
	}
	
	/* 개인회원 회원가입 페이지 이동 */
	@GetMapping("/regist/ConMembership")
	public String Conmembership() {
		
		return "member/regist/ConMembership";
	}
	
	/* 사업자회원 회원가입 페이지 이동 */
	@GetMapping("/regist/SelMembership")
	public String Selmembership() {
		
		return "member/regist/SelMembership";
	}
	
	/* 아이디 중복체크 */
	@PostMapping("/idDupCheck")
	public ResponseEntity<String> checkDuplication(@RequestBody MemberDTO member) {
		
		String result = "사용 가능한 아이디입니다.";
		log.info("[MemberController] Request Check ID : {}", member.getMemberId());
		
		if(memberService.selectMemberById(member.getMemberId())) {
			log.info("[MemberController] Already Exist");
    		result = "중복 된 아이디가 존재합니다.";
		}
		
		return ResponseEntity.ok(result);
	}
	
//	//아이디 중복검사
//	@RequestMapping(value = "/member/idCheck", method = RequestMethod.POST)
//	@ResponseBody
//	public String memberIdCheck(String memberId) throws Exception {
//		
//		int result = memberService.idCheck(memberId);
//		
//		if(result != 0) {
//			
//			return "fail";
//		} else {
//			
//			return "success";
//		}
//	}
	
	/* 구매자 회원 가입 */
	@PostMapping("/regist/ConMembership")
	public String registConMember(@ModelAttribute MemberDTO member,
			@RequestParam String emailId, @RequestParam String domain,
			@RequestParam String postCode, @RequestParam String bsAddress, @RequestParam String dtAddress,
			RedirectAttributes rttr) throws MemberRegistException {
		
		String email = emailId + "$" + "@" + "$" + domain;
		member.setEmail(email);
		member.setPostCode(postCode);
		member.setBsAddress(bsAddress);
		member.setDtAddress(dtAddress);
		
		
		log.info("[MemberController] registMember request Member : " + member);
		
		member.setMemberPwd(passwordEncoder.encode(member.getMemberPwd()));
		
		memberService.registConMember(member);
		
		rttr.addFlashAttribute("message", messageSourceAccessor.getMessage("member.regist"));
		
		
		
		return "redirect:/";
	}
	
	/* 판매자 회원 가입 */
	@PostMapping("/regist/SelMembership")
	public String registSelMember(@ModelAttribute MemberDTO member,
			@RequestParam String emailId, @RequestParam String domain,
			@RequestParam String postCode, @RequestParam String bsAddress, @RequestParam String dtAddress,
			RedirectAttributes rttr) throws MemberRegistException {
		
		String email = emailId + "$" + "@" + "$" + domain;
		member.setEmail(email);
		member.setPostCode(postCode);
		member.setBsAddress(bsAddress);
		member.setDtAddress(dtAddress);
		
		
		log.info("[MemberController] registMember request Member : " + member);
		
		member.setMemberPwd(passwordEncoder.encode(member.getMemberPwd()));
		
		memberService.registSelMember(member);
		
		rttr.addFlashAttribute("message", messageSourceAccessor.getMessage("member.regist"));
		
		
		
		return "redirect:/";
	}
	
	
	/* 마이페이지 페이지 이동 */
	@GetMapping("/mypage/mypageMain")
	public String mypageMain() {
		
		return "member/mypage/mypageMain";
	}
	
	/* 배송확인 페이지 이동 */
	@GetMapping("/mypage/delivery")
	public String delivery() {
		
		return "member/mypage/delivery";
	}
	
	/* 교환신청 페이지 이동 */
	@GetMapping("/mypage/exchange")
	public String exchange() {
		
		return "member/mypage/exchange";
	}
	
	/* 환불신청 페이지 이동 */
	@GetMapping("/mypage/refund")
	public String refund() {
		
		return "member/mypage/refund";
	}
	
	/* 내정보수정 페이지 이동 */
	@GetMapping("/mypage/infoModify")
	public String infoModify() {
		
		return "member/mypage/infoModify";
	}
	
	/* 내정보수정 접근 페이지 이동 */
	@GetMapping("/mypage/infoModifyJoin")
	public String infoModifyJoin() {
		
		return "member/mypage/infoModifyJoin";
	}
	
	/* 좋아요 페이지 이동 */
	@GetMapping("/mypage/like")
	public String like() {
		
		return "member/mypage/like";
	}
	
	/* 게시글내역 페이지 이동 */
	@GetMapping("/mypage/myBoard")
	public String myBoard() {
		
		return "member/mypage/myBoard";
	}
	
	/* 주문상세내역 페이지 이동 */
	@GetMapping("/mypage/orderDetail")
	public String orderDetail() {
		
		return "member/mypage/orderDetail";
	}
	
	/* 주문내역 페이지 이동 */
	@GetMapping("/mypage/orderList")
	public String orderList() {
		
		return "member/mypage/orderList";
	}
	
	/* 회원탈퇴 페이지 이동 */
	@GetMapping("/mypage/quit")
	public String quit() {
		
		return "member/mypage/quit";
	}
	
	
	
	
	
	
	
	
	
	
	
}
