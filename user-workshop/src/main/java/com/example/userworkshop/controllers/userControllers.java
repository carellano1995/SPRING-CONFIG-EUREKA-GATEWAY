package com.example.userworkshop.controllers;

import java.util.List;

import com.example.userworkshop.client.RestClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class userControllers {

    private RestClient restClient;

	@Autowired
	public userControllers(RestClient restClient) {
		this.restClient = restClient;
	}


	@GetMapping
	@ResponseBody
	public String helloWorld() {
		
        var result = restClient.getAll();

         return result;
	}

}