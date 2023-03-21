package com.water.Mulbburi.ask;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AskController {

	@GetMapping("askoneAnswer")
	public String oneAnswer() {
		return "ask/12-4. oneAskAnswer";
	}
	
	@GetMapping("askone")
	public String askOne() {
		return "ask/12-1. oneAsk";
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
