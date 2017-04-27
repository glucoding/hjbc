package com.hejiascm.blockchain.interfaces;

import com.ibm.crl.bc.hejia.sdk.capitalacc.BankTransferRecord;
import com.ibm.crl.bc.hejia.sdk.capitalacc.CapitalAccount;
import com.ibm.crl.bc.hejia.sdk.capitalacc.SubAccount;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;

public interface CapitalAccDAO {
	void cancelSubAccount(String subAccId, String operator);
	
	String createCapitalAccount(CapitalAccount cap, String operator);
	
	String createSubAccount(SubAccount sub, String operator);
	
	String createWithdrawTransfer(TransferRecord tr, String operator);
	
	void failToTransfer(String transferId, String remarks, String operator);
	
	BankTransferRecord getBankTransferRecordById(String transferId, String operator);
	
	BankTransferRecord[] getBankTransferRecords(String query, String operator);
	
	CapitalAccount getCapitalAccountByOrgId(String orgId, String operator);
	
	SubAccount getSubAccountById(String id, String operator);
	
	SubAccount[] getSubAccounts(String query, String operator);
	
	TransferRecord getTransferRecordById(String transferId, String operator);
	
	TransferRecord[] getTransferRecords(String query, String operator);
	
	void processTransferRecord(String transferId, String remarks, String serial, String operator);
	
	String submitBankTransferRecord(BankTransferRecord tr, String operator);
	
	String succeedToTransfer(BankTransferRecord tr, String operator);
	
	void suspendSubAccount(String subId, String operator);
	
	void updateSubAccount(SubAccount sub, String operator);
}
