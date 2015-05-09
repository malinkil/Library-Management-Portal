<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%
if(session.getAttribute("currentUser") == null){
response.sendRedirect("index.jsp");
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/st.css">
    <script type="text/javascript" src="js/validationScript.js"> </script>
</head>
<body>
<ul class="nav navbar-nav navbar-right">
                    <li><a class="btn btn-info" href="home.htm">Home</a>
                    </li>
                    <li><a class="btn btn-info" href="logout.htm">Logout</a>
                    </li>
                  </ul>
<div class="container">
    <div id=header>
        <h2>Library Management System</h2>
    </div><br><br>
    <h3><b>Welcome <c:out value="${usernameFromCtr}"></c:out></b></h3>
    <h4>
        <script type="text/javascript">
            
        

            function send(type){
                if(type == "addUser"){
                    window.location = "addUsers.htm";
                }else if(type == "viewUser"){
                    window.location = "viewUser.htm";
                }else if(type == "viewSeller"){
                    window.location = "viewSeller.htm";
                }else if(type == "addSeller"){
                    window.location = "createSeller.htm";
                }
                else if(type == "createOrder"){
                    window.location = "createOrder.htm";
                }
                else if(type == "searchBook"){
                    window.location = "searchBook.htm";
                }else if(type == "myBooks"){
                    window.location = "myBooks.htm";
                }
            }
          
        </script>
    </h4>
    
    <form action="main.htm" method="get">
        <table class="table">

            <div style=" margin-bottom: 20px;">
            <input type="button" onclick="javascript:send('addUser');" value ="Add User"  class="btn btn-primary"></input>
            <input id="fir" type="button" onclick="javascript:send('viewUser');" value="View User"   class="btn btn-primary"></input>
</div>
        <div class="sec">
                <input type="button" onclick="javascript:send('addSeller');" value ="Add Seller" class="btn btn-primary"></input>
                <input id = "second" type="button" onclick="javascript:send('viewSeller');" value="View Seller" class="btn btn-primary"></input>
            </div>

            <div class="third">
                 <input type="button" onclick="javascript:send('createOrder');" value="Create New Book Order"  class="btn btn-primary"></input>
                 <input id = "searchbook" type="button" onclick="javascript:send('searchBook');" value="Search Books"  class="btn btn-primary"></input>
                <input id = "mybook" type="button" onclick="javascript:send('myBooks');" value="My Books"  class="btn btn-primary"></input></td>
            </div>

        </table>
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
 