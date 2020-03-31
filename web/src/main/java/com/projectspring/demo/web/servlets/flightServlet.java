/*
package com.projectspring.demo.web.servlets;


import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns="/flight")
public class flightServlet extends HttpServlet {


    private final SpringTemplateEngine springTemplateEngine;

    public flightServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine=springTemplateEngine;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        WebContext webContext=new WebContext(request,response,request.getServletContext());
        this.springTemplateEngine.process("create-flight.html",webContext,response.getWriter());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session= request.getSession();
        String origin=request.getParameter("origin");
        String destination =request.getParameter("destination");
        String departureDate = request.getParameter("departureDate");
        String returnDate=request.getParameter("returnDate");
        String passengers =request.getParameter("passengers");

        session.setAttribute("origin",origin);
        session.setAttribute("destination",destination);
        session.setAttribute("departureDate",departureDate);
        session.setAttribute("returnDate",returnDate);
        session.setAttribute("passengers",passengers);
        response.sendRedirect("package.html");
    }

}
*/
