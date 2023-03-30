package com.water.Mulbburi.productpage.DAO;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.productpage.DTO.ProductPageDTO;

@Mapper
public interface ProductPageMapper {

	ProductPageDTO selectProductPageDetail(int sbNo);

	ProductPageDTO selectProductPageList();

	
}
