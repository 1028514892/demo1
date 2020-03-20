package com.example.demo.model;

import lombok.Data;


/**
 * (Question)表实体类
 *
 * @author makejava
 * @since 2020-03-10 20:37:04
 */
@Data
public class Question {
    
    private Integer id;
    
    private String title;
    
    private String description;
    
    private Long gmtCreate;
    
    private Long gmtModified;
    
    private Integer creator;
    
    private Integer commentCount;
    
    private Integer viewCount;
    
    private Integer likeCount;
    
    private String tag;
    }