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
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
<style type="text/css">

   body{
      background-color:powderblue;
      
      .nav-tabs{
          margin-left:600px;
       }
     .container{
         margin-top:150px;
    
       .appointment-form{
       
           max-width:400px;
           
           .table{
               margin-left:0px;
               width:100px;
           
           }
           
       }
   }
   

</style>
</head>
<body>
<ul class="nav nav-tabs">
             <li class="nav-item">
                    <a class="nav-link" href="Home.jsp">Home</a>
             </li>
             <li class="nav-item">
                   <a class="nav-link  " href="JobSeekerLogin.jsp">JobSeeker Login</a>
            </li>
             <li class="nav-item">
                  <a class="nav-link" href="ConsultantLogin.jsp">Consultant Login</a>
            </li>
             <li class="nav-item">
                  <a class="nav-link active" aria-current="page"  href="ViewBookAppointment.jsp">View BookAppointment</a>
            </li>
           <li class="nav-item">
           <a class="nav-link" href="JobSeekerRegistration.jsp">JobSeeker Registration</a>
          </li>
      </ul>

<div class="container">
 
 <h1>Consultant Appointments</h1>
   
<form  class="appointment-form" action="getAppointmentController" >
    <p style="color:black">${feedbackMessage}</p>
   <button type="submit" class="btn btn-success" name="actionType1" value="viewAppointment">See Your Appointments</button>
</form>
   <div class="table">
   <table class="table">
       <p style="color:black">${message}</p>
       <p style="color:black">${message1}</p>
      <thead>
        <tr>
           <th>AppointmentID</th> 
           <th>ConsultantFirstName</th>    
           <th>Country</th>
           <th>JobSeekerFirstName</th>
           <th>AppointmentDate</th>
           <th>AppointmentTime</th>
           <th>JobField</th>
           <th>State</th>
           <th>Delete</th>
           <th>Accept</th>
                 
        </tr>
      </thead>
      <tbody>
          <tag:forEach var="appointment" items="${appointment}">
        <tr>
         <form action="ManageAppointmentController" method="POST">
          
           <td><input type="hidden"  name="appointmentid" value="${appointment.appointmentID}">${appointment.appointmentID}</input></td>
           <td><input type="hidden" name="consultantfirstname" value="${appointment.consultantFirstName}">${appointment.consultantFirstName}</input></td>
          
         
           <td><input type="hidden" name="country" value="${appointment.country}">${appointment.country}</input></td>
         
           <td><input type="hidden" name="jobseekerfirstname" value="${appointment.jobSeekerFirstName}">${appointment.jobSeekerFirstName }</input></td>
           
           <td><input type="hidden" name="jobseekerappointmentdate" value="${appointment.appointmentDate}">${appointment.appointmentDate}</input></td>
           <td><input type="hidden" name="jobseekerappointmenttime" value="${appointment.appointmentTime}">${appointment.appointmentTime}</input></td>
           <td><input type="hidden" name="jobfield" value="${appointment.jobField}">${appointment.jobField}</input></td>
           <td><input type="hidden" name="status" value="${appointment.status}">${appointment.status}</input></td>
    
           <td><button type="submit" class="btn btn-danger" name="actionType2" value="deleteAppointment">Delete</button></td>
           <td><button type="submit" class="btn btn-warning"   name="actionType2" value="AcceptAppointment">Accept</button></td>
        </form>
         
        </tr>
        </tag:forEach>
      
      
      </tbody>
   
   </table>
</div>

</div>
</body>
</html>