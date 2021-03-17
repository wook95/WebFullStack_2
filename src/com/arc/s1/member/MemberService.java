package com.arc.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.arc.s1.util.ActionFoward;

public class MemberService {
	
	
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	
	
	
	
	
	
	
	
	public ActionFoward memberJoin(HttpServletRequest request) throws Exception{
		
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		actionFoward.setPath("../WEB-INF/member/memberJoin.jsp");
		actionFoward.setCheck(true);
		
		
		if(method.toUpperCase().equals("POST")) {
			
			
			
			MemberDTO mDTO = new MemberDTO();
			mDTO.setId(request.getParameter("id"));
			mDTO.setPw(request.getParameter("pw"));
			mDTO.setName(request.getParameter("name"));
			mDTO.setEmail(request.getParameter("email"));
			mDTO.setPhone(request.getParameter("phone"));
			
			int result = memberDAO.memberJoin(mDTO);
			actionFoward.setPath("../index.do");
			actionFoward.setCheck(false);
			
		}
		
		return actionFoward;
		
	}
	
	
	
}
