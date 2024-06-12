<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index Page</title>
    <style>
        .abc {
            background: pink;
            top: 2in;
            height: 250px;
            width: 400px;
            font-size: 18px;
            left: 5in;
            border-style: solid;
           font-weight: bold;
        }
       
    </style>
</head>
<body>
    <div class="abc" id="f1">
        <form method="POST" action="Result.jsp">
            <table align="center">
                <tr>
                    <td colspan="2" align="center">
                        <h3>Simple Interest</h3>
                        <hr>
                    </td>
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
                        <input type="submit" value="Calculate" style="font-weight: bold;">
                        <input type="reset" value="Clear" style="font-weight: bold;">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
