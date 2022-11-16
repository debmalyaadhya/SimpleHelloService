package com.simpleservice.simplehelloservice.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleHelloController {

	@ResponseBody
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from the service at " + (new Date().toString());
	}

}
