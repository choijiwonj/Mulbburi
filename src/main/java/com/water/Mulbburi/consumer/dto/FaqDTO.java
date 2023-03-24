package com.water.Mulbburi.consumer.dto;

import java.util.Date;

import lombok.Data;

@Data
public class FaqDTO {
	
	private int faqNo;
	private String faqCategory;
	private String faqSt;
	private int memberNo;
	private Date faqWriteTime;
	

}


