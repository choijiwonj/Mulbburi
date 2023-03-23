package com.water.Mulbburi.main;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.screen.youtube.YoutubeDTO;

@Mapper
public interface MainMapper {

	int selectTotalCount(Map<String, String> searchMap);
	List<YoutubeDTO> selectMyYoutube(SelectCriteria selectCriteria);

}
