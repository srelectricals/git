package com.cg.daoo;

public interface QmBook {
	public static final String RETRIVE_ALL_QUERY = "SELECT * FROM book where bookid=?";
	public static final String VIEW_BOOK_DETAILS_QUERY = "SELECT * from book";
	public static final String INSERT_QUERY = "INSERT INTO book VALUES(?,?,?,?,?)";
	public static final String DELETE_QUERY = "DELETE FROM book where bookid=?";

}
