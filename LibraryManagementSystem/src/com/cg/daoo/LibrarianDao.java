package com.cg.daoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cg.connection.DBConnection;
import com.cg.model.Librariann;

public class LibrarianDao implements QmLibrary {
	
	//------------------------ Library Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	displayLibrarian
		 - Return Type		:	void
		 - Throws			:  	SQLException, ClassNotFoundException 	
		 - Creation Date	:	15/03/2019
	     - Author           :  Kirti Sharma
		 - Description		:	viewing Librarian
		 ********************************************************************************************************/
	
	public void displayLibrarian() throws ClassNotFoundException, SQLException {
		Librariann lb = new Librariann();

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement ps = con.prepareStatement(QmLibrary.INSERT_QUERY);

		ps.setInt(1, lb.getLid());
		ps.setString(2, lb.getLname());
		ps.setString(3, lb.getAddress());
		ps.setInt(4, lb.getNumbers());

		int i = ps.executeUpdate();
		System.out.println("Values inserted" + i + "row");
		con.close();

	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : viewLibrarian
	 * - Return Type : void 
	 * - Throws : SQLException, ClassNotFoundException 
	 * - Creation Date : 15/03/2019 
	 * - Author:  Kirti Sharma
	 * - Description : viewing Librarian
	 ********************************************************************************************************/

	public void viewLibrarian() throws SQLException, ClassNotFoundException {
		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		ResultSet resultset = null;

		PreparedStatement ps1 = con.prepareStatement(QmLibrary.VIEW_LIBRARIAN_DETAILS_QUERY);

		resultset = ps1.executeQuery();

		while (resultset.next()) {
			System.out.println("Librarian ID is:" + resultset.getInt(1));
			System.out.println("Librarian name is" + resultset.getString(2));
			System.out.println("Librarian Address is:" + resultset.getString(3));
			System.out.println("Librarian number is" + resultset.getInt(4));
		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 *  - Function Name : retriveLibrarian
	 *  - Return Type : String 
	 *  - Throws : Exception, ClassNotFoundException 
	 *  - Creation Date : 15/03/2019 
	 *  - Author:  Kirti Sharma
	 *  - Description : View a particular Librarian
	 ********************************************************************************************************/

	public void rertriveLibrarian(String librarianid) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;

		preparedStatement = con.prepareStatement(QmLibrary.RETRIVE_ALL_QUERY);
		preparedStatement.setString(1, librarianid);
		resultset = preparedStatement.executeQuery();

		while (resultset.next()) {
			System.out.println("Librarian ID is:" + resultset.getInt(1));
			System.out.println("Librarian name is" + resultset.getString(2));
			System.out.println("Librarian Address is:" + resultset.getString(3));
			System.out.println("Librarian number is" + resultset.getInt(4));
		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : deleteLibrarian
	 * - Return Type : String 
	 * - Throws :Exception, ClassNotFoundException 
	 * - Creation Date : 15/03/2019 
	 * - Author:  Kirti Sharma
	 * -Description : to delete a particular Librarian
	 ********************************************************************************************************/

	public void deleteLibrarian(String librarianid1) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		preparedStatement = con.prepareStatement(QmLibrary.DELETE_QUERY);
		preparedStatement.setString(1, librarianid1);
		ResultSet resultset = null;
		resultset = preparedStatement.executeQuery();

		System.out.println("Librarian deleted");

		con.close();
	}

}
