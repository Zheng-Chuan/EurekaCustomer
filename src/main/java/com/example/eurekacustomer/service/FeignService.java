package com.example.eurekacustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient("provider-application")
public interface FeignService {

    @GetMapping("/provider/{id}")
    Map providerMethod(@PathVariable(value = "id") int id);
}
