package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class test {
    @Autowired
    @RequestMapping("/")
    public String Test() {
        System.out.println("demo2-gitest");

        return "successed";
    }
}
