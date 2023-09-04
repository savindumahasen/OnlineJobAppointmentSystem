package com.Savindu.OnlineJobAppointmenWebSystem.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Consultant;
import com.Savindu.OnlineJobAppointmenWebSystem.Service.ManageConsultantService;

/**
 * Servlet implementation class ManageConsultantController
 */
public class ManageConsultantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";
	
	private ManageConsultantService getManageConsultantService() {
		
		return  ManageConsultantService.getManageConsultantServiceObj();
	}
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageConsultantController() {
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String actionType1=request.getParameter("actionType1");
		if(actionType1.equals("addConsultant")) {
			addConsultant(request,response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String actionType1=request.getParameter("actionType1");
		if(actionType1.equals("viewConsultant")) {
			viewConsultants(request,response);
		}else if(actionType1.equals("selectConsultant")) {
			selectConsultant(request,response);
		}else if(actionType1.equals("login")) {
			consultantLogin(request,response);
		}
		
	}
	
	private boolean addConsultant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		Consultant consultant=new Consultant();
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String country=request.getParameter("country");
		String email=request.getParameter("email");
		String jobField=request.getParameter("jobfield");
	    String date=request.getParameter("date");
		String time=request.getParameter("time");
		consultant.setFirstName(firstName);
		consultant.setLastName(lastName);
		consultant.setCountry(country);
		consultant.setEmail(email);
		consultant.setJobField(jobField);
	    consultant.setDate(date);
	    consultant.setTime(time);
		System.out.println(consultant);
		
		try {
			if(getManageConsultantService().addConsultant(consultant)) {
				message="Consultant is added successfully confirmed";
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("ViewJobSeekers.jsp");
				
				rd.forward(request, response);
			}else {
				message="Consultant is not added successfully confirmed ";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			  message=e.getMessage();
			  System.out.println(message);
		}
		
		
		return false;
		
	}
	private void viewConsultants(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		List<Consultant > consultantList=new ArrayList<Consultant>();
		try {
			consultantList=getManageConsultantService().fetchAllConsultant();
			if(consultantList.size()>0) {
			
			}else {
				message="No Records Found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
		request.setAttribute("ConsultantList", consultantList);
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd=request.getRequestDispatcher("ViewConsultant.jsp");
		rd.forward(request, response);
	
		
		
	}
	private void selectConsultant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String country=request.getParameter("country");
		
		String email=request.getParameter("email");
		String jobField=request.getParameter("jobfield");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		
		try {
		      Consultant consultant=getManageConsultantService().fetchSingleConsultant(email);
		      String consultant1=consultant.getEmail();
		    
			if(email.equals(consultant1)){
				request.setAttribute("Message",email);
				request.setAttribute("Message1",firstName);
				request.setAttribute("Message2",lastName);
				request.setAttribute("Message3",country);
				request.setAttribute("Message4",date);
				request.setAttribute("Message5",time);
				request.setAttribute("Message6", jobField);
				RequestDispatcher rd=request.getRequestDispatcher("BookAppointment.jsp");
			
			    System.out.println(consultant);
				rd.forward(request, response);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		      message=e.getMessage();
		}
		
	}
	private void consultantLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		String email=request.getParameter("consultantemail");
		
		try {
			Consultant consultant=getManageConsultantService().fetchSingleConsultant(email);
			if(email.equals(consultant.getEmail())) {
				request.setAttribute("Email",email);
				RequestDispatcher rd=request.getRequestDispatcher("ViewBookAppointment.jsp");
				rd.forward(request, response);
			}else {
				message="Please Enter the Correct Email";
				request.setAttribute("feedbackMessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("getAppointmentController?actionType1=ViewBookAppointment.jsp");
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
