package com.example.fruit_service_oa2.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.sql.Date;
import java.util.Objects;


@Tag(name="村民的信息",description = "包括姓名，年龄等全部信息")
public class Villager {
    @Schema(name="唯一标识的id")
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
    @Schema(name="村民的生日",type="Timestamp")
    Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHome_num() {
        return home_num;
    }

    public void setHome_num(String home_num) {
        this.home_num = home_num;
    }

    public Integer getHome_person() {
        return home_person;
    }

    public void setHome_person(Integer home_person) {
        this.home_person = home_person;
    }

    public Integer getLambor() {
        return lambor;
    }

    public void setLambor(Integer lambor) {
        this.lambor = lambor;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Villager() {
    }

    public Villager(Integer id, String name, String account, String password, String sex, String home_num, Integer home_person, Integer lambor, String phone_number, Date birthday) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.home_num = home_num;
        this.home_person = home_person;
        this.lambor = lambor;
        this.phone_number = phone_number;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villager villager = (Villager) o;
        return Objects.equals(id, villager.id) && Objects.equals(name, villager.name) && Objects.equals(account, villager.account) && Objects.equals(password, villager.password) && Objects.equals(sex, villager.sex) && Objects.equals(home_num, villager.home_num) && Objects.equals(home_person, villager.home_person) && Objects.equals(lambor, villager.lambor) && Objects.equals(phone_number, villager.phone_number) && Objects.equals(birthday, villager.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, account, password, sex, home_num, home_person, lambor, phone_number, birthday);
    }

    @Override
    public String toString() {
        return "Villager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", home_num='" + home_num + '\'' +
                ", home_person=" + home_person +
                ", lambor=" + lambor +
                ", phone_number='" + phone_number + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
