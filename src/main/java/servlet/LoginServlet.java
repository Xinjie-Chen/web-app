package servlet;

import service.DepartmentsServiceImpl;
import service.LoginServiceImpl;
import service.doctorScheduleAddImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        System.out.println(username + " " + password);
        LoginServiceImpl ls = new LoginServiceImpl();
        String realPassword = ls.getPassword(username);
        if(realPassword != null && realPassword.equals(password)) {
            doctorScheduleAddImpl dsa = new doctorScheduleAddImpl();
            req.setAttribute("list", dsa.getAll());
            req.getRequestDispatcher("doctorSchedule.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
