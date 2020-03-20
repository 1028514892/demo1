//package com.example.demo.interceptor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author xiaoxin
// * @date 2020/3/11 - 11:40
// */
//@Configuration
////@EnableWebMvc
//public class WebConfig implements WebMvcConfigurer {
//    @Autowired
//    private SessionInterceptor sessionInterceptor;  //直接注入，就不用手动创建
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
//    }
//}
