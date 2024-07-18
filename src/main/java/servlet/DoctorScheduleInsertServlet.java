package servlet;

import entity.DoctorSchedule;
import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorScheduleInsert")
public class DoctorScheduleInsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doctor_id = req.getParameter("doctor_id");
        String date = req.getParameter("date");
        String shift_time = req.getParameter("shift_time");
        String remarks = req.getParameter("remarks");

        DoctorSchedule doctorSchedule = new DoctorSchedule();
        doctorSchedule.setDoctor_id(Integer.parseInt(doctor_id));
        doctorSchedule.setDate(date);
        doctorSchedule.setShift_time(shift_time);
        doctorSchedule.setRemarks(remarks);

        DoctorScheduleService ds = new DoctorScheduleService();
        ds.insertAll(doctorSchedule);

        req.setAttribute("list", ds.getAll());
        req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
    }
}
