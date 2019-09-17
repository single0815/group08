package com.fs.service;

import com.fs.pojo.User;

public interface UserService {
	public User selectUserByUsername(String username);
	public void insertUser(User user);
}
