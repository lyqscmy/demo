package com.example.demo.mapper;

import com.example.demo.model.Record;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.sql.Time;
import java.time.Instant;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class RecordMapperTest {

    @Autowired
    private SqlSession sqlSession;

    @Test
    void insertTest() {
        Record record = new Record("test");
        System.out.println(TimeZone.getDefault());
        System.out.println(Instant.now());
        int row = sqlSession.insert("insertRecord", record);
        assertEquals(1, row);

        Record act = sqlSession.selectOne("selectByName", record);
        System.out.println(act.getCreateTime());
        assertEquals(record.getName(), act.getName());
    }
}