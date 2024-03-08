package io.hexlet.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    // BEGIN
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var param = req.getParameter("name");
        var name =  param.isEmpty() ? "Guest" : param;

        req.setAttribute("message", String.format("Hello, %s!", name));
        req.getRequestDispatcher("WEB-INF/hello.jsp").forward(req, resp);
    }
    // END
}
