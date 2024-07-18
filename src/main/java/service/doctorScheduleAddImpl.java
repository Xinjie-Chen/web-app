package service;

import entity.DoctorSchedule;
import mapper.DoctorScheduleMapper;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.List;

public class doctorScheduleAddImpl {
    public void addSchedule(String doctorId, String date, String time, String remarks) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);
        DoctorSchedule doctorSchedule = new DoctorSchedule();
        doctorSchedule.setDoctor_id(Integer.parseInt(doctorId));
        doctorSchedule.setDate(date);
        doctorSchedule.setShift_time(time);
        doctorSchedule.setRemarks(remarks);
        mapper.addSchedule(doctorSchedule);
    }

    public List<DoctorSchedule> getAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);
        return mapper.getAll();
    }

    public void deleteSchedule(int doctorId) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DoctorScheduleMapper mapper = sqlSession.getMapper(DoctorScheduleMapper.class);
        DoctorSchedule doctorSchedule = new DoctorSchedule();
        doctorSchedule.setSchedule_id(doctorId);
        try {
            mapper.deleteSchedule(doctorSchedule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
