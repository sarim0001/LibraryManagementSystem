package com.jts.lms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DatabaseService {
	
	public static Connection conn = null;
	
	private static Connection createConn() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/librarydb123","sarim123","khan@sarim123");
		
		if(conn==null) {
			
			System.out.println("Cannot Make Connection To Database");
			
			return null;
			
		}else {
			
			return conn;
			
		}
		
	}

	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		if(conn==null) {
			
			return createConn();
			
		}
		
		return conn;
		
	}

}
