package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AccountController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello Minaa!!";
    }
}
