package com.xyz.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

@RestController
@SpringBootApplication
@PropertySource(value="application.properties")
@ConfigurationProperties(prefix = "file")
public class PropertyfileApplication {

//    @Value("${fileName}")
    private   String name;

    public static void main(String[] args) {
        SpringApplication.run(PropertyfileApplication.class, args);
    }


    @RequestMapping("/file")
    public String file() {
        return name;
    }

}
