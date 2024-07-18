package service;

import entity.DoctorSchedule;
import entity.consultation;
import mapper.ConsultationMapper;
import mapper.DoctorScheduleMapper;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.List;

public class ConsultationService {
    public List<consultation> getAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ConsultationMapper mapper = sqlSession.getMapper(ConsultationMapper.class);
        return mapper.getAll();
    }

    public void insertAll(consultation consult) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ConsultationMapper mapper = sqlSession.getMapper(ConsultationMapper.class);
        mapper.insertAll(consult);
        sqlSession.commit();
    }

    public void deleteById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ConsultationMapper mapper = sqlSession.getMapper(ConsultationMapper.class);
        mapper.deleteById(id);
        sqlSession.commit();
    }
}
