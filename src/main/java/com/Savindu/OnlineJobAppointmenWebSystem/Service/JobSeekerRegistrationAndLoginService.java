package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.DAO.JobSeekerRegistrationAndLogin;
import com.Savindu.OnlineJobAppointmenWebSystem.DAO.JobSeekerRegistrationAndLoginImp;
import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;

public class JobSeekerRegistrationAndLoginService {
	
	private static JobSeekerRegistrationAndLoginService jobSeekerRegistrationAndLoginServiceObj;
	private JobSeekerRegistrationAndLogin getJobRegistrationDao() {
		return  new JobSeekerRegistrationAndLoginImp();
	}
	
	private JobSeekerRegistrationAndLoginService() {
		
	}
	public  static  synchronized JobSeekerRegistrationAndLoginService getJobSeekerRegistrationAndLoginService() {
		    if(jobSeekerRegistrationAndLoginServiceObj==null) {
		    	
		    	return new JobSeekerRegistrationAndLoginService();
		    }
		    return jobSeekerRegistrationAndLoginServiceObj;
	}
	
	
	public boolean registerJobSeeker(JobSeeker jobSeeker) throws ClassNotFoundException, SQLException {
		
		return  getJobRegistrationDao().registerJobSeeker(jobSeeker);
	}
	public JobSeeker fetchSingleJobSeeker(String email) throws ClassNotFoundException, SQLException {
		return getJobRegistrationDao().fetchSingleJobSeeker(email);
	}
	public List<JobSeeker> fetchAllJobSeeker() throws ClassNotFoundException, SQLException{
		
		return getJobRegistrationDao().fetchAllJobSeeker();
	}
}