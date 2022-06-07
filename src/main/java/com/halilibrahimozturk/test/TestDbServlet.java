package com.halilibrahimozturk.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestDbServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String htmlResponse = "<html>";
        htmlResponse += "<h3>Hello World in Servlet</h3>";
        htmlResponse += "</html>";
        response.getWriter().println(htmlResponse);
    }
}
