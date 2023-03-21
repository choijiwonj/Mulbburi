package com.water.Mulbburi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class testcontroller {
	
	@GetMapping("/")
	public String test2() {
		return "/main/01.purchase";
	}
	
	
	
	
}
