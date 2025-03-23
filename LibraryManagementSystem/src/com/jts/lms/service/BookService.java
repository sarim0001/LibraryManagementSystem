package com.jts.lms.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jts.lms.dao.BookDao;
import com.jts.lms.dto.Book;

public class BookService {
	
	Scanner sc = new Scanner(System.in);

	 public void searchBySrNo(Connection conn) throws SQLException {
		 
		 System.out.println("Enter Book Serial Number");
		 
		 int srNo = sc.nextInt();
		 
		 BookDao bookdao = new BookDao();
		 
		 Book book = bookdao.getBookBySrNo(conn, srNo);
		 
		 if(book != null) {
			 
			 System.out.println("=======Book Details=======");
			 System.out.println("Serial No: "+book.getSrNo());
			 System.out.println("Name: "+book.getBookName());
			 System.out.println("Author: "+book.getBookAuthor());
			 System.out.println("Quantity: "+book.getBookQty());
			  System.out.println("==========================");

		 }else {
			 
			 System.out.println("No Book For Serial No."+srNo+" Found");
			 
		 }
		 
	 }
	
}
