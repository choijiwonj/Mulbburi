package com.water.Mulbburi.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.shoppingcart.DAO.CartMapper;
import com.water.Mulbburi.shoppingcart.DTO.cartDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@Service
public class cartService {

	private final CartMapper cartDAO;
	
	public cartService(CartMapper cartDAO) {
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
	
	
	
	public int deleteCart(int pcNo) {
		return cartDAO.deleteCart(pcNo);
	}

	
	public List<cartDTO> getCartList(Long memberNo){
		List<cartDTO> cart = cartDAO.getCart(memberNo);
		
		for(cartDTO dto : cart) {
			dto.initTotal();
		}
		
		return cart;
	}

	
}
