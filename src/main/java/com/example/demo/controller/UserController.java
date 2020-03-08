package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resources;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 0:15
 */
@Controller
public class UserController {
    @GetMapping("/hello")
    public String aa(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        model.addAttribute("key","key");

        return "hello";
    }
}
