package com.water.Mulbburi.shoppingcart;

import lombok.Data;

@Data
public class cartDTO {

	/* 장바구니 번호 */
	private int pcNo;
	/* 회원번호 */
	private int memberNo;
	/* 상품번호 */
	private int sbNo;
	/* 상품수량 */
	private int pcAmount;
	/* 상품이름 */
	private String sbName;
	/* 상품가격 */
	private int sbPrice;
	/* 총가격 */
	private int totalPrice;
	
	public void initTotal() {
		this.totalPrice = this.sbPrice * this.pcAmount;
	}
	
	
	
}
