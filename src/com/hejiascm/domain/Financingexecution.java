package com.hejiascm.domain;

import java.util.List;

public class Financingexecution {
	String id;
	String financingContractID;
	String lenderOrgID;
	String borrowerOrgID;
	double loanAmount;
	double totalPrincipalPaid;
	double totalInterestPaid;
	List<Repaymentdetail> repaymentDetails;
	String[] loanRecordID;
	String[] repaymentRecordID;
	int loanStatus;
	int repaymentStatus;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFinancingContractID() {
		return financingContractID;
	}
	public void setFinancingContractID(String financingContractID) {
		this.financingContractID = financingContractID;
	}
	public String getLenderOrgID() {
		return lenderOrgID;
	}
	public void setLenderOrgID(String lenderOrgID) {
		this.lenderOrgID = lenderOrgID;
	}
	public String getBorrowerOrgID() {
		return borrowerOrgID;
	}
	public void setBorrowerOrgID(String borrowerOrgID) {
		this.borrowerOrgID = borrowerOrgID;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getTotalPrincipalPaid() {
		return totalPrincipalPaid;
	}
	public void setTotalPrincipalPaid(double totalPrincipalPaid) {
		this.totalPrincipalPaid = totalPrincipalPaid;
	}
	public double getTotalInterestPaid() {
		return totalInterestPaid;
	}
	public void setTotalInterestPaid(double totalInterestPaid) {
		this.totalInterestPaid = totalInterestPaid;
	}
	public List<Repaymentdetail> getRepaymentDetails() {
		return repaymentDetails;
	}
	public void setRepaymentDetails(List<Repaymentdetail> repaymentDetails) {
		this.repaymentDetails = repaymentDetails;
	}
	public String[] getLoanRecordID() {
		return loanRecordID;
	}
	public void setLoanRecordID(String[] loanRecordID) {
		this.loanRecordID = loanRecordID;
	}
	public String[] getRepaymentRecordID() {
		return repaymentRecordID;
	}
	public void setRepaymentRecordID(String[] repaymentRecordID) {
		this.repaymentRecordID = repaymentRecordID;
	}
	public int getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(int loanStatus) {
		this.loanStatus = loanStatus;
	}
	public int getRepaymentStatus() {
		return repaymentStatus;
	}
	public void setRepaymentStatus(int repaymentStatus) {
		this.repaymentStatus = repaymentStatus;
	}
}
