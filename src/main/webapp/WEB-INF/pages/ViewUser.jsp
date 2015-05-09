
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/st.css">
    <script type="text/javascript" src="js/validationScript.js"></script>

</head>

<body>

<ul class="nav navbar-nav navbar-right">
  <li><a class="btn btn-info" href="home.htm">Home</a>
  </li>
</ul>
<div class="container">
    <div id=header>
        <h2>Library management System</h2>
    </div><br>
    <h3 class="viewuser"><b>View User</b></h3>
</div>
<table class="gridtable" align="center">
    <thead>
    <tr>
        <th>User Name</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Role</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.role}</td>
            <td onclick="location.href='editUser.htm?userId=${user.userId}'"><a>Update</a></td>
            <td onclick="location.href='deleteUser.htm?userId=${user.userId}'"><a>Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</div>

</body>
</html>
