package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger("demoLogger");

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/i")
    public String getInfo() {
        logger.info("sample info message");
        return "INFO LOG";
    }

    @GetMapping("/w")
    public String getWarn() {
        logger.warn("sample warn message");
        return "WARN LOG";
    }

    @GetMapping("/e")
    public String getError() {
        logger.error("sample error message");
        return "ERROR LOG";
    }
}
