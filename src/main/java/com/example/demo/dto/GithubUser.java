package com.example.demo.dto;


import lombok.Data;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 12:03
 */
@Data
public class GithubUser {
    private String  name;
    private Long id ;
    private String  bio;
    private String  avatar_url;

}
