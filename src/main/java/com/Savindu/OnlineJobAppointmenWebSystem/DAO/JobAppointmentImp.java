package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManager;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManagerFactory;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;

public class JobAppointmentImp implements JobAppointment {
	
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		  DBDriverManagerFactory driverFactory=new DBDriverManagerFactory();
		  DBDriverManager driverManager=driverFactory.getDbDrive("MYSQL");
		  driverManager.getConnection();
		  return driverManager.getConnection();
			
	}

	@Override
	public boolean addJobAppointment(Appointment appointment)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="INSERT INTO appointment (consultantfirstname,consultantlastname,consultantemail,country,jobseekeremail,jobseekerfirstname,jobseekerlastname,appointmentdate,appointmenttime,jobfield) VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
	    ps.setString(1, appointment.getConsultantFirstName());
	    ps.setString(2,appointment.getConsultantLastName());
	    ps.setString(3,appointment.getConsultantEmail());
	    ps.setString(4,appointment.getCountry());
	    ps.setString(5,appointment.getJobSeekerEmail());
	    ps.setString(6,appointment.getJobSeekerFirstName());
	    ps.setString(7,appointment.getJobSeekerLastName());
	    ps.setString(8,appointment.getAppointmentDate());
	    ps.setString(9,appointment.getAppointmentTime());
	    ps.setString(10,appointment.getJobField());
	    
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		
		return result;
	}

	@Override
	public Appointment fetchSingleJobAppointment(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
 		String query="SELECT * FROM appointment WHERE consultantemail=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,email);
 		Appointment appointment=new Appointment();
		ResultSet  rs=ps.executeQuery();
		
		while(rs.next()) {
			appointment.setAppointmentID(rs.getInt("appointmentID"));
			appointment.setConsultantFirstName(rs.getString("consultantfirstname"));
			appointment.setConsultantLastName(rs.getString("consultantlastname"));
			appointment.setConsultantEmail(rs.getString("consultantemail"));
			appointment.setCountry(rs.getString("country"));
			appointment.setJobSeekerEmail(rs.getString("jobseekeremail"));
			appointment.setJobSeekerFirstName(rs.getString("jobseekerfirstname"));
			appointment.setJobSeekerLastName(rs.getString("jobseekerlastname"));
			appointment.setAppointmentDate(rs.getNString("appointmentdate"));
			appointment.setAppointmentTime(rs.getString("appointmenttime"));
			appointment.setJobField(rs.getString("jobfield"));
			
		}
	    connection.close();
	    ps.close();
		return appointment;
	}



	

}
