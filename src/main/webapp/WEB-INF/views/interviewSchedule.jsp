<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interview Schedule </title>
<link rel="stylesheet" href="resources/css/interviewSchedule.css">

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
                document.getElementById("qualification").value = localStorage.getItem("item2");
                document.getElementById("candidateName").value = localStorage.getItem("item3");
            });
        </script>
        <script>
            $(window).on('beforeunload', function() {
                localStorage.setItem("item1",document.getElementById("RequirementID").value);
                localStorage.setItem("item2",document.getElementById("qualification").value);
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
   
             <form action="interviewSchedule.html" method="post">
             
             <p class="paragraph">INTERVIEW SCHEDULE</p>
             
             <select class="reqid" name="RequirementID" id="RequirementID" onchange="location = this.value;">
            <option value="">REQUIREMENT ID</option> 
            <!-- <option value="RequirementID" selected>REQUIREMENT ID</option>-->
           
  	<c:forEach  var="is"  items= "${CandidateRequirement}">
  	 <option value="http://localhost:9044/InterviewSchedulingManagement/updateList2?order=${is.requirementId }">${is.requirementId } </option>
                          
                          </c:forEach> 
             </select>
             
            
             
                <select class="qualification" name="qualification" id="qualification" onchange="location = this.value;">
            <option value="">QUALIFICATION</option> 
            <!--  <option value="qualification" selected></option>-->
           
                 <option value="http://localhost:9044/InterviewSchedulingManagement/updateList3?qualification1=${qualification}">${qualification} </option>
            </select><br>
             
             <select class="name" name="candidateName" id="candidateName" onchange="location = this.value;">
            <option value="">CANDIDATE NAME</option>
           
 		<c:forEach  var="is"  items= "${Candidate}">
                          
        <option value="http://localhost:9044/InterviewSchedulingManagement/updateList4?emailId=${is.emailId }">${is.emailId } </option>
                </c:forEach> 
             
             </select><br>
             
              <p class="p2">RANK:</p> 
             
               <input type="checkbox" name="Rank" value="R1">R1<br>
              <input type="checkbox" name="Rank" value="R2" >R2<br>
               <input type="checkbox" name="Rank" value="R3">R3<br>
               
               
               <input type="text" name="venue" placeholder="VENUE"><br>
              
         
              <center><button type="submit" class="btn btn-success">Submit</button>
             
             </form>
         </div>    
</body>
</html>