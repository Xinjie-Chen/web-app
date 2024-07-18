package entity;


import java.sql.Time;
import java.sql.Date;

public class Appointments {
    /*
    appointment_id
            patient_id
    doctor_id
            appointment_date
    appointment_time
            status
     */
    private int appointment_id;
    private int patient_id;
    private int doctor_id;
    private Date appointment_date;
    private Time appointment_time;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(Time appointment_time) {
        this.appointment_time = appointment_time;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    @Override
    public String toString() {
        return "PatientAppoint{" +
                "appointment_id=" + appointment_id +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                ", appointment_date=" + appointment_date +
                ", appointment_time=" + appointment_time +
                ", status='" + status + '\'' +
                '}';
    }
}
