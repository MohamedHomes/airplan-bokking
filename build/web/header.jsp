<%-- 
 Document   : Home
    Created on : Apr 30, 2019, 1:47:48 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
    if(session.getAttribute("username")!=null)
    {
        String username=(String)session.getAttribute("username");
        out.print("Welcome ,"+ username);
    }
    %>


    </body>
</html>
