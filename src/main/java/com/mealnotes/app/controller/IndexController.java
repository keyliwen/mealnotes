package com.mealnotes.app.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mealnotes.app.beans.User;
import com.mealnotes.app.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index.do")
	public ModelAndView index(HttpServletRequest request){
		User user = new User();
		user.setName("lihai");
		userService.addUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		return new ModelAndView("index",map);
	}
}
