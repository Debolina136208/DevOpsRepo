package com.cg.bank.dao;

import java.util.List;

import com.cg.bank.dto.AccountBean;
import com.cg.bank.dto.TransactionBean;

public interface IDAO {
	public void debit(TransactionBean trans);
	public  List<AccountBean> getAllAccounts(String cName);
}
