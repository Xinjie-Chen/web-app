package entity;

import java.sql.Date;

public class consultation {
    /*
    consultation_id
            patient_id
    doctor_id
            consultation_time
    is_hospital_registered
            is_hospitalized
    medical_advice_case
     */
    private int consultation_id;
    private int patient_id;
    private int doctor_id;
    private Date consultation_time;
    private boolean is_hospital_registered;
    private boolean is_hospitalized;
    private String medical_advice_case;

    public int getConsultation_id() {
        return consultation_id;
    }

    public void setConsultation_id(int consultation_id) {
        this.consultation_id = consultation_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Date getConsultation_time() {
        return consultation_time;
    }

    public void setConsultation_time(Date consultation_time) {
        this.consultation_time = consultation_time;
    }

    public boolean isIs_hospital_registered() {
        return is_hospital_registered;
    }

    public void setIs_hospital_registered(boolean is_hospital_registered) {
        this.is_hospital_registered = is_hospital_registered;
    }

    public boolean isIs_hospitalized() {
        return is_hospitalized;
    }

    public void setIs_hospitalized(boolean is_hospitalized) {
        this.is_hospitalized = is_hospitalized;
    }

    public String getMedical_advice_case() {
        return medical_advice_case;
    }

    public void setMedical_advice_case(String medical_advice_case) {
        this.medical_advice_case = medical_advice_case;
    }

    @Override
    public String toString() {
        return "consultation{" +
                "consultation_id=" + consultation_id +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                ", consultation_time=" + consultation_time +
                ", is_hospital_registered=" + is_hospital_registered +
                ", is_hospitalized=" + is_hospitalized +
                ", medical_advice_case='" + medical_advice_case + '\'' +
                '}';
    }
}
