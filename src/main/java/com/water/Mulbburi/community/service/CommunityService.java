<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6

 package com.water.Mulbburi.community.service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.community.dao.CommunityMapper;
import com.water.Mulbburi.community.dto.AttachmentDTO;

import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
@Transactional



public class CommunityService {
	 
	private final CommunityMapper communityMapper;
	
	public CommunityService(CommunityMapper communityMapper) {
		this.communityMapper = communityMapper;
	}

	public Map<String, Object> selectCommunityList(Map<String, String> searchMap, int page) {
		
		/* 1. 전체 게시글 수 확인 (검색어가 있는 경우 포함) => 페이징 처리 계산을 위해서 */
		int totalCount = communityMapper.selectTotalCount(searchMap);
		log.info("[communityMapper] totalCount : {}", totalCount);
		
		/* 한 페이지에 보여줄 게시물의 수 */
		int limit = 10;
		/* 한 번에 보여질 페이징 버튼의 수 */
		int buttonAmount = 5;
		
		/* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
		log.info("[CommunityService] selectCriteria : {}", selectCriteria);
		
		/* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다. */
		List<CommunityDTO> communityList = communityMapper.selectCommunityList(selectCriteria);
		log.info("[CommunityService] communityList : {}", communityList);
		
		Map<String, Object> communityListAndPaging = new HashMap<>();
		communityListAndPaging.put("paging", selectCriteria);
		communityListAndPaging.put("communityList", communityList);
		
		return communityListAndPaging;
	}

	public CommunityDTO selectCommunityDetail(Long no) {
		
		/* 1. 조회수 증가 로직 */
		int result = communityMapper.incrementCommunityCount(no);
		
		/* 2. 게시글 상세 내용 조회 후 리턴 */
		return communityMapper.selectCommunityDetail(no);
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

	/* 게시글 등록 서비스 메소드 */
	public void registCommunity(CommunityDTO community) {
		
		communityMapper.insertcommunity(community);
		
	}

	public void registThumbnail(CommunityDTO community) {
		
		/* 1. Community 테이블에 데이터 저장 */
		communityMapper.insertThumbnailContent(community);
		
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


	

	
	
	
	
	
	

}
<<<<<<< HEAD
=======
///*
//  package com.water.Mulbburi.community.service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.water.Mulbburi.common.paging.Pagenation;
//import com.water.Mulbburi.common.paging.SelectCriteria;
//import com.water.Mulbburi.community.dao.CommunityMapper;
//import com.water.Mulbburi.community.dto.CommunityDTO;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//@Transactional
//
//
//public class CommunityService {
//	 
////	private final CommunityMapper communityMapper;
////	
////	public CommunityService(CommunityMapper communityMapper) {
////		this.communityMapper = communityMapper;
////	}
//	
//
////	public Map<String, Object> selectCommunityList(Map<String, String> searchMap, int page){
////		
////	/* 1. 전체 게시글 수 확인 ( 검색어가 있는 경우 포함) => 페이징 처리 계산을 위해서*/
////		int totalCount = communityMapper.selectTotalCount(searchMap);
////		log.info("[CommunityService] totalCount : {}", totalCount);
////		
////		/* 한 페이지에 보여줄 게시물의 수 */
////		int limit = 10;
////		/* 한 번에 보여질 페이징 버튼의 수 */
////		int buttonAmount = 5; 
////		
////		/* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
////		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
////		log.info("[CommunityService selectCriteria : {}", selectCriteria);
////
////		/* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다.*/
////		List<CommunityDTO> communityList = communityMapper.selectCommunityList(selectCriteria);
////		log.info("[CommunityService] communityList : {}", communityList);
////		
////		Map<String, Object> communityListPaging = new HashMap<>();
////		communityListAndPaging.put("paging", selectCriteria);
////		communityListAndPaging.put("communityList",communityList);
////		
////		return communityListAndPaging;
////	}
//
//	public CommunityService(CommunityMapper communityMapper) {
////		this.communityMapper = communityMapper;
//	}
//	
//	public Map<String, Object> selectCommunityList(Map<String, String> searchMap, int page){
//		
////	/* 1. 전체 게시글 수 확인 ( 검색어가 있는 경우 포함) => 페이징 처리 계산을 위해서*/
////		int totalCount = communityMapper.selectTotalCount(searchMap);
////		log.info("[CommunityService] totalCount : {}", totalCount);
////		
////		/* 한 페이지에 보여줄 게시물의 수 */
////		int limit = 10;
////		/* 한 번에 보여질 페이징 버튼의 수 */
////		int buttonAmount = 5; 
////		
////		/* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
////		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
////		log.info("[CommunityService selectCriteria : {}", selectCriteria);
////
////		/* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다.*/
////		List<CommunityDTO> communityList = communityMapper.selectCommunityList(selectCriteria);
////		log.info("[CommunityService] communityList : {}", communityList);
////		
////		Map<String, Object> communityListPaging = new HashMap<>();
////		communityListAndPaging.put("paging", selectCriteria);
////		communityListAndPaging.put("communityList",communityList);
////		
////		return communityListAndPaging;
//		return null;
//	}
//	}
>>>>>>> a7c0fc094262de0c8c17300c32766b27b1990ec5
=======
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
