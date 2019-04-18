
package com.cg.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cg.connection.DBConnection;
import com.cg.model.Memberr;

public class Memberr1 {
	Memberr m = new Memberr();

	//------------------------ 1. Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name	: getMember()
	 - Input Parameters	: set parameters	
	 - Return Type		: void
	 - Throws		    : NumberFormatException,  IOException
	 - Author           : kirti sharma
	 - Creation Date	: 15/03/2019
	 - Description		: calls member method getMember()
	 ********************************************************************************************************/

	public void getMember() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			DBConnection l = new DBConnection();
			Connection con = l.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into member values(?)");

			System.out.println("Enter Member Id:");
			int mem_id = Integer.parseInt(br.readLine());
			m.setMem_ID1(mem_id);

			System.out.println("Enter Member Name:");
			String name = br.readLine();
			m.setName(name);

			System.out.println("Enter Address of Member:");
			String address = br.readLine();
			m.setAddress(address);

			System.out.println("Enter Gender of Member:");
			String gender = br.readLine();
			m.setGender(gender);

			System.out.println("Enter Date of Birth:");
			String dob = br.readLine();
			m.setDOB(dob);

			System.out.println("Enter Date of Joining:");
			String doj = br.readLine();
			m.setDOJ(doj);

			System.out.println("Enter your phnone no:");
			String phn = br.readLine();
			m.setPhnNo(phn);

			/*******************************************
			 * VALIDATION OF PHONE NUMBER
			 ******************************************/

			String num = m.getPhnNo();
			if ((num.length() == 12) && (num.charAt(0) == '9') && (num.charAt(1) == '1') && (num.charAt(2) >= '7')
					&& (num.charAt(2) <= '9')) {
				ps.setString(1, m.getPhnNo());

				System.out.println("Valid number");
			}

			else if ((num.length() == 11) && (num.charAt(0) == '0') && (num.charAt(1) >= '7')
					&& (num.charAt(1) <= '9')) {
				ps.setString(1, m.getPhnNo());
				System.out.println("Valid number");
			} else if ((num.length() == 10) && (num.charAt(0) >= '7') && (num.charAt(0) <= '9')) {
				ps.setString(1, m.getPhnNo());
				System.out.println("VALID PHONE NUMBER");
			} else
				System.out.println("INVALID PHONE NUMBER");

		}

		catch (Exception e) {
			System.out.println("Enter a valid value");
		}
	}
}
