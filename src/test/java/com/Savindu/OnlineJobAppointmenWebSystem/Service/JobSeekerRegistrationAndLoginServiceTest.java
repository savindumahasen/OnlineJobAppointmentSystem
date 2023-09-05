package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.JobSeeker;

class JobSeekerRegistrationAndLoginServiceTest {
	
	static JobSeekerRegistrationAndLoginService jobSeekerRegistrationLoginServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		jobSeekerRegistrationLoginServiceObj=JobSeekerRegistrationAndLoginService.getJobSeekerRegistrationAndLoginService();
	}

	

	@Test
	@DisplayName("Job Seeker Registration")
	void testRegisterJobSeeker() throws ClassNotFoundException, SQLException {
		JobSeeker jobSeeker=new JobSeeker();
		jobSeeker.setFirstName("Vinod");
		jobSeeker.setLastName("Heetiarachchi");
		jobSeeker.setEmail("vinod@gmail.com");
		jobSeeker.setPassword("vinod900");
		jobSeeker.setConfirmPassword("vinod900");
		boolean result=jobSeekerRegistrationLoginServiceObj.registerJobSeeker(jobSeeker);
		
		assertEquals(result,"register Job Seeker should return true");
	}

	@Test
	void testFetchSingleJobSeeker() {
		fail("Not yet implemented");
	}

	@Test
	void testFetchAllJobSeeker() {
		fail("Not yet implemented");
	}

}
