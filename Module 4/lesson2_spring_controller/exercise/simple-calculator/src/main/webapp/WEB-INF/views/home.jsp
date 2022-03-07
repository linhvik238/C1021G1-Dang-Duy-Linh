<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h3> Calculator </h3>
<form action="/calculate" method="post">
    <table class="table">
        <tr>
            <td>
                <input type="number" name="num1" placeholder="first number">
            </td>
            <td>
                <input type="number" name="num2" placeholder="second number"> <br>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" class="btn btn-primary" name="calculate" value="+">Addition(+)</button>
            </td>
            <td>
                <button type="submit" class="btn btn-primary" name="calculate" value="-">Subtraction(-)</button>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" class="btn btn-primary" name="calculate" value="X">Multiplication(X)</button>
            </td>
            <td>
                <button type="submit" class="btn btn-primary" name="calculate" value="/">Division(/)</button>
            </td>
        </tr>
    </table>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
