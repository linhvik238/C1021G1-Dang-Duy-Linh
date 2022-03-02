<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2022
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<form action="/productServlet" method="post">
    <input type="hidden" name="action" value="create" />
    <label>Id:
    <input type="text" name="id"> </label> <br>
    <label>Name:
    <input type="text" name="name"> </label> <br>
    <label>Price:
    <input type="text" name="price"> </label> <br>
    <label>Description:
    <input type="text" name="description"> </label> <br>
    <label>Producer:
    <input type="text" name="producer"> </label> <br>
    <input type="submit" value="register">
</form>
</body>
</html>
