package com.Savindu.OnlineJobAppointmenWebSystem.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;
import com.Savindu.OnlineJobAppointmenWebSystem.Service.JobAppointmentService;

/**
 * Servlet implementation class ManageAppointmentController
 */
public class ManageAppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";
	String message1="";
	private JobAppointmentService getManageJobAppointmentService() {
		
		return JobAppointmentService.getJobAppointmentService();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageAppointmentController() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String actionType1=request.getParameter("actionType1");
	    System.out.println(actionType1);
	    if(actionType1.equals("viewAppointment")) {
	    	 viewAppointment(request,response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              String actionType2=request.getParameter("actionType2");
              
              if(actionType2.equals("bookAppointment")) {
            	  bookAppointment(request,response);
              }else if(actionType2.equals("AcceptAppointment")) {
            	  updateAppointment(request,response);
              }else if(actionType2.equals("deleteAppointment")) {
            	  deleteAppointment(request,response);
              }
	}
	
	private void bookAppointment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		Appointment appointment=new Appointment();
		String consultantFirstName=request.getParameter("consultantfirstname");
		String consultantLastName=request.getParameter("consultantlastname");
		String consultantEmail=request.getParameter("consultantemail");
		String country=request.getParameter("country");
		String jobSeekerEmail=request.getParameter("jobseekeremail");
		String jobSeekerFirstName=request.getParameter("jobseekerfirstname");
		String jobSeekerLastName=request.getParameter("jobseekerlastname");
		String jobField=request.getParameter("jobfield");
		String appointmentDate=request.getParameter("date");
		String appointmentTime=request.getParameter("time");
		String state=request.getParameter("state");
		appointment.setJobSeekerFirstName(jobSeekerFirstName);
		appointment.setJobSeekerLastName(jobSeekerLastName);
		appointment.setJobSeekerEmail(jobSeekerEmail);
		appointment.setJobField(jobField);
		appointment.setCountry(country);
		appointment.setConsultantFirstName(consultantFirstName);
		appointment.setConsultantLastName(consultantLastName);
		appointment.setConsultantEmail(consultantEmail);
		appointment.setAppointmentDate(appointmentDate);
		appointment.setAppointmentTime(appointmentTime);
		appointment.setStatus(state);
		System.out.println(jobSeekerEmail);
		System.out.println(consultantFirstName);
		System.out.println(appointment);
		System.out.println(state);
		
		try {
			if(getManageJobAppointmentService().addJobAppointment(appointment)) {
				message="Appointment Booking  is  successfully confirmed";
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("BookAppointment.jsp");
				rd.forward(request, response);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			    message=e.getMessage();
			    System.out.println(message);
		}
		
		
	}
	private void viewAppointment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		List<Appointment> appointment=new ArrayList<Appointment>();
		try {
			appointment=getManageJobAppointmentService().fetchAllJobAppointment();
	
			if(appointment.size()>0) {
				message="All the records are available successfully";
				request.setAttribute("feedbackMessage",message);
				request.setAttribute("appointment", appointment);
				RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
				rd.forward(request, response);
			}else {
			   message="Record are not available";
			   request.setAttribute("feedbackMessage",message);
			   RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
			   rd.forward(request, response);
			   
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
			   System.out.println(message);
		}
		
	}
	private void updateAppointment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
	    Appointment appointment=new Appointment();  
	    String btnMessage="";
	    int appointmentID=Integer.valueOf(request.getParameter("appointmentid"));
	    System.out.println(appointmentID);
		String consultantFirstName=request.getParameter("consultantfirstname");
		 System.out.println(consultantFirstName);
		//String consultantLastName=request.getParameter("consultantlastname");
		 //System.out.println(consultantLastName);
		//String consultantEmail=request.getParameter("consultantemail");
		 //System.out.println(consultantEmail);
		String country=request.getParameter("country");
		 System.out.println(country);
		//String jobSeekerEmail=request.getParameter("jobseekeremail");
		 //System.out.println(jobSeekerEmail);
		//String jobSeekerFirstName=request.getParameter("jobseekerfirstname");
		 //System.out.println(jobSeekerFirstName);
		String jobSeekerLastName=request.getParameter("jobseekerlastname");
		 System.out.println(jobSeekerLastName);
		String jobSeekerAppointmentDate=request.getParameter("jobseekerappointmentdate");
		 System.out.println(jobSeekerAppointmentDate);
		String jobSeekerAppointmentTime=request.getParameter("jobseekerappointmenttime");
		 System.out.println(jobSeekerAppointmentTime);
		String jobField=request.getParameter("jobfield");
		 System.out.println(jobField);
		String status=request.getParameter("status");
		 System.out.println(status);
		String status1="";
	
        status="accepted";
		status1=status;
	    appointment.setAppointmentID(appointmentID);
	    appointment.setConsultantFirstName(consultantFirstName);
		//appointment.setConsultantLastName(consultantLastName);
		//appointment.setConsultantEmail(consultantEmail);
		appointment.setCountry(country);
		//appointment.setJobSeekerEmail(jobSeekerEmail);
		//appointment.setJobSeekerFirstName(jobSeekerFirstName);
		appointment.setJobSeekerLastName(jobSeekerLastName);
		appointment.setAppointmentDate(jobSeekerAppointmentDate);
	    appointment.setAppointmentTime(jobSeekerAppointmentTime);
	    appointment.setJobField(jobField);
	    appointment.setStatus(status1);
	        
	        
	        
			


		
		try {
			if(getManageJobAppointmentService().updateJobAppointment(appointment)) {
				message="Appointment accepted successfully";
				message1="click the see your Appointments Button to see the table state again";
				 
			
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		        message=e.getMessage();
		        System.out.println(message);
		}
		request.setAttribute("message",message);
		request.setAttribute("message1",message1);
        
		RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
		rd.forward(request, response);
	}
	
	private void deleteAppointment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		int iD=Integer.valueOf(request.getParameter("appointmentid"));
		String jobSeekerFirstName=request.getParameter("jobseekerfirstname");
		
	    try {
			if(getManageJobAppointmentService().deleteJobAppointment(iD)) {
				message="AppointmentID "+iD+" JobSeekerFirstName"+jobSeekerFirstName+" is deleted successfully";
				message1="click the see your Appointments Button to  see the table again";
				request.setAttribute("message",message);
				request.setAttribute("message1",message1);
				RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
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
