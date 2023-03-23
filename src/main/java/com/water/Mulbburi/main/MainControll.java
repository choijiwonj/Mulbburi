
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
	
	/* 유투브 3개 가져오기 */
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

}

