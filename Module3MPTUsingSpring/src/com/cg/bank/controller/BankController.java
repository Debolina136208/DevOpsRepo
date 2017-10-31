package com.cg.bank.controller;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bank.dto.AccountBean;
import com.cg.bank.dto.TransactionBean;
import com.cg.bank.service.IService;

@Controller
public class BankController {
	@Autowired
	private IService service;
	
	@RequestMapping(value="/attender",method=RequestMethod.POST)
	public ModelAndView handleRequest(@RequestParam("cName")String cName){
	
		ModelAndView modelAndView = null;
		List<AccountBean> acnts=service.getAllAccounts(cName);
		
		if(acnts.size()==0){
			modelAndView = new ModelAndView("CustomerError");
			modelAndView.addObject("Error", "There are no accounts for "+cName);
		}else{
			modelAndView = new ModelAndView("AccountInfo");
			modelAndView.addObject("Accounts",acnts);
			modelAndView.addObject("Name",cName);
		}
		
		return modelAndView;
	}	
	
	@RequestMapping(value = "/Debit",method=RequestMethod.POST)
	public ModelAndView sayHello(@RequestParam(value="acNo", required=true) String acNo,@RequestParam(value="amount", required=true) int amt) {
			TransactionBean trans=new TransactionBean();
			trans.setAccountNo(acNo);
			trans.setTransAmt(amt);
			trans.setTransDesc("ATM Debit");
			trans.setTransDate(Date.valueOf(LocalDate.now()));
			service.debit(trans);
			ModelAndView modelAndView = new ModelAndView("TransactionSuccess");
			modelAndView.addObject("Amount", amt);
			modelAndView.addObject("AccountNo", acNo);
			return modelAndView;
	}
}
