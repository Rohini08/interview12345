<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%            
        response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
        response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
        response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
        <title>Login</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet"  href="resources/css/Login.css"/>
    </head>
    <body style="background-image: url(resources/images/loginbkg5.jpg);">
            <ul>
                    <li><a href="default.asp"><font color="white">Home</font></a></li>
                    <li><a href="about.asp"><font color="white">About</font></a></li>
                    <!--<li><a href="about.asp"><font color="white">Job Openings</font></a></li>-->
                    
                    <li class="contact"><a href="contact.asp"><font color="white">Contact</font></a></li>
                    
                  </ul>
        <div class="login-box">
            
            <form  action="Login.html" method="POST">
                <p class="paragraph"><b>LOG IN</b></p>
               
               
                
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