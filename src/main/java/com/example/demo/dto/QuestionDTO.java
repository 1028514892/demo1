package com.example.demo.dto;

import com.example.demo.model.User;
import lombok.Data;

/**
 * @author xiaoxin
 * @date 2020/3/11 - 12:51
 */
@Data
public class QuestionDTO {

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
    private User user;
}
