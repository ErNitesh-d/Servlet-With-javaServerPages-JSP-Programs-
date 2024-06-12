<%-- 
    Document   : SecondPage
    Created on : May 7, 2024, 7:38:33 PM
    Author     : Nitesh-JETPUR
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>SESSION DEMO</title>
</head>
<body>
     
    <h2>User Second Page</h2>
    <%
        Integer accessCount = (Integer) session.getAttribute("accesscount");
        if (accessCount == null) {
            accessCount = 0;
        }
        session.setAttribute("accesscount", ++accessCount);
    %>
    <br>
    Access Count: <%= accessCount %>
    <%
        String requestUrl = request.getRequestURI();
        String sessionUrl = (String) session.getAttribute("url");
        session.setAttribute("url", requestUrl + " " + sessionUrl);
    %>
    
</body>
</html>
