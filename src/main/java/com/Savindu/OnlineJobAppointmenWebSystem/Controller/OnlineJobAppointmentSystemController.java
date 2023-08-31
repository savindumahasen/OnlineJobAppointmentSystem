package com.Savindu.OnlineJobAppointmenWebSystem.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Admin;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;
import com.Savindu.OnlineJobAppointmenWebSystem.Service.AdminLoginService;
import com.Savindu.OnlineJobAppointmenWebSystem.Service.JobSeekerRegistrationAndLoginService;

/**
 * Servlet implementation class OnlineJobAppointmentSystemController
 */
public class OnlineJobAppointmentSystemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message="";
	private JobSeekerRegistrationAndLoginService getJobSeekerRegistrationAndLoginService() {
		
		return JobSeekerRegistrationAndLoginService.getJobSeekerRegistrationAndLoginService();
	}
	private AdminLoginService  getAdminLoginService() {
		return AdminLoginService.getAdminLoginService();
	}
       
    
    public OnlineJobAppointmentSystemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionType=request.getParameter("actionType");
		if(actionType.equals("login")) {
			loginJobSeeker(request,response);
		}else if(actionType.equals("adminlogin")) {
			adminLogin(request,response);
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionType=request.getParameter("actionType");
		if(actionType.equals("register")) {
			registerJobSeeker(request,response);
		}
	}
	
	public void registerJobSeeker(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JobSeeker jobSeeker=new JobSeeker();
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmpassword");
		if(password.equals(confirmPassword)) {
		jobSeeker.setFirstName(firstName);
		jobSeeker.setLastName(lastName);
		jobSeeker.setEmail(email);
		jobSeeker.setPassword(password);
        jobSeeker.setConfirmPassword(confirmPassword);		
		try {
			if(getJobSeekerRegistrationAndLoginService().registerJobSeeker(jobSeeker)) {
						
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("JobSeekerLogin.jsp");
				rd.forward(request, response);
			}else {
				message="The Record has not beed successfull added";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
	
	}else {
		 message="Your Password and confirm password is not matching";
		 request.setAttribute("feedbackmessage", message);
		 RequestDispatcher rd=request.getRequestDispatcher("JobSeekerRegistration.jsp");
		 rd.forward(request, response);
	}

}
	public void loginJobSeeker(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	try {
		JobSeeker jobSeeker=getJobSeekerRegistrationAndLoginService().fetchSingleJobSeeker(email);
		if(jobSeeker.getEmail()==null) {
			 message="You dont have an this kind of email";
			 request.setAttribute("feedbackMessage",message);
			 RequestDispatcher rd=request.getRequestDispatcher("JobSeekerLogin.jsp");
			 rd.forward(request, response);
			 
		}else if((jobSeeker.getEmail().equals(email))&&(jobSeeker.getPassword().equals(password))) {
			   message="Welcome to the Appointment Booking Page";
			   request.setAttribute("feedbackmessage",message);
			   RequestDispatcher rd=request.getRequestDispatcher("DashBoard.jsp");
			   rd.forward(request, response);
		}else{
			
			  message="Your email or password is incorrect";
			  request.setAttribute("feedbackMessage",message);
			  RequestDispatcher rd=request.getRequestDispatcher("JobSeekerLogin.jsp");
			  rd.forward(request, response);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	              message=e.getMessage();
	              System.out.println(message);
	}
}
	public void adminLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			Admin admin=getAdminLoginService().fetchAdminLogin(email);
			if((email.equals(admin.getEmail())&&(password.equals(admin.getPassword())))) {
			
				RequestDispatcher rd=request.getRequestDispatcher("AddConsultant.jsp");
				rd.forward(request, response);
				
				
			}else {
				message="Admin Login is  not Successfully Confirmed!";

				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
				rd.forward(request, response);
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
	
	
	
	}
	
	private void clearMessage() {
		
		message="";
	}

}
