package com.water.Mulbburi.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("/cart/{memberNo}")
	public String cartPageGet(@PathVariable("memberNo") long memberNo, Model model) {
		
		model.addAttribute("cartInfo", cartService.getCartList(memberNo));
		
		return "shoppingcart/shoppingcart";
	}
	
	@PostMapping("/delete")
	public String deleteCartPOST(cartDTO cart) {
		
		cartService.deleteCart(cart.getPcNo());
		
		return "redirect:/cart/" + cart.getMemberNo();
	}
	
}
