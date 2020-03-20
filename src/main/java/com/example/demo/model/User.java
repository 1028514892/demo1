package com.example.demo.model;

import lombok.Data;


/**
 * @author xiaoxin
 * @date 2020/3/9 - 19:55
 */
@Data
public class User {
    private int id;
    private String account_id;
    private String name;
    private String token;
    private Long gmt_create;
    private Long gmt_modified;
    private String avatar_url;
    private String bio;



}
