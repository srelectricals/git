package com.cg.controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.exception.LibraryException;
import com.cg.model.Bookss;

public class Bookss1 {
	Bookss b = new Bookss();


	//------------------------ 1. Library Application --------------------------
		/*******************************************************************************************************
		 - Function Name	: getBooks()
		 - Input Parameters	: 	
		 - Return Type		: void
		 - Throws		    : IOException, LibraryException
		 - Author           : Kirti
		 - Creation Date	: 15/03/2019
		 - Description		: calls books method getBooks()
		 ********************************************************************************************************/

	public void getBooks() throws IOException, LibraryException {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Book Id:");
			int book_Id = Integer.parseInt(br.readLine());
			b.setBook_ID(book_Id);

			System.out.println("Enter Book Title:");
			String title = br.readLine();
			b.setTitle(title);

			System.out.println("Enter Book Author1:");
			String author1 = br.readLine();
			b.setAuthor1(author1);

			System.out.println("Enter Book Author2:");
			String author2 = br.readLine();
			b.setAuthor2(author2);

			System.out.println("Enter Book Publisher:");
			String publisher = br.readLine();
			b.setPublisher(publisher);
		} 
		catch (NumberFormatException e) {
			System.out.println("enter a valid value");
		}

	}

}
