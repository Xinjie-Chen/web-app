package servlet;

import entity.DoctorSchedule;
import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DoctorScheduleSet")
public class DoctorScheduleSetServlet extends HttpServlet {
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

        DoctorSchedule ds = new DoctorSchedule();
        ds.setDoctor_id(Integer.parseInt(doctor_id));
        ds.setDate(date);
        ds.setShift_time(shift_time);
        ds.setRemarks(remarks);

        DoctorScheduleService dss = new DoctorScheduleService();
        dss.setAll(ds);

        req.setAttribute("list", dss.getAll());
        req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
    }
}
