package com.water.Mulbburi.community.service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.community.dao.CommunityMapper;
import com.water.Mulbburi.community.dto.AttachmentDTO;
import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class CommunityService {
	
	private final CommunityMapper communityMapper;
	
	public CommunityService(CommunityMapper communityMapper) {
		this.communityMapper = communityMapper;
	}

	public void registReply(ReplyDTO reply) {
		
		communityMapper.insertReply(reply);
		
	}

	public List<ReplyDTO> loadReply(ReplyDTO reply) {
		
		return communityMapper.selectReplyList(reply);
	}

	public void removeReply(ReplyDTO reply) {
		
		communityMapper.deleteReply(reply);
		
	}


	public void registThumbnail(CommunityDTO community) {
		
		/* 1. Board 테이블에 데이터 저장 */
		communityMapper.insertContent(community);
		
		/* 2. Attachment 테이블에 데이터 저장(첨부된 파일만큼) */
		for(AttachmentDTO attachment : community.getAttachmentList()) {
			communityMapper.insertAttachment(attachment);
		}
		
	}

	public Map<String, Object> selectThumbnailList(int page) {
		
		int totalCount = communityMapper.selectThumbnailTotalCount();
		log.info("[ThumbmailService] totalCount : {}", totalCount);
		
		int limit = 9;
		int buttonAmount = 5;
		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
		log.info("[ThumbmailService] selectCriteria : {}", selectCriteria);
		
		List<CommunityDTO> thumbnailList = communityMapper.selectThumbnailCommunityList(selectCriteria);
		log.info("[ThumbmailService] thumbnailList : {}", thumbnailList);
		
		Map<String, Object> thumbnailListAndPaging = new HashMap<>();
		thumbnailListAndPaging.put("paging", selectCriteria);
		thumbnailListAndPaging.put("thumbnailList", thumbnailList);
		
		return thumbnailListAndPaging;
	}

	public CommunityDTO selectThumbnailDetail(Long no) {
		
		int result = communityMapper.incrementCommunityCount(no);
		
		log.info("[CommunityService] result : {}", result);
		
		return communityMapper.selectThumbnailCommunityDetail(no);
	}

	public void registCommunity(CommunityDTO community) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, Object> selectCommunityList(Map<String, String> searchMap, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	public CommunityDTO selectCommunityDetail(Long no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
