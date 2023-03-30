package com.water.Mulbburi.productpage.service;

import org.springframework.stereotype.Service;

import com.water.Mulbburi.productpage.DAO.ProductPageMapper;
import com.water.Mulbburi.productpage.DTO.ProductPageDTO;

@Service
public class ProductPageService {

	private final ProductPageMapper productPageMapper;
	
	public ProductPageService(ProductPageMapper productPageMapper) {
		this.productPageMapper = productPageMapper;
	}
	
	public ProductPageDTO selectProductPageDetail(int sbNo) {
		
		return productPageMapper.selectProductPageDetail(sbNo);
	}

	public ProductPageDTO selectProductList() {
		
		return productPageMapper.selectProductPageList();
	}


}
