<%-- 
    Document   : login
    Created on : Oct 20, 2016, 12:49:11 PM
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
        <h1>Login</h1>
        <c:if test="${param.error!=null}">
            <div style="color:red"> Invalid username/Password</div>
        </c:if>
        <form method="post" action="">
            <div>
            <label>User Name</label>
            <input type="text" name="username" placeholder="Username"/>
            </div>
             <div>
            <label>Password</label>
            <input type="password" name="password" placeholder="Password"/>
            </div>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
