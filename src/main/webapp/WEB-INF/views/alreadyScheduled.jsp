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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>already Scheduled</title>
<link rel="stylesheet" href="resources/css/interviewSchedule.css">

 <style>
body {
  background-image: url("resources/images/urbkg7.jpg");
  
  background-repeat: repeat;
  background-size: cover;
  background-position: center;
}
</style>
</head>
<body>
 <ul>
                   
                    <!--<li><a href="about.asp"><font color="white"></font></a></li>
                    <li><a href="about.asp"><font color="white">Job Openings</font></a></li>-->
                    
                    <li class="logout"><a href="logout.html"><font color="white">LOGOUT</font></a></li>
                    <a href="HrHome.html">Home</a>
                  </ul>

<h1>already scheduled</h1>
 

</body>
</html>