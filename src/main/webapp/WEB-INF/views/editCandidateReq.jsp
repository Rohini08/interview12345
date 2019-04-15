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
<title>Edit Candidate</title>
<link rel="stylesheet" href="resources/css/addCandidateRequirement.css">
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

    <form class="well form-horizontal" action="editCandidateReq.html" method="post"  id="contact_form">


<!-- Form Name -->
<legend><center><h2><b> Edit Candidate Requirement </b></h2></center></legend><br>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" >RequirementId</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="requirementId" placeholder="requirementId" class="form-control"  type="text">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Employee Id</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="employeeId" placeholder="Employee Id" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Domain</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="domain" placeholder="Domain" class="form-control"  type="text">
    </div>
  </div>
</div>

  <div class="form-group"> 

    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    
  </div>
</div>
</div>
  
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Required Vacancies</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="requiredVacancies" placeholder="Required Vacancies" class="form-control"  type="text">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Qualification</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="qualification" placeholder="qualification" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Closing Date</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="closingDate" placeholder="Closing Date" class="Closing Date"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Priority</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="priority" placeholder="Priority" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Minimum Experience</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="minExperience" placeholder="Minimum Experience" class="form-control"  type="text">
    </div>
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp&nbs<button type="submit" class="btn btn-warning" >&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
</div>

</form>
</div>

</body>
</html>