package com.demo.servlets;

import com.demo.beans.MyUser;
import com.demo.service.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registeruser")
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String role = req.getParameter("role");
        String pass = req.getParameter("pass");
        
        MyUser m = new MyUser(uname, email, role, pass);
        LoginService lsi = new LoginServiceImpl();
        boolean status = lsi.registerUser(m);
        
        if (status) {
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.forward(req, resp);
        } else {
            out.println("<h5>Registration failed</h5>");
            RequestDispatcher rd = req.getRequestDispatcher("register.html");
            rd.include(req, resp);
        }
    }
}
