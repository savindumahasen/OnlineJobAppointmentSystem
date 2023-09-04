<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manawise Online Job Appointment System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
      body{
      
        padding-top:100px;
        background-color:powderblue;
      }
      .container{
            .nav-tabs{
            
               margin-top:-100px;
               margin-left:450px;
            }
      
      }
     .form-signup{
        margin:100px auto;
        max-width:400px;
        background-color:white;
        border-radius:10px;
        padding:15px;
      } 
      .form-signup h2{
          text-align:center;
       }
     
     
</style>
</head>
<body>


<div class="container" >
           
         

         <form action="RegisterJobSeeker"  method="post" class="form-signup">
         
            <h2>Register</h2>
            <p>Create your account it's free take a minute</p>
            <div class="form-group">
               <div class="row" >
                  <div class="col-md-6">
                  <input type="text" name="firstname" required class="form-control" placeholder=" First Name"></input>
                  </div>
                 
                  <div class="col-md-6">
                  <input type="text" name="lastname" required class="form-control" placeholder=" Last Name"></input>
                  </div>
               </div>
            </div>
              <br/>
               <div class="form-group">
                  <input type="email" name="email" required class="form-control" placeholder=" Email"></input>
               </div>
               <br/>
                <div class="form-group">
                  <input type="password" name="password" required class="form-control"  placeholder=" password"></input>
               </div>
               <br/>
                <div class="form-group">
                  <input type="password" name="confirmpassword" required class="form-control" placeholder=" Confirm Password"></input>
               </div>
               <div class="form-group">
                 <input type="hidden"  name="actionType"  value="register"/>
               </div>
               <br/>
               <div class="form-group">
                 <a  style="text-decoration: none" href="JobSeekerLogin.jsp">If you have already register Please Sign In?</a>
               </div>
               
               <br/>
                <button type="submit" class="btn btn-success "  style="width:370px;" name="btn">Submit</button>
                <br/>
               <p style="color:magenta">${feedbackmessage}</p>
               
           
         
         </form>

</div>


</body>
</html>