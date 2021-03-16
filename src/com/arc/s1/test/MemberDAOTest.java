package com.arc.s1.test;

import com.arc.s1.member.MemberDAO;
import com.arc.s1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDAO mDAO = new MemberDAO();
		MemberDTO mDTO = new MemberDTO();
		
		mDTO.setId("iu");
		mDTO.setPhone("1234");
		
		try {
			mDTO = mDAO.login(mDTO);
			
			System.out.println(mDTO != null);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
