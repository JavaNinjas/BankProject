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

    <h3>List of clients</h3>

    <table class="table bordered">
        <c:forEach var="client" items="${clients}">
            <tr>
                <td>
                    <c:out value="${clients}"/>
                </td>
                <td>
                    <form name="submit" action="/delete" method="get">
                        <button class="btn btn-success btn-large">Delete</button>
                        <input type="hidden" name="deleteThisRow" value="<c:out value='${client.ID}'/>"/>
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>

    <a href="index.jsp" class="btn btn-success btn-large">Back</a>
</div>

<script src="http://code.jquery.com/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>