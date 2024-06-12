<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <style>
        .abc {
            background: yellow;
            /*position: absolute;*/
            top: 2in;
            height: 200px;
            width: 350px;
            left: 5in;
            border-style: solid;
            font-size: 25px;
        }
    </style>
</head>
<body>
    <div class="abc" id="f1">
                <br><br>
                <b>Visit</b>
                
        <%
             
            String userName = request.getParameter("userName");
            if (userName != null && !userName.isEmpty()) {
                out.println("<b><p>Welcome, " + userName + " !</p></b>");
            } else {
                out.println("<p>Welcome!</p>");
            }
        %>
    </div>
</body>
</html>
