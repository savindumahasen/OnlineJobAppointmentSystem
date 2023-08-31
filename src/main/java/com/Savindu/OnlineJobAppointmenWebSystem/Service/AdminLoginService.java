package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import java.sql.SQLException;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.AdminLogin;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.AdminLoginImp;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Admin;

public class AdminLoginService {

	private static AdminLoginService adminLoginServiceObj;
	
	private AdminLogin getAdminLoginObj() {
		return new AdminLoginImp();
		
		
	}
	private  AdminLoginService() {
		
		// TODO Auto-generated constructor stub
	}
	public static synchronized AdminLoginService getAdminLoginService() {
		
		if(adminLoginServiceObj==null) {
			  adminLoginServiceObj=new AdminLoginService();
		}
    	return 	adminLoginServiceObj;
	}
	
	
	public Admin fetchAdminLogin(String email) throws SQLException, ClassNotFoundException {
		
		return  getAdminLoginObj().fetchSingleAdmin(email);
	}
	
	
	
	
	
	
	
	
	
	

}
