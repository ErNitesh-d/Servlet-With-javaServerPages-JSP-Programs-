<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LoginPage</title>
</head>
<body>
    <div class="abcL" id="f1">
        <form method="POST" action="result.jsp">
            <table align="center">
                <tr>
                    <td colspan="2" align="center">
                        <h1>Login</h1>
                        <hr>
                    </td>
                </tr>
                <tr>
                     <td><h2>User Name: </h2></td>
                    <td><input type="text" name="txtUsr"  style="font-size: 18px; font-weight: bold;" ></td>
                </tr>
                <tr>
                   <td><h2>Password: </h2></td>
                    <td><input type="password" name="txtPwd"   style="font-size: 18px; font-weight: bold;" ></td>
                </tr>
                <tr>
                    <td colspan="5" align="center">
                        <hr>
                        <input type="submit" value="Login" style="font-size: 18px; font-weight: bold;">
                        <input type="reset" value="Reset" style="font-size: 18px; font-weight: bold;">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
