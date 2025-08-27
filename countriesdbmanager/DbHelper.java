package com.mycompany.countriesdbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author suleymanov
 */
public class DbHelper {
	private String userName = "root";
	private String password = "143459";
	private String dbUrl = "jdbc:mariadb://localhost:3306/world_db";
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbUrl, userName, password);
	}
	public void showErrorMessage(SQLException exception){
		System.out.println("Error message: " + exception.getMessage());
		System.out.println("Error code: "+ exception.getErrorCode());
	}
	
}
