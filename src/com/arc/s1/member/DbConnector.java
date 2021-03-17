package com.arc.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {

	public static Connection dbconnect() throws Exception{
		
		//1. 로그인 정보 
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		return con;
		
		
	}
	
	
	
	
}
