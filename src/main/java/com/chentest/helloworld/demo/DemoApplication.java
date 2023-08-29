package com.chentest.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 为了能够用上GetMapping，而在这里加上Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// GetMapper，就是要用上@Controller
	@GetMapping("/") // 显示的路径是http://localhost:8080/
	public String helloWorld() {
		return "index"; // "index"：去读 src/main/resources/templates/index.html
	}
}
