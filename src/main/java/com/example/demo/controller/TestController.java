package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
@RequestMapping("/showStrq1")
    public String showStr(String str){

        return str;
    }


    public String index(String str){

        return str;
    }
}
