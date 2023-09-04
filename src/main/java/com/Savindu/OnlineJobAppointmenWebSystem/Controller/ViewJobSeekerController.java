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

import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;
import com.Savindu.OnlineJobAppointmenWebSystem.Service.JobSeekerRegistrationAndLoginService;

/**
 * Servlet implementation class ViewJobSeekerController
 */
public class ViewJobSeekerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";
	
	private JobSeekerRegistrationAndLoginService getJobSeekerRegistrationAndLoginService(){
		
		return JobSeekerRegistrationAndLoginService.getJobSeekerRegistrationAndLoginService();  
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewJobSeekerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String actionType2=request.getParameter("actionType2");
		if(actionType2.equals("all")) {
			viewJobSeekers(request,response);
		}
	}

	private void viewJobSeekers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<JobSeeker> jobSeekerList=new ArrayList<JobSeeker>();
		try {
			jobSeekerList=getJobSeekerRegistrationAndLoginService().fetchAllJobSeeker();
			System.out.println(jobSeekerList);
			if(jobSeekerList.size()>0) {
				request.setAttribute("JobSeekerList", jobSeekerList);
				RequestDispatcher rd=request.getRequestDispatcher("ViewJobSeekers.jsp");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		           message=e.getMessage();
		           System.out.println(message);
		}
		
		
	}



}
