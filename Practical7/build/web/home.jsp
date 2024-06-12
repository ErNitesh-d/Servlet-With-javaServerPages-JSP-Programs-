<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pro-8</title>
<style>
.abc {
    background: yellow;
    position:static;
    height: 200px; /* corrected 'hieght' to 'height' */
    width: 300px;
    border-style: solid;
}
</style>
</head>
<body>
<div class="abc" id="f1">
<br>

<h1><center>WELCOME</center></h1>

<%
    String username = request.getParameter("txtUsr");
    out.println("<h1>" + username + "</h1>");
   %>
</div>
</body>
</html>
