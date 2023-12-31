package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.JobAppointment;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.JobAppointmentImp;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;

public class JobAppointmentService {
	
	private static JobAppointmentService jobAppointmentServiceObj;
	
	  
	
	private JobAppointmentService() {
		
	}
	private JobAppointment getJobAppointmentDAO() {
		
		return new JobAppointmentImp();
	}
	public  static synchronized JobAppointmentService getJobAppointmentService() {
		
		if(jobAppointmentServiceObj==null) {
			jobAppointmentServiceObj=new JobAppointmentService();
		}
		return jobAppointmentServiceObj;
	}
	
	
	public boolean addJobAppointment(Appointment appointment) throws ClassNotFoundException, SQLException {
		return getJobAppointmentDAO().addJobAppointment(appointment);
	}
	
	public boolean updateJobAppointment(Appointment appointment) throws ClassNotFoundException, SQLException {
		
		return getJobAppointmentDAO().updateJobAppointment(appointment);
	}
	public boolean deleteJobAppointment(int id) throws ClassNotFoundException, SQLException {
		
		return getJobAppointmentDAO().deleteJobAppointment(id);
	}
	public Appointment fetchSingleAppointment(String email) throws ClassNotFoundException, SQLException {
		
		return getJobAppointmentDAO().fetchSingleJobAppointment(email);
	}
	public List<Appointment> fetchAllJobAppointment() throws ClassNotFoundException, SQLException{
		return getJobAppointmentDAO().fetchAllJobAppointment();
		
		
	}
	
	
	

}
