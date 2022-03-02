<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2022
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Detail Product</title>
</head>
<body>
<label>Id: </label>
<c:out value="${product.id}"></c:out> <br>
<label>Name: </label>
<c:out value="${product.name}"></c:out> <br>
<label>Price: </label>
<c:out value="${product.price}"></c:out> <br>
<label>Description: </label>
<c:out value="${product.description}"></c:out> <br>
<label>Producer: </label>
<c:out value="${product.producer}"></c:out> <br>
</body>
</html>
