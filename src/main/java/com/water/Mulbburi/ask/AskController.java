package com.water.Mulbburi.ask;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AskController {

	private final AskService askService;

	public AskController(AskService askService) {
		this.askService = askService;
	}

	@GetMapping("askcontroll")
	public String askControll() {
		return "12. askControll";
	}

	@GetMapping("askoneAnswer")
	public String oneAnswer() {
		return "/ask/12-4. oneAskAnswer";
	}

	@GetMapping("askone")
	public String askOne(@RequestParam(defaultValue = "1") int page, Model model) {

		Map<String, Object> askListAndPaging = askService.selectAllAsk(page);
		model.addAttribute("paging", askListAndPaging.get("paging"));
		model.addAttribute("askList", askListAndPaging.get("askList"));

		return "ask/12-1. oneAsk";
	}

	   
	   @PostMapping("getEmail")
	   public String getEmail(Model model, @RequestParam int inquiryNo) {
		   
		   AskDTO askList = askService.getEmail(inquiryNo);
		   model.addAttribute("askList", askList);
		   
		   model.addAttribute("inquiryNo", inquiryNo);
		   
	      return "redirect:ask/12-1. oneAsk";
	   }
	   
	   @PostMapping("/update/answer")
	   public String updateAnswer(@RequestParam int inquiryNo, @RequestParam String inquiryAnswer, Model model) {
		   
		   
		   log.info("inquiryAnswer {}", inquiryAnswer);
		   log.info("inquiryNo {}", inquiryNo);
		   
		   AskDTO askList = askService.getEmail(inquiryNo);
		   model.addAttribute("askList", askList);
		   
		   
	        askService.updateAnswer(inquiryNo, inquiryAnswer);
	        
	        Map<String, Object> askListAndPaging = askService.updateAnswer(inquiryNo, inquiryAnswer);
	        model.addAttribute("inquiryNo", askListAndPaging.get("inquiryNo"));
	        model.addAttribute("inquiryAnswer", askListAndPaging.get("inquiryAnswer"));
			   
		   return "redirect:/main/01.purchaseMain";
	   }
	   

	@GetMapping("notice")
	public String notice() {
		return "ask/12-2. notice";
	}

	@GetMapping("FAQ")
	public String FAQ() {
		return "ask/12-3. FAQ";
	}
}
