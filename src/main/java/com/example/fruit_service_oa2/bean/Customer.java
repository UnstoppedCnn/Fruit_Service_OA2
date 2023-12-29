package com.example.fruit_service_oa2.bean;



public class Customer {
    String name;
    Integer age;
    String sex;
    String phone_num;

    String from;
    int fruit_received;

    public Customer() {
    }

    public Customer(String name, Integer age, String sex, String phone_num, String from, int fruit_received) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone_num = phone_num;
        this.from = from;
        this.fruit_received = fruit_received;
    }

}
