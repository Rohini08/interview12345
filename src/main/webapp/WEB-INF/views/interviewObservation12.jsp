<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interview Observation</title>
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
                    
                    <li class="logout"><a href="logout.html"><font color="white">LOGOUT</font></a></li>
                    
                  </ul>

    <div class="container">
    
             <form action="interviewObservation.html" method="post">
             <p class="paragraph">INTERVIEW OBSERVATION</p>
             
             <select class="reqid" name="RequirementID" id="RequirementID" onchange="location = this.value;">
             <option value="">REQUIREMENT ID</option>
           
  	 <c:forEach  var="is"  items= "${CandidateRequirement}">
  	 <option value="http://localhost:9044/InterviewSchedulingManagement/updateList5?order=${is.requirementId }">${is.requirementId } </option>
                          
                          </c:forEach> 
             </select><br>
             
           
           <select class="name" name="candidateName" id="candidateName" onchange="location = this.value;">
            <option value="">CANDIDATE NAME</option>
           
 		<c:forEach  var="is"  items= "${candidateName}">
                          
        <option value="http://localhost:9044/InterviewSchedulingManagement/updateList6?emailId=${is.candidateName }">${is.candidateName } </option>
                </c:forEach> 
             
            </select> <br>
            
             <input type="number" name="marks" placeholder="MARKS"><br>
            
            <input type="date" name="toj" placeholder=""TIME OF JOINING"><br>  
             
             <center><button type="submit" class="btn btn-success">Submit</button> </center>
             
         
          </form>
          
          </div>
          

</body>


</html>