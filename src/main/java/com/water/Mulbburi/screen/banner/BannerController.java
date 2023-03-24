package com.water.Mulbburi.screen.banner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.water.Mulbburi.file.FileDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BannerController {

	private final BannerService bnService;

	@Autowired
	public BannerController(BannerService bnService) {
		this.bnService = bnService;
	}

	@GetMapping("/banner")
	public String banner() {
		return "screen/08-1. bannerControll";
	}

	/* 저장할 배너 목록 삽입 */
	@PostMapping("regist/banner")
	public String insertYoutube(@ModelAttribute BannerDTO bannerDTO) {

		bnService.insertBanner(bannerDTO);
		return "redirect:/banner";
	}
	
//	@PostMapping("regist/file")
//	public String insertFile(@ModelAttribute FileDTO fileDTO) {
//		return null;
//	}
	
	/* 배너 목록 조회 */
	/* 저장한 유투브 목록 가져오기 */
	@GetMapping("screen/08-4. bannerList")
	public String selectAllYoutube(@RequestParam(defaultValue="1") int page, 
				                   @RequestParam(required=false) String searchCondition, 
				                   @RequestParam(required=false) String searchValue,
				                   Model model
) {

		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		Map<String, Object> bnListAndPaging = bnService.selectAllBanner(searchMap, page);
		model.addAttribute("paging", bnListAndPaging.get("paging"));
		model.addAttribute("bannerList", bnListAndPaging.get("bannerList"));		
		
		return "screen/08-4. bannerList";
	}
}
