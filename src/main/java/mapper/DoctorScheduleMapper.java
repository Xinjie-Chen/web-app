package mapper;

import entity.DoctorSchedule;

import java.util.List;

public interface DoctorScheduleMapper {
    List<DoctorSchedule> getAll();
    void deleteById(int id);
    void insertAll(DoctorSchedule doctorSchedule);
    void setAll(DoctorSchedule doctorSchedule);
}
