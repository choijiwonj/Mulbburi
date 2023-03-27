<<<<<<< HEAD
package com.water.Mulbburi.main;
=======

package com.water.Mulbburi.main;
	

>>>>>>> 0822f007817c5acffdf1b7a0b8a0b8fd96dfed1e
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainControll {
	
	private final MainService mainService;
	
	@Autowired
	public MainControll(MainService mainService) {
		this.mainService = mainService;
	}
	
	
	@GetMapping("Mulbburi")
	public String selectMyYoutube(
			@RequestParam(defaultValue="1") int page, 
            @RequestParam(required=false) String searchCondition, 
            @RequestParam(required=false) String searchValue,
            Model model) {
		
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		Map<String, Object> ytListAndPaging = mainService.selectMyYoutube(searchMap, page);
		model.addAttribute("paging", ytListAndPaging.get("paging"));
		model.addAttribute("youtubeList", ytListAndPaging.get("youtubeList"));		
		
		return "main/01.purchase";
	}
	
	/* 스토어 */
	@GetMapping("/store")
	public String store() {
		return "store/04. store";
	}
	
	/* 구매자 로그인 */
	@GetMapping("Mulbburi/login")
	public String loginPurchase(@RequestParam(defaultValue="1") int page, 
            @RequestParam(required=false) String searchCondition, 
            @RequestParam(required=false) String searchValue,
            Model model) {
		
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		Map<String, Object> ytListAndPaging = mainService.selectMyYoutube(searchMap, page);
		model.addAttribute("paging", ytListAndPaging.get("paging"));
		model.addAttribute("youtubeList", ytListAndPaging.get("youtubeList"));		
		
		return "main/01-1.purchaseLogin";
	}
	
	/*판매자*/
	
	
	
	/*관리자*/
	/* 판매자 신고 관리 */
	@GetMapping("sellerAdmin")
	public String sellerAdmin() {
		return "seller/06. sellerControll";
	}
	
	/* 회원 신고 관리 */
	@GetMapping("memberAdmin")
	public String memberAdmin() {
		return "adminMember/13. memberControll";
	}
	
	/* 문의 관리 */
	@GetMapping("askAdmin")
	public String askAdmin() {
		return "ask/12. askControll";
	}
	
	/* 화면 관리 */
	@GetMapping("screenAdmin")
	public String screenAdmin() {
		return "screen/08. screenControll";
	}
	
	@GetMapping("MulbburiAdminMain")
	public String adminLogin() {
		return "main/03-1. adminMainLogin";
	}

}
