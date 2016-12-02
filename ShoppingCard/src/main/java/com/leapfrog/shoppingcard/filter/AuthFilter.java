/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shoppingcard.filter;

import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        if(!request.getRequestURI().toLowerCase().contains("/login"))
        {
           /* System.out.println("IP:" + request.getRemoteAddr());
            System.out.println("URl:" + request.getRequestURI());
            System.out.println("Date:" + new Date());*/
            HttpSession session= request.getSession(false);
            if(session==null || session.getAttribute("login")==null){
            response.sendRedirect(request.getContextPath()+ "/login");
            
            }else{
             chain.doFilter(request, response);
            }
        }else{
       
        chain.doFilter(request, response);
 }
    }

    @Override
    public void destroy() {

    }

}
