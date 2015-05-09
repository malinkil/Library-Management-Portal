<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    
    <style>
        body{
            background-color:#E6E6E6 ;
        }
        p.serif {
            font-family: "Times New Roman", Times, sans-serif;
        }
        h1   {font-family: "Times New Roman", Times, sans-serif;
            color:Black; font-size:300%;
        }
          body {
    background-image: url("lib.jpg");
	 background-size: 1500px 1000px;
    background-repeat: no-repeat;
}
      #box{
      border:none;
      }  

    </style>
</head>
<body>
<h1 align="center">Library Management System</h1>


<form action="doLogin.htm" method="post">
    <div align = "center">

        <fieldset id="box">

            <b>UserName:</b>
            <input type="text" name="userName" style="font-size: 20pt">
            <br><br>
            <b>Password:</b>
                <input type="password" name="password" style="font-size: 20pt">
                <br><br>
                <input type="submit" value="Login">
        </fieldset>
    </div>
</form>
</body>

</html>
