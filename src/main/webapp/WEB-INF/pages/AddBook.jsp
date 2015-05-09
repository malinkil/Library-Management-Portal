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
<div class="navbar-collapse collapse" style="height: 1px;">
                <ul class="nav navbar-nav navbar-right">
                    <li><a class="btn btn-info" href="home.htm">Home</a>
                    </li>
                  </ul>
<div class="container">
    <div id=header>
        <h2>Library MANAGEMENT SYSTEM</h2>
    </div><br>
    <h3><b>Create Book Order</b></h3>
    <form role="form" name="myForm" method="post">
        <div class="form-group" >
            <label for="bt">BOOK Title</label>
            <input type="text" class="form-control" id="id" name="title" placeholder="Enter Book name">
        </div>
        <div class="form-group">
            <label for="version">Version</label>
            <input type="text" class="form-control"  name="version"  placeholder="Enter version">
        </div>
        <div class="form-group">
            <label for="bkEdition">Category</label>
            <input type="text" class="form-control" id="bkEdition"  name="category" placeholder="Enter book category">
        </div>
        <div class="form-group">
            <label for="author">Author</label>
            <input type="text" class="form-control"  name="author"  placeholder="Enter author">
        </div>
        <div class="form-group">
            <label for="qty">QUANTITY:</label>
            <input type="text" class="form-control" id="qty" name="quantity"  placeholder="Quantity">
        </div>
        <div class="form-group">
            <label for="sId">SELLER ID:</label>
            <select name="sellerId">
                <c:forEach items="${sellerList}" var="sell">
                    <option  value="${sell.sellerId }">${sell.sellerName }</option>

                </c:forEach>
            </select>
        </div>
        <input type="button" onClick="javascript:validateForm(this.form);" value="Order"class="btn btn-primary">
        <input type="reset" value="Reset" class="btn btn-primary">
    </form>
   

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>