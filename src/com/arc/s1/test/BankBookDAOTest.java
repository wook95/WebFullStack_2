package com.arc.s1.test;

import java.util.ArrayList;
import java.util.List;

import com.arc.s1.account.AccountDAO;
import com.arc.s1.account.AccountDTO;

public class BankBookDAOTest {

	public static void main(String[] args) {
		
		
		
		
		AccountDAO accountDAO = new AccountDAO();
		
		try {
			List<AccountDTO> ar=  accountDAO.getList();
			System.out.println(ar.size()!=0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
