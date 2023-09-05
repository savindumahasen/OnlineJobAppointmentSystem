<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
 
     .nav-tabs{
        background-color:red;
        margin-left:800px;
        
     }
}
.heading{
      color:blue;
      text-align:center;
}
  .container{
      max-width:400px;
      margin-top:100px;
    form{
      
    .form-group{
       .selectpicker{
        
           border:none;
          
        }
    }
}
</style>

</head>
<body>
  <ul class="nav nav-tabs">
               <li class="nav-item">
                <a style="color:white;" class="nav-link " href="Home.jsp">Home</a>
              </li>
              <li class="nav-item">
                 <a  style="color:white;" class="nav-link" href="AdminLogin.jsp">AdminLogin</a>
             </li>
              <li class="nav-item">
               <a  style="color:white;" class="nav-link" href="AboutUs.jsp">About Us</a>
              </li>
             
              <li clss="nav-item">
               <a style="color:black;" class="nav-link active" aria-current="page"   href="AddConsultant.jsp">Add Consultant</a>
             </li>
  </ul>
  <img style="width:600px;height:1000px;margin-left:0px;margin-top:20px;" src="Images/consultant.jpg" class="addconsultantimage" alt="addconsultant"></img>
  
  <div class="container" style="margin-top:-900px; margin-left:800px;">
  
  <p>${feedbackMessage}</p>
  <h1>Add Consultant</h1>
  <form action="manageConsultantController" method="POST">
    <div class="form-group">
    <p>${feedbackmessage}</p>
    <label for="exampleFirstName">First Name</label>
    <input type="text" class="form-control" class="firstname" name="firstname" required>
    
  </div>
  <br/>
   <div class="form-group">
    <label for="exampleFirstName">Last Name</label>
    <input type="text" class="form-control" class="lastname" name="lastname" required>
    
  </div>
  <br/>
  <div class="form-group">
    <label for="exampleCountry">Country</label>
    <select class=" form-control"  name="country" >
      <option value="Australia">Australia</option>
      <option value="England">England</option>
      <option value="America">America</option>    
    </select>
    
  </div>
  <br/>
  <script src="//cdn.tutorialjinni.com/jquery/3.6.1/jquery.min.js"></script>
  <script src="//cdn.tutorialjinni.com/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="//cdn.tutorialjinni.com/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>
  <script src="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/js/bootstrap-select-country.min.js"></script>
  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" class="form-control" class="email" name="email" required>
    
  </div>
  <br/>

   <div class="form-group">
    <label for="jobfield">Job Field</label>
    <select class=" form-control" name ="jobfield">
      <option value="Agriculture, Food, and Natural Resources">Agriculture, Food, and Natural Resources</option>
      <option value="Architecture and Construction">Architecture and Construction</option>
      <option value="Arts, Audio/Video Technology, and Communication">Arts, Audio/Video Technology, and Communication</option>
      <option value="Business and Finance">Business and Finance</option>
      <option value="Education and Training">Education and Training</option>
      <option value="Government and Public Administration">Government and Public Administration</option>
      <option value="Health Science">Health Science</option>
      <option value="Information Technology">Information Technology</option>
    </select>
    
  </div>
  <br/>

    <div class="form-group">
    <label for="exampleConsultant">Date</label>
     <input type="date" class="form-control" class="date" name="date" required>
    </div>
    <br/>
   <div class="form-group">
    <label for="exampleConsultant">Date</label>
     <input type="time" class="form-control" class="time" name="time" required>
    </div>
   
    
  <br/>
   <button type="submit"  style="width:380px; border-radius:10px" name="actionType1" value="addConsultant" class="btn btn-success">Add</button>
     <div class="botton-section" style="margin-bottom:100px">
    </div>
  
</form>
</div>
</body>
</html>