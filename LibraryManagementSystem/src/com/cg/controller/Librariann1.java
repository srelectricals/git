
package com.cg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.model.Librariann;

public class Librariann1 {
	Librariann l1 = new Librariann();


	//------------------------ 1. Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name	: getLibrarian()
	 - Input Parameters	: set parameters	
	 - Return Type		: void
	 - Throws		    : NumberFormatException,  IOException
	 - Author           : Kirti sharma
	 - Creation Date	: 15/03/2019
	 - Description		: calls lending method getLending()
	 ********************************************************************************************************/

	public void getLibrarian() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("enter librarian id");
			int str1 = Integer.parseInt(br.readLine());
			l1.setLid(str1);

			System.out.println("enter libarian name");
			String str2 = br.readLine();
			l1.setLname(str2);

			System.out.println("enter address");
			String str3 = br.readLine();
			l1.setAddress(str3);

			System.out.println("enter number");
			int str4 = Integer.parseInt(br.readLine());
			l1.setNumbers(str4);
		} catch (NumberFormatException e) {
			System.out.println("wrong value entered");
		} catch (IOException e) {
			System.out.println("wrong value entered");

		}
	}
}
