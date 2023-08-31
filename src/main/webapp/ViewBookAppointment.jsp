<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
<style type="text/css">

   body{
      background-color:powderblue;
     .container{
         margin-top:150px;
    
       .appointment-form{
       
           max-width:400px;
       }
   }
   

</style>
</head>
<body>


<div class="container">
 <h1>Consultant Appointments</h1>
<form  class="appointment-form" action="getAppointmentController" >
    <p style="color:magenta">${feedbackMessage}</p>
   <div class="form-group">
    <label for="exampleConsultant">Consultant Email</label>
     <input type="email" class="form-control" class="email" name="consultantemail" readonly="readonly" value="${Email}" required>
   </div>
   <br/>
   <button type="submit" class="btn btn-success" name="actionType1" value="viewAppointment">See Your Appointments</button>
  
   <br/><br/>
   <table class="table table-dark table-striped">
      <thead>
        <tr>
           <th>AppointmentID</th> 
           <th>Consultant FirstName</th>
           <th>Consultant LastName</th>
           <th>Consultant Email</th>
           <th>Country</th>
           <th>JobSeeker Email</th>
           <th>JobSeeker FirstName</th>
           <th>JobSeeker LastName</th>
           <th>Appointment Date</th>
           <th>Appointment Time</th>
           <th>Job Field</th>
                 
        </tr>
      </thead>
      <tbody>
     
        <tr>
           <td>${appointment.appointmentID }</td>
           <td>${appointment.consultantFirstName}</td>
           <td>${appointment.consultantLastName }</td>
           <td>${appointment.consultantEmail}</td>
           <td>${appointment.country}</td>
           <td>${appointment.jobSeekerEmail }</td>
           <td>${appointment.jobSeekerFirstName}</td>
           <td>${appointment.jobSeekerLastName}</td>
           <td>${appointment.appointmentDate}</td>
           <td>${appointment.appointmentTime}</td>
           <td>${appointment.jobField}</td>
        
         
        </tr>
      
      
      </tbody>
   
   </table>

</form>
</div>
</body>
</html>