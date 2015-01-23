package com.mealnotes.app.controller.webapp;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mealnotes.app.beans.common.user.UserInfo;
import com.mealnotes.app.service.common.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping({"/","/index.do"})
	public ModelAndView index(HttpServletRequest request){
		UserInfo userInfo = userService.findUserInfoByUsername("liwen");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", userInfo.getUsername());
		return new ModelAndView("index",map);
	}
}
