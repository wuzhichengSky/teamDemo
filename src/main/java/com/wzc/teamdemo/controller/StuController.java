package com.wzc.teamdemo.controller;

import com.wzc.teamdemo.pojo.Stu;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value="stu",tags = "学生模块")
public class StuController {
    @ResponseBody
    @GetMapping("/stu")
    /*传过来的是一个对象，paramType，paramType为query*/
    @ApiImplicitParams({@ApiImplicitParam(name="id",value="学生id",dataType = "Integer",paramType = "query",required = true)})
    @ApiOperation(value="你好学生")
    public String helloStu(@Param("id") Integer id){

        return "hello stu";
    }


    @ResponseBody
    @GetMapping("/addstu")
    /*传过来的是一个对象，paramType，paramType为query*/
    @ApiImplicitParams({@ApiImplicitParam(name="stu",value="student",dataType = "Stu",paramType = "body",required = true)})
    @ApiOperation(value="新增学生")
    public String addStu(@RequestBody Stu stu){
        return "hello stu";
    }



}
