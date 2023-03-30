package com.water.Mulbburi.productpage.service;

import org.springframework.stereotype.Service;

import com.water.Mulbburi.productpage.DAO.ProductPageMapper;
import com.water.Mulbburi.productpage.DTO.ProductPageDTO;

@Service
public class ProductService {

	private final ProductPageMapper productMapper;
	
	public ProductService(ProductPageMapper productMapper) {
		this.productMapper = productMapper;
	}
	
	public ProductPageDTO selectProductPageDetail(int sbNo) {
		
		return productMapper.selectProductPageDetail(sbNo);
	}

	public ProductPageDTO selectProductList() {
		
		return productMapper.selectProductPageList();
	}


}
