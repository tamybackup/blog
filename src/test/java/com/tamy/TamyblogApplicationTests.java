package com.tamy;


import com.tamy.dao.UserInfoDao;
import com.tamy.pojo.UserInfo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.tamy.dao")
class TamyblogApplicationTests {
    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    void contextLoads() {
        UserInfo zhangsan = userInfoDao.findByUsername("zhangsan");
        System.out.println(zhangsan);
    }

}
