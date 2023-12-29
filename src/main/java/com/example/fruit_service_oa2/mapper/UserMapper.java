package com.example.fruit_service_oa2.mapper;

import com.example.fruit_service_oa2.bean.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    @Insert("insert into customer values (#{name},#{age},#{sex},#{phone_num},#{from},#{fruit_received})")
    boolean insertUser( Customer cust);
}
