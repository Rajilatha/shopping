package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByEmail(String email);

}
