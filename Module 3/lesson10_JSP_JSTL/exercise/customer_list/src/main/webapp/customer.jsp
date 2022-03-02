<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/2/2022
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dayOfBirth}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" width="100px" height="80px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
