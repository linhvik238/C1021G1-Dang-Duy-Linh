<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sandwich Condiments</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<center>
<h3> Please select the below condiments for your sandwich</h3>
    <div class="container">
<form method="post" action="/select">
    <div class="form-check">
    <input type="checkbox" id="tomato" class="btn-success" name="condiment" value="Tomato">
    <label for="tomato"> Tomato </label><br>
    </div>
    <div class="form-check">
    <input type="checkbox" id="lettuce" class="btn-success" name="condiment" value="Lettuce">
    <label for="lettuce"> Lettuce </label><br>
    </div>
    <div class="form-check">
    <input type="checkbox" id="onion" class="btn-success" name="condiment" value="Onion">
    <label for="onion"> Onion </label><br>
    </div>
    <div class="form-check">
    <input type="checkbox" id="chili" class="btn-success" name="condiment" value="Chili">
    <label for="chili"> Chili </label><br>
    </div>
    <div class="form-check">
    <input type="checkbox" id="mayonnaise" class="btn-success" name="condiment" value="Mayonnaise">
    <label for="mayonnaise"> Mayonnaise </label><br>
    </div>
    <input type="submit" value="select">
</form>
    </div>

<c:choose>
    <c:when test="${list != null}">
    <div class="container">
        <table border="2">
            <tr>
                <td class="btn-danger">You have selected</td>
            </tr>
            <c:forEach var="condiment" items="${list}">
                <tr>
                    <td class="btn-success">${condiment}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </c:when>
</c:choose>
</center>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
