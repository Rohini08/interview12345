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
<title>Candidate Requirement</title>
<link rel="stylesheet" href="resources/css/addCandidateRequirement.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
        crossorigin="anonymous">
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
                    <li><a href="HrHome.html"><font color="white">HOME</font></a></li>
                   
                      <li ><a class="logout" href="logout.html"><font color="white">LOGOUT</font></a></li>
                   
                    
                   
                    
                  </ul>
        <div class="container">
            <form action="addCandidateReq.html" method="POST" >
                <p class="paragraph">
                        
                   <b>ADD CANDIDATE REQUIREMENT</b>
                </p>
                <input type="number" name="employeeId" placeholder="Employee Id" class="employee" required>
                <input type="text" name="domain" placeholder="Domain" class="requirement" required><br>
                <input type="number" name="requiredVacancies" placeholder="Required Vacancies" class="requirement" required><br>
               <select class="qualification" name="qualification" required>
                   <option disabled>QUALIFICATION</option>
                   <option>BE/BTECH</option>
                   <option>MCA</option>
                   <option>OTHERS</option>
               </select><br>
                
                <input type="date" name="closingDate" placeholder="Closing Date" class=" requirement" required><br>
                
                <input type="text" name="priority" placeholder="Priority" class="requirement" required><br>
                <input type="text" name="minExperience" placeholder="Minimum Experience" class="requirement" required><br>
                  <center><button type="submit" class="btn btn-success">Submit</button>
               
           </form>

        </div>    


</body>
</html>