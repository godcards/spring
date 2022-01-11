package com.yu;

import com.yu.UserTools.UserTools;
import com.yu.dao.UserMapper;
import com.yu.dao.UserMapperImpl;
import com.yu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapperImpl getUser = context.getBean("getUser", UserMapperImpl.class);
        getUser.getUser();
    }
}
