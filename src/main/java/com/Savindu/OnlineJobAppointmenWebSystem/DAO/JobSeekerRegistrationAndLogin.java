package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;

public interface JobSeekerRegistrationAndLogin {
	public boolean registerJobSeeker(JobSeeker jobSeeker) throws SQLException, ClassNotFoundException;
	public JobSeeker fetchSingleJobSeeker(String email) throws ClassNotFoundException, SQLException;
	public List<JobSeeker> fetchAllJobSeeker() throws ClassNotFoundException, SQLException;

}
