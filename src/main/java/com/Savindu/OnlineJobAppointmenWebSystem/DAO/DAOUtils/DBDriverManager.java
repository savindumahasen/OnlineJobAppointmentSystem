package com.Savindu.OnlineJobAppointmenWebSystem.DAO.DAOUtils;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBDriverManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException;
}
