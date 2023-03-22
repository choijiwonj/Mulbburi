package com.water.Mulbburi.shoppingcart.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

@Mapper
public interface cartDAO {

	public int addCart(cartDTO cart) throws Exception;

	public int deleteCart(int pcNo);

	
	  public List<cartDTO> getCart(long memberNo);
	  
	  public cartDTO checkCart(cartDTO cart);
	  
	 
}
