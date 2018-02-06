package com.aml.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		PreparedStatement pst=con.prepareStatement("update  student set name=?,salary=? where id=?");
		pst.setInt(1, 5);
		pst.setString(2, "Maya");
		pst.setInt(3,30000 );
		pst.addBatch();
		
		pst.setInt(1, 6);
		pst.setString(2, "anil");
		pst.setInt(3,20000 );
		pst.addBatch();
		pst.executeBatch();
		System.out.println("row inserted");
		//int i=pst.executeUpdate("delete from student where id=6");
		int j= pst.executeUpdate("delete from student where id=4");
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
