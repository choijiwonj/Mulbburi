package com.water.Mulbburi.screen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScreenController {
	
	@GetMapping("/banner")
	public String banner() {
		return "/screen/08-1. bannerControll";
	}
	
	@GetMapping("/youtube")
	public String youtube() {
		return "/screen/08-2. youtubeControll";
	}
}
