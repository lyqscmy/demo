package com.example.demo.Mapper;

import com.example.demo.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    City selectCityById(long id);

    List<City> selectCityByState(String state);

    int insert(City city);
}

