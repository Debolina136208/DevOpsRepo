package com.cg.bank.service;

import java.util.List;

import com.cg.bank.dto.AccountBean;
import com.cg.bank.dto.TransactionBean;

public interface IService {
	public List<AccountBean> getAllAccounts(String cName);
	public void debit(TransactionBean trans);
}
