package com.aml.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement stmt=con.createStatement();
		int re1=stmt.executeUpdate("update student set name='amol' where id=1");
		ResultSet re=stmt.executeQuery("select * from student");
        System.out.println("after the update");
		while(re.next()) {
			System.out.println(re.getInt(1));
			System.out.println(re.getString(2));
			System.out.println(re.getInt(3));
			
		}
		re.close();
		stmt.close();
		con.close();
	}
}
