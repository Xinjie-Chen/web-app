package servlet;

import entity.consultation;
import service.ConsultationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/consultationInsert")
public class ConsultationInsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String consultation_id = req.getParameter("consultation_id");
        String patient_id = req.getParameter("patient_id");
        String  doctor_id = req.getParameter("doctor_id");
        String consultation_time = req.getParameter("consultation_time");
        String is_hospital_registered = req.getParameter("is_hospital_registered");
        String is_hospitalized = req.getParameter("is_hospital");
        String medical_advice_case = req.getParameter("medical_advice_case");

        consultation consult = new consultation();
        consult.setConsultation_id(Integer.parseInt(consultation_id));
        consult.setPatient_id(Integer.parseInt(patient_id));
        consult.setDoctor_id(Integer.parseInt(doctor_id));
        consult.setConsultation_time(java.sql.Date.valueOf(consultation_time));
        consult.setIs_hospital_registered(Boolean.parseBoolean(is_hospital_registered));
        consult.setIs_hospitalized(Boolean.parseBoolean(is_hospitalized));
        consult.setMedical_advice_case(medical_advice_case);

        ConsultationService cs = new ConsultationService();
        cs.insertAll(consult);

        req.setAttribute("list", cs.getAll());
        req.getRequestDispatcher("consultationList.jsp").forward(req, resp);
    }

}
