package com.water.Mulbburi;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.view.RedirectView;
=======
>>>>>>> 41ac649f624e75228a47e9e506a339d25199d482

@Controller
public class testcontroller {
	
<<<<<<< HEAD

	@GetMapping("/*")
	public String test() {
		return "main/01.purchase";
	}
	/*
	 * @GetMapping("/") public String test2() { return "/main/01.purchase"; }
	 */
	
	
	
	
=======
	@GetMapping("/*")
	public String test() {
		return "main/01-1.purchaseLogin";
	}
>>>>>>> 41ac649f624e75228a47e9e506a339d25199d482
}
