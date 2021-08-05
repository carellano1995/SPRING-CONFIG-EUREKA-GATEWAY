package com.example.restworksop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class PlayerControllers {

	@GetMapping
	@ResponseBody
	public String helloWorld() {
		return "hello world";
	}

}