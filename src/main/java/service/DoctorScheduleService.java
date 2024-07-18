package service;

import entity.DoctorSchedule;
import mapper.DoctorScheduleMapper;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.List;

public class DoctorScheduleService {
    public List<DoctorSchedule> getAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);

        return mapper.getAll();
    }

    public void deleteById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);

        try {
            mapper.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.commit();
        }
    }

    public void insertAll(DoctorSchedule doctorSchedule) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);

        try {
            mapper.insertAll(doctorSchedule);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.commit();
        }
    }

    public void setAll(DoctorSchedule ds) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);

        try {
            mapper.setAll(ds);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.commit();
        }
    }
}