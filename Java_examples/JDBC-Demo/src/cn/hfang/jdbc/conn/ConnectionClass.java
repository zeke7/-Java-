package cn.hfang.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	//���ݿ��ַ
	private static String URL = "jdbc:mysql://localhost:3306/my_test";
	
	private static String USER = "root";
	
	private static String PASSWORD = "csci330pass";
			
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		// ��������
		Class.forName("com.mysql.jdbc.Driver");
	
		// ��ȡ���Ӷ���
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
	
	}
}
