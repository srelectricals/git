package com.cg.daoo;

public interface QmLibrary {
	public static final String RETRIVE_ALL_QUERY="SELECT * FROM librarian where l_id=?";
	public static final String VIEW_LIBRARIAN_DETAILS_QUERY="SELECT * from librarian";
	public static final String INSERT_QUERY="INSERT INTO librarian VALUES(?,?,?,?)";
	public static final String DELETE_QUERY="DELETE FROM librarian where l_id=?";
}
