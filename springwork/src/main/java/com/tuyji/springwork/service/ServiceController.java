package com.tuyji.springwork.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping(path = "/user")
    public String getUser(){
        return "Volkan Tuyji";
    }
}
