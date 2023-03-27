package com.water.Mulbburi.community.dto;

import java.util.Date;

import com.water.Mulbburi.member.dto.MemberDTO;

public class ReplyDTO {

	private int commentNo;
	private String body;
	private int communityNo;
	private int memberNo;
	private Date commentUpdateDate;
	private Date commentDeletDate;
	private Date commentWriteDate;
	private int custom;
	public void setWriter(MemberDTO member) {
		
	}
	
	

}
