package com.cg.daoo;

public interface QmMember {
	public static final String RETRIVE_ALL_QUERY="SELECT * FROM member where member_id=?";
	public static final String VIEW_MEMBER_DETAILS_QUERY="SELECT * from  member";
	public static final String INSERT_QUERY="INSERT INTO member VALUES(?,?,?,?,?,?,?)";
	public static final String DELETE_QUERY="DELETE FROM member where member_id =?";
	
}
