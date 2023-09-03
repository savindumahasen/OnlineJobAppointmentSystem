package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;

public interface JobAppointment {
	
	
	
	public boolean addJobAppointment(Appointment appointment) throws ClassNotFoundException, SQLException;
	public boolean updateJobAppointment(Appointment appointment) throws ClassNotFoundException, SQLException;
	public boolean deleteJobAppointment(int id) throws ClassNotFoundException, SQLException;
	public Appointment fetchSingleJobAppointment(String email) throws ClassNotFoundException, SQLException;
	public List<Appointment> fetchAllJobAppointment() throws ClassNotFoundException, SQLException;

}
