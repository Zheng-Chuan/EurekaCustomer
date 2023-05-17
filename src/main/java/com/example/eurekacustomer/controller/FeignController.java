package com.example.eurekacustomer.controller;

import com.example.eurekacustomer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/consumer/{id}")
    public Map consumerTest(@PathVariable(value = "id") Integer id) {
        return feignService.providerMethod(id);
    }

}
