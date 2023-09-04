<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appointment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">

     body{
      background-color:powderblue;
     }
     .nav-tabs{
         margin-left:800px
     }
    .form-signup{
        background-color:white;
        padding-left:15px;
        padding-right:15px;
        margin:100px 600px;
        max-width:400px;
        height:300px;
        border-radius:10px;
    }
    .form-signup h2{
         text-align:center;
    }

</style>
</head>
<body>

      
       <form action="getJobSeeker"  class="form-signup">
         
               <h2>Login</h2>
               
               <p>${feedbackMessage}</p>
       
           
               <div class="form-group">
                  <input type="email" name="email" required class="form-control" placeholder=" Email"></input>
               </div>
               <br/>
                <div class="form-group">
                  <input type="password" name="password" required class="form-control"  placeholder=" password"></input>
               </div>
               <br/>
               <div class="form-group">
                   <a style="color:blue;text-decoration:none;" href="JobSeekerRegistration.jsp">If You Don't have an Account?</a>
               </div>
               <br/>
                <input type="hidden"  name="actionType"  value="login"/>
               
                 <button type="submit" style="width:300px;" class="btn btn-success">submit</button>
                <div style="margin-bottom:100px;"></div>
                
             
               
           
         
         </form>
    
</body>
</html>