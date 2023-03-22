package com.water.Mulbburi.screen.banner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BannerController {
	
	@GetMapping("/banner")
	public String banner() {
		return "/screen/08-1. bannerControll";
	}
}
