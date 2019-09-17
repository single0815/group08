package com.fs.mapper;

import com.fs.pojo.User;

public interface UserMapper {
	public User selectUserByUsername(String username);
	public void insertUser(User user);
}
