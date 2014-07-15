<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!Doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bank Project</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
</head>
<body>

<div class="container">

    <h1>Bank</h1>
    <h3><c:out value="${clientDeleted}"/> deleted</h3>

    <h3>Show all clients</h3>

    <form name="submit" action="/index" method="get">
        <input type="submit" name ="showAll" class="btn btn-success btn-large" value="Show all"/>
    </form>
</div>

<script src="http://code.jquery.com/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>