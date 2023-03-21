package com.water.Mulbburi.order;


import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class orderDTO {
	/* 주문번호 */
	private String orderId;
	/* 배송받는사람 */
	private String memberName;
	/* 주문 회원 아이디 */
	private String memberId;
	/* 전화번호 */
	private String phone;
	/* 이메일 */
	private String email;
	/* 요청사항 */
	private String coment;
	/* 우편번호 */
	private String memberAddress;
	/* 상세주소 */
	private String memberAddress2;
	/* 주문상품 */
	private List<orderItemDTO> orders;
	/* 주문날짜 */
	private Date orderDate;
	/* 최종판매비용 */
	private int orderFinalSalePrice;
	
	public void getOrderPriceInfo() {
		for(orderItemDTO order : orders) {
			orderFinalSalePrice += order.getSbPrice();
		}
	}
}
