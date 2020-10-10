package com.binw.dameng.controller;

import com.binw.dameng.service.StudentService;
import com.binw.dameng.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
//@Api(value="学生",tags="学生")
public class StudentController {
    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/test01")
    @ApiOperation(value="测试01",tags="测试")
    public R test(){
        return R.ok(studentService.test01(),"查询成功");
    }
}
