<%-- 
    Document   : FirstPage
    Created on : May 7, 2024, 7:36:50 PM
    Author     : Nitesh-JETPUR
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User First Page</title>
</head>
<body>
    <h2>User First Page</h2>
    <%
        Integer accessCount = (Integer) session.getAttribute("accesscount");
        if (accessCount == null) {
            accessCount = 0;
        }
        session.setAttribute("accesscount", ++accessCount);
    %>
    Access Count: <%= accessCount %>
    <%
        String requestUrl = request.getRequestURI();
        String sessionUrl = (String) session.getAttribute("url");
        session.setAttribute("url", requestUrl + " " + sessionUrl);
    %>
    <h2>VISIT</h2>
    <a href="SecondPage.jsp">SecondPage.jsp</a>
</body>
</html>
