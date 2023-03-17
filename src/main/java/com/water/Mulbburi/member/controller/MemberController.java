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
	@GetMapping("/regist/ConMembership")
	public String Conmembership() {
		
		return "member/regist/ConMembership";
	}
	
	/* 사업자회원 회원가입 페이지 이동 */
	@GetMapping("/regist/SelMembership")
	public String Selmembership() {
		
		return "member/regist/SelMembership";
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
