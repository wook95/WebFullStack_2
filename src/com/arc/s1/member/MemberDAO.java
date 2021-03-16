package com.arc.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	
	public MemberDTO login(MemberDTO mDTO) throws Exception{
			
			
			String id ="user01";
			String pw ="user01";
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver ="oracle.jdbc.driver.OracleDriver";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,id,pw);
			
			String sql="select * from member where id=?and pw=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, mDTO.getId());
			st.setString(2, mDTO.getPw());
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				mDTO.setName(rs.getString("name"));
				mDTO.setEmail(rs.getString("email"));
				mDTO.setPhone(rs.getString("phone"));
				mDTO.setId(rs.getString("id"));
				mDTO.setPw(rs.getString("pw"));
				
				
			}
			else {
				
				mDTO = null;
			}
			rs.close();
			st.close();
			con.close();
			
			return mDTO;
			
		}
		
		
	
	
}
