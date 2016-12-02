/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shoppingcard.controller;

import com.leapfrog.shoppingcard.system.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sony
 */
@WebServlet(name="login",urlPatterns = {"/login"})

public class LoginController extends Controller{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
      request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
     if(request.getParameter("username").equals("admin")&&request.getParameter("password").equals("admin")){
     request.getSession().setAttribute("login", true);
     response.sendRedirect(request.getContextPath()+"/");
     }
     else{
     response.sendRedirect(request.getContextPath()+"/login?error");
     }
    }
    
}
