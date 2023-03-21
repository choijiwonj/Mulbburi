package com.water.Mulbburi.community.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.water.Mulbburi.community.service.CommunityService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/community")
public class CommunityController {
	
	@Value("${image.image-dir}")
	private String IMAGE_DTR;
	
	private final CommunityService communityService;
	private final MessageSourceAccessor messageSourceAccessor;
	
	

	@GetMapping("/regist")
	public String regist() {
		return "community/comWrite";
	}
	
	
	
	
	
	
	@GetMapping("/main")
	public String main() {
		return "community/communityMain";
	}
	

}
