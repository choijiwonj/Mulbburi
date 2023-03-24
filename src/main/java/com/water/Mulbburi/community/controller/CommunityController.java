package com.water.Mulbburi.community.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;




import com.water.Mulbburi.member.dto.MemberDTO;


import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller
@RequestMapping("/community")

public class CommunityController {

	

	@GetMapping("/main")
	public String main() {
		return "community/communityMain";
	}
	
	


	}


