package com.example.shopping.service;

import com.example.shopping.model.Cart;

public interface CartService {
	
	boolean saveCart(Cart cart);
	boolean updateCart(Cart cart);
	
	Cart findCart();

}
