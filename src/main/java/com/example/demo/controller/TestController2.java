package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
@RequestMapping("/showStr2111221")
    public String showStr(String str){

        return str;
    }
}
