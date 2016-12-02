<%-- 
    Document   : index
    Created on : Oct 20, 2016, 2:19:35 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="item" items="${sessionScope.cartItems}">
        <h1>${item.name}}</h1>
     
       </c:forEach>
    </body> 
</html>
