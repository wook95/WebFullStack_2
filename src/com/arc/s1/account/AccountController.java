package com.arc.s1.account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arc.s1.util.ActionFoward;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountController() {
		super();
		// TODO Auto-generated constructor stub
	}
	//서비스 쓴다
	private AccountService accountService;

	//상속받은 메서드중 init 잇음
	//controller 객체 생성 후 자동 호출 되는 초기화 메서드

	@Override
	public void init() throws ServletException {
		accountService = new AccountService();
		AccountDAO accountDAO = new AccountDAO(); //세터만들어놈
		accountService.setAccountDAO(accountDAO);


		super.init();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ActionFoward actionFoward = null;
		
		
		
		String uri = request.getRequestURI();
		//WebFullStack_2/account/accountList.do
		int index = uri.lastIndexOf("/");
		uri = uri.substring(index+1); // '/'는 생략하기 위한 +1 이다
		try {
			if(uri.equals("accountList.do")) {
			actionFoward = 	accountService.getList(request);
			//path 랑 트루 폴스 정보있음
			
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		//포워드로 보낼거냐 리다이렉트로 보낼거냐!
		if(actionFoward.isCheck()) {
			//포워드야 포워딩 하는 코드 쳐
			RequestDispatcher view = request.getRequestDispatcher(actionFoward.getPath()); // 포워딩할 준비만
			view.forward(request, response); // 넘겨준다 안에 어레이리스트 있음
		}
		else {
			//리다이렉트
			
		 response.sendRedirect(actionFoward.getPath());
			
		}
		
		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//겟으로 오든 포스트로 오는 doget이 실행된다
	}

}
