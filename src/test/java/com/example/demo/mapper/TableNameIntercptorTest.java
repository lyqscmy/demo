package com.example.demo.mapper;

import com.example.demo.model.Record;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TableNameInterceptorTest {

    @Autowired
    private RecordMapper recordMapper;

    @Test
    public void test() {
        Record record = recordMapper.selectByName("a");
        System.err.println(record.getName());
    }
}