package servlet;


import service.DepartmentsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list")
public class DepartmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DepartmentsServiceImpl ds = new DepartmentsServiceImpl();

        req.setAttribute("list", ds.queryALL());
        req.getRequestDispatcher("list1.jsp").forward(req, resp);
    }
}
