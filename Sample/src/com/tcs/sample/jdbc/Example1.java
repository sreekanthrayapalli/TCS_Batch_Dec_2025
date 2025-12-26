package com.tcs.sample.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Driver d = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement st  = con.createStatement();
			ResultSet rs =st.executeQuery("select *from emp");//1
			//now remove 1 and add 2
			int i =st.executeUpdate("insert into emp values()");//2
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			
			con.close();
		} catch (SQLException e) {
e.printStackTrace();
		}
	}

}
