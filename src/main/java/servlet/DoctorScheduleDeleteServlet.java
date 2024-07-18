package servlet;

import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorScheduleDelete")
public class DoctorScheduleDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DoctorScheduleService ds = new DoctorScheduleService();
        try {
            resp.getWriter().write("ok");
            ds.deleteById(Integer.parseInt(req.getParameter("id")));
        } catch (Exception e) {
            resp.getWriter().write("error");
        }

    }
}
