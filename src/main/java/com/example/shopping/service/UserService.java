package com.example.shopping.service;

import com.example.shopping.model.User;

public interface UserService {

	boolean saveUser(User user);

	User findUserByEmail(String email);
	

}
