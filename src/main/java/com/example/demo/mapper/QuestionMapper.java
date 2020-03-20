package com.example.demo.mapper;

import com.example.demo.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaoxin
 * @date 2020/3/10 - 20:39
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,description,gmtCreate,gmtModified,creator,commentCount,viewCount,likeCount,tag,title,avatar_url) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tag}),#{avatar_url}")
    void create(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);
    @Select("select count(1) from question")
    Integer count();
}
