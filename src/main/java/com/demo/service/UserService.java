package com.demo.service;

import com.demo.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}