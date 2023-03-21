package com.water.Mulbburi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontroller {
	

	@GetMapping("/")
	public String test2() {
		return "/shoppingcart/shoppingcart";
	}
	
}
