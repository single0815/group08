package com.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fs.pojo.User;
import com.fs.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	//用户免费注册界面跳转
	@RequestMapping("regist.action")
	public ModelAndView userRegist(String username,String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userService.insertUser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.html");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
