package com.water.Mulbburi.community.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.community.dto.AttachmentDTO;
import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;
import com.water.Mulbburi.consumer.dto.ConsumerDTO;
import com.water.Mulbburi.file.FileDTO;

@Mapper

public interface CommunityMapper {

	void insertReply(ReplyDTO reply);

	List<ReplyDTO> selectReplyList(ReplyDTO reply);

	void deleteReply(ReplyDTO reply);

	void insertContent(CommunityDTO community);

	void insertFile(FileDTO file);

	int selectThumbnailTotalCount();

	List<CommunityDTO> selectThumbnailCommunityList(SelectCriteria selectCriteria);

	int incrementCommunityCount(Long no);

	CommunityDTO selectThumbnailCommunityDetail(Long no);

	void insertAttachment(AttachmentDTO attachment);


	
	





}
