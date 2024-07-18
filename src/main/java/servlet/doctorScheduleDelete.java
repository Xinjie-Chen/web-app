package servlet;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("call delete");
        int doctor_id = Integer.parseInt(req.getParameter("doctor_id"));
        doctorScheduleAddImpl dsa = new doctorScheduleAddImpl();
        dsa.deleteSchedule(doctor_id);
        req.setAttribute("list", dsa.getAll());
        req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
    }
}
