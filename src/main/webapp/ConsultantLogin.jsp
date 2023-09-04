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
        background-color:powderblue;
     }
     .container{
         max-width:400px;
         
   
         
         .form-signup{
          
             margin-top:100px;
             background-color:white;
             padding-left:15px;
             padding-right:15px;
              border-radius:10px;
          }
       
       }
       .nav-tabs{
          margin-left:800px;
       }

</style>
</head>
<body>
     <ul class="nav nav-tabs">
             <li class="nav-item">
                    <a class="nav-link" href="Home.jsp">Home</a>
             </li>
             <li class="nav-item">
                   <a class="nav-link"  href="JobSeekerLogin.jsp">JobSeeker Login</a>
            </li>
             <li class="nav-item">
                  <a class="nav-link active"  aria-current="page" href="ConsultantLogin.jsp">Consultant Login</a>
            </li>
           <li class="nav-item">
           <a class="nav-link" href="JobSeekerRegistration.jsp">JobSeeker Registration</a>
          </li>
      </ul>

   <div class="container">
      
         <form action="manageConsultantController"  class="form-signup">
         
               <h2 style="text-align:center">Login</h2>
               <p>Please Enter your correct Email</p>
               <p>${feeddbackMessage}</p>
           
               <div class="form-group">
                  <input type="email" name="consultantemail" required class="form-control" placeholder=" Email"></input>
               </div>
               <br/>
               
              
                <input type="hidden"  name="actionType1"  value="login"/>
               
                 <button type="submit" style="width:350px;margin-bottom:100px;color:white;" class="btn btn-warning">Submit</button>
                <div style="margin-bottom:100px;"></div>
                
               
                
                    
                </div>
                
             
               
           
         
         </form>
   </div>

</body>
</html>