package com.water.Mulbburi.productpage.service;

import org.springframework.stereotype.Service;

import com.water.Mulbburi.productpage.DAO.ProductPageMapper;
import com.water.Mulbburi.productpage.DTO.ProductPageDTO;

@Service
public class ProductPageService {


	private final ProductPageMapper productMapper;
	
	public ProductPageService(ProductPageMapper productMapper) {
		this.productMapper = productMapper;

	}
	
	public ProductPageDTO selectProductPageDetail(int sbNo) {
		

		return productPageMapper.selectProductPageDetail(sbNo);

	}

	public ProductPageDTO selectProductList() {

		return productPageMapper.selectProductPageList();

	}


}
