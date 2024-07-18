package service;


import mapper.UserMapper;

import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

public class LoginServiceImpl {
    public String getPassword(String username) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        String password = userMapper.getPassword(username);
        sqlSession.close();
        return password;
    }
}
