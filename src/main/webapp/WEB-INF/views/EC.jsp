<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ECR</title>
<link rel="stylesheet" a href="editCandidateRequirement.css"/>
</head>
<body>
<ul>
                    <li><a href="home.html"><font color="white">HOME</font></a></li>
                    <!--<li><a href="about.asp"><font color="white"></font></a></li>
                    <li><a href="about.asp"><font color="white">Job Openings</font></a></li>-->
                    
                    <li class="logout"><a href="logout.html"><font color="white">LOGOUT</font></a></li>
                    
                  </ul>
        <div class="container">
        <input type="number" name="requirementId" placeholder="Requirement Id" class="requirement" required>
        <button type="submit">Search</button>
<br><br>
<table border="1" >
<tr>
<td> <center> <span style="color:black">Employee Id</span>
</td>
<td> <center> <span style="color:black">Domain</span>
</td>
<td> <center> <span style="color:black">Required Vacancies</span>
</td>
<td> <center> <span style="color:black">Closing Date</span>
</td>
<td> <center> <span style="color:black">Priority</span>
</td>
<td> <center> <span style="color:black">Minimum Experience</span>
</td>
</tr></div>
<c:forEach var="ec"  items="${ec}">
<tr>
<td> <center> <span style="color:black">${ec.employeeId}</span>
</td>
<td> <center> <span style="color:black">${ec.domain}</span>
</td>
<td> <center> <span style="color:black">${ec.requiredVacancies}</span>
</td>
<td> <center> <span style="color:black">${ec.closingDate}</span>
</td>
<td> <center> <span style="color:black">${ec.priority}</span>
</td>
<td> <center> <span style="color:black">${ec.minExperience}</span>
</td>
</td>
<c:set property="${ec.employeeId}" var="vehNumber" ></c:set>
 <fmt:parseNumber var="vehNumber" value="${ec.employeeId}" integerOnly="true"/>
<fmt:parseNumber var="vehNumber" integerOnly="true" type="number" value="${ec.employeeId}" /> --%> 
<td> <center> <span style="color:black"><a href="EC.html?id=${ec.employeeId}">Update</a></span>
</td>
</tr>
</c:forEach>


</table>
</body>
</html>