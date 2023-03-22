package com.water.Mulbburi.screen.youtube;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;

@Mapper
public interface YoutubeMapper {
	
	/* 유투브 정보 저장 */
	int insertYoutube(YoutubeDTO youtubeDTO);

	/* 유투브 목록 가져오기 */
	int selectTotalCount(Map<String, String> searchMap);
	List<YoutubeDTO> selectBoardList(SelectCriteria selectCriteria);
}
