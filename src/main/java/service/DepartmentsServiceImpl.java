package service;

import entity.Departments;
import mapper.DepartmentsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.MybatisUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DepartmentsServiceImpl {
    public List<Departments> queryALL() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        DepartmentsMapper mapper = sqlSession.getMapper(DepartmentsMapper.class);

        return mapper.selectAll();
    }
}
