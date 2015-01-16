package com.mealnotes.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.mealnotes.app.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index.do")
	@ResponseBody
	public JSONObject index(HttpServletRequest request){
		//User user = new User();
		//user.setName("liwen");
		//userService.addUser(user);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("success", "test");
		return jsonObject;
	}
}
