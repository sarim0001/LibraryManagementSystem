package com.jts.lms.login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jts.lms.dao.DatabaseService;
import com.jts.lms.dao.LoginDao;
import com.jts.lms.dsh.adminDashboard;

public class LoginService {
	
	Scanner sc = new Scanner(System.in);
	
	public void doLogin() throws ClassNotFoundException, SQLException {
		
		System.out.print("Enter Username: ");
		
		String userName = sc.nextLine();
		
		System.out.println("");
		
		System.out.print("Enter Password: ");
		
		String password = sc.nextLine();
		
		System.out.println("");
		
		try(Connection conn = DatabaseService.getConnection()){
			
			LoginDao logindao = new LoginDao();
			
			String userType = logindao.doLogin(conn, userName, password);
			
			if(userType.equals(null)) {
			
				System.out.println("Invalid User");
				
			}
			
			System.out.println("Login Success. You Login As "+userType+". Please Select From Below Option");
			
			if(userType.equals("admin")) {
				
				adminDashboard admindashboard = new adminDashboard();
				admindashboard.dashboardOption(conn);				
			}
			
			if(userType.equals("user")) {
				
				//show user menu
				
			}
			
		}
		
		
		
	}
	
}
