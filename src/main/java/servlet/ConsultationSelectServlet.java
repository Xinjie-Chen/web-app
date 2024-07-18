package servlet;

import service.ConsultationService;
import service.DoctorScheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/consultationSelect")
public class ConsultationSelectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ConsultationService cs = new ConsultationService();
        req.setAttribute("list", cs.getAll());
        req.getRequestDispatcher("consultationList.jsp").forward(req, resp);
    }

}
