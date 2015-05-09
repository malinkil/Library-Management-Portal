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
        <h2>Library Management System</h2>
    </div><br>
    <h3><b>Create Record</b></h3>
    <form role="form" name="myForm" method="POST">
        <div class="form-group">
            <label for="id">USER NAME:</label>
            <input type="text" class="form-control" id="id" name="userName" placeholder="Enter ID">
        </div>
        <div class="form-group">
            <label for="password">PASSWORD:</label>
            <input type="text" class="form-control" id="password" name="password" placeholder="Enter Password">
        </div>
        <label for="role">Role:</label>
            <select name="role">
                <option value="ADMIN">ADMIN</option>
                <option value="USER">USER</option>
            </select>
        <div class="form-group">
            <label for="firstName">FIRST NAME:</label>
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name">
        </div>
        <div class="form-group">
            <label for="lastName">LAST NAME:</label>
            <input type="text" class="form-control" id="lastName" name= "lastName" placeholder="Enter Last Name">
        </div>
        <div class="form-group">
            <label for="email">EMAIL ID:</label>
            <input type="email" class="form-control" id="emailId" name ="email" placeholder="Enter Email id">
        </div>
        <div class="form-group">
            <label for="number">CONTACT NUMBER:</label>
            <input type="text" class="form-control" id="number" name="contactNo"placeholder="Enter Contact Number">
        </div>
        <div class="form-group">
            <label for="address">ADDRESS:</label>
            <input type="text" class="form-control" id="address" name ="address" placeholder="Enter Contact Address">
        </div>
        <div class="form-group">
            <label for="dob">DATE OF BIRTH:</label>
            <input type="date" name="dateOfBirth">
        </div>
        <div class="form-group">
            <label for="doj">DATE OF JOINING:</label>
            <input type="date" name="dateOfJoining">
        </div>
        <div class="form-group">
            <label for="customerType">CUSTOMER TYPE:</label>
            <select name="membershipId">
                <option value="1">REGULAR</option>
                <option value="2">PREMIUM</option>
            </select>
        </div>
        <input type="button" onClick="javascript:validateForm(this.form);" value ="Save" class="btn btn-primary"></input>
        <input type="reset" value="Reset" class="btn btn-primary">
    </form>
    
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>
