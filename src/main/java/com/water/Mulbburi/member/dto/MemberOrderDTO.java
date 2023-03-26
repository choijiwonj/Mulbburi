package com.water.Mulbburi.member.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberOrderDTO {
	
	private Long orderNo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDate;
	private String sbName;
	private Long orderMoney;
	private int memberName;
}
