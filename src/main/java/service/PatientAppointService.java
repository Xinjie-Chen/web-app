package service;

import entity.Appointments;
import entity.DoctorSchedule;
import mapper.PatientAppointMapper;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.List;

public class PatientAppointService {
    public List<Appointments> selectAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PatientAppointMapper mapper = sqlSession.getMapper(PatientAppointMapper.class);

        return mapper.selectAll();
    }

    public void setById(Appointments ap) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PatientAppointMapper mapper = sqlSession.getMapper(PatientAppointMapper.class);

        try {
            mapper.setById(ap);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
