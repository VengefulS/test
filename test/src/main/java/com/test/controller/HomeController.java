package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Home;
import com.test.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping("/getP")
	@ResponseBody
	public String getPass(@RequestParam("nameHtml") String name) {

		return homeService.selectPassByName(name);
	}

	@RequestMapping("/getAll")
	@ResponseBody
	public Home getAll(@RequestParam("idHtml") int id) {
		return homeService.selectByPrimaryKey(id);
	}

	@RequestMapping("/getRest")
	@ResponseBody
	public Map<String, Object> getAll1(@RequestParam("idHtml") int id) {

		Map<String, Object> map = new HashMap<String, Object>();
		Home h = homeService.selectByPrimaryKey(id);
		map.put("name", h.getName());
		map.put("password", h.getPassword());
		if (h.getSex() == 1) {
			map.put("sex", "男");
		} else {
			map.put("sex", "女");
		}
		return map;
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Home> findAll() {
		return homeService.selectAll();
	}


}
