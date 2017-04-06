package com.express.service;

import com.express.model.User;

import java.util.List;

public interface UserService {
	/**
	 * 获取用户
	 * @param id
	 * @return
	 */
	User getUserById(String id);
	
	List<User> getAllUsers();
	
	void createUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);
	
}
