package com.water.Mulbburi.screen.youtube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YoutubeController {
	
	@GetMapping("/youtube")
	public String youtube() {
		return "/screen/08-2. youtubeControll";
	}
}
