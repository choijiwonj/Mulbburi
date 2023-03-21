package com.water.Mulbburi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class testcontroller {
	
	@GetMapping("/*")
	public String test() {
		return "main/01.purchase";
	}
	
//	@GetMapping(".siren")
//	public String test2{
//		return 
//	}
}
