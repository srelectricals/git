
package com.cg.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.cg.controller.*;
import com.cg.daoo.*;

public class Library1 {
	Scanner sc = new Scanner(System.in);
     
	//------------------------ Library Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	displaymain
	 - Input Parameters :   
	 - Return Type		:	void
	 - Author           :   Kirti Sharma
	 - Creation Date	:	15/03/2019
	 - Description		:	Calling Controller and DAO(Data Access object)
	 ********************************************************************************************************/


	public void displaymain() {
		try {
			// book objects
			Bookss1 b1 = new Bookss1();
			BooksDao b2 = new BooksDao();
			// lending objects
			Lendingg1 l1 = new Lendingg1();
			LendingDao l2 = new LendingDao();
			// librarian objects
			Librariann1 n1 = new Librariann1();
			LibrarianDao n2 = new LibrarianDao();
			// member objects
			Memberr1 m1 = new Memberr1();
			MemberDao m2 = new MemberDao();

			Rules rules = new Rules();

			System.out.println(
					"*************************************** VARUN MEMORIAL LIBRARY ***************************************");
			System.out.println(
					"********************************************* MUMBAI **************************************************");

			System.out.println("********************************************");
			System.out.println("*********Enter 1 for Member*****************");
			System.out.println("*********Enter 2 for Librarian**************");
			System.out.println("*********Enter 3 for for Book***************");
			System.out.println("*********Enter 4 to for Lending*************");
			System.out.println("*********Press 10 to exit****************** ");
			System.out.println("*********************************************");
			System.out.println("*****Press 5 for GENERAL INSTRUCTIONS********");
			System.out.println("*****Press 6 for SEE DO'S AND DONT'S*********");
			System.out.println("*****Press 7 for TIMINGS OF LIBRARY**********");
			System.out.println("*****Press 8 for REGULATION OF LIBRARY*******");
			System.out.println("*********************************************");

			int n = 0;
			do {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Enter Your Choice");
				n = Integer.parseInt(br.readLine());
				switch (n) {
				case 1:
					System.out.println("*******************************************");
					System.out.println("********PRESS 1 TO ADD MEMBER**************");
					System.out.println("****PRESS 2 TO VIEW ALL DETAILS OF BOOK****");
					System.out.println("****PRESS 3 TO VIEW A PARTICULAR BOOK******");
					System.out.println("*******PRESS 4 TO DELETE A BOOK************");
					System.out.println("*******************************************");

					int a = sc.nextInt();

					if (a == 1) {
						m1.getMember();
						System.out.println("Members deatils saved successfully.");
					} else if (a == 1) {
						m1.getMember();
						m2.displayMember();
					} else if (a == 2) {
						System.out.println("Member details are:");
						m2.viewMember();
					} else if (a == 3) {
						System.out.println("Enter Member ID");
						String e = sc.next();
						m2.rertriveMember(e);
					} else {
						System.out.println("Enter Member ID");
						String f = sc.next();
						m2.deleteMember(f);
					}
					break;

				case 2:
					System.out.println("***********************************************");
					System.out.println("********PRESS 1 TO ADD LIBRARIAN***************");
					System.out.println("****PRESS 2 TO VIEW ALL DETAILS OF LIBRARIAN****");
					System.out.println("****PRESS 3 TO VIEW A PARTICULAR LIBRARIAN******");
					System.out.println("*******PRESS 4 TO DELETE A LIBRARIAN************");
					System.out.println("************************************************");

					int b = sc.nextInt();

					if (b == 1) {
						n1.getLibrarian();
						n2.displayLibrarian();
						System.out.println("Librarian details saved successfully.");
					} else if (b == 2) {
						System.out.println("Librarian details are:");
						n2.viewLibrarian();

					} else if (b == 3) {
						System.out.println("Enter Librarian ID");
						String g = sc.next();
						n2.rertriveLibrarian(g);
					} else {
						System.out.println("Enter Librarian ID");
						String h = sc.next();
						n2.deleteLibrarian(h);
					}

					break;

				case 3:
					System.out.println("*******************************************");
					System.out.println("********PRESS 1 TO ADD BOOK****************");
					System.out.println("****PRESS 2 TO VIEW ALL DETAILS OF BOOK****");
					System.out.println("****PRESS 3 TO VIEW A PARTICULAR BOOK******");
					System.out.println("*******PRESS 4 TO DELETE A BOOK************");
					System.out.println("*******************************************");

					int c = sc.nextInt();

					if (c == 1) {
						b1.getBooks();
						b2.displayBook();
						System.out.println("Book details saved successfully.");
					} else if (c == 2) {
						System.out.println("Book details are:");
						b2.viewBook();

					} else if (c == 3) {
						System.out.println("Enter Book ID");
						String a1 = sc.next();
						b2.rertriveBook(a1);
					} else {
						System.out.println("Enter Book ID");
						String b11 = sc.next();
						b2.deleteBook(b11);
					}

					break;

				case 4:
					System.out.println("*********************************************");
					System.out.println("********PRESS 1 TO ADD LENDING****************");
					System.out.println("****PRESS 2 TO VIEW ALL DETAILS OF LENDING****");
					System.out.println("****PRESS 3 TO VIEW A PARTICULAR LENDING******");
					System.out.println("*******PRESS 4 TO DELETE A LENDING************");
					System.out.println("**********************************************");

					int d = sc.nextInt();

					if (d == 1) {
						l1.getLending();
						l2.displayLending();
						System.out.println("Lending details saved successfully.");
					} else if (d == 2) {
						System.out.println("Lending details are:");
						l2.viewLending();

					} else if (d == 3) {
						System.out.println("Enter Lending ID");
						String c8 = sc.next();
						l2.rertriveLending(c8);
					} else {
						System.out.println("Enter Lending ID");
						String dl = sc.next();
						l2.deleteLending(dl);

					}

					break;

				case 5:
					System.out.println("*****GENERAL INSTRUCTIONS*****");
					rules.generalInstructions();
					break;
				case 6:
					System.out.println("*****TO SEE DO'S AND DONT'S****");
					rules.doDont();
					break;
				case 7:
					System.out.println("*****TIMINGS OF LIBRARY********");
					rules.tim();
					break;
				case 8:
					System.out.println("*****REGULATION OF LIBRARY******");
					rules.aboutLibrary();
					break;
				case 10:
					System.exit(0);
					break;
				default:
					System.out.println("wrong value entered ");
					break;
				}
			} while (n != 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Library1 l = new Library1();
		l.displaymain();
	}
}
