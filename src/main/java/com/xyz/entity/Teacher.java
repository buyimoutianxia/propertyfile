package com.xyz.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;


@Repository
@PropertySource("/config/teacher.properties")
//使用@ConfigurationProperties需要配置get和set方法,默认不需要prefix，如果变量值存在共同的前缀，可以使用prefix
//@ConfigurationProperties(prefix = "teacher")
@ConfigurationProperties
public class Teacher {

    private String name;
    private int age;
    private String className;
    private String homeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
