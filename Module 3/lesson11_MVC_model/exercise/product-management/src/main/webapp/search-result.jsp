<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<html>
<head>
    <title>Search Result</title>
    <style>
        th {
            text-align: center;
            color: crimson;
        }
        td {
            width: 100px;
            text-align: center;
        }
        .description {
            width: 350px;
            text-align: center;
        }
    </style>
</head>
<body>
<a href="/productServlet">Return to main menu</a>
<h2>Your search product is: </h2>
<%--<c:if test="${message == null}">--%>
<c:choose>
    <c:when test="${message == null}">
        <c:forEach var="product" items="${listSearch}">
        <table border="2">
            <tr>
                <th>Id: </th>
                <th>Name: </th>
                <th>Price: </th>
                <th class="description">Description: </th>
                <th>Producer: </th>
            </tr>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td class="description">${product.description}</td>
                <td>${product.producer}</td>
            </tr>
        </table>
        </c:forEach>
    </c:when>
    <c:otherwise>
        <h2>${message}</h2>
    </c:otherwise>
</c:choose>
</body>
</html>
