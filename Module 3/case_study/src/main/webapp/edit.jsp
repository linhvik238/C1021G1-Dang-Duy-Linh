<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Customer</title>
</head>
<body>
<center>
    <h1>Update Customer</h1>
    <h2>
        <a href = "/customer">List All Customers</a>
    </h2>
    <div align="center">
        <form action = "/customer?action=edit" method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit Customer
                    </h2>
                </caption>
                <tr>
                    <th>Customer Id: </th>
                    <td>
                        <input type="text" name="customer-id" size="45" readonly
                               value = "<c:out value="${customer.customerId}"/>"/>
                    </td>
                </tr>

                <tr>
                    <th>Customer Code: </th>
                    <td>
                        <input type="text" size="45" readonly
                               value = "<c:out value="${customer.customerCode}" /> " />
                    </td>
                </tr>

                <tr>
                    <th>Customer Name: </th>
                    <td>
                        <input type="text" name="customer-name" size="45"
                               value = "<c:out value="${customer.customerName}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Birthday: </th>
                    <td>
                        <input type="text" name="code-birthday" size="45"
                               value = "<c:out value="${customer.customerBirthday}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Gender: </th>
                    <td>
                        <label for="gender-category">
                        <select name="gender" id="gender-category">
                        <option value="true" ${customer.gender = "true" ? "selected":""}/> Nam </option>
                        <option value="false" ${customer.gender = "false" ? "":"selected"}/> Nữ </option>
                        </select>
                        </label>
                    </td>
                </tr>
                <tr>
                    <th>Customer Id Card: </th>
                    <td>
                        <input type="text" name="customer-id-card" size="45"
                               value = "<c:out value="${customer.customerIdCard}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Phone: </th>
                    <td>
                        <input type="text" name="customer-phone" size="45"
                               value = "<c:out value="${customer.customerPhone}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Email: </th>
                    <td>
                        <input type="text" name="customer-email" size="45"
                               value = "<c:out value="${customer.customerEmail}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Address: </th>
                    <td>
                        <input type="text" name="customer-address" size="45"
                               value = "<c:out value="${customer.customerAddress}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Customer Type Id: </th>
                    <td>
                        <label for="category">CustomerType: </label>
                        <select class="form-control" id="category" name="customerType">
                            <c:forEach var="type" items="${customerType}">
                                <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="save" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</center>
</body>
</html>
