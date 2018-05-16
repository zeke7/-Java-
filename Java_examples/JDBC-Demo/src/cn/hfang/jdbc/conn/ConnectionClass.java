package cn.hfang.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	//数据库地址
	private static String URL = "jdbc:mysql://localhost:3306/my_test";
	
	private static String USER = "root";
	
	private static String PASSWORD = "csci330pass";
			
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
	
		// 获取连接对象
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
	
	}
}
