package com.water.Mulbburi.management.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ManagementDTO {

	/* (전체 관리) 주문날짜 주문번호 고객ID 상품명 총주문수량 총주문금액 */
	
	private Long orderNo;			// 주문번호
	private Date orderDate;			// 주문날짜
	private String memberId;		// 고객ID
	private String sbName;			// 상품명
	private Long orderAmount;		// 상품수량
	private Long orderMoney;		// 주문금액
	
}
