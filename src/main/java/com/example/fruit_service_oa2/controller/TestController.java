package com.example.fruit_service_oa2.controller;


import com.example.fruit_service_oa2.bean.Customer;
import com.example.fruit_service_oa2.mapper.UserMapper;
import com.example.fruit_service_oa2.model.Model;
import com.example.fruit_service_oa2.service.demoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "用户管理")
@RestController
public class TestController {
    @Resource
    demoMapper dm;
    @CrossOrigin
    @GetMapping ("/test")
    @ApiOperation(value="添加用户信息",notes = "根据前端请求增加用户")
    public Model test(){
        dm.adduser();
        return new Model(1,"no problem");
    }
}
