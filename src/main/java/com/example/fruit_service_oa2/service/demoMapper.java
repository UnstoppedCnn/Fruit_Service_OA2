package com.example.fruit_service_oa2.service;


import com.example.fruit_service_oa2.bean.Customer;
import com.example.fruit_service_oa2.mapper.UserMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;

@Service
public class demoMapper {
    @Resource
    private UserMapper um;
    public Customer adduser(){
        Customer tesm=new Customer(0,"222",23,"男","12312312312","adsda",900,new Date(2000,12,11));
        um.insertUser(tesm);
        return tesm;
    }
}
