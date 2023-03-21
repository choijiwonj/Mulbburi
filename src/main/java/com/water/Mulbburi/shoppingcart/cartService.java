package com.water.Mulbburi.shoppingcart;

import java.util.List;

public interface cartService {
	
	public int addCart(cartDTO cart);

	public List<cartDTO> getCartList(int memberNo);
	
	public int modifyCount(cartDTO cart);
}
