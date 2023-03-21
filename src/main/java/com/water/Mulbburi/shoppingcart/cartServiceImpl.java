package com.water.Mulbburi.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cartServiceImpl implements cartService {

	@Autowired
	private cartDAO cartDAO;

	@Override
	public int addCart(cartDTO cart) {

		cartDTO checkCart = cartDAO.checkCart(cart);

		if (checkCart != null) {
			return 2;
		}
		try {
			return cartDAO.addCart(cart);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<cartDTO> getCartList(int memberNo) {
		List<cartDTO> cart = cartDAO.getCart(memberNo);
		
		for(cartDTO dto : cart) {
			dto.initTotal();
		}
		
		return cart;
	}

}
