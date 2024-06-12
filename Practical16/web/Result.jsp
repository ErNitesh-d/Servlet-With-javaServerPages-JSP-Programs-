<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Result Page</title>
    <style>
        .abc {
            background: pink;
           font-weight: bold;
           font-size: 18px;
            top: 2in;
            height: 250px;
            width: 400px;
            left: 5in;
            border-style: solid;
        }
    </style>
</head>
<body>
       <jsp:useBean id="si" class="ex.SimpleInterest" />
         <jsp:setProperty name="si" property="*"/>
        <div class="abc" id="f1">
          
            <table width="50%" align="center">
                <tr>
                    <th colspan="2">
                        <h3>Simple Interest</h3>
                        <hr>
                    </th>
                </tr>
                <tr>
                    <td>Amount :</td>
                    <td><jsp:getProperty name="si" property="p" /></td>
                </tr>
                <tr>
                    <td>Rate :</td>
                    <td><jsp:getProperty name="si" property="r" /></td>
                </tr>
                <tr>
                    <td>Time :</td>
                    <td><jsp:getProperty name="si" property="n" /></td>
                </tr>
                <%
                    // Calculate interest before displaying
                    si.calculateInterest();
                %>
                <tr>
                    <td>Interest :</td>
                    <td><jsp:getProperty name="si" property="interest" /></td>
                </tr>
                <tr>
                    <th colspan="2">
                        <hr>
                        <a href="index.jsp">Home</a>
                    </th>
                </tr>
            </table>
        </div>
   </body>
</html>
