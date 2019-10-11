package com.test.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.entity.Home;

@Mapper
public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer id);
    
    String selectPassByName(String name);
    
    List<Home> selectAll();

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
    
}