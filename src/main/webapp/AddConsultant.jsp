<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appointment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
<style type="text/css">
body{
 
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
  <div class="container">
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