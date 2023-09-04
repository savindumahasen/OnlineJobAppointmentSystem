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
import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;

public class JobSeekerRegistrationAndLoginImp implements JobSeekerRegistrationAndLogin {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DBDriverManagerFactory driverFactory=new DBDriverManagerFactory();
		DBDriverManager driverManager=driverFactory.getDbDrive("MYSQL");
		driverManager.getConnection();
		return driverManager.getConnection();
		
	
	}

	@Override
	public boolean registerJobSeeker(JobSeeker jobSeeker) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="INSERT INTO registration (firstname,lastname,email,password,confirmpassword) VALUES(?,?,?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, jobSeeker.getFirstName());
		ps.setString(2, jobSeeker.getLastName());
		ps.setString(3, jobSeeker.getEmail());
		ps.setString(4, jobSeeker.getPassword());
		ps.setString(5, jobSeeker.getConfirmPassword());
		
		boolean result=false;
		if(ps.executeUpdate()>0) {
			result=true;
		}
		ps.close();
		connection.close();
		return result;
	}
	public JobSeeker fetchSingleJobSeeker(String email) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		String query="SELECT * FROM registration WHERE email=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,email);
		ResultSet rs=ps.executeQuery();
		JobSeeker jobSeeker=new JobSeeker();
		while(rs.next()) {
			jobSeeker.setFirstName(rs.getString("firstname"));
			jobSeeker.setLastName(rs.getString("lastname"));
			jobSeeker.setEmail(rs.getString("email"));
			jobSeeker.setPassword(rs.getString("password"));
			jobSeeker.setConfirmPassword(rs.getString("confirmpassword"));
		}
		ps.close();
		connection.close();
		return jobSeeker;
		
	}

	@Override
	public List<JobSeeker> fetchAllJobSeeker() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		String query="SELECT * FROM registration";
		Statement st=connection.createStatement();
		List<JobSeeker> jobSeekerList=new ArrayList<JobSeeker>();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			JobSeeker jobseeker=new JobSeeker();
			jobseeker.setFirstName(rs.getString("firstname"));
			jobseeker.setLastName(rs.getString("lastname"));
			jobseeker.setEmail(rs.getString("email"));
			jobseeker.setPassword(rs.getString("password"));
			jobseeker.setConfirmPassword(rs.getString("confirmpassword"));
		    jobSeekerList.add(jobseeker);
		}
		st.close();
		connection.close();
		
		return jobSeekerList;
		
	}
	
	

}
