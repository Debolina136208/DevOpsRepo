package com.cg.bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.bank.dto.AccountBean;
import com.cg.bank.dto.TransactionBean;

@Repository
public class BankDAO implements IDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	//Method for inserting the transaction of debited amount into the transaction_details table
	public void debit(TransactionBean trans){
		entityManager.persist(trans);
	}
	
	public  List<AccountBean> getAllAccounts(String cName){
		String qStr = "SELECT account FROM AccountBean account WHERE account.customerName=:pName";
		TypedQuery<AccountBean> query = entityManager.createQuery(qStr, AccountBean.class);
		query.setParameter("pName", cName);
		return query.getResultList();
	}
}
