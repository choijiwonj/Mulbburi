package com.water.Mulbburi.screen.youtube;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YoutubeMapper {
	
	int insertYoutube(YoutubeDTO youtubeDTO);
}
