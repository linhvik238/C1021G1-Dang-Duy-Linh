<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
</head>
<body>
<form action="/productServlet?action=search" method="post">
    <label>Search Product: </label>
    <input type="text" name="nameProduct">
    <input type="submit" value="search">
</form>
</body>
</html>
