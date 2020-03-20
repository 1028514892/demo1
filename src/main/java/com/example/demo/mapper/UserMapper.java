package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaoxin
 * @date 2020/3/9 - 20:01
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(account_id,name,token,gmt_create,gmt_modified,avatar_url,bio) values(#{account_id},#{name},#{token},#{gmt_create},#{gmt_modified},#{bio},#{avatar_url})")
    void insertUser(User user);
    @Select("select * from user where token=#{token}")
    User findToken(String token);

    @Select("select * from user where id=#{id}")
    User findById(@Param("id") Integer id);
}
