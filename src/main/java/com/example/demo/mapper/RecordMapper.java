package com.example.demo.mapper;

import com.example.demo.model.Record;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper {
    int insertRecord(Record record);
    Record selectByName(String name);
}
