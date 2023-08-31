package com.Savindu.OnlineJobAppointmenWebSystem.Controller;

import java.io.IOException;
import java.sql.SQLException;

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
	    if(actionType1.equals("viewAppointment")) {
	    	 viewAppointment(request,response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              String actionType1=request.getParameter("actionType1");
              
              if(actionType1.equals("bookAppointment")) {
            	  bookAppointment(request,response);
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
		System.out.println(consultantFirstName);
		System.out.println(appointment);
		
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
		String email=request.getParameter("consultantemail");
		
		try {
			Appointment appointment=getManageJobAppointmentService().fetchSingleAppointment(email);
	
			if(email.equals(appointment.getConsultantEmail())) {
				request.setAttribute("appointment", appointment);
				RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
				rd.forward(request, response);
			}else {
			   message=email+"doesn't have appointments yet";
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
	
	private void clearMessage() {
		message="";
	}

}
