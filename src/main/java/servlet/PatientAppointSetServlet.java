package servlet;

import entity.Appointments;
import entity.DoctorSchedule;
import service.PatientAppointService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/patientAppointSet")
public class PatientAppointSetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String status = req.getParameter("status");
        String patient_id = req.getParameter("patient_id");
        PatientAppointService pas = new PatientAppointService();

        Appointments ap = new Appointments();
        ap.setPatient_id(Integer.parseInt(patient_id));
        ap.setStatus(status);

        pas.setById(ap);

        req.setAttribute("list", pas.selectAll());
        req.getRequestDispatcher("PatientAppointList.jsp").forward(req, resp);
    }
}
