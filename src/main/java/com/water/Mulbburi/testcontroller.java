package com.water.Mulbburi;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.view.RedirectView;

@Controller
public class testcontroller {


	@GetMapping("/*")
	public String test() {
		return "main/01.purchase";
	}
	/*
	 * @GetMapping("/") public String test2() { return "/main/01.purchase"; }
	 */
	
	
	
	
	/*
	 * @GetMapping("/*") public String test2() { return "screen/08. screenControll";
	 * }
	 */
}
<<<<<<< HEAD
=======
=======
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6


<<<<<<< HEAD
	@GetMapping("/*")
	public String test() {
		return "screen/08. screenControll";
	}
}
>>>>>>> a7c0fc094262de0c8c17300c32766b27b1990ec5
=======

>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
