package com.water.Mulbburi.faq.dto;

import java.util.Date;

import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.Data;

@Data
public class FaqDTO {
	
	private int faqNo;
	private String faqCategory;
	private String faqSt;
	private int memberNo;
	private Date faqWriteTime;
	public void setWriter(MemberDTO member) {
		// TODO Auto-generated method stub
		
	}
	

}


