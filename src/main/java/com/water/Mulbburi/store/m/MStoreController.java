package com.water.Mulbburi.store.m;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MStoreController {
	
	private MStoreService stService;
	
	@Autowired
	public MStoreController(MStoreService stService) {
		this.stService = stService;
	}
	
	/* 저장한 다육이 목록 가져오기 */
	@GetMapping("select/dayuk")
	public String selectMyDayuk(@RequestParam(defaultValue="1") int page, 
				                   Model model) {

		Map<String, Object> stListAndPaging = stService.selectMyDayuk(page);
		model.addAttribute("paging", stListAndPaging.get("paging"));
		model.addAttribute("storeList", stListAndPaging.get("storeList"));	
			
		return "store/04. store";
	}
}
