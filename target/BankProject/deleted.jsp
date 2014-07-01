<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>Bank Project</title>
    <b:kickstart></b:kickstart>
</head>
<body>

<b:container>

    <h1>Bank</h1>
    <h3><c:out value="${clientDeleted}"/> deleted</h3>

    <h3>Show all clients</h3>

    <form name="submit" action="/index" method="get">
        <input type="submit" name ="showAll" class="btn btn-success btn-large" value="Show all"/>
    </form>
</b:container>

</body>
</html>