<%-- 
    Document   : Home
    Created on : Apr 30, 2019, 1:47:48 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <link rel="stylesheet" href="style1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Airline Reservation</title>
    </head>
    <body>
        <table width="100%">
            <tr height="100px">
                <td colspan="3" align="center"><h1>Airline Reservation</h1></td>
                <td align="right" style="vertical-align: top;"><h3>
                 <jsp:include page="header.jsp"></jsp:include></h3></td></tr>
            <tr height="50px" align="center"><td><h3><a href="Home.jsp">Home</a></h3></td>
                <td><h3><a href="tiketReservation.jsp">Ticket Reservation</a></h3></td>
                <td><h3><a href="aboutus.jsp">About Us</a></h3></td>
                <td><h3><a href="register.jsp">signup</a></h3></td></tr>
            <tr height="500px" align="center"><td colspan="4"><h1>Welcome to  Airline Reservation</h1>
                     <a href="login.jsp">LOg IN</a>
                    
            <marquee behavior="scroll"><image src="images/2.jpg"  height="180px" width="200px" />
                            <image src="images/5.jpg"  height="180px" width="200px" />
                            <image src="images/6.jpg"  height="180px" width="220px" />
                            <image src="images/7.jpg"  height="180px" width="200px" />
                            <image src="images/8.jpg"  height="180px" width="200px" />
                            <image src="images/9.jpg"  height="180px" width="200px" /></marquee>    
                    </td>
               </tr>
               <tr height="20px" align="center"><td colspan="4"><footer><h3>Airline Reservation Copyright &copy; 2019</h3></footer></td>
               </tr>
        </table>
    </body>
</html>
