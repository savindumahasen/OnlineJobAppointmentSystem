package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.SQLException;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;

public interface JobAppointment {
	
	
	
	public boolean addJobAppointment(Appointment appointment) throws ClassNotFoundException, SQLException;
	public Appointment fetchSingleJobAppointment(String email) throws ClassNotFoundException, SQLException;

}
