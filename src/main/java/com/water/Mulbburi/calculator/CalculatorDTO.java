package com.water.Mulbburi.calculator;

import com.water.Mulbburi.member.dto.MemberDTO;
import com.water.Mulbburi.order.orderDTO;
import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

import lombok.Data;

@Data
public class CalculatorDTO {
	
	private int calNo; //정산번호ㅓ
	private String calDate; //정산일
	private int calMoney; //정산금액
	private int memberNo; //계정번호
	private int calCharge; //수수료
	private int orderNo;   //주문번호
	private orderDTO orderAmountMoney;
	private int allMoney;
	private int calCharge2;
	private int calMoney2;
	private orderDTO orderDate;	

}
