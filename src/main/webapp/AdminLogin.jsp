<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manawise Online Job Appointment System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
     .adminImg{
        margin-left:-120px;
        height:800px;
        width:600px
     }
    .form-signup{
       margin-left:600px;
       max-width:300px;
       margin-top:-600px;
       
       
       }
</style>
<body>

  <div class="container">
        
         <img  class="adminImg" src="Images/AdminLogin.jpg" src="adminLogin"></img>
              <form action="LoginAdmin"  class="form-signup">
         
               <h2 style="text-align:center;">AdminLogin</h2>
               
                <p style="color:red;">${feedbackMessage}</p>
             
       
           
               <div class="form-group">
                  <input type="email" name="email" required class="form-control" placeholder=" Email"></input>
               </div>
               
               <br/>
                <div class="form-group">
                  <input type="password" name="password" required class="form-control"  placeholder=" password"></input>
               </div>
               <br/>
               <div class=""form-group>
                 
                <input type="hidden"  name="actionType"  value="adminlogin"/>
               </div>
               <button type="submit" class="btn btn-warning "  style="width:300px;" name="btn">Submit</button>
                <div style="margin-bottom:100px;"></div>
                
             
        </form>
    </div>
</body>
</html>