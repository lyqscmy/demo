package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    City selectCityById(long id);
    int insert(City city);
}

