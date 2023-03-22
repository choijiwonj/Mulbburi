<<<<<<< HEAD
<<<<<<< HEAD
/*
 * package com.water.Mulbburi.management.controller;
 * 
 * import java.util.Map;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import com.water.Mulbburi.management.service.ManagementService;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * @Slf4j
 * 
 * @Controller
 * 
 * @RequestMapping("/management") public class ManagementController {
 * 
 * private final ManagementService managementService;
 * 
 * public ManagementController(ManagementService managementService) {
 * this.managementService = managementService; }
 * 
 * 주문 관리 - 전체
 * 
 * @GetMapping("/orderAll") public String store(@RequestParam(defaultValue="1")
 * int page, Model model) {
 * 
 * Map<String, Object> orderAllAndPaging =
 * managementService.checkOrderAll(page); model.addAttribute("paging",
 * orderAllAndPaging.get("paging")); model.addAttribute("orderAll",
 * orderAllAndPaging.get("orderAll"));
 * 
 * log.info("[ManagementController] page : {}", page);
 * 
 * return "management/orderAll"; }
 * 
 * 주문 관리 - 결제
 * 
 * @GetMapping("/waitPay") public String waitpay() { return
 * "management/waitPay"; }
 * 
 * @GetMapping("/compPay") public String compleatepay() { return
 * "management/compPay"; }
 * 
 * 주문 관리 - 배송
 * 
 * @GetMapping("/waitSend") public String waitsend() { return
 * "management/waitSend"; }
 * 
 * @GetMapping("/compSend") public String compsend() { return
 * "management/compSend"; }
 * 
 * 주문 관리 - 환불
 * 
 * @GetMapping("/waitRef") public String waitrefund() { return
 * "management/waitRef"; }
 * 
 * @GetMapping("/compRef") public String comprefund() { return
 * "management/compRef"; }
 * 
 * 주문 관리 - 교환
 * 
 * @GetMapping("/waitExc") public String waitexchange() { return
 * "management/waitExc"; }
 * 
 * @GetMapping("/compExc") public String compexchange() { return
 * "management/compExc"; }
 * 
 * }
 */
=======
=======

>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
package com.water.Mulbburi.management.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.water.Mulbburi.management.service.ManagementService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/management")
public class ManagementController {
	
	private final ManagementService managementService;
	
	public ManagementController(ManagementService managementService) {
		this.managementService = managementService;
	}

	/* 주문 관리 - 전체 */
	
	@GetMapping("/orderAll")
	public String checkorderAll(@RequestParam(defaultValue="1") int page, Model model) {	
	
		Map<String, Object> orderAllAndPaging = managementService.checkOrderAll(page);
		model.addAttribute("paging", orderAllAndPaging.get("paging"));
		model.addAttribute("orderAll", orderAllAndPaging.get("orderAll"));
		
		log.info("[ManagementController] page : {}", page);
		
		return "management/orderAll";
	}
	
	/* 주문 관리 - 결제 */
	
	@GetMapping("/waitPay")
	public String waitpay() {	
		return "management/waitPay";
	}

	@GetMapping("/compPay")
	public String compleatepay() {	
		return "management/compPay";
	}
	
	/* 주문 관리 - 배송 */
	
	@GetMapping("/waitSend")
	public String waitsend() {	
		return "management/waitSend";
	}

	@GetMapping("/compSend")
	public String compsend() {	
		return "management/compSend";
	}
	
	/* 주문 관리 - 환불 */
	
	@GetMapping("/waitRef")
	public String waitrefund() {	
		return "management/waitRef";
	}

	@GetMapping("/compRef")
	public String comprefund() {	
		return "management/compRef";
	}
	
	/* 주문 관리 - 교환 */
	
	@GetMapping("/waitExc")
	public String waitexchange() {	
		return "management/waitExc";
	}

	@GetMapping("/compExc")
	public String compexchange() {	
		return "management/compExc";
	}
}

<<<<<<< HEAD
>>>>>>> a7c0fc094262de0c8c17300c32766b27b1990ec5
=======

>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
