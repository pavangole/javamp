package com.example.docker;

import java.sql.*;

public class DbConnection{
	public static Connection Connectiontodatabase() throws Exception{

		String url="jdbc:mysql://localhost:3306/server_management";
		String user="root";
		String password = "Root@root123";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection(url,user,password);


		return connect;
		
	}
}