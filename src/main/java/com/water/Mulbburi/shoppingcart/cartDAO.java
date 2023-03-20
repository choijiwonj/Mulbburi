package com.water.Mulbburi.shoppingcart;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface cartDAO {
	
	public int addCart(cartDTO cart);
	
	public int deleteCart(int cartId);
	
	public int modifyCount(cartDTO cart);
	
	public List<cartDTO> getCart(int memberNo);
	
	public cartDTO checkCart(cartDTO cart);
}

