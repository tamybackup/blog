package com.tamy.service.impl;

import com.tamy.dao.UserInfoDao;
import com.tamy.pojo.UserInfo;
import com.tamy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}
