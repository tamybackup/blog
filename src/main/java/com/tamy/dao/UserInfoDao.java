package com.tamy.dao;

import com.tamy.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInfoDao {

    @Select("select * from users")
    public List<UserInfo> findAll();

    @Select("select * from users where username = #{username}")
    public UserInfo findByUsername(String username);
}
