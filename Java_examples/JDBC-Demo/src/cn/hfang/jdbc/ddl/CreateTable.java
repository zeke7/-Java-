package cn.hfang.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	// 数据库地址
	private static String URL = "jdbc:mysql://localhost:3306/my_test";

	private static String USER = "root";

	private static String PASSWORD = "csci330pass";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 获取连接对象
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

		// 编写sql语句
		String sql = "CREATE TABLE stuff(id int, name varchar(50),age int)";
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
	}

}
