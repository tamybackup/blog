package com.tamy.service.security;

import com.tamy.dao.UserInfoDao;
import com.tamy.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        UserInfo userInfo = userInfoDao.findByUsername(s);
        System.out.println(userInfo);
        if (userInfo==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return userInfo;
    }
}
