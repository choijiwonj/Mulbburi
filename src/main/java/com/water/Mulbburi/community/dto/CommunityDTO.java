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
	private int memberNo;
	private int custom;
	public AttachmentDTO[] getAttachmentList() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAttachmentList(List<AttachmentDTO> attachmentList) {
		// TODO Auto-generated method stub
		
	}
	public void setWriter(MemberDTO member) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
