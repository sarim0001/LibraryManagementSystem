package com.jts.lms;

import java.sql.SQLException;

import com.jts.lms.login.LoginService;

public class LibraryManagementSystem {

	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		System.out.println("***************Welcome To College Library***************");
		System.out.println("");
		System.out.println("!Please Do Login First To Access Menu!");	
		System.out.println("");
		LoginService loginservice = new LoginService();
		loginservice.doLogin();
		
	}
	
}
