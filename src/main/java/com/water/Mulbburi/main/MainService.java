package com.water.Mulbburi.main;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.screen.youtube.YoutubeDTO;
import com.water.Mulbburi.screen.youtube.YoutubeMapper;

@Service
public class MainService {

private final MainMapper mainMapper;

public MainService(MainMapper mainMapper) {
	this.mainMapper = mainMapper;
}

public Map<String, Object> selectMyYoutube(Map<String, String> searchMap, int page) {	
		
		/* 1. 전체 게시글 수 확인 (검색어가 있는 경우 포함) => 페이징 처리 계산을 위해서 */
		int totalCount = mainMapper.selectTotalCount(searchMap);
		
		/* 한 페이지에 보여줄 게시물의 수 */
		int limit = 3;
		/* 한 번에 보여질 페이징 버튼의 수 */
		int buttonAmount = 3;
				
		/* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);

		/* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다. */
		List<YoutubeDTO> youtubeList = mainMapper.selectMyYoutube(selectCriteria);
		
		Map<String, Object> ytListAndPaging = new HashMap<>();
		ytListAndPaging.put("youtubeList", youtubeList);
		
		return ytListAndPaging;
	}
	
	

}