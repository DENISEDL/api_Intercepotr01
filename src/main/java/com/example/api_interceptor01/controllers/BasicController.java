package com.example.api_interceptor01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("/")
    public String getTime(){
        return OffsetDateTime.now().toString();
    }
}
