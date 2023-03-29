package com.water.Mulbburi.member.controller;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.water.Mulbburi.member.service.MailService;
import com.water.Mulbburi.member.service.MemberService;
import com.water.Mulbburi.member.service.RedisUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
	
	private final PasswordEncoder passwordEncoder;
    private final MessageSourceAccessor messageSourceAccessor;
    private final MemberService memberService;
    private final AuthenticationService authenticationService;
    private final MailService mailService;
    private final RedisUtil redisUtil;

    public MemberController(MessageSourceAccessor messageSourceAccessor, MemberService memberService, PasswordEncoder passwordEncoder, AuthenticationService authenticationService, MailService mailService,RedisUtil redisUtil) {
        this.messageSourceAccessor = messageSourceAccessor;
        this.memberService = memberService;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
        this.mailService = mailService;
        this.redisUtil = redisUtil;
    }
	
	/* 로그인 페이지 이동 */
	@GetMapping("/login/login")
	public String goLogin() {
		
		return "member/login/login";
	}
	
	/* 로그인 실패 시 */
	@PostMapping("/login/loginFalse")
	public String loginFailed() {
		
		return "member/login/loginFalse";
	}
	
	/* 아이디 찾기 페이지 이동 */
	@GetMapping("/login/idSearch")
	public String showIdSearch(@ModelAttribute MemberDTO member, Model model) {
		
		String memberId = member.getMemberId();
		
		model.addAttribute("memberId", memberId);
		
		return "member/login/idsearch";
	}
	
	/* 아이디 찾기 */
	@PostMapping("/login/idSearch")
	public String doFindIdSearch(@ModelAttribute MemberDTO member, Model model) {
		
//		System.out.println("member : " + member);
		
		String memberId = memberService.findLoginId(member);
		
		model.addAttribute("memberId", memberId);
		
//		System.out.println("model : " + model );
		
		String result = "";
			
		if(memberId != null) {
			
			result = "member/login/idSuccess";
		} else {
			
			result = "member/login/idFalse";
		}
		
		return result;

	}
	
	/* 비밀번호 찾기 */
	@GetMapping("/login/pwdSearch")
	public String showPwdSearch() {
		
		
		
		return "member/login/pwdSearch";
	}
	
	/* 이메일 전송 */
	@PostMapping("/mailsend")
	@ResponseBody
	String mailConfirm(@RequestParam(value="emailId", required=false) String emailId, @RequestParam(value="domain", required=false) String domain) throws Exception {
		
//		System.out.println("emailId :" + emailId);
//		System.out.println("domain :" + domain);
		
		String email = emailId + "@" + domain;
		
//		System.out.println("email :" + email);
		
		String code = mailService.sendSimpleMessage(email);
//		System.out.println("인증코드 : " + code);
		
		
		
		return code;
	}
	
	/* 비밀번호 찾기 구현 */
	@PostMapping("/login/pwdSearch")
//	@ResponseBody
	public String doFindPwdSearch(@ModelAttribute MemberDTO member, Model model,
			 @RequestParam(required=false) String cerNo,
			 @RequestParam(value="emailId", required=false) String emailId, @RequestParam(value="domain", required=false) String domain) throws Exception {
		
//		System.out.println("member : " + member);
		
		String email = emailId + "@" + domain;
		String rescode = redisUtil.getData(email);
		
//		System.out.println("rescode : " + rescode);
		String memberPwd = memberService.findLoginPwd(member);
		
		cerNo = member.getCerNo();
		
//		System.out.println("cerNo : " + cerNo);
		
		model.addAttribute("memberPwd", memberPwd);
		
		String result = "";
		
		if(rescode.equals(cerNo)) {
			result = "member/login/pwdReset";
		} else  {
			result = "member/login/pwdFalse";
		}
		
		return result;
	}
	
	/* 비밀번호 재설정 */
	@GetMapping("/login/pwdReset")
	public String pwdReset() {
		
		return "/member/login/pwdReset";
	}
	
	@PostMapping("/login/pwdReset")
//	@ResponseBody
	public String doPwdReset(@ModelAttribute MemberDTO member,@RequestParam(required=false, value="memberId") String memberId, 
			@RequestParam(required=false, value="memberPwd") String memberPwd,
			RedirectAttributes rttr) {
		
		System.out.println("memberID :" + memberId);
		System.out.println("memberPwd :" + memberPwd);
		
		String rememberPwd = passwordEncoder.encode(memberPwd);
		
		System.out.println("바뀐memberPwd :" + memberPwd);
		
		member.setMemberId(memberId);
		member.setMemberPwd(rememberPwd);
		
		memberService.pwdModifyMember(member);
		
		rttr.addFlashAttribute("message", messageSourceAccessor.getMessage("member.modify"));
		
		return "member/login/login";
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
	
	/* 구매자 회원 가입 */
	@PostMapping("/regist/ConMembership")
	public String registConMember(@ModelAttribute MemberDTO member,
			@RequestParam String emailId, @RequestParam String domain,
			@RequestParam String postCode, @RequestParam String bsAddress, @RequestParam String dtAddress,
			RedirectAttributes rttr) throws MemberRegistException {
		
		String email = emailId + "@" + domain;
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
		
		String email = emailId + "@" + domain;
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
