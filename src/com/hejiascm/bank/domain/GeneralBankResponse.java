package com.hejiascm.bank.domain;

public class GeneralBankResponse {
	private char[] status;
	private String statusText;
	public char[] getStatus() {
		return status;
	}
	public void setStatus(char[] status) {
		this.status = status;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
}
