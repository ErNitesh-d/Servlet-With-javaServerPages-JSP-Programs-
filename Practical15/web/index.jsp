<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Program-15</title>
    <style>
        div {
            background: lightgreen;
            width: 1000px;
            left: 110px;
        }
        .abcH {
            
            top: 20px;
            width: 1000px;
            border-style: solid;
        }
        .abcL {
            margin-top: 10px;
            margin-left: 250px;
            top: 200px;
            width: 500px;
            background: #DD93AC;
            font-size: 18px;
        }
        .abcF {
            
            margin-top: 10px;
            top: 500px;
            width: 1000px;
            border-style: solid;
        }
        
    </style>
</head>
<body bgcolor="lightgreen">
    <h1>   Dept of MCA</h1>
    <div>
        <jsp:include page="/header.jsp"/>
        <jsp:include page="/login.jsp" />
        <jsp:include page="/footer.jsp" />
        <br>
    </div>
</body>
</html>
