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

@WebServlet(urlPatterns = "/package")
public class packageServlet  extends HttpServlet {

    private final SpringTemplateEngine springTemplateEngine;

    public packageServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine=springTemplateEngine;
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        WebContext webContext=new WebContext(request,response,request.getServletContext());
        this.springTemplateEngine.process("package.html",webContext,response.getWriter());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender= request.getParameter("gender");
        String baggage=request.getParameter("baggage");

        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);
        session.setAttribute("gender",gender);
        session.setAttribute("baggage",baggage);
        response.sendRedirect("passangers-baggages.html");
    }

}
*/
