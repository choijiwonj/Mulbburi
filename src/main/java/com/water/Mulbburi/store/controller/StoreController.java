package com.water.Mulbburi.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/store")
public class StoreController {

	@GetMapping("/store")
	public String store() {	
		return "store/store";
	}
	
	@GetMapping("/prodInq")
	public String prodinquiry() {	
		return "store/prodInq";
	}
	
	@GetMapping("/prodMod")
	public String prodmodify() {	
		return "store/prodMod";
	}	

	@GetMapping("/prodReg")
	public String prodregist() {	
		return "store/prodReg";
	}	
	
}
