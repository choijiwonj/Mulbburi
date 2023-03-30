package com.water.Mulbburi.consumer.controller;

import java.util.HashMap;


import java.util.Map;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.water.Mulbburi.consumer.dto.ConsumerDTO;
import com.water.Mulbburi.consumer.service.ConsumerService;
import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller 
@RequestMapping("/consumer")

public class ConsumerController {
	
	private final ConsumerService consumerService;
	private final MessageSourceAccessor messageSourceAccessor;
	
	public ConsumerController(ConsumerService consumerService, MessageSourceAccessor messageSourceAccessor) {
	this.consumerService = consumerService;	
	this.messageSourceAccessor = messageSourceAccessor;
	}

	@GetMapping("/main")
	public String main() {
		return "consumer/consumerMain";
	}
	
	
	
	@GetMapping("/list")
	public String list() {
		
		return "consumer/consumerList";
	}
	
	
	  @GetMapping("/detail") public String selectConsumerDetail(@RequestParam(defaultValue="1") int
			  no, Model model) {
		  
		  ConsumerDTO consumerDetail = consumerService.selectConsumerDetail(no);
			log.info("[ConsumerController] consumerDetail : {}", consumerDetail);
			
			model.addAttribute("consumer", consumerDetail);
		  
		  
		  
	  return "consumer/gongiDetail"; 
	  }
	 

	@GetMapping("/write")
	public String write() {
		
		return "consumer/consumerWrite";
	}
	@GetMapping("/googi")
	public String googi(@RequestParam(defaultValue="1") int page, 
			@RequestParam(required=false) String searchCondition, 
			@RequestParam(required=false) String searchValue,
			Model model) {
		
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		
		Map<String, Object> consumerListAndPaging = consumerService.selectConsumerList(searchMap, page);
		model.addAttribute("paging", consumerListAndPaging.get("paging"));
		model.addAttribute("consumerList", consumerListAndPaging.get("consumerList"));
		
		return "consumer/consumerGoogi";
	}
	
	@GetMapping("/regist")
	public String regist() {
		
		return "consumer/announcementRegist";
		
	}
	/* 게시글 등록 컨트롤러 핸들러 메소드 */
	@PostMapping("/regist")
	public String registConsumer(ConsumerDTO consumer,@AuthenticationPrincipal MemberDTO member,
			RedirectAttributes rttr ) {
		consumer.setWriter(member);
		log.info("[ConsumerController] consumer : {}", consumer);
		
		consumerService.registConsumer(consumer);
		
		rttr.addFlashAttribute("messages", messageSourceAccessor.getMessage("consumer.regist"));
		
		return "redirect:/consumer/googi";
		
	}
	
	
	
	@GetMapping("/faq")
		public String faq(@RequestParam(defaultValue="1") int page, 
				@RequestParam(required=false) String searchCondition, 
				@RequestParam(required=false) String searchValue,
				Model model) {
			
			Map<String, String> searchMap = new HashMap<>();
			searchMap.put("searchCondition", searchCondition);
			searchMap.put("searchValue", searchValue);
			
			
			Map<String, Object> consumerListAndPaging = consumerService.selectConsumerList(searchMap, page);
			model.addAttribute("paging", consumerListAndPaging.get("paging"));
			model.addAttribute("consumerList", consumerListAndPaging.get("consumerList"));
		return "consumer/consumerFAQ";
	}
	
	
}
