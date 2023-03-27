package com.water.Mulbburi.community.dto;

import java.util.Date;
import java.util.List;

import com.water.Mulbburi.file.FileDTO;
import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.Data;

@Data

public class CommunityDTO {
	
	private int communityNo;
	private String communityTitle;
	private String communityStory;
	private int communityWriteDate;
	private Date communityUpdateDate;
	private Date communityDeleteDate;
	private int memberNo;
	private int custom;	
	private List<ReplyDTO> replyList;
	private List<AttachmentDTO> attachmentList;
	public void setWriter(MemberDTO member) {		
	}
	

	
	
	
	
	
	
	
	
	
	

}
