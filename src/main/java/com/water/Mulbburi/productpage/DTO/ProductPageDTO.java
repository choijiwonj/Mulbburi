package com.water.Mulbburi.productpage.DTO;

import java.util.List;

import com.water.Mulbburi.file.FileDTO;

import lombok.Data;

@Data
public class ProductPageDTO {

	/* 상품 번호 */
	private int sbNo;
	/* 상품 이름 */
	private String sbName;
	/* 상품 가격 */
	private int sbPrice;
	/* 상품 카테고리 */
	private int prodCategoryNo;
	/* 상품 상태 */
	private String sbStatus;
	/* 상품 이미지 */
	private List<FileDTO> fileList;
	/* 판매자 번호 */
	private long memberNo;
	/* 판매업체 이름 */
	private String sellerName;
	
	
}
