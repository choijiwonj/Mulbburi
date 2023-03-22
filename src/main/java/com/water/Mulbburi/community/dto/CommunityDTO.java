package com.water.Mulbburi.community.dto;

import java.sql.Date;

import java.util.List;

import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.Data;

@Data
public class CommunityDTO {
	
	private int communityNo;
	private String communityTitle;
	private String communityStory;
	private Date communityWriteDate;
	private Date communityUpdateDate;
	private Date communityDeleteDate;
	private MemberDTO memberNo;
	private int custom;
	private List<ReplyDTO> replyList; 			// ReplyTable과 join하는 경우 1:N 조인이 될 것이기 때문에 List<ReplyDTO> 타입으로 생성
	private List<AttachmentDTO> attachmentList; // AttachmentTable과 join하는 경우 1:N 조인이 될 것이기 때문에 List<AttachmentDTO> 타입으로 생성
	

	
	
	
	
	
	

}
