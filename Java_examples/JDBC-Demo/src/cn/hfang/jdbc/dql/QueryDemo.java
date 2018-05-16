package cn.hfang.jdbc.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDemo {

	// ���ݿ��ַ
	private static String URL = "jdbc:mysql://localhost:3306/my_test";

	private static String USER = "root";

	private static String PASSWORD = "csci330pass";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = null;

		Statement stmt = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//String sql = "SELECT age from student";

			String sql = "SELECT * from student ";

			
			stmt = conn.createStatement();

			ResultSet res = stmt.executeQuery(sql);
			
			//ȡ��һ������
			/*
			if(res.next()){
				System.out.println(res.getInt("id"));
				System.out.println(res.getString("name"));
				System.out.println(res.getInt("age"));
			}
			*/
			
			//ȡ����������
			while(res.next()){
				System.out.println(res.getInt("id"));
				System.out.println(res.getString("name"));
				System.out.println(res.getInt("age"));
			}
			
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
