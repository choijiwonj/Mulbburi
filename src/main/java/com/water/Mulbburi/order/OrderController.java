package com.water.Mulbburi.order;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.water.Mulbburi.shoppingcart.DTO.cartDTO;
import com.water.Mulbburi.shoppingcart.service.cartService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	private cartService cartService;
	
	public OrderController(cartService cartService) {
		this.cartService = cartService;
	}

	@GetMapping("/order")
	public String getOrder(Model model, @ModelAttribute("cartList") List<cartDTO> cartList) {
		model.addAttribute("cartList",cartList);
		return "order/order";
	}
	
	
}
