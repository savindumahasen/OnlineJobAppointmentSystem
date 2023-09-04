<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manawise Online Job Appointment System</title>
<script src="https://smtpjs.com/v3/smtp.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
<style type="text/css">
h1{
   text-align:center;
   margin-top:20px;
 }

 .nav-tabs{
  
     margin-left:500px;
     background-color:red;
     width:1200px;
  }
.bookappointment{
    max-width:400px;
    margin-left:500px;
    margin-top:-200px;
   
   }
 </style>
</head>
<body>
  
    
 <div class="container">
     
          <ul class="nav nav-tabs">
               <li class="nav-item">
                <a style="color:white;" class="nav-link " aria-current="page" href="Home.jsp">Home</a>
              </li>
              <li class="nav-item">
                 <a  style="color:white;" class="nav-link" href="JobSeekerLogin.jsp">Login</a>
             </li>
              <li class="nav-item">
               <a  style="color:white;" class="nav-link" href="DashBoard.jsp">DashBoard</a>
              </li>
              <li class="nav-item">
               <a class="nav-link active"aria-current="page" href="BookAppointment.jsp">BookAppointment</a>
              </li>
              <li class="nav-item">
               <a style="color:white;" class="nav-link "  href="manageConsultantController?actionType1=viewConsultant">View Consultants</a>
              </li>
              <li class="nav-item">
               <a style="color:white;" class="nav-link" href="ConsultantLogin.jsp">ConsultantLogin</a>
             </li>
        </ul>
   <h1>Welcome To Appointment Booking Page</h1>

      <img style="margin-left: 100px;" src="Images/AppointmentBookImage.jpg" class="appointmentImage" alt="AppointmentBookImage"></img>
   
   <form action="ManageAppointmentController"  class="bookappointment" method="POST">
      <p style="color:red;">${feedbackmessage}</p>  
      <p style="color:magenta">${EmailMessage}</p>
      <div class="form-group">
       <label for="consultantfirstname">Consultant First Name</label>
       <input type="text" class="form-control" id="consultantfirstname" class="consultantfirstname" readonly="readonly" name="consultantfirstname" value="${Message1}" required>
     
      </div>
  
     <br/>
    <div class="form-group">
    <label for="consultantlastname">Consultant Last Name</label>
    <input type="text" class="form-control" id="consultantlastname" class="consultantlastname" readonly="readonly" name="consultantlastname" value="${Message2}" required>
    
  </div>
  <br/>
    <div class="form-group">
    <label for="consultantemail">Consultant Email</label>
    <input type="email" class="form-control" id="consultantemail" class="consultantemail"  readonly="readonly" name="consultantemail" value="${Message}" required>
    
  </div>
  <br/>

 
  <div class="form-group">
    <label for="country">Country</label>
    <input type=""text" class=" form-control"  id="" readonly="readonly" name="country" value="${Message3}" ></input>
    
  </div>
  <br/>
  
  <div class="form-group">
    <label for="jobseekeremail">Job Seeker Email</label>
    <input type="email" class="form-control" id="jobseekeremail" class="jobseekeremail" name="jobseekeremail" required>
    
  </div>
  <br/>
      <div class="form-group">
    <label for="jobseekerfirstname">Job Seeker First Name</label>
    <input type="text" class="form-control" id="jobseekerfirstname" class="jobseekerfirstname" name="jobseekerfirstname" required>
    
  </div>
  <br/>
    <div class="form-group">
    <label for="jobseekerlastname">Job Seeker Last Name</label>
    <input type="text" class="form-control" id="jobseekerlastname" class="jobseekerlastname" name="jobseekerlastname" required>
    
  </div>
  <br/>
   <div class="form-group">
    <label for="date">Appointment Date</label>
    <input type="text" class="form-control" id="date" class="date" name="date"  readonly="readonly" value="${Message4}" required>
    
  </div>
  <br/>
   <div class="form-group">
    <label for="time">Appointment Time</label>
    <input type="text" class="form-control" id="time" class="time" name="time"  readonly="readonly" value="${Message5}" required>
    
  </div>
  <br/>
  
   
 
  
 
   <div class="form-group">
    <label for="jobfield">Job Field</label>
    <input type=text class=" form-control" id="jobfield" name ="jobfield" readonly="readonly" value="${Message6}"></input>
    
  </div>
  <br/>
     <div class="form-group">
    <label for="state"></label>
    <input type="hidden" class="form-control" id="state" class="state" name="state"  readonly="readonly" value="false" required>
    
  </div>
  <br/>
  
  
  <br/>
   <button onclick="sendEmail()" type="submit"  style="width:380px; margin-bottom:100px;" border-radius:10px" name="actionType2" value="bookAppointment" class="btn btn-success">Add</button>
   
  
</form>

</div>

<script src="https://smtpjs.com/v3/smtp.js">
</script>

<script>

   
	     let consultantFirstName=document.getElementById("consultantfirstname").value;
	     let consultantLastName=document.getElementById("consultantlastname").value;
	     let appointmentDate=document.getElementById("date").value;
	     let appointmentTime=document.getElementById("time").value;
	     
	     let body="Your Job Appointment is successfully Booked "+"<br/><br/>Consultant FirstName :"+consultantFirstName+"<br/></br>Consultant LastName :"+consultantLastName;
	     let body1="<br/><br/>Appointment Date :"+appointmentDate+"<br/><br/>Appointment Time :"+appointmentTime;
	     let fullBody=body+body1;
	     function sendEmail(){
	          Email.send({
		      SecureToken:"2059abe9-9f59-487d-9a7f-477daa55ef93",
		      To : 'savinduruhunuhewa@gmail.com',
		      From : "savinduruhunuhewa@gmail.com",
		      Subject : "Online Job Appointment",
		      Body :fullBody
		    })
   }

</script>
</body>
</html>