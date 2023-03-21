package com.water.Mulbburi.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("cartController")
public class shoppingcartController {

	@Autowired
	private cartService cartService;
	
	@PostMapping("/cart/add")
	@ResponseBody
	public String addCartPOST(cartDTO cart) {
		int result = cartService.addCart(cart);
		
		return result + "";
	}
	
	@GetMapping("/cart/{memberNo}")
	public String cartPageGet(@PathVariable("memberNo") int memberNo, Model model) {
		
		model.addAttribute("cartInfo", cartService.getCartList(memberNo));
		
		return "/cart";
		
	}
	
	@PostMapping("/cart/update")
	public String updateCartPost(cartDTO cart) {
		
		cartService.modifyCount(cart);
		
		return "redirect:/cart/" + cart.getMemberNo();
		
	}
}
