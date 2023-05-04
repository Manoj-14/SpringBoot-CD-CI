package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {
	
	@RequestMapping("/")
	public String root() {
		return "Go to /hello";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from spring boot";
	}
}
