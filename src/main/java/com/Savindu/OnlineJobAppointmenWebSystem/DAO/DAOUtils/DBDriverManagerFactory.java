package com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils;


public class DBDriverManagerFactory {
	
       
	public DBDriverManager getDbDrive(String databaseType) {
		
		if(databaseType.equals("MYSQL")) {
			return new DBDriverManagerImp();
		}
		
	    return null;
	}

}
