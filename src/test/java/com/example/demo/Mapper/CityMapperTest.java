package com.example.demo.Mapper;

import com.example.demo.City;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MybatisTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CityMapperTest {

    @Autowired
    private CityMapper cityMapper;


    @Test
    void selectCityById() {
    }

    @Test
    void selectCityByState() {
        City city = new City("MY");
        cityMapper.insert(city);
        List<City> cityList = cityMapper.selectCityByState("MY");
        System.out.println(cityList);
    }

    @Test
    void insert() {
        City city = new City("MY");
        cityMapper.insert(city);
        assertEquals(2, city.getId());
    }
}