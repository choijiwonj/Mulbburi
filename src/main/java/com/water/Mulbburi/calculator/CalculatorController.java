package com.water.Mulbburi.calculator;

import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CalculatorController {

	private final CalculatorService calService;
	
	public static String filePath = "C:\\Users\\hi\\Desktop\\서브프로젝트\\Mulbburi (2)";
    public static String fileNm = "calculator.xlsx";

	@Autowired
	public CalculatorController(CalculatorService calService) {
		this.calService = calService;
	}

	/*
	 * @PostMapping("calculator") public String getDate(Model model, @RequestParam
	 * String calDate, CalculatorDTO calDTO) {
	 * 
	 * calDTO.setCalDate(calDate); Map<String, Object> calculList =
	 * calService.selectDate(calDTO); model.addAttribute("calList",
	 * calculList.get("calList"));
	 * 
	 * return "calculator/05. calculator"; }
	 */

	@GetMapping("calculator")
	public String calculator(Model model) {

		return "calculator/05. calculator";
	}
	
	@GetMapping("excel")
	public String excel(@RequestParam String calDate) {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("calculator data");
		Map<String, Object[]> data = calService.selectAllData(calDate);
		
		
		return "calculator/05. calculator";
	}

}
