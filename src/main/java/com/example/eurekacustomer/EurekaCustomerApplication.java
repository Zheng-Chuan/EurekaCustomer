package com.example.eurekacustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaCustomerApplication {
    public static <IgniteConfiguration> void main(String[] args) {
        SpringApplication.run(EurekaCustomerApplication.class, args);

    }

}


