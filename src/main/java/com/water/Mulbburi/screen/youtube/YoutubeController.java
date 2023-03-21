package com.water.Mulbburi.screen.youtube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class YoutubeController {
	
	/* 유투브 목록 조회 화면 */
	@GetMapping("/youtube")
	public String youtubeList() {
		return "/screen/08-2. youtubeControll";
	}
	
	/* 저장할 유투브 목록 삽입 */
	@PostMapping("regist/youtube")
	public String insertYoutube(@ModelAttribute YoutubeDTO youtubeDTO) {
		
		
		
		
		return "redirect:/";
	}

//	/* 저장한 유투브 주소 가져오기 */
//	@GetMapping("/")
	
}
