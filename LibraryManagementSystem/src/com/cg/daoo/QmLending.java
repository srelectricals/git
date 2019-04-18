package com.cg.daoo;

public interface QmLending {
	public static final String RETRIVE_ALL_QUERY = "SELECT * FROM lending where LibId=?";
	public static final String VIEW_LENDING_DETAILS_QUERY = "SELECT * from lending";
	public static final String INSERT_QUERY = "INSERT INTO lending VALUES(?,?,?,?,?,?,?,?,?)";
	public static final String DELETE_QUERY = "DELETE FROM lending where LibId=?";
}
