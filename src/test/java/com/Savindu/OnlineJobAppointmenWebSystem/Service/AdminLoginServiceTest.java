package com.Savindu.OnlineJobAppointmenWebSystem.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Admin;

class AdminLoginServiceTest {

	static AdminLoginService adminLoginObj;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		adminLoginObj=AdminLoginService.getAdminLoginService();
	}

	
	@Test
	@DisplayName("Admin Login")
	@Disabled
	void testFetchAdminLogin() throws ClassNotFoundException, SQLException {
		
		Admin result=adminLoginObj.fetchAdminLogin("admin@gmail.com");
		if((result.getEmail()!=null)&&(result.getPassword()!=null)) {
			assertEquals(result,"fetch Admin Login method should return admin object");
		}
	
	}

	

	@Test
	@DisplayName("Admin Login")
	@Disabled
	void testFetchAdminLoginNegative() throws ClassNotFoundException, SQLException {
		
		Admin result=adminLoginObj.fetchAdminLogin("admin@gmail.com");
		if((result.getEmail()!=null)&&(result.getPassword()!=null)) {
			assertEquals(result,"fetch Admin Login method should return admin object");
		}
	
	}
	
	
	
}
	































