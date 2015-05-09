<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/st.css">
    <script type="text/javascript" src="js/validationScript.js">

    </script>

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
    <h3><b>UPDATE</b></h3>
    <form role="form" method="post" name="myForm">
        <div class="form-group">
            <label for="id">USER ID:</label>
            <input type="text" class="form-control" value="${user.userName }" name="userName" placeholder="Enter ID">
        </div>
         <label for="role">CUSTOMER TYPE:</label>
            <select name="role">
                <option value="ADMIN">ADMIN</option>
                <option value="USER">USER</option>
            </select>
        <div class="form-group">
            <label for="firstName">FIRST NAME:</label>
            <input type="text" class="form-control" value="${user.firstName }" name="firstName" placeholder="Enter First Name">
        </div>
        <div class="form-group">
            <label for="lastName">LAST NAME:</label>
            <input type="text" class="form-control" value="${user.lastName }" name="lastName" placeholder="Enter Last Name">
        </div>
        <div class="form-group">
            <label for="email">EMAIL ID:</label>
            <input type="email" class="form-control" value="${user.email }" name="email" placeholder="Enter Email id">
        </div>
        <div class="form-group">
            <label for="number">CONTACT NUMBER:</label>
            <input type="text" class="form-control" value="${user.contactNo }" name="contactNo" placeholder="Enter Contact Number">
        </div>
        <div class="form-group">
            <label for="address">ADDRESS:</label>
            <input type="text" class="form-control"  value="${user.address }" name="address" placeholder="Enter Contact Address">
        </div>
        <div class="form-group">
            <label for="dob">DATE OF BIRTH:</label>
            <input type="date" name="dateOfBirth" >
            <label>${user.dateOfBirth }</label>
        </div>
        <div class="form-group">
            <label for="doj">DATE OF JOINING:</label>
            <input type="date" name="dateOfJoining" >
            <label>${user.dateOfBirth }</label>
        </div>
        <div class="form-group">
            <label for="customerType">CUSTOMER TYPE:</label>
            <select name="membershipId">
                <option value="1">REGULAR</option>
                <option value="2">PREMIUM</option>
            </select>
        </div>
        <input type="button" value="SAVE" onClick="javascript:validateForm(this.form);" class="btn btn-primary">
        <input type="reset" value="RESET" class="btn btn-primary">
    </form>
    <div align ="right">
        <a href="home.htm"><b>Back to home</a>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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