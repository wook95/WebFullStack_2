package com.arc.s1.test;

import com.arc.s1.member.MemberDAO;
import com.arc.s1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDAO mDAO = new MemberDAO();
		MemberDTO mDTO = new MemberDTO();
		
		mDTO.setId("id3");
		mDTO.setPhone("pw3");
		mDTO.setName("id3");
		mDTO.setEmail("id@wsfd");
		mDTO.setPhone("919192");
	
		try {
			int result = mDAO.memberJoin(mDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
