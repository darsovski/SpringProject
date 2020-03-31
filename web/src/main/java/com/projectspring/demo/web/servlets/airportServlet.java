/*
package com.projectspring.demo.web.servlets;

import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/airport")
public class airportServlet extends HttpServlet {

    private final SpringTemplateEngine springTemplateEngine;

    public airportServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine=springTemplateEngine;
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        WebContext webContext =new WebContext(request,response,request.getServletContext());
        this.springTemplateEngine.process("create-airport.html",webContext,response.getWriter());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        String country = request.getParameter("country");
        session.setAttribute("name",name);
        session.setAttribute("country",country);
        response.sendRedirect("create-flight.html");
    }
}
*/
