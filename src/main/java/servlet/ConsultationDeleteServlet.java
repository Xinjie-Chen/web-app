package servlet;

import service.ConsultationService;
import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/consultationDelete")
public class ConsultationDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        try {
            ConsultationService cs = new ConsultationService();
            cs.deleteById(id);
            resp.getWriter().write("ok");
        } catch (Exception e) {
            resp.getWriter().write("error");
        }
    }

}
