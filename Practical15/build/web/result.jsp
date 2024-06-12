<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result Page</title>
</head>
<body>
    <%
        String d;
        if (request.getParameter("txtUsr").equals("Nitesh") && request.getParameter("txtPwd").equals("admin")) {
            d = "Welcome.jsp";
        } else {
            d = "index.jsp";
        }
        response.sendRedirect(d);
    %>
</body>
</html>
