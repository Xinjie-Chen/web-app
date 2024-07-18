package mapper;
import entity.DoctorSchedule;

import java.util.List;

public interface DoctorScheduleMapper {
    void addSchedule(DoctorSchedule doctorSchedule);
    List<DoctorSchedule> getAll();
    void deleteSchedule(DoctorSchedule doctorSchedule);
}
