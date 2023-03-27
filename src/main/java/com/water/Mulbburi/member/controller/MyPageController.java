package com.water.Mulbburi.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.water.Mulbburi.member.dto.MemberDTO;
import com.water.Mulbburi.member.dto.MemberOrderDTO;
import com.water.Mulbburi.member.service.MyPageService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MyPageController {
	
	private final MyPageService myPageService;
	
	/* 의존성 주입 */
	public MyPageController (MyPageService myPageService) {
		this.myPageService = myPageService;	
	}
		
	/* 배송확인 페이지 이동 */
	@GetMapping("/mypage/delivery")
	public String goDelivery() {
		
		return "member/mypage/delivery";
	}
	
	@PostMapping("/mypage/delivery")
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
	public String goOrderDetail() {
		
		return "member/mypage/orderDetail";
	}
	
	@PostMapping("/mypage/orderDetail")
	public String orderDetail(@RequestParam("selectOrder") List<String> selectOrders) {
		
		System.out.println(selectOrders);
		
		return "member/mypage/orderDetail";
	}
	
	/* 주문내역 페이지 이동 */
	@GetMapping("/mypage/orderList")
	public String orderList(@RequestParam(defaultValue="1") int page, 
			@RequestParam(required=false) String searchCondition,
			@RequestParam(required=false) String searchValue,
			@AuthenticationPrincipal MemberDTO member,
			MemberOrderDTO orderDTO,
			Model model) {
			
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		Long memberNo = member.getMemberNo();
		
		
		Map<String, Object> orderListAndPaging = myPageService.selectOrderList(searchMap, page, memberNo);
		model.addAttribute("paging", orderListAndPaging.get("paging"));
		model.addAttribute("orderList", orderListAndPaging.get("orderList"));
		
		return "member/mypage/orderList";
	}
	
	
}
