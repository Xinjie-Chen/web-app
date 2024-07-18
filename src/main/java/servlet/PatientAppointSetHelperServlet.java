package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/patientAppointSetHelper")
public class PatientAppointSetHelperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String patient_id = req.getParameter("id");
        req.setAttribute("patient_id", patient_id);
        req.getRequestDispatcher("PatientAppointSet.jsp").forward(req, resp);
    }
}
