<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appointment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
</head>
<body>
         <div class="container">
         
               <ul class="nav nav-tabs">
                  <li class="nav-item">
                      <a class="nav-link " aria-current="page" href="Home.jsp">Home</a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="JobSeekerLogin.jsp">Login</a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" aria-current="page" href="DashBoard.jsp">DashBoard</a>
                 </li>
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="manageConsultantController?actionType1=viewConsultant">View Consultants</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="ConsultantLogin.jsp">ConsultantLogin</a>
                 </li>
             </ul>
               <h2 style="text-align:center;">View Consultant</h2>
               <p>View Your Consultants Now</p>
                <p>${feedbackmessage}</p>
       
       
           <table class="table table-dark table-striped">
              <thead>
              <tr>
                 <th>Consultant First Name</th>
                 <th>Consultant Last Name</th>
                 <th>Country</th>
                 <th>Email</th>
                 <th>Job Field</th>
                 <th>Date</th>
                 <th>Time</th>
                 <th>Select Consultants</th>
              </tr>
              </thead>
              <tbody>
              <tag:forEach var="consultant" items="${ConsultantList}">
              <tr>
                   <form action="manageConsultantController" method="get">
                       <td><input type="hidden" name="firstname" value="${consultant.firstName }">${consultant.firstName}</input></td>
                       <td><input type="hidden" name="lastname" value="${consultant.lastName }">${consultant.lastName}</input></td>
                       <td><input type="hidden" name="country" value="${consultant.country}">${consultant.country}</input></td>
                       <td><input type="hidden" name="email" value="${consultant.email}">${consultant.email}</input></td>
                       <td><input type="hidden" name="jobfield" value="${consultant.jobField}">${consultant.jobField}</input></td>
                       <td><input type="hidden" name="date" value="${consultant.date}">${consultant.date}</input></td>
                       <td><input type="hidden" name="time" value="${consultant.time}">${consultant.time}</input></td>
                       <td><button type="submit" class="btn btn-warning" name="actionType1" value="selectConsultant">Select</button></td>
                  </form>
               </tr>
              </tag:forEach>          
              
              
              
              </tbody>
               
           </table>
           
        </div>
</body>
</html>