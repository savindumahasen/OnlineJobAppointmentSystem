package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManager;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManagerFactory;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Admin;

public class AdminLoginImp implements AdminLogin {
	
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
            DBDriverManagerFactory driverFactory=new DBDriverManagerFactory();
			DBDriverManager driverManager=driverFactory.getDbDrive("MYSQL");
			driverManager.getConnection();
			return driverManager.getConnection();
			
	}

	@Override
	public Admin fetchSingleAdmin(String email) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Connection connection=getConnection();
		String query="SELECT * FROM  admin_login WHERE email=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,email);
		
		ResultSet  rs=ps.executeQuery();
		Admin admin=new Admin();
		
		while(rs.next()) {
			admin.setEmail(rs.getString("email"));
			admin.setPassword(rs.getString("password"));
		}
		rs.close();
		connection.close();
		return admin;
	}

	
}
