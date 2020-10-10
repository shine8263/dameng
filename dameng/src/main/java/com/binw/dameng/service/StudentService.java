package com.binw.dameng.service;

import com.binw.dameng.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Map<String,String>> test01(){
        return studentMapper.test01();
    }

    public String test02(){
        return studentMapper.test02();
    }

}
