package com.water.Mulbburi.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.shoppingcart.DAO.cartDAO;
import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@Service
public class cartService {

	private final cartDAO cartDAO;
	
	public cartService(cartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	
	public int addCart(cartDTO cart) {
		cartDTO checkCart = cartDAO.checkCart(cart);
		
		if(checkCart != null) {
			return 2;
		}
		try {
			return cartDAO.addCart(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
	}
	
	public List<cartDTO> getCartList(long memberNo){
		List<cartDTO> cart = cartDAO.getCart(memberNo);
		
		for(cartDTO dto : cart) {
			dto.initTotal();
		}
	
		return cart;
	}
	
	public int deleteCart(int pcNo) {
		return cartDAO.deleteCart(pcNo);
	}

	
}
