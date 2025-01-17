package servlet;

import service.PatientAppointService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/patientAppointSelect")
public class PatientAppointSelectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PatientAppointService pas = new PatientAppointService();
        req.setAttribute("list", pas.selectAll());
        req.getRequestDispatcher("PatientAppointList.jsp").forward(req, resp);
    }
}
