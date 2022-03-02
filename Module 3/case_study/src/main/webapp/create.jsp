<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create New Customer</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/customer?action=create" method="post">
                <div class="form-group">
                    <label for="customer-id"></label>
                    <input type="hidden" class="form-control" id="customer-id" name="customer-id">
                </div>
                <div class="form-group">
                    <label for="customer-name">Name</label>
                    <input type="text" class="form-control" id="customer-name" name="customer-name">
                </div>
                <div class="form-group">
                    <label for="code-birthday">Birthday: </label>
                    <input type="date" class="form-control" id="code-birthday" name="code-birthday">
                </div>
                <div class="form-group">
                    <label for="gender">Gender: </label>
                    <select class="form-control" id="gender" name="gender" required>
                        <option value="">Please select</option>
                        <option value="true">Male</option>
                        <option value="false">Female</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="customer-id-card">Id Card: </label>
                    <input type="text" class="form-control" id="customer-id-card" name="customer-id-card">
                </div>
                <div class="form-group">
                    <label for="customer-phone">Customer Phone: </label>
                    <input type="text" class="form-control" id="customer-phone" name="customer-phone">
                </div>
                <div class="form-group">
                    <label for="customer-email">Customer Email: </label>
                    <input type="text" class="form-control" id="customer-email" name="customer-email">
                </div>
                <div class="form-group">
                    <label for="customer-address">Address: </label>
                    <input type="text" class="form-control" id="customer-address" name="customer-address">
                </div>
                <div class="form-group">
                    <label for="category">CustomerType: </label>
                    <select class="form-control" id="category" name="idCustomerType">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

                <script src="/assert/jquery/jquery-3.5.1.min.js"></script>
                <script src="/assert/bootstrap413/js/popper.min.js"></script>
                <script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
                <script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>


</body>
</html>
