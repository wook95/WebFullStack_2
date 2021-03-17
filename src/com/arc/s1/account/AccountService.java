package com.arc.s1.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.arc.s1.util.ActionFoward;

public class AccountService {

	
	
	
	private AccountDAO accountDAO; // setter만 만듬 집어만 널라고, 저 메소드로
	
	
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}



	public ActionFoward getList(HttpServletRequest request) throws Exception {
		
		ActionFoward actionFoward = new ActionFoward();
		List<AccountDTO> ar = accountDAO.getList(); //webinf bankbooklist.jsp 에 출력
		
		
		actionFoward.setPath("../WEB-INF/account/accountList"); //어떻게 보냄? attribute로 내부-->내부
		
		request.setAttribute("list", ar); // 이 경로로 포워딩인가 리다이렉튼가 ? 정해야댐 /서버로 요청할땐 .do로/ jsp애 뿌려줄 데이터 있음 무족권 포워ㅡ드
		
		//포워드를 보낼떄는 우리약속/
		actionFoward.setCheck(true);
		
		
		// 요청 /리퀘스트 --> 컨트롤러-->서비스 (ar 담는다)--> 리스판스로 나가면 리퀘스트 리스판스 사라짐
		//컨트롤러에서 jsp로 리퀘스트 보냄(바로 보낸는 방법이 포워드)
		//클라이언트에 리스판스를 보내고 다시 요청을 받는게 리다이렉트..! 다시공부 고고고ㅗ공
		
		
		return actionFoward;
	}
	
	
}
