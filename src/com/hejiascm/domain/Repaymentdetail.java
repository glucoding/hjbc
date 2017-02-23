package com.hejiascm.domain;

public class Repaymentdetail {
	String repaymentRecordID;
	String time;
	double principalPaid;
	double interestPaid;
	double principalRemained;
	double interestRemained;
	
	public String getRepaymentRecordID() {
		return repaymentRecordID;
	}
	public void setRepaymentRecordID(String repaymentRecordID) {
		this.repaymentRecordID = repaymentRecordID;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrincipalPaid() {
		return principalPaid;
	}
	public void setPrincipalPaid(double principalPaid) {
		this.principalPaid = principalPaid;
	}
	public double getInterestPaid() {
		return interestPaid;
	}
	public void setInterestPaid(double interestPaid) {
		this.interestPaid = interestPaid;
	}
	public double getPrincipalRemained() {
		return principalRemained;
	}
	public void setPrincipalRemained(double principalRemained) {
		this.principalRemained = principalRemained;
	}
	public double getInterestRemained() {
		return interestRemained;
	}
	public void setInterestRemained(double interestRemained) {
		this.interestRemained = interestRemained;
	}
}
