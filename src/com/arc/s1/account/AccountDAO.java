package com.arc.s1.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.arc.s1.member.DbConnector;

public class AccountDAO  {

	
	public List<AccountDTO> getList() throws Exception {
	
	ArrayList<AccountDTO> ar = new ArrayList<>(); 	
	Connection con = DbConnector.dbconnect();
	
	String sql = "select * from account";
	PreparedStatement st= con.prepareStatement(sql);
	ResultSet rs = st.executeQuery();
	
	
	
	while(rs.next()) {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountId(rs.getLong("accountId"));
		accountDTO.setAccountName(rs.getString("accountname"));
		accountDTO.setRate(rs.getDouble("rate"));
		accountDTO.setAccountSale(rs.getString("accountsale"));
		
		ar.add(accountDTO);
		
	}
	
	rs.close();
	st.close();
	con.close();
	
	return ar;
	
	
	}
	
	
	public AccountDTO getSelect(long accountID) throws Exception{
	
		
		Connection con = DbConnector.dbconnect();
		
		String sql = "select * from account where accountId =1 ";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		 AccountDTO accountDTO = null;
		
		if(rs.next()) {
				accountDTO = new AccountDTO();
				accountDTO.setAccountId(rs.getLong("accountId"));
				accountDTO.setAccountName(rs.getString("accountname"));
				accountDTO.setRate(rs.getDouble("rate"));
				accountDTO.setAccountSale(rs.getString("accountsale"));
				
		}
		
		
		rs.close();
		st.close();
		con.close();
		
		return accountDTO;
		
	}

}
