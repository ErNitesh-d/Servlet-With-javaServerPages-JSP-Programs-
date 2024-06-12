<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Information Form</title>
    <style>
        body{
            background: #D7BDE2;
        }
       </style>
</head>
<body >
    <form action="Program17" method="get">
        <table>
            <tr>
                <td>Student ID:</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Student Name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Student Address:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>Enter mark (JWT):</td>
                <td><input type="text" name="jwt"></td>
            </tr>
            <tr>
                <td>Enter mark (MAD):</td>
                <td><input type="text" name="mad"></td>
            </tr>
            <tr>
                <td>Enter mark (PYTHON):</td>
                <td><input type="text" name="python"></td>
            </tr>
            <tr>
                <td>Enter mark (DS):</td>
                <td><input type="text" name="ds"></td>
            </tr>
        </table>
        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>
