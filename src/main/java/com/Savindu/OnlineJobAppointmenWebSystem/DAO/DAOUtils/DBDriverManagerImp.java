package com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDriverManagerImp implements DBDriverManager{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://127.0.0.1:3306/job_appointment";
		String userName = "root";
		String password = "Savindu@123";
		
		return DriverManager.getConnection(url, userName, password);
	}

}
