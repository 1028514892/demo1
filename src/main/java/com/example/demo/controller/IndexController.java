package com.example.demo.controller;

import com.example.demo.dto.PaginationDTO;
import com.example.demo.dto.QuestionDTO;
import com.example.demo.mapper.QuestionMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Question;
import com.example.demo.model.User;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 0:15
 */
@Controller
public class IndexController {
    @Autowired
    private QuestionService questionService;
//    @GetMapping("/")
//    public String index(HttpServletRequest request, Model model,
//                        @RequestParam(name = "page",defaultValue = "1") Integer page,
//                        @RequestParam(name = "size",defaultValue = "5") Integer size){
//
//        User user = (User) request.getSession().getAttribute("user");
//        System.out.println(user);
//        PaginationDTO questionList = questionService.list(page,size);
//        model.addAttribute("questionList",questionList);
//        return "index";
//    }
    @GetMapping("/")
    public String index(HttpServletRequest request){

        User user = (User) request.getSession().getAttribute("user");
        System.out.println(user);
        return "index";
    }
}
