package com.water.Mulbburi.shoppingcart.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

@Mapper
public interface CartMapper {

	public int addCart(cartDTO cart) throws Exception;

	public int deleteCart(int pcNo);
	
	public cartDTO checkCart(cartDTO cart);

	public List<cartDTO> getCart(Long memberNo);
	  
	 
}
