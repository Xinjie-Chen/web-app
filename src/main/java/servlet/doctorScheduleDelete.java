package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.DoctorSchedule;
import service.doctorScheduleAddImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/doctorScheduleDelete")
public class doctorScheduleDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doctor_id = req.getParameter("doctor_id");
        int doctorId = Integer.parseInt(doctor_id);
        doctorScheduleAddImpl dsa = new doctorScheduleAddImpl();
        try {
            dsa.deleteSchedule(doctorId);
            resp.getWriter().write("ok");
        } catch (Exception e) {
            resp.getWriter().write("error");
        }
    }
}
