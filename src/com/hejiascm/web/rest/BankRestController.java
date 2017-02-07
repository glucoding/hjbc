package com.hejiascm.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hejiascm.bank.dao.BankDAO;
import com.hejiascm.bank.domain.BankTransferRequest;

@Controller("BankRestController")
public class BankRestController {
	@Autowired
	BankDAO bankDAO;
	
	/**
	 * Create a new Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/transfer", method = RequestMethod.POST)
	@ResponseBody
	public String transfer(@RequestBody BankTransferRequest btr) {
		return bankDAO.transfer(btr);
	}
}
