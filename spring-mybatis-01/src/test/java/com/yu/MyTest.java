package com.yu;

import com.yu.UserTools.UserTools;
import com.yu.dao.UserMapper;
import com.yu.pojo.user;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getUser(){
        SqlSession sqlSession = UserTools.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<user> user = mapper.getUser();
        for (com.yu.pojo.user user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }
}
