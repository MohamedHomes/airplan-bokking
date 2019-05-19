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
            <td align="right" style="vertical-align: top;"><h3><jsp:include page="header.jsp"></jsp:include></h3></td></tr>
            <tr height="50px" align="center"><td><h3><a href="Home.jsp">Home</a></h3></td>
                <td><h3><a href="tiketReservation.jsp">Ticket Reservation</a></h3></td>
                <td><h3><a href="aboutus.jsp">About Us</a></h3></td>
                <td><h3><a href="feedback.jsp">Feedback</a></h3></td></tr>
            <tr height="500px"><td colspan="4"><marquee behavior="alternate"><image src="images/2.jpg"  height="110px" width="150px" />
                                                        <image src="images/3.jpg"  height="110px" width="150px" />
                                                        <image src="images/15.jpg"  height="110px" width="150px" />
                                                        <image src="images/16.jpg"  height="110px" width="150px" />
                                                        <image src="images/17.jpg"  height="110px" width="150px" /></marquee>
                    <h3 style="text-align: justify;width: 100%;"> 
Airline reservation systems (ARS) are part of the so-called passenger service systems (PSS), which are applications supporting the direct contact with the passenger.

ARS eventually evolved into the computer reservations system (CRS). A computer reservation system is used for the reservations of a particular airline and interfaces with a global distribution system (GDS) which supports travel agencies and other distribution channels in making reservations for most major airlines in a single system
********************
airline reservation systems incorporate airline schedules, fare tariffs, passenger reservations and ticket records. An airline's direct distribution works within their own reservation system, as well as pushing out information to the GDS. The second type of direct distribution channel are consumers who use the internet or mobile applications to make their own reservations. Travel agencies and other indirect distribution channels access the same GDS as those accessed by the airline reservation systems, and all messaging is transmitted by a standardized messaging system that functions on two types of messaging that transmit on SITA's high level network (HLN). These messaging types are called Type A [usually EDIFACT format] for real time interactive communication and Type B [TTY] for informational and booking type of messages. Message construction standards set by IATA and ICAO, are global, and apply to more than air transportation. Since airline reservation systems are business critical applications, and they are functionally quite complex, the operation of an in-house airline reservation system is relatively expensive.

Prior to deregulation, airlines owned their own reservation systems with travel agents subscribing to them. Today, the GDS are run by independent companies with airlines and travel agencies being major subscribers.

As of February 2009, there are only four major GDS providers in the market: Amadeus, Travelport (which operates the Apollo, Worldspan and Galileo systems), Sabre and Shares. There is one major Regional GDS, Abacus, serving the Asian market and a number of regional players serving single countries, including Travelsky (China), Infini and Axess (both Japan) and Topas (South Korea). Of these, Infini is hosted within the Sabre complex, Axess is in the process of moving into a partition within the Worldspan complex, and Topas agencies will be migrating into Amadeus.

Reservation systems may host "ticket-less" airlines and "hybrid" airlines that use e-ticketing in addition to ticket-less to accommodate code-shares and interlines.

In addition to these "standardized" GDS, some airlines have proprietary versions which they use to run their flight operations. A few examples are Delta's OSS and Deltamatic systems and EDS SHARES. SITA Reservations remains the largest neutral multi-host airline reservations system, with over 100 airlines currently managing inventory. 
            
</h3>
                    <h2>The Vision</h2><h3 style="text-align: justify;width: 100%;">GoAir strives to maintain and enhance passenger’s perception of its services, and in doing so will consistently endeavour to improve on the quality and reliability of its operations. </h3>
                    <h2>The Mission</h2><h3 style="text-align: justify;width: 100%;">To provide safe, secure and efficient transportation at all times with attention to essential details that uniquely differentiates our services, thus leading to strengthening and maintaining our position in the market.</h3>
                    </td>
               </tr>
               <tr height="20px" align="center"><td colspan="4"><footer><h3>Airline Reservation Copyright &copy; 2019</h3></footer></td>
               </tr>
        </table>
    </body>
</html>
