package com.hejiascm.bank.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "stream")
@XmlType(propOrder = {"userName", "clientId", "payAccNo","recvAccNo","recvAccNm","tranAmt","memo"})
public class BankTransferRequest {
	private String userName;
	private String clientId;
	private String payAccNo;
	private String recvAccNo;
	private String recvAccNm;
	private Double tranAmt;
	private String memo;
	
	public String getUserName() {
		return userName;
	}
	
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getClientId() {
		return clientId;
	}
	
	@XmlElement
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getPayAccNo() {
		return payAccNo;
	}
	
	@XmlElement
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	
	public String getRecvAccNo() {
		return recvAccNo;
	}
	
	@XmlElement
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public String getRecvAccNm() {
		return recvAccNm;
	}
	
	@XmlElement
	public void setRecvAccNm(String recvAccNm) {
		this.recvAccNm = recvAccNm;
	}
	
	public Double getTranAmt() {
		return tranAmt;
	}
	
	@XmlElement
	public void setTranAmt(Double tranAmt) {
		this.tranAmt = tranAmt;
	}
	
	public String getMemo() {
		return memo;
	}
	
	@XmlElement
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
