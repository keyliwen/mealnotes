package com.mealnotes.app.controller.webapp;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginCotroller {
	
	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request){
		String error = request.getParameter("error");
		Map<String, Object> map = new HashMap<String, Object>();
		return new ModelAndView("login",map);
	}
	
	@RequestMapping("/noaccess.do")
	public ModelAndView noaccess(){
		return new ModelAndView("noaccess");
	}
}
