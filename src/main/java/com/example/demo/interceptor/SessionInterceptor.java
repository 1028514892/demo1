//package com.example.demo.interceptor;
//
//import com.example.demo.mapper.UserMapper;
//import com.example.demo.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author xiaoxin
// * @date 2020/3/11 - 11:43
// */
//@Service //加上这个注解spring才能接管它
//public class SessionInterceptor implements HandlerInterceptor {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null||cookies.length!=0) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("token")){
//                    String token = cookie.getValue();
//                    User user = userMapper.findToken(token);
//                    if (user != null) {
//                        request.getSession().setAttribute("user",user);
//                    }
//                    break;
//                }
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
