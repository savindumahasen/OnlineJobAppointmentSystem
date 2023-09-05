package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Appointment;

class JobAppointmentServiceTest {
	static JobAppointmentService jobAppointmentServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		jobAppointmentServiceObj=JobAppointmentService.getJobAppointmentService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
	@DisplayName("Book Appointment")
	void testAddJobAppointmentPositive() throws ClassNotFoundException, SQLException {
		

		 Appointment appointment=new Appointment();
	     appointment.setAppointmentID(80);
	     appointment.setJobSeekerFirstName("Savindu");
	     appointment.setJobSeekerLastName("Ruhunuhewa");
	     appointment.setCountry("Australia");
	     appointment.setJobSeekerEmail("sandun@gmail.com");
	     appointment.setConsultantFirstName("sandun");
	     appointment.setJobSeekerLastName("Gamage");
	     appointment.setConsultantEmail("savindu@gmail.com");
	     appointment.setJobField("Buisness");
	     appointment.setAppointmentDate("2023-12-22");
	     appointment.setAppointmentTime("13.10");
	     appointment.setStatus("accepted");
		   boolean result=jobAppointmentServiceObj.addJobAppointment(appointment);
		   boolean expected=true;
		   
		   assertEquals(expected,result,"add Job Appointment methosd should return true ");	
		   
	}


	@Test
	@DisplayName("Book Appointment")
    @Disabled
	void testAddJobAppointmentNegative() throws ClassNotFoundException, SQLException {
		
           Appointment appointment =new Appointment();
	
		   boolean result=jobAppointmentServiceObj.addJobAppointment(null);
		   boolean expected=true;
		   if(result==false) {
		   assertEquals(expected,result,"add Job Appointment method should return true");
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@DisplayName("Book Appointment Update")

	void testUpdateJobAppointment() throws ClassNotFoundException, SQLException {
		 Appointment appointment=new Appointment();
	     appointment.setAppointmentID(51);
	     appointment.setJobSeekerFirstName("Mahasen");
	     appointment.setJobSeekerLastName("Ruhunuhewa");
	     appointment.setCountry("Australia");
	     appointment.setJobSeekerEmail("sandun@gmail.com");
	     appointment.setConsultantFirstName("sandun");
	     appointment.setJobSeekerLastName("warnakoolasooriya");
	     appointment.setConsultantEmail("savindu@gmail.com");
	     appointment.setJobField("Buisness");
	     appointment.setAppointmentDate("2023-12-22");
	     appointment.setAppointmentTime("12.10");
	     appointment.setStatus("accepted");
		   boolean result=jobAppointmentServiceObj.addJobAppointment(appointment);
		   boolean expected=true;
		   
		   assertEquals(expected,result,"add Job Appointment should return true");
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@DisplayName("Book Appointment Update")
    @Disabled
	void testUpdateJobAppointmentNagative() throws ClassNotFoundException, SQLException {
	
		   boolean result=jobAppointmentServiceObj.updateJobAppointment(null);
		   boolean expected=true;
		   
		   assertEquals(expected,result,"Appointment is updated successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@DisplayName("Fetch A Signle Job Appointment ")
   @Disabled
	void testFetchSingleJobAppointment() throws ClassNotFoundException, SQLException {
	
		   Appointment result=jobAppointmentServiceObj.fetchSingleAppointment("anushka@gmail.com");
		   if(result.getAppointmentID()>0) {
			   
			   assertEquals(result,"fetch Single Appointment method should return the appointment object");
		   }
		   
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@DisplayName("Fetch A Single Appointment")
    @Disabled
	void testFetchSingleJobAppointmentNegative() throws ClassNotFoundException, SQLException {
		
		   Appointment result=jobAppointmentServiceObj.fetchSingleAppointment("abc@gmail.com");
		   if(result.getAppointmentID()==0) {
			   
			   assertEquals(result,"fetch Single Appointment method should return appointment object");
		   }
	}
		
	
	 @Test
	@DisplayName("Fetch All Appointment")
    @Disabled
	void testFetchAllAppoinmentsNegative() throws ClassNotFoundException, SQLException {
		
		   List<Appointment> result=jobAppointmentServiceObj.fetchAllJobAppointment();
		   if(result!=null) {
			   
			   assertEquals(result,"fetch All Appointemtn method should return Appointment List");
		   }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@Disabled
	void testDeleteJobAppointment() throws ClassNotFoundException, SQLException {
		boolean result=jobAppointmentServiceObj.deleteJobAppointment(64);
	    boolean expected=true;
	    assertEquals(expected,result,"Appointment is deleted successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
      @Test
    @Disabled
	void testDeleteJobAppointmenNegative() throws ClassNotFoundException, SQLException {
		boolean result=jobAppointmentServiceObj.deleteJobAppointment(9);
	    boolean expected=true;
	    assertEquals(expected,result,"Appointment is deleted successfully");
	}
	

}











































