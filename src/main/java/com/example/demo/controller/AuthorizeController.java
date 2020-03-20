package com.example.demo.controller;

import com.example.demo.dto.AccessTokenDTO;
import com.example.demo.dto.GithubUser;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 11:10
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @Autowired
    private UserMapper userMapper;

    @Value("${github.client.id}")
    private String clientId;

    @Value("${github.client.secret}")
    private String clientSecret;

    @Value("${github.client.uri}")
    private String clientUri;

    @GetMapping("/callback")
    public String  callback(@RequestParam(name = "code") String code,
                            @RequestParam(name = "state") String state,
                            HttpServletRequest request,
                            HttpServletResponse response) throws Exception{
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setRedirect_uri(clientUri);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
      GithubUser gituser = githubProvider.getUser(accessToken);
        if(gituser !=null&&gituser.getId()!=null){
            System.out.println("gituser = " + gituser.getName());
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setAccount_id(String.valueOf(gituser.getId()));
            user.setName(gituser.getName());
            user.setGmt_create(System.currentTimeMillis());
            user.setGmt_modified(user.getGmt_create());
            user.setAvatar_url(gituser.getAvatar_url());
            user.setBio(gituser.getBio());
            userMapper.insertUser(user);
            response.addCookie(new Cookie("token",token));

            //登录成功，写cookie和session
//            request.getSession().setAttribute("gituser",gituser);

            return "redirect:/";

//            redirect 返回的是路径
        }else {
            //登录失败，重新登录
            return "redirect:/";
        }
    }
}
