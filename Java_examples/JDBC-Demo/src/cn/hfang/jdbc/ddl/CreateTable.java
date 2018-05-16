package cn.hfang.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	// ���ݿ��ַ
	private static String URL = "jdbc:mysql://localhost:3306/my_test";

	private static String USER = "root";

	private static String PASSWORD = "csci330pass";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ��������
		Class.forName("com.mysql.jdbc.Driver");

		// ��ȡ���Ӷ���
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

		// ��дsql���
		String sql = "CREATE TABLE stuff(id int, name varchar(50),age int)";
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
	}

}
