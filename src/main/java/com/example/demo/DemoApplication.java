package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shakelily
 */
@RestController
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DemoApplication {

    @RequestMapping("/")
    public String hello() {
        return "Hello Yaou!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
