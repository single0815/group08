package com.fs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.UserMapper;
import com.fs.pojo.User;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User selectUserByUsername(String username) {
		
		return userMapper.selectUserByUsername(username);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
		
	}
	
}
