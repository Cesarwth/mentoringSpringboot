package com.advance.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {

    @GetMapping("/list")
    public String getCustomers(){
        return "{\"Name\":\"Cesar\",\"Status\":\"Got it\"}";
    }
}
