
package com.cg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.model.Lendingg;

public class Lendingg1 {
	Lendingg m = new Lendingg();

	//------------------------ 1. Library Application --------------------------
		/*******************************************************************************************************
		 - Function Name	: getLending()
		 - Input Parameters	: set parameters	
		 - Return Type		: void
		 - Throws		    : NumberFormatException,  IOException
		 - Author           : Kirti sharma
		 - Creation Date	: 15/003/2019
		 - Description		: calls lending method getLending()
		 ********************************************************************************************************/


	public void getLending() throws NumberFormatException, IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Member Id:");
			int mem_ID = Integer.parseInt(br.readLine());
			m.setMem_ID(mem_ID);

			System.out.println("Enter Library ID:");
			int libId = Integer.parseInt(br.readLine());
			m.setLibId(libId);

			System.out.println("lending date is:");
			String lndDate = br.readLine();
			m.setLndDate(lndDate);

			System.out.println("Enter the no. of book");

			/*****************************************
			 * VALIDATION OF BOOKS
			 *******************************************/
			int n = Integer.parseInt(br.readLine());
			for (int i1 = 1; i1 <= n; i1++) {
				System.out.println("Enter book : " + i1);
				System.out.println("Enter Book's Name : ");
				String book_id = br.readLine();
				if (i1 == 1)
					m.setBook_ID1(book_id);
				if (i1 == 2)
					m.setBook_ID2(book_id);
				if (i1 == 3)
					m.setBook_ID3(book_id);
				if (i1 == 4)
					m.setBook_ID4(book_id);
				if (i1 == 5)
					m.setBook_ID5(book_id);
				if (i1 >= 6) {
					System.out.println("Cannot Borrow Books");
				} else
					continue;
			}

			System.out.println("Enter Return date:");
			String rtrndate = br.readLine();
			m.setRtrnDate(rtrndate);
			
		} catch (NumberFormatException e) {
			System.out.println("enter a valid value");
		}
	}
}
