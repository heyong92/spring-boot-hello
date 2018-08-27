package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
@RequestMapping("/showStr")
    public String showStr(String str){

        return str;
    }
}
