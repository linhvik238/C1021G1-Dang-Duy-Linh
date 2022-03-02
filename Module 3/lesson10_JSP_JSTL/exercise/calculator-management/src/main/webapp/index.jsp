<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="/calculatorServlet" style="width: 50%;margin: auto" class="d-flex justify-content-center">
    <fieldset>
        <legend>Calculator</legend>
        <div class="d-flex ">
            <div class="">
                <label for="first">First operand: </label><br><br>
                <label for="operator">Operand: </label><br><br>
                <label for="second">Second operand: </label>
            </div>
            <div>
                <input type="text" id="first" name="firstOperator"><br><br>
                <select id="operator" name="operator">
                    <option value="addition">Addition</option>
                    <option value="subtraction">Subtraction</option>
                    <option value="multiplication">Multiplication</option>
                    <option value="division">Division</option>
                </select><br><br>
                <input type="text" id="second" name="secondOperator">
                <button type="submit">Calculator</button>
            </div>
        </div>

    </fieldset>
</form>
</body>
</html>