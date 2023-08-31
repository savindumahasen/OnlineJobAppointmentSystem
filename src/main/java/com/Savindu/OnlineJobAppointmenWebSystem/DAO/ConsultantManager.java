package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Consultant;

public interface ConsultantManager {
	
	public boolean  addConsultant(Consultant consultant ) throws SQLException, ClassNotFoundException;
	public Consultant fetchSingleConsultant(String email) throws ClassNotFoundException, SQLException;
	public List<Consultant> fetchAllConsultant() throws ClassNotFoundException, SQLException;

}
