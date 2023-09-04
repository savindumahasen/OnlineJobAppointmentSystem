<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manawise Online Job Appointment System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
           .container{
        	   
        	     .nav-tabs{
        	    	 
        	    	 margin-left:400px;
        	     }
        	     .table{
        	        margin-top:60px;
        	     
        	     }
           }

</style>
</head>
<body style="background-color:powderblue;">


<div class="container">
  <ul class="nav nav-tabs">
               <li class="nav-item">
                <a class="nav-link " aria-current="page" href="Home.jsp">Home</a>
              </li>
              <li class="nav-item">
                 <a class="nav-link" href="JobSeekerLogin.jsp">JobSeekerLogin</a>
             </li>
              <li class="nav-item">
               <a class="nav-link" href="AboutUS.jsp">AboutUS</a>
              </li>
              <li class="nav-item">
               <a class="nav-link active"aria-current="page" href="ViewJobSeekers.jsp">ViewJobSeekers</a>
              </li>
              <li class="nav-item">
               <a class="nav-link "  href="manageConsultantController?actionType1=viewConsultant">View Consultants</a>
              </li>
              <li class="nav-item">
               <a class="nav-link" href="ConsultantLogin.jsp">ConsultantLogin</a>
             </li>
              <li class="nav-item">
               <a class="nav-link" href="AdminLogin.jsp">AdminLogin</a>
             </li>
  </ul>
  <h1>View JobSeekers Details</h1>
  <form action="getJobSeekerController" method="get">
     <button  style="margin-top: 50px;" type="submit" class="btn btn-warning" name="actionType2" value="all">View Job Seekers</button>
  </form>

  
  <table  class="table table-dark table-striped">
       <thead>
         <tr>
           <th>FirstName</th>
           <th>LastName</th>
           <th>Email</th>
           <th>Password</th>
           <th>ConfirmPassword</th>
         
         
         </tr>
       
       </thead>
  
        <tbody>
         
          <tag:forEach var="JobSeekerList" items="${JobSeekerList }">
          <tr>
              <td>${JobSeekerList.firstName}</td>
              <td>${JobSeekerList.lastName}</td>
              <td>${JobSeekerList.email}</td>
              <td>${JobSeekerList.password}</td>
              <td>${JobSeekerList.confirmPassword}</td>

          </tr>
          </tag:forEach>
          
          
          
          
         
        
        
        </tbody>
  </table>
</div>
</body>
</html>