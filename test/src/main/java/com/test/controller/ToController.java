package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToController {
	@RequestMapping("/")
	public String to() {
		return "index";
	}
	
}
