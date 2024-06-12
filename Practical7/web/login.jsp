<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Program-8</title>
<style>
.abc {
    background: lightgreen;
    position: static;
    top: 2in;
    height: 200px;
    width: 300px;
    left: 5in;
    border-style: solid;
}
</style>
</head>
<body>
<div class="abc" id="f1">
<br>
<form method="POST" action="home.jsp">
    <table align="center">
        <tr>
            <td>User Name:</td>
            <td><input type="text" name="txtUsr"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="txtPwd"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="checkbox" name="chkRM"> Remember Me
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Login">
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
