package com.example.shopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.shopping.model.Cart;
import com.example.shopping.model.UserModel;
import com.example.shopping.repository.CartRepository;


@Service("cartService")
public class CartServiceImpl implements CartService {

	@Qualifier("cartRepository")
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private HttpSession httpSession;

	@Override
	public boolean saveCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public Cart findCart() {
		// TODO Auto-generated method stub
		//System.out.println("gmail,tyup,tyuolgy,thjuklo");
		return ((UserModel) httpSession.getAttribute("userModel")).getCart();
	}

	
}
