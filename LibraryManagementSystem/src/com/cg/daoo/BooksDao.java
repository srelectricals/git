package com.cg.daoo;

import java.sql.*;
import com.cg.connection.DBConnection;
import com.cg.model.Bookss;

public class BooksDao {

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name : displayBook 
	 - Return Type : void 
	 - Throws : Exception, SQLException 
	 - Author:  Kirti Sharma
	 - Creation Date : 15/03/2019 
	 - Description : Adding Book
	 ********************************************************************************************************/

	public void displayBook() throws Exception, SQLException {
		Bookss b = new Bookss();
		// Database Connection
		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement ps = con.prepareStatement(QmBook.INSERT_QUERY);

		ps.setInt(1, b.getBook_ID());
		ps.setString(2, b.getTitle());
		ps.setString(3, b.getAuthor1());
		ps.setString(4, b.getAuthor2());
		ps.setString(5, b.getPublisher());

		int i = ps.executeUpdate();
		System.out.println("Values inserted" + i + "row");
		con.close();

	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name : viewBook 
	 - Return Type : void 
	 - Throws : Exception, ClassNotFoundException 
	 - Author:  Kirti Sharma
	 - Creation Date : 15/03/2019 
	 - Description : View all Book
	 ********************************************************************************************************/
	public void viewBook() throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		ResultSet resultset = null;

		PreparedStatement ps1 = con.prepareStatement(QmBook.VIEW_BOOK_DETAILS_QUERY);

		resultset = ps1.executeQuery();

		while (resultset.next()) {
			System.out.println("Book ID is: " + resultset.getInt(1));
			System.out.println("Book title is: " + resultset.getString(2));
			System.out.println("Book author is: " + resultset.getString(3));
			System.out.println("Book author2 is: " + resultset.getString(4));
			System.out.println("Book publisher is: " + resultset.getString(5));
		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	  - Function Name : retriveBook 
	  - Return Type : String 
	  - Throws :Exception, ClassNotFoundException 
	  - Creation Date : 15/03/2019 
	  - Author:  Kirti Sharma
	  -Description : View a particular Book
	 ********************************************************************************************************/

	public void rertriveBook(String bookid) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;

		preparedStatement = con.prepareStatement(QmBook.RETRIVE_ALL_QUERY);
		preparedStatement.setString(1, bookid);
		resultset = preparedStatement.executeQuery();

		while (resultset.next()) {
			System.out.println("Book ID is: " + resultset.getInt(1));
			System.out.println("Book title is: " + resultset.getString(2));
			System.out.println("Book author is: " + resultset.getString(3));
			System.out.println("Book author2 is: " + resultset.getString(4));
			System.out.println("Book publisher is: " + resultset.getString(5));

		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	  - Function Name : deleteBook 
	  - Return Type : String 
	  - Throws : Exception, ClassNotFoundException 
	  - Creation Date : 15/03/2019 
	  - Author:  Kirti Sharma
	  - Description : to delete a particular Book
	 ********************************************************************************************************/

	public void deleteBook(String bookid1) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		preparedStatement = con.prepareStatement(QmBook.DELETE_QUERY);
		preparedStatement.setString(1, bookid1);
		ResultSet resultset = null;
		resultset = preparedStatement.executeQuery();

		System.out.println("book deleted");

		con.close();
	}

}
