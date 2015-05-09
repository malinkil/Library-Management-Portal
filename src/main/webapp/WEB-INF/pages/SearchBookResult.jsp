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
    <link rel="stylesheet" type="text/css" href="st.css">
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
        <h2>Library Management System</h2>
    </div><br>
    <h3 align="center"><b>Available Books</b></h3>
</div>


<form method="post" action="issueBook.htm">

    <table class="gridtable" align="center">
        <thead>
        <tr>
            <th>Book title</th>
            <th>Version</th>
            <th>Author</th>
            <th>Category</th>
            <th>Issue</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.title}</td>
                <td>${book.version}</td>
                <td>${book.author}</td>
                <td>${book.category}</td>
                <td><input id= "selection"type="radio" name="bookId" value="${book.bookId}" class="form-control" id="id"></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <div class="subresult" align="center">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
</div>
<script type="text/javascript">
<!--	
var currentTime = new Date()
var month = currentTime.getMonth() + 1
var day = currentTime.getDate()
var year = currentTime.getFullYear()
var time = currentTime
//document.write(month + "/" + day + "/" + year)
document.write(time)
//--></script>

</body>
</html>