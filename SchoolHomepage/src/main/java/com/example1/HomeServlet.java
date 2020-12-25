package com.example1;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  super.doGet(req, resp);
        //resp.getWriter().println("hello world HomeServlet");
        // resp.sendRedirect(req.getContextPath()+ "/page");
        // resp.sendRedirect(req.getContextPath()+ "");
        req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
        //  resp.sendRedirect(req.getContextPath()+ "/page");
    }

}
