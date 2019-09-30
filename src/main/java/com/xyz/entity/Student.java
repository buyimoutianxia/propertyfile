package com.xyz.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

//@Repository实现DAO层的Bean扫描
@Repository
//@PropertySource引入外部配置文件，结合@Value注解完成属性的值注入
@PropertySource("/config/student.properties")
public class Student {

    @Value("${student.name}")
    private  String name;
    @Value("${student.address}")
    private String address;
    @Value("${student.age}")
    private int age;
    @Value("${sex}")
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

