package com.jts.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jts.lms.dto.Book;

public class BookDao {
	
	public Book getBookBySrNo(Connection conn, int srNo) throws SQLException{
		
		 String query = "select * from books where sr_no = ?";
		 
		 try(PreparedStatement ps = conn.prepareStatement(query) ) {
			 
			 ps.setInt(1, srNo);
			 
			 try(ResultSet rs = ps.executeQuery()) {
				 
				 if(rs.next()) {
					 
					 Book book = new Book();
					 book.setId(rs.getInt("id"));
					 book.setSrNo(rs.getInt("sr_no"));
					 book.setBookName(rs.getString("book_name"));
					 book.setBookAuthor(rs.getString("author_name"));
					 book.setBookQty(rs.getInt("qty"));
					 
					 return book;
					 
				 }
				 
			 }
			 
		 }
		 
		 return null;
		
	}
	
	public Book getBookByauthorName(Connection conn, String authorName) throws SQLException{
		
		 String query = "select * from books where author_name = ?";
		 
		 try(PreparedStatement ps = conn.prepareStatement(query) ) {
			 
			 ps.setString(1, authorName);
			 
			 try(ResultSet rs = ps.executeQuery()) {
				 
				 if(rs.next()) {
					 
					 Book book = new Book();
					 book.setId(rs.getInt("id"));
					 book.setSrNo(rs.getInt("sr_no"));
					 book.setBookName(rs.getString("book_name"));
					 book.setBookAuthor(rs.getString("author_name"));
					 book.setBookQty(rs.getInt("qty"));
					 
					 return book;
					 
				 }
				 
			 }
			 
		 }
		 
		 return null;
		
	}
	
}
