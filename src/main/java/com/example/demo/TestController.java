package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shakelily
 */
@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello Test!";
    }
}
