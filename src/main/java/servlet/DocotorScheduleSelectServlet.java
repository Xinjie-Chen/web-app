package servlet;

import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorScheduleSelect")
public class DocotorScheduleSelectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DoctorScheduleService ds =  new DoctorScheduleService();
        req.setAttribute("list", ds.getAll());
        req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
    }
}
