package com.cg.daoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cg.connection.DBConnection;
import com.cg.model.Memberr;

public class MemberDao implements QmMember {

	 //------------------------ Library Application --------------------------
   	/*******************************************************************************************************
	 - Function Name	:	displayMember
	 - Return Type		:	void
	 - Creation Date	:	15/03/2019
	 - Author          :    Kirti Sharma
	 - Description		:	adding Member
	 ********************************************************************************************************/

	public void displayMember() {
		try {
			Memberr member = new Memberr();

			DBConnection l = new DBConnection();
			Connection con = l.getConnection();

			PreparedStatement ps = con.prepareStatement(QmMember.INSERT_QUERY);

			ps.setInt(1, member.getMem_ID1());
			ps.setString(2, member.getName());
			ps.setString(3, member.getAddress());
			ps.setString(4, member.getGender());
			ps.setString(5, member.getDOB());
			ps.setString(6, member.getDOJ());
			ps.setString(7, member.getPhnNo());

			int i = ps.executeUpdate();
			System.out.println("Values inserted" + i + "row");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : viewMember 
	 * - Return Type : void 
	 * - Throws :SQLException, ClassNotFoundException
	 * - Creation Date : 15/03/2019
	 * - Author:  Kirti Sharma
	 * -Description : viewing Member
	 ********************************************************************************************************/

	public void viewMember() throws SQLException, ClassNotFoundException {
		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		ResultSet resultset = null;

		PreparedStatement ps1 = con.prepareStatement(QmMember.VIEW_MEMBER_DETAILS_QUERY);
		resultset = ps1.executeQuery();

		while (resultset.next()) {
			System.out.println("Member ID: " + resultset.getInt(1));
			System.out.println("Name is: " + resultset.getString(2));
			System.out.println("Address is: " + resultset.getString(3));
			System.out.println("Gender is: " + resultset.getString(4));
			System.out.println("Date of Birth is: " + resultset.getString(5));
			System.out.println("Date of Joining is: " + resultset.getString(6));
			System.out.println("Phone no is" + resultset.getString(7));
		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : retriveMember
	 * - Return Type : String 
	 * - Throws :Exception, ClassNotFoundException 
	 * - Creation Date : 15/03/2019
	 * - Author:  Kirti Sharma
	 * - Description : View a particular Member
	 ********************************************************************************************************/

	public void rertriveMember(String memberid) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;

		preparedStatement = con.prepareStatement(QmMember.RETRIVE_ALL_QUERY);
		preparedStatement.setString(1, memberid);
		resultset = preparedStatement.executeQuery();

		while (resultset.next()) {

			System.out.println("Member ID: " + resultset.getInt(1));
			System.out.println("Name is: " + resultset.getString(2));
			System.out.println("Address is: " + resultset.getString(3));
			System.out.println("Gender is: " + resultset.getString(4));
			System.out.println("Date of Birth is: " + resultset.getString(5));
			System.out.println("Date of Joining is: " + resultset.getString(6));
			System.out.println("Phone no is" + resultset.getString(7));

		}

		con.close();
	}

	// ------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 * - Function Name : deleteMember 
	 * - Return Type : String 
	 * - Throws :Exception, ClassNotFoundException 
	 * - Creation Date : 15/03/2019 
	 * - Author:  Kirti Sharma
	 * - Description : to delete a particular Member
	 ********************************************************************************************************/

	public void deleteMember(String memberid1) throws SQLException, ClassNotFoundException {

		DBConnection l = new DBConnection();
		Connection con = l.getConnection();

		PreparedStatement preparedStatement = null;
		preparedStatement = con.prepareStatement(QmMember.DELETE_QUERY);
		preparedStatement.setString(1, memberid1);
		ResultSet resultset = null;
		resultset = preparedStatement.executeQuery();

		System.out.println("Member deleted successfully");

		con.close();
	}

}
