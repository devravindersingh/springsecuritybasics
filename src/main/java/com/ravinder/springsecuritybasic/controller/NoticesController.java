package com.ravinder.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNoticeDetails(String input){
        return "Here are the notices details from the DB";
    }
}
