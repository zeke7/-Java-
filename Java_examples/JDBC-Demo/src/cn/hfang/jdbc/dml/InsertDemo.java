package cn.hfang.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	// Êý¾Ý¿âµØÖ·
	private static String URL = "jdbc:mysql://localhost:3306/my_test";

	private static String USER = "root";

	private static String PASSWORD = "csci330pass";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = null;

		Statement stmt = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "INSERT INTO student VALUES (3, 'zeke3', 23)";

			stmt = conn.createStatement();

			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
