package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Home;
import com.test.mapper.HomeMapper;
import com.test.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeMapper homeMapper;

	public String selectPassByName(String name) {

		return homeMapper.selectPassByName(name);
	}

	public Home selectByPrimaryKey(Integer id) {
		return homeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Home> selectAll() {
		return homeMapper.selectAll();
	}

}
