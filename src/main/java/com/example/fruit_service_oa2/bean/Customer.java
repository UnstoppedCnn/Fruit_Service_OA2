package com.example.fruit_service_oa2.bean;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.sql.Date;
import java.util.Objects;

@Tag(name="客户的信息",description = "包括姓名，年龄等全部信息")
public class Customer {
    @Schema(name="唯一标识的id")
    Integer c_id;
    @Schema(name="客户的名字",type="String")
    String name;
    @Schema(name="客户的年龄",type="int")
    Integer age;
    @Schema(name="客户的性别",type="String")
    String sex;
    @Schema(name="客户的电话号码",type="String")
    String phone_num;
    @Schema(name="客户来自哪里",type="String")
    String from;
    @Schema(name="客户可以接收多少水果",type="int")
    int fruit_received;
    @Schema(name="客户的生日",type="Date")
    Date birthday;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getFruit_received() {
        return fruit_received;
    }

    public void setFruit_received(int fruit_received) {
        this.fruit_received = fruit_received;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return c_id == customer.c_id && fruit_received == customer.fruit_received && Objects.equals(name, customer.name) && Objects.equals(age, customer.age) && Objects.equals(sex, customer.sex) && Objects.equals(phone_num, customer.phone_num) && Objects.equals(from, customer.from) && Objects.equals(birthday, customer.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_id, name, age, sex, phone_num, from, fruit_received, birthday);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_id=" + c_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", from='" + from + '\'' +
                ", fruit_received=" + fruit_received +
                ", birthday=" + birthday +
                '}';
    }

    public Customer() {
    }

    public Customer(int c_id, String name, Integer age, String sex, String phone_num, String from, int fruit_received, Date birthday) {
        this.c_id = c_id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone_num = phone_num;
        this.from = from;
        this.fruit_received = fruit_received;
        this.birthday = birthday;
    }
}
