<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <style>
        div {
            background: lightgreen;
            position: absolute;
            width: 1000px;
            left: 110px;
        }
        .abcH {
            top: 0.5cm;
            width: 1000px;
            border-style: solid;
        }
        .abcL {
            top: 200px;
            width: 1000px;
        }
        .abcF {
            top: 500px;
            width: 1000px;
            border-style: solid;
        }
    </style>
</head>
<body bgcolor="lightgreen">
    <%@ include file="/header.jsp" %>
    <div class="abcL">
        <center>
            <h1>Welcome To Website OF GUJARAT TECHNOLOGICAL UNIVERSITY</h1>
            <br>
            <br>
            <h1><a href="index.jsp">Home</a></h1>
        </center>
    </div>
    <jsp:include page="/footer.jsp" />
</body>
</html>
