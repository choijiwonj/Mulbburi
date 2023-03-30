package com.water.Mulbburi.consumer.dto;

import java.util.Date;

import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.Data;

@Data

public class ConsumerDTO {
	
	private int announcementNo;
	private String announcementTitle;
	private String announcementSt;
	private int administratorNo;
	private Date anWriteTime;
	public void setWriter(MemberDTO member) {
	
		
	}
	
	
	
	
	
	
	
	
	
	

}
