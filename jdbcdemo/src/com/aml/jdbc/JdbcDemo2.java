package com.aml.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JdbcDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		pst.setInt(1, 3);
		pst.setString(2, "anjali");
		pst.setInt(3,10000 );
		int j=pst.executeUpdate();
		pst.setInt(1, 4);
		pst.setString(2, "ajay");
		pst.setInt(3,10000 );
		int i=pst.executeUpdate();
		System.out.println("row inserted");
		ResultSet rs=pst.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		rs.close();
		pst.close();
		con.close();
		
	}

}
