package com.example.demo;

import com.example.demo.Mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final CityMapper cityMapper;

    public DemoApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) {
		City city = new City("MY");
    	cityMapper.insert(city);
        System.out.println(this.cityMapper.selectCityById(1));
    }
}
