package servlet;

import service.doctorScheduleAddImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorScheduleAdd")
public class doctorScheduleAdd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doctor_id = req.getParameter("doctor_id");
        String date = req.getParameter("date");
        String shift_time = req.getParameter("shift_time");
        String remarks = req.getParameter("remarks");

        doctorScheduleAddImpl dsa = new doctorScheduleAddImpl();
        dsa.addSchedule(doctor_id, date, shift_time, remarks);
        req.setAttribute("list", dsa.getAll());
        req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
    }
}
