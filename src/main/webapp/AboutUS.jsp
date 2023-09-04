<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appointment System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
<style type="text/css">
   .nav-tabs{
        margin-left:800px;
        width:900px;
        background-color:red;
   }
   h1{
    margin-left:400px;
    }

</style>
</head>
<body>


  
  <div class="container">
  
          <ul class="nav nav-tabs">
               <li class="nav-item">
                <a  style="color:white;" class="nav-link " aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                 <a style="color:white;" class="nav-link" href="JobSeekerLogin.jsp">Login</a>
             </li>
              <li class="nav-item">
               <a class="nav-link active"aria-current="page" href="AboutUS.jsp">AboutUs</a>
              </li>
              <li class="nav-item">
               <a style="color:white;" class="nav-link "  href="manageConsultantController?actionType1=viewConsultant">View Consultants</a>
              </li>
              <li class="nav-item">
               <a style="color:white;" class="nav-link" href="ConsultantLogin.jsp">ConsultantLogin</a>
             </li>
        </ul>
          <h1>About US</h1>
         
          <img src="Images/dashboardimage1.jpg" style="width:900px;height:400px;" class="aboutusimage1" alt="aboutusimage1"></img>
  
          <h3>Main  Features Of our Job Appointment Online System </h3>
          <ul type="disc">
            <li>100% safety</li>
            <li>Supportive Environment</li>
            <li>Friendly</li>
            <li>Research</li>
            
          </ul>
          <div class="container1">
            <h1 style="color:red">Joined With our Team</h1>
            <div class="bottom-section">
              <img style="margin-left: 260px;margin-top:10px;" src="Images/organizationPepole.jpg"  class="aboutusimage2" alt="our team"></img>
            
            </div>
          
          </div>
  </div>
  
  

</body>
</html>