package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	
	//Get HTTP Method
	//http://localhost:8080/hello-world
    
    @GetMapping("/hello-world")
    public String helloWorld(){
    	return "hello world!";
    }
}