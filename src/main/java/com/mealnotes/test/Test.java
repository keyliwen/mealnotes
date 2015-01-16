package com.mealnotes.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class Test {

	@RequestMapping("/test.do")
	@ResponseBody
	public JSONObject test(HttpServletRequest request){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("data", "test");
		return jsonObject;
	}
}
