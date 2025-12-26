package com.example.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadData {
	@Autowired
	private DataSource ds;
	
	public void readData() throws Exception {
		Connection con = ds.getConnection();
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from emp");//1
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+
		    rs.getString(2)+"  "+rs.getString(3));
		}
		
		con.close();
	}
}
