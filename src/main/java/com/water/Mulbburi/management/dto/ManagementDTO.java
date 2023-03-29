package com.water.Mulbburi.management.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ManagementDTO {

	/* (전체 관리) 주문날짜 주문번호 고객ID 상품명 총주문수량 총주문금액 */
	
	private Long orderNo;			// 주문번호
	private Date orderDate;			// 주문날짜
	private String orderName;		// 주문자명
	private String memberId;		// 고객ID
	private Long sbNo;				// 상품번호
	private String sbName;			// 상품명
	private Long orderAmount;		// 총주문수량
	private Long orderMoney;		// 총주문금액
	private int DtorderAmount;		// 상세주문수량
	private String orderPhone;		// 주문자번호
	private String orderPostCode;	// 우편번호
	private String orderBsAddress;	// 주소
	private String orderDtAddress;	// 상세주소
	
}
