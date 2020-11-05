package com.example.lesson21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson21.model.Cat;

@RestController
public class ApiController {
	@GetMapping("/hello")
	public String HelloWorldMethod(@RequestParam(name = "name") String name) {
		return "Hello, " + name;
	}

	@GetMapping("/cat/{id}")
	public Cat catMethod(@PathVariable(name ="id") Integer age)  {
		return new Cat("Murzik", age);
	}
}
