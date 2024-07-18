package mapper;

import entity.consultation;

import java.util.List;

public interface ConsultationMapper {
    List<consultation> getAll();
    void insertAll(consultation consultation);
    void deleteById(int patient_id);
}
