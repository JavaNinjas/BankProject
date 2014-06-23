
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>Bank</h1>
  <h3>Add client</h3>
        <form name="input" action="index" method="get">
            <input type="text" name="firstName" value="First name"><br>
            <input type="text" name="lastName" value="Last name"><br>
            <input type="submit" value="Add">
        </form>
  <h3>Search client</h3>
  <form name="input" action="index" method="get">
      <input type="text" name="search" value=""><br>
      <input type="submit" value="Search">
  </form>
  </body>
</html>