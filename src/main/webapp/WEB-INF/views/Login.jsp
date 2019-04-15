<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title> Login</title>
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
		<link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="resources/css/Login.css">
<style>
body {
  background-image: url("resources/images/loginbkg5.jpg");
  background-position: 50% 50%;
  background-repeat: repeat;
}
</style>
    </head>

    <body>
    
    
<ul>
                   <!--  <li><a href="default.asp"><font color="white">Home</font></a></li>-->
                    <li><a href="about.asp"><font color="white">About</font></a></li>
                    <!--<li><a href="about.asp"><font color="white">Job Openings</font></a></li>-->
                    
                    <li class="contact"><a href="contact.asp"><font color="white">Contact</font></a></li>
                    
                  </ul>
        <div class="login-box">
            
            <form action="Login.html" method="POST">
                <p class="paragraph"><font size="+1"><b>LOG IN</b></font></p>
               
               
                
                <input type="email" name="emailId" placeholder="Email Id" class="userDetails" required><br>
                
                <input type="password" name="password" placeholder="Password" class="userDetails" required><br>
               
                

               <div class="center"> 
                   <button type="submit"><font color="white">LOGIN</font></button>
                   <p class="signup2"><font color="grey">Don't have Account?</font></p>
                   <p class="signup"><a href="UserRegistration.html"><font color="white"><b><u>SIGN UP NOW</u></b></font></a></p>
               </div>
           </form>

        </div>    

    </body>
</html>