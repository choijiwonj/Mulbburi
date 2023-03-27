package com.water.Mulbburi.shoppingcart.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

@Mapper
public interface CartMapper {

	public int addCart(cartDTO cart) throws Exception;

	public void deleteCart(cartDTO deletesbNo);
	
	public cartDTO checkCart(cartDTO cart);

	public List<cartDTO> getCart(Long memberNo);

	public void modifyCount(cartDTO updateCartPost);



	  
	 
}
