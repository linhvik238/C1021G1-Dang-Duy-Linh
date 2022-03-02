<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>User Management Application</title>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <style>
    * {
      background-color: darkseagreen;
    }

    th {
      color: crimson;
      background: darkgrey;
    }

    a {
      text-decoration-line: none;
    }
  </style>
</head>
<body>
<center>
  <h1>
    <a href="/users">User Management</a>
  </h1>
  <h2>
    <a href="/users?action=create">Add New User</a>
  </h2>
  <form action="/users?action=search" method="post">
    <input type="text" name="country" placeholder="search by country name" required>
    <input type="submit" value="search">
  </form>
  <form action="/users?action=searchById" method="post">
    <input type="text" name="id" placeholder="search by ID" required>
    <input type="submit" value="search by ID">
  </form>
</center>
<div align="center">
  <table border="2" cellpadding="5">
    <caption><h2>List of Users</h2></caption>
    <thead>
    <tr>
      <th>ID:</th>
      <th>Name:</th>
      <th>Email:</th>
      <th>Country:</th>
      <th>Actions:</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${listUser}">
      <tr>
        <td><c:out value="${user.id}"/></td>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.country}"/></td>
        <td>
          <a href="/users?action=edit&id=${user.id}"><i class="material-icons"
                                                        style="font-size:30px;color:red">edit</i></a>
          <a href="/users?action=delete&id=${user.id}"><i class="material-icons"
                                                          style="font-size:30px;color:red">delete</i></a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</script>
</body>
</html>
