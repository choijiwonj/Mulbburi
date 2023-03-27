package com.water.Mulbburi.order;

import lombok.Data;

@Data
public class orderItemDTO {
	/* 주문번호 */
	private String orderId;
	/* 상품번호 */
	private int sbNo;
	/* 주문수량 */
	private int sbCount;
	/* 상품가격 */
	private int sbPrice;
	/* 총 상품가격 */
	private int totalsbPrice;
	
	public void initSaleTotal() {
		this.totalsbPrice = this.sbPrice*this.sbCount;
	}
	
}
