package com.arc.s1.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arc.s1.util.ActionFoward;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService memberService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException{
    	memberService = new MemberService();
    	MemberDAO memberDAO = new MemberDAO();
    	memberService.setMemberDAO(memberDAO);
    	
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		String path = request.getServletPath();
		String uri	= request.getRequestURI();
		System.out.println(path);
		System.out.println(uri);
		String result="";
		//substring
		//1. 자르려고 하는 시작 인덱스 찾기
		int index = uri.lastIndexOf("/");
		//2. 해당 인덱스부터 잘라오기
		result = uri.substring(index+1);
		//3. 멤버로그인.do 
		System.out.println(result);
		
		String pathInfo = "";
		ActionFoward actionFoward = null;
		
		if(result.equals("memberLogin.do")) {
			System.out.println("로그인 처리");
			pathInfo="../WEB-INF/member/memberLogin.jsp";
		}else if(result.equals("memberJoin.do")) {
			
			//메소드 구분
			String method = request.getMethod();
			
			
			System.out.println("회원가입 처리");
			try {
				actionFoward=memberService.memberJoin(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}else {
			System.out.println("그 외 다른 처리");
		}
		
		
		
		//foward
		RequestDispatcher view = request.getRequestDispatcher(pathInfo);
		view.forward(request, response);
		
//		MemberDAO mDAO = new MemberDAO();
//		MemberDTO mDTO = new MemberDTO();
//		String result = null;
//		try {
//			
//			String id = request.getParameter("id");
//			String pw = request.getParameter("pw");
//			
//			mDTO.setId(id);
//			mDTO.setId(pw);
//
//			mDTO = mDAO.login(mDTO);
//
//			result = "실패~";
//
//			if(mDTO != null){
//				result = "success";
//			}
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// TODO Auto-generated method stub
//		
//		
//		//attribute
//		request.setAttribute("r", result);
//		request.setAttribute("member", mDTO);
//		
//		
//		
//		RequestDispatcher view = request.getRequestDispatcher("./memberResult.jsp");
//		view.forward(request, response);
//		
//		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
