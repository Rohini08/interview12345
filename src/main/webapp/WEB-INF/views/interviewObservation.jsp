<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
<title>Observation</title>
<link rel="stylesheet" href="resources/css/interviewObservation.css">
 <script type="text/javascript">
function handleSelect(elm)
{
window.location = elm.value;
}
</script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
                document.getElementById("RequirementID").value = localStorage.getItem("item1");
                document.getElementById("candidateName").value = localStorage.getItem("item3");
            });
        </script>
        <script>
            $(window).on('beforeunload', function() {
                localStorage.setItem("item1",document.getElementById("RequirementID").value);
                localStorage.setItem("item3",document.getElementById("candidateName").value);
            });
        </script>
          
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
                     <li><a href="HrHome.html"><font color="white">HOME</font></a></li>
                    <li class="logout"><a href="logout.html"><font color="white">LOGOUT</font></a></li>
                    
                  </ul>
    
    <div class="container">
    
             <form action="updateList5.html" method="post">
             
             <select name="requirementId" id="RequirementID" onchange="location = this.value;">
             <option value="RequirementID" selected></option>
           
  	 <c:forEach  var="is"  items= "${CandidateRequirement}">
  	 <option value="updateList5?order=${is.requirementId }">${is.requirementId } </option>
                          
                          </c:forEach> 
             </select>
             
           
           <select name="candidateName" id="candidateName" ">
            <option value="Candidate Name" selected></option>
           
 		<c:forEach  var="is"  items= "${candidate1}">
                          
        <option value="updateList5?candidateName=${is.candidateName}">${is.candidateName} </option>
                </c:forEach> 
             
            </select> 
            
            Marks: <input type="text" name="interviewMarks"><br>
            
            Time Of Joining: <input type="text" name="toj"><br>  
             
             <center><button type="submit" class="btn btn-success">Submit</button> </center>
             
         
          </form>
          
          </div>
          
          
</body>
</html>