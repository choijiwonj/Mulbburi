package com.water.Mulbburi.community.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.community.dto.AttachmentDTO;

import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;


@Mapper
public interface CommunityMapper {

	
	List<CommunityDTO> selectCommunityList(SelectCriteria selectCriteria);

	void insertcommunity(CommunityDTO community);

	void insertCommunityContent(CommunityDTO community);

	void insertAttachment(AttachmentDTO attachment);

	int selectCommunityTotalCount();

	int incrementCommunityCount(Long no);

	CommunityDTO selectCommunityDetail(Long no);

	void insertReply(ReplyDTO reply);

	List<ReplyDTO> selectReplyList(ReplyDTO reply);

	void deleteReply(ReplyDTO reply);

	void insertThumbnailContent(CommunityDTO community);

	int selectThumbnailTotalCount();

	List<CommunityDTO> selectThumbnailCommunityList(SelectCriteria selectCriteria);

	int selectTotalCount(Map<String, String> searchMap);

	CommunityDTO selectThumbnailCommunityDetail(Long no);

	

	





	

}

