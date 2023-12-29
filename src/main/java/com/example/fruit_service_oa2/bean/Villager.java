package com.example.fruit_service_oa2.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name="村民的信息",description = "包括姓名，年龄等全部信息")

public class Villager {
    @Schema(name="")
    Integer id;
    @Schema(name="村民姓名",type="String")
    String name;
    @Schema(name="账号",type="String")
    String account;
    @Schema(name="村民的姓名",type="String")
    String password;
    @Schema(name="性别",type="String")
    String sex;
    @Schema(name="门牌号",type="String")
    String home_num;
    @Schema(name="家庭人口",type="Integer")
    Integer home_person;
    @Schema(name="劳动力",type="Integer")
    Integer lambor;
    @Schema(name="户主电话号码",type="String")
    String phone_number;
}
