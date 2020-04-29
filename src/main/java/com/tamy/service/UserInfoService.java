package com.tamy.service;

import com.tamy.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> findAll();

    public UserInfo findByUsername(String username);
}
