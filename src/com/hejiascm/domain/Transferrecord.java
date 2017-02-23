package com.hejiascm.domain;

import java.util.List;

public class Transferrecord {
	String id;
	String serial;
	int type;
	String submitterOrgId;
	List<Fincontradecontext> tradeContexts;
	double amount;
	String time;
	String payerOrgID;
	Bankaccountinfo payerBankAccountInfo;
	String payeeOrgID;
	Bankaccountinfo payeeBankAccountInfo;
	List<Finconattachment> attachments;
	String remards;
	List<Operation> operations;
	int status;
	int bankStatus;
	String[] bankTransferRecordID;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSubmitterOrgId() {
		return submitterOrgId;
	}
	public void setSubmitterOrgId(String submitterOrgId) {
		this.submitterOrgId = submitterOrgId;
	}
	public List<Fincontradecontext> getTradeContexts() {
		return tradeContexts;
	}
	public void setTradeContexts(List<Fincontradecontext> tradeContexts) {
		this.tradeContexts = tradeContexts;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPayerOrgID() {
		return payerOrgID;
	}
	public void setPayerOrgID(String payerOrgID) {
		this.payerOrgID = payerOrgID;
	}
	public Bankaccountinfo getPayerBankAccountInfo() {
		return payerBankAccountInfo;
	}
	public void setPayerBankAccountInfo(Bankaccountinfo payerBankAccountInfo) {
		this.payerBankAccountInfo = payerBankAccountInfo;
	}
	public String getPayeeOrgID() {
		return payeeOrgID;
	}
	public void setPayeeOrgID(String payeeOrgID) {
		this.payeeOrgID = payeeOrgID;
	}
	public Bankaccountinfo getPayeeBankAccountInfo() {
		return payeeBankAccountInfo;
	}
	public void setPayeeBankAccountInfo(Bankaccountinfo payeeBankAccountInfo) {
		this.payeeBankAccountInfo = payeeBankAccountInfo;
	}
	public List<Finconattachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Finconattachment> attachments) {
		this.attachments = attachments;
	}
	public String getRemards() {
		return remards;
	}
	public void setRemards(String remards) {
		this.remards = remards;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBankStatus() {
		return bankStatus;
	}
	public void setBankStatus(int bankStatus) {
		this.bankStatus = bankStatus;
	}
	public String[] getBankTransferRecordID() {
		return bankTransferRecordID;
	}
	public void setBankTransferRecordID(String[] bankTransferRecordID) {
		this.bankTransferRecordID = bankTransferRecordID;
	}
	
}
