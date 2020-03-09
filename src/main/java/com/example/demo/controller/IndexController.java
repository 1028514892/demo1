package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 0:15
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String aa(){

        return "index";
    }
}
