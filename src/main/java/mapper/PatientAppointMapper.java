package mapper;

import entity.Appointments;
import entity.DoctorSchedule;

import java.util.List;

public interface PatientAppointMapper {
    public List<Appointments> selectAll();
    void setById(Appointments ap);
}
