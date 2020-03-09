package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 0:15
 */
@Controller
public class UserController {
    @GetMapping("/hello")
    public String aa(){

        return "index";
    }
}
