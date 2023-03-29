package com.water.Mulbburi.store.m;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.screen.youtube.YoutubeDTO;

@Mapper
public interface StoreMapper {

	int selectTotalCount();
	List<YoutubeDTO> selectMyDayuk(SelectCriteria selectCriteria);

}
