<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
    <style>
        h1 {
            color : darksalmon;
        }
    </style>
</head>
<body>
<%
    String productDescription = request.getParameter("description");
    float listPrice = Float.parseFloat(request.getParameter("price"));
    float discountPercent = Float.parseFloat(request.getParameter("discount"));

    double discountAmount = listPrice * discountPercent * 0.01;
    double discountPrice = listPrice - discountAmount;
%>
<h1>Product Description: <%=productDescription%></h1>
<h1>List Price: <%=listPrice%></h1>
<h1>Discount Percent: <%=discountPercent%></h1>
<h1>Discount Amount: <%=discountAmount%></h1>
<h1>Discount Price: <%=discountPrice%></h1>
</body>
</html>
