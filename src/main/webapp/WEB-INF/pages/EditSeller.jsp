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
		<h3><b>Update Seller</b></h3>
      <form role="form" name="myForm" method="POST">
        <div class="form-group">
          <label for="id">USER NAME:</label>
          <input type="text" class="form-control" id="id"  value="${seller.sellerName }" name="sellerName" placeholder="Enter USER NAME">
        </div>
        <div class="form-group">
          <label for="firstName">FIRST NAME:</label>
          <input type="text" class="form-control" name="firstName" value="${seller.firstName}" id="firstName" placeholder="Enter First Name">
        </div>
        <div class="form-group">
          <label for="lastName">LAST NAME:</label>
          <input type="text" class="form-control" name="lastName" value="${seller.lastName}" id="lastName" placeholder="Enter Last Name">
        </div>
		<div class="form-group">
          <label for="email">EMAIL ID:</label>
          <input type="email" class="form-control" name="email" value="${seller.email}" id="emailId" placeholder="Enter Email id">
        </div>
		<div class="form-group">
          <label for="number">CONTACT NUMBER:</label>
          <input type="text" class="form-control" id="number"  value="${seller.contactNumber}" name="contactNumber" placeholder="Enter Contact Number">
        </div>
		<div class="form-group">
          <label for="address">ADDRESS:</label>
          <input type="text" class="form-control" id="address" value="${seller.address}" name="address" placeholder="Enter Address">
        </div>
		
        <input type="button" onClick="javascript:validateForm(this.form);"  value="Save"  class="btn btn-primary">
		<input type="reset" value="Reset" class="btn btn-primary">
      </form>
	 
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