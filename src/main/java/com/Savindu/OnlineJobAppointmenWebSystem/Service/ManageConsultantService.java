package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.ConsultantManager;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.ConsultantManagerImp;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Consultant;

public class ManageConsultantService {
	
	private static ManageConsultantService manageConsultantServiceObj;

	private  ManageConsultantService() {
		
	}
	private ConsultantManager getConsultantManagerDao() {
		return new ConsultantManagerImp();
		
	}
	public static synchronized ManageConsultantService getManageConsultantServiceObj() {
		   if(manageConsultantServiceObj==null) {
			   manageConsultantServiceObj=new ManageConsultantService();
		   }
		   return manageConsultantServiceObj;
	}
	
	
	public boolean addConsultant(Consultant consultant) throws ClassNotFoundException, SQLException {
		
		
		return getConsultantManagerDao().addConsultant(consultant);
	}
	public List<Consultant> fetchAllConsultant() throws ClassNotFoundException, SQLException{
		return getConsultantManagerDao().fetchAllConsultant();
		
	}
	public Consultant fetchSingleConsultant(String email) throws ClassNotFoundException, SQLException{
		
		return getConsultantManagerDao().fetchSingleConsultant(email);
	}

}
