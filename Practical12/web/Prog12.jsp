<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Program-12</title>
    <style>
        body{
            background: pink;
        }
        .abc {
            position: absolute;
            top: 2in;
            background-color: lightgreen;
            height: 200px; /* Corrected the spelling of "height" */
            width: 400px;
            left: 5in;
            border-style: solid;
        }
    </style>
</head>
<body>
    <div class="abc" id="f1">
        <br>
        <form method="POST" action="Prog12">
            <table align="center">
                <tr>
                    <td colspan="2" align="center"><h3>Simple Interest</h3><hr></td>
                </tr>
                <tr>
                    <td>Amount :</td>
                    <td><input type="text" name="p"></td>
                </tr>
                <tr>
                    <td>Rate :</td>
                    <td><input type="text" name="r"></td>
                </tr>
                <tr>
                    <td>Time :</td>
                    <td><input type="text" name="n"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <hr>
                        <input type="submit" value="Calculate">
                        <input type="reset" value="Clear">
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <%@ include file="/footer.jsp" %>
</body>
</html>
