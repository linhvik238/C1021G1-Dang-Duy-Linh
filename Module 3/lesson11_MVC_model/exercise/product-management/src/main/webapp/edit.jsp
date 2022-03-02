<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2022
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<form action="/productServlet" method="post">
    <input type="hidden" name="action" value="edit" />
    <input type="hidden" name="id" value="${product.id}" />
    <label>Name:
        <input type="text" name="name" value="${product.name}"> </label> <br>
    <label>Price:
        <input type="text" name="price" value="${product.price}"> </label> <br>
    <label>Description:
        <input type="text" name="description" value="${product.description}"> </label> <br>
    <label>Producer:
        <input type="text" name="producer" value="${product.producer}"> </label> <br>
    <input type="submit" value="edit">
</body>
</html>
