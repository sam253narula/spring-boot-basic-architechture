package com.spring.boot.learning.lombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.learning.lombok.service.ExampleService;

@RestController
public class ExampleController {

	@Autowired
	ExampleService example;

	@GetMapping("/hello")
	public String Hello() {
		return example.Hello();
	}
}
