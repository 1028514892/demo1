package com.example.demo.dto;

import lombok.Data;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 11:18
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
