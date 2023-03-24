package com.water.Mulbburi.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.water.Mulbburi.member.dto.MemberDTO;
import com.water.Mulbburi.shoppingcart.DTO.cartDTO;
import com.water.Mulbburi.shoppingcart.service.cartService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/cart")
public class shoppingcartController {

	private final cartService cartService;
	
	public shoppingcartController(cartService cartService) {
		this.cartService = cartService;
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addCartPOST(cartDTO cart, HttpServletRequest request) {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("member");
		if(dto == null) {
			return "5";
		}
		int result = cartService.addCart(cart);
		
		return result + "";
	}
	
	@GetMapping("/list")
	public String cartPageGet(@AuthenticationPrincipal MemberDTO member, Model model) {
		
		
		model.addAttribute("cartInfo", cartService.getCartList(member.getMemberNo()));
		System.out.println(model);
		log.info("[] : " + model);
		return "shoppingcart/cartList";
	}
	
	@PostMapping("/checkout")
	public String checkoutPost(@AuthenticationPrincipal MemberDTO member, RedirectAttributes redirectAttributes) {
		List<cartDTO> cartList = cartService.getCartList(member.getMemberNo());
		redirectAttributes.addFlashAttribute("cartList", cartList);
		System.out.println("cartList : " + cartList);
		return "redirect:/order/order.html";
	}
	
	 @PostMapping("/list/deletesbNo")
	 public ResponseEntity<String> deletesbNo(@RequestBody cartDTO deletesbNo){
	 
	 log.info("[cartController] deletesbNo : {}", deletesbNo);
	 
	 cartService.deleteCart(deletesbNo);
	 
	 return ResponseEntity.ok("상품 삭제 완료");
	 
	 }
	 
	@PostMapping("/list/updateCart")
	public ResponseEntity<String> updateCartPost(@RequestBody cartDTO updateCartPost) {
		
		log.info("[cartController] updateCart : {}", updateCartPost);
		
		cartService.modifyCount(updateCartPost);
		
		return ResponseEntity.ok("수량 변경 완료");
	}
	
	
	
}
