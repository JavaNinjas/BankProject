<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>

<html>
<head>
    <title>Bank Project</title>
    <b:kickstart></b:kickstart>
</head>
<body>


<b:container>
<div class="row">
    <div class="col-md-6">
        <h1>Bank</h1>

        <h3>Add client</h3>


        <form name="input" action="/add" method="post">
            <input type="text" name="firstName" class="form-control" value="First name"><br>
            <input type="text" name="lastName" class="form-control" value="Last name"><br>
            <input type="submit" name="add" class="btn btn-success btn-large" value="Add">
        </form>

        <h3>Show all clients</h3>

        <form name="submit" action="/index" method="get">
            <input type="submit" name="showAll" class="btn btn-success btn-large" value="Show all"/>
        </form>
    </div>
    <div class="col-md-6">



    </div>


    </b:container>

     </div>

</body>
</html>