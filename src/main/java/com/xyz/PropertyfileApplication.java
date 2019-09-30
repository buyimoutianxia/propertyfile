package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//通过application.properties和application.yml中的server.port验证配置文件的优先级
@SpringBootApplication
public class PropertyfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyfileApplication.class, args);
    }
}
