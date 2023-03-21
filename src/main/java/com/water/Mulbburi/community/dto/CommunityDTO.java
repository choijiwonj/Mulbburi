package com.water.Mulbburi.community.dto;

import java.sql.Date;

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
	
	
	
	
	
	

}
