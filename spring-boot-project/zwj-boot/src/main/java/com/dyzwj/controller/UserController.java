package com.dyzwj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/test1")
	public Map<String, String> test1(){
		Map<String,String> res = new HashMap<>();
		res.put("name","zwj");
		return res;
	}

}
