package com.hejiascm.bank.dao;

import com.hejiascm.bank.domain.BankTransferRequest;

public interface BankDAO {
	public String transfer(BankTransferRequest btr);
}
