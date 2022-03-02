<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2022
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List Product</title>
    <style>
        .description {
            width: 350px;
            text-align: justify;
        }
    </style>
</head>
<body>
<a href="/productServlet?action=create">Create Product</a>
<td><a href="/productServlet?action=search&name=${product.name}">Search</a></td>
<p style="color:chocolate">${message}</p>
<h3>List Product</h3>

<table align="center" border="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th class="description">Description</th>
        <th>Producer</th>
        <th colspan="5">Action</th>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td><a href="/productServlet?action=detail&id=${product.id}">${product.name}</a></td>
            <td>${product.price}</td>
            <td class="description">${product.description}</td>
            <td>${product.producer}</td>
            <td><a href="/productServlet?action=edit&id=${product.id}">Edit</a></td>
            <td><a href="/productServlet?action=delete&id=${product.id}">Delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
