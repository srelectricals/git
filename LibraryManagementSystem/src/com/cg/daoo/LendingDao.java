package com.cg.daoo;

import java.sql.*;
import com.cg.connection.DBConnection;
import com.cg.model.Lendingg;

public class LendingDao implements QmLending {

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name : displayLending
	 - Return Type : void 
	 - Throws : Exception, SQLException 
	 - Creation Date : 15/03/2019 
	 - Author:  Kirti Sharma
	 - Description : Adding Lending
	 ********************************************************************************************************/

	public void displayLending() throws Exception, SQLException {

		Lendingg m = new Lendingg();

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement ps = con.prepareStatement(QmLending.INSERT_QUERY);

		ps.setInt(1, m.getMem_ID());
		ps.setInt(2, m.getLibId());
		ps.setString(3, m.getLndDate());
		ps.setString(4, m.getBook_ID1());
		ps.setString(5, m.getBook_ID2());
		ps.setString(6, m.getBook_ID3());
		ps.setString(7, m.getBook_ID4());
		ps.setString(8, m.getBook_ID5());
		ps.setString(9, m.getRtrnDate());

		int i = ps.executeUpdate();
		System.out.println("Lending Successfull" + i + "row");
		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name : viewLending 
	 - Return Type : void 
	 - Throws :SQLException, ClassNotFoundException 
	 - Creation Date : 15/03/2019 
	 - Author:  Kirti Sharma
	 - Description : viewing Lending
	 ********************************************************************************************************/

	public void viewLending() throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		ResultSet resultset = null;

		PreparedStatement ps1 = con.prepareStatement(QmLending.VIEW_LENDING_DETAILS_QUERY);

		resultset = ps1.executeQuery();

		while (resultset.next()) {

			System.out.println("Member id is: " + resultset.getInt(1));
			System.out.println("Library id is" + resultset.getString(2));
			System.out.println("Lending date is: " + resultset.getString(3));
			System.out.println("Book1 is: " + resultset.getString(4));
			System.out.println("Book2 is: " + resultset.getString(5));
			System.out.println("Book3 is: " + resultset.getString(6));
			System.out.println("Book4 is " + resultset.getString(7));
			System.out.println("Book5 is " + resultset.getString(8));
			System.out.println("Return date is:" + resultset.getString(9));
		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	  - Function Name : retriveLending
	  - Return Type : String 
	  - Throws : Exception, ClassNotFoundException 
	  - Creation Date : 15/03/2019 
	  - Author:  Kirti Sharma
	  -Description : View a particular lending
	 ********************************************************************************************************/

	public void rertriveLending(String lendid) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;

		preparedStatement = con.prepareStatement(QmLending.RETRIVE_ALL_QUERY);
		preparedStatement.setString(2, lendid);
		resultset = preparedStatement.executeQuery();

		while (resultset.next()) {
			System.out.println("Member id is: " + resultset.getInt(1));
			System.out.println("Library id is" + resultset.getString(2));
			System.out.println("Lending date is: " + resultset.getString(3));
			System.out.println("Book1 is: " + resultset.getString(4));
			System.out.println("Book2 is: " + resultset.getString(5));
			System.out.println("Book3 is: " + resultset.getString(6));
			System.out.println("Book4 is " + resultset.getString(7));
			System.out.println("Book5 is " + resultset.getString(8));
			System.out.println("Return date is:" + resultset.getString(9));

		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : deleteLending 
	 * - Return Type : String 
	 * - Throws :Exception, ClassNotFoundException 
	 * - Creation Date : 15/03/2019 
	 * - Author:  Kirti Sharma
	 * -Description : to delete a particular Lending
	 ********************************************************************************************************/

	public void deleteLending(String lendid1) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		preparedStatement = con.prepareStatement(QmLending.DELETE_QUERY);
		preparedStatement.setString(1, lendid1);
		ResultSet resultset = null;
		resultset = preparedStatement.executeQuery();

		System.out.println("Lending deleted:");

		con.close();
	}
}
