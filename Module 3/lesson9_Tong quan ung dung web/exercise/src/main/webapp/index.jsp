<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="calculate.jsp" method="post">
    <label>Product Description: </label>
    <input type="text" name="description" placeholder="description" /> <br>
    <label>List Price: </label>
    <input type="text" name="price" placeholder="price" /> <br>
    <label>Discount Percent: </label>
    <input type="text" name="discount" placeholder="discount percent" /> <br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
