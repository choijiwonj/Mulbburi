package com.water.Mulbburi.community.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.community.dto.AttachmentDTO;
import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;

@Mapper
public class CommunityMapper {

	public int selectTotalCount(Map<String, String> searchMap) {
	
		return 0;
	}

	public List<CommunityDTO> selectCommunityList(SelectCriteria selectCriteria) {
	
		return null;
	}

	public List<ReplyDTO> selectReplyList(ReplyDTO reply) {
	
		return null;
	}

	public void insertReply(ReplyDTO reply) {
	
		
	}

	public void deleteReply(ReplyDTO reply) {
	
		
	}

	public void insertcommunity(CommunityDTO community) {
	
		
	}

	public void insertCommunityContent(CommunityDTO community) {
	
		
	}

	public void insertAttachment(AttachmentDTO attachment) {
	
		
	}

	public int selectCommunityTotalCount() {
	
		return 0;
	}

	public int incrementCommunityCount(Long no) {
	
		return 0;
	}

	public CommunityDTO selectCommunityDetail(Long no) {
	
		return null;
	}
	
	

}
