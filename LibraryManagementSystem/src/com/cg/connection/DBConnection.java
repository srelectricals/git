package com.cg.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	 public Connection getConnection() throws ClassNotFoundException, SQLException
	 {
      Class.forName("oracle.jdbc.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Manager");
      System.out.println("Connection Created");
	 return con;
     }
}
