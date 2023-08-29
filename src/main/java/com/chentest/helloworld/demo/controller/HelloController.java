package com.chentest.helloworld.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 为了能够用上GetMapping，而在这里加上Controller
public class HelloController {
    @RequestMapping("/hello") // 显示的路径是http://localhost:8080/hello
    public String index() {
        return "hello"; // "index"：去读 src/main/resources/templates/hello.html
    }
}