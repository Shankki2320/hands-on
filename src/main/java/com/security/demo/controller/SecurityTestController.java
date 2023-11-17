package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityTestController {


    @GetMapping("/public/test")
    public String testPublicAuth(){
        return "ALLOWED";
    }

    @GetMapping("/private/test")
    public String testPrivateAuth(){
        return "AUTH REQUIRED";
    }






}
