package com.Savindu.OnlineJobAppointmenWebSystem.DAO;

import java.sql.SQLException;

import com.Savindu.OnlineJobAppointmenWebSystem.Model.Admin;

public interface AdminLogin {

	public Admin fetchSingleAdmin(String email) throws SQLException, ClassNotFoundException;
}
