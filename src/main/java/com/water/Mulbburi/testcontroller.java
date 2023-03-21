package com.water.Mulbburi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;


=======
import org.springframework.web.servlet.view.RedirectView;
>>>>>>> 050701942f800ee90f0038deb4fd3a95ff95d049

@Controller
public class testcontroller {
	
<<<<<<< HEAD
	@GetMapping("/*")
	public String test() {
		return "main/01.purchase";
=======
	@GetMapping("/")
	public String test2() {
		return "/main/01.purchase";
>>>>>>> 050701942f800ee90f0038deb4fd3a95ff95d049
	}
	
	
	
	
}
