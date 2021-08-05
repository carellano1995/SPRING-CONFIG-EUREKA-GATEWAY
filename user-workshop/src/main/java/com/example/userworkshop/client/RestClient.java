package com.example.userworkshop.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="rest-workshop")
@RequestMapping("/teams")
public interface RestClient {

    @GetMapping("/")
    String getAll();
}