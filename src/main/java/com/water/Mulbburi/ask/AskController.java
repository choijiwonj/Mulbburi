package com.water.Mulbburi.ask;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String askOne(@RequestParam(defaultValue="1") int page, 
        Model model) {
		
		Map<String, Object> askListAndPaging = askService.selectAllAsk(page);
		model.addAttribute("paging", askListAndPaging.get("paging"));
		model.addAttribute("askList", askListAndPaging.get("askList"));

		return "ask/12-1. oneAsk";
	}
	
	@GetMapping("getEmail")
	public String getEmail(@RequestParam(defaultValue="1") int page, Model model) {
		
		Map<String, Object> askListAndPaging = askService.selectAllAsk(page);
		model.addAttribute("askList", askListAndPaging.get("askList"));
		
		return "ask/12-4. oneAskAnswer";
	}
	
	@GetMapping("notice")
	public String notice() {
		return "ask/12-2. notice";
	}
	
	@GetMapping("FAQ")
	public String FAQ() {
		return "ask/12-3. FAQ";
	}
	
	@PostMapping("regist/answer")
	public String answer(AskDTO askDTO) {
		
		askService.registAnswer(askDTO);
		
		return "redirect:askone";
	}
}
