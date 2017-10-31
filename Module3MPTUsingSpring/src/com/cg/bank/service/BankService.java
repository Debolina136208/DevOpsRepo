package com.cg.bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.dao.IDAO;
import com.cg.bank.dto.AccountBean;
import com.cg.bank.dto.TransactionBean;

@Service
@Transactional
public class BankService implements IService{
	//Instantiating the Bank DAO Class for database related operations
	@Autowired
	IDAO dao;
	
	//Calling DAO method to get the account details
	public List<AccountBean> getAllAccounts(String cName){
		return dao.getAllAccounts(cName);
	}
	
	//Calling DAO method to insert the transaction details into database
	public void debit(TransactionBean trans){
		dao.debit(trans);
	}
}
