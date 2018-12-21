package com.yangjie.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yangjie.entity.User;
import com.yangjie.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hello", produces = "text/html; charset=utf-8")
	public ModelAndView show() {
		userService.getUser(2);
		ModelAndView view = new ModelAndView("index");
		return view;
	}

	@RequestMapping(value = "/insert")
	public ModelAndView add() {
		User u = new User();
		Map<String, String> m = new HashMap<String, String>();
		u.setId(2);
		u.setName("123");
		int num = userService.insert(u);
		if(num>0)
		{
			m.put("msg","添加成功");
		}
		ModelAndView view = new ModelAndView("index",m);
		return view;
	}
}
