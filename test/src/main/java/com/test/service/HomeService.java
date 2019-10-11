package com.test.service;


import java.util.List;

import com.test.entity.Home;


public interface HomeService {
	

	String selectPassByName(String name);
	Home selectByPrimaryKey(Integer id);
	List<Home> selectAll();
    
}
