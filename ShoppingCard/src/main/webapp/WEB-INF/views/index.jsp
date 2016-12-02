<%-- 
    Document   : index
    Created on : Oct 20, 2016, 12:27:16 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tattoo Booking</h1>
        <form action="${pageContext.request.contextPath}/cart/add" method="post">
            <input type="text" name="name" value="Dots & Patterns"/>
            <input type="text" name="quantity" value="1"/>
            <input type="text" name="price" value="500"/>
            <button type="submit">Bye Now</button>
        </form>
        <form action="${pageContext.request.contextPath}/cart/add" method="post">
            <input type="text" name="name" value="Tardition Arts"/>
            <input type="text" name="quantity" value="1"/>
            <input type="text" name="price" value="1500"/>
            <button type="submit">Bye Now</button>
        </form>
    </body>
</html>
