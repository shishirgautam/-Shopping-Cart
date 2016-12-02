/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shoppingcard.controller;

import com.leapfrog.shoppingcard.entity.CartItem;
import com.leapfrog.shoppingcard.system.Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
@WebServlet(name="cart",urlPatterns = {"/cart/*"})
public class CartController extends Controller {
    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String url=request.getRequestURI().toLowerCase();
        if(url.contains("/list")){
        request.getRequestDispatcher("/WEB-INF/views/cart/index.jsp").forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        HttpSession session= request.getSession(true);
        if(session.getAttribute("cartItems")==null){
            session.setAttribute("cartItems", new ArrayList<CartItem>());
         
        }
        CartItem item=new CartItem();
        item.setName(request.getParameter("name"));
        item.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        item.setPrice(Double.parseDouble(request.getParameter("price")));
        List<CartItem>items=(List)session.getAttribute("cartItems");
        items.add(item);
        response.sendRedirect(request.getContextPath()+"/cart/list");
           
    }
    
}
