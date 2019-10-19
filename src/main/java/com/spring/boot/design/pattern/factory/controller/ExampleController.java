package com.spring.boot.design.pattern.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.design.pattern.factory.service.ExampleService;

@RestController
public class ExampleController {

	@Autowired
	ExampleService example;
	// ExampleService example = new ExampleService();

	@GetMapping("/hello")
	public String Hello() {
		return example.Hello();
	}
}
