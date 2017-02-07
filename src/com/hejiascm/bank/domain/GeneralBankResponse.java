package com.hejiascm.bank.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stream")
public class GeneralBankResponse {
	private char[] status;
	private String statusText;
	
	public char[] getStatus() {
		return status;
	}
	
	@XmlElement
	public void setStatus(char[] status) {
		this.status = status;
	}
	
	public String getStatusText() {
		return statusText;
	}
	
	@XmlElement
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
}
