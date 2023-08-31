package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManager;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils.DBDriverManagerFactory;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.Consultant;

public class ConsultantManagerImp implements ConsultantManager {
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		DBDriverManagerFactory driverFactory=new DBDriverManagerFactory();
		DBDriverManager driverManager=driverFactory.getDbDrive("MYSQL");
		driverManager.getConnection();
		return driverManager.getConnection();
	}

	@Override
	public boolean addConsultant(Consultant consultant) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="INSERT INTO consultant (firstname,lastname,country,email,jobfield,date,time) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,consultant.getFirstName());
		ps.setString(2,consultant.getLastName());
		ps.setString(3,consultant.getCountry());
		ps.setString(4,consultant.getEmail());
		ps.setString(5,consultant.getJobField());
		ps.setString(6,consultant.getDate());
		ps.setString(7,consultant.getTime());
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		return result;
	}

	@Override
	public List<Consultant> fetchAllConsultant() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="SELECT * FROM consultant";
		Statement st=connection.createStatement();
		List<Consultant> consultantList=new ArrayList<Consultant>();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			Consultant consultant=new Consultant();
			consultant.setFirstName(rs.getString("firstname"));
			consultant.setLastName(rs.getString("lastname"));
			consultant.setCountry(rs.getString("country"));
			consultant.setEmail(rs.getString("email"));
			consultant.setJobField(rs.getString("jobfield"));
			consultant.setDate(rs.getString("date"));
			consultant.setTime(rs.getString("time"));
			consultantList.add(consultant);
		}
		st.close();
		connection.close();
		
		return consultantList;
	}

	@Override
	public Consultant fetchSingleConsultant(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="SELECT * FROM consultant WHERE email=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,email);
		
		ResultSet rs=ps.executeQuery();
		Consultant consultant=new Consultant();
		while(rs.next()) {
			consultant.setFirstName(rs.getString("firstname"));
			consultant.setLastName(rs.getString("lastname"));
			consultant.setCountry(rs.getString("country"));
			consultant.setEmail(rs.getString("email"));
			consultant.setJobField(rs.getString("jobfield"));
			consultant.setDate(rs.getString("date"));
			consultant.setTime(rs.getString("time"));
		}
		ps.close();
		connection.close();
		return consultant;
	}

    
}
	