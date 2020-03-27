package com.example.demo2.controller;

import org.jboss.logging.MessageBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class test {
    @Autowired
    @RequestMapping("/")
    public String Test(){
        return "demo2";
    }
}