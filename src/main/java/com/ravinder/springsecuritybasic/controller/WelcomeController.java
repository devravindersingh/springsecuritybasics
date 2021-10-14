package com.ravinder.springsecuritybasic.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("welcome")
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome from spring application with security";
    }
}
