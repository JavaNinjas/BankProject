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

    <h3>List of clients</h3>

    <b:table class="table bordered">
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

    </b:table>

    <a href="index.jsp" class="btn btn-success btn-large">Back</a>
</b:container>
</body>
</html>