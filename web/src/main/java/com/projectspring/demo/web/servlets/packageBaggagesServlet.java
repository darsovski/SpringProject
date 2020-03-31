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

@WebServlet(urlPatterns = "/packageBaggage")
public class packageBaggagesServlet extends HttpServlet {

    private final SpringTemplateEngine springTemplateEngine;

    public packageBaggagesServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine=springTemplateEngine;
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        WebContext webContext =new WebContext(request,response,request.getServletContext());
        this.springTemplateEngine.process("passengers-baggages.html",webContext,response.getWriter());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        WebContext webContext=new WebContext(request,response,request.getServletContext());
        webContext.setVariable("basic",session.getAttribute("basic"));
        webContext.setVariable("medium",session.getAttribute("medium"));
        webContext.setVariable("premium",session.getAttribute("premium"));
    }
}
*/
