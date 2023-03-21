package com.water.Mulbburi.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller 
@RequestMapping("/consumer")

public class ConsumerController {
	
	@GetMapping("/main")
	public String main() {
		return "consumer/consumerMain";
	}
	
	
	
	@GetMapping("/list")
	public String list() {
		
		return "consumer/consumerList";
	}
	
	@GetMapping("/detail")
	public String detail() {
		
		return "consumer/consumerDetail";
	}

	@GetMapping("/write")
	public String write() {
		
		return "consumer/consumerWrite";
	}
	@GetMapping("/googi")
	public String googi() {
		
		return "consumer/consumerGoogi";
	}
	
	@GetMapping("/faq")
	public String faq() {
		
		return "consumer/consumerFAQ";
	}
	
	
}
