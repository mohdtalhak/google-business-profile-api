package com.actify.realbusinessapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome! Go to /oauth2/authorization/google to login.";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Google Business OAuth Success!";
    }
}