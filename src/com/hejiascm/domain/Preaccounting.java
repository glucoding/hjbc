package com.hejiascm.domain;

import java.util.List;

public class Preaccounting {
	private String id;
	private String contractId;
	private int type;
	private List<Contractgoods> goodses;
	private String orderId;
	private String buyerId;
	private String sellerId;
	private double totalAmount;
	private double paidAmount;
	private int preAccountingFinancingStatus;
	private String financingApplicationId;
	private String financingContractId;
	private String[] singleAccountingApplicationIds;
	private String startSingleAccountingApplicationTime;
	private String endSingleAccountingApplicationTime;
	private String notes;
	private List<String> paymentRecordIds;
	private int status;
	private List<Operation> operations;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Contractgoods> getGoods() {
		return goodses;
	}
	public void setGoods(List<Contractgoods> goodses) {
		this.goodses = goodses;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public int getPreAccountingFinancingStatus() {
		return preAccountingFinancingStatus;
	}
	public void setPreAccountingFinancingStatus(int preAccountingFinancingStatus) {
		this.preAccountingFinancingStatus = preAccountingFinancingStatus;
	}
	public String getFinancingApplicationId() {
		return financingApplicationId;
	}
	public void setFinancingApplicationId(String financingApplicationId) {
		this.financingApplicationId = financingApplicationId;
	}
	public String getFinancingContractId() {
		return financingContractId;
	}
	public void setFinancingContractId(String financingContractId) {
		this.financingContractId = financingContractId;
	}
	public String[] getSingleAccountingApplicationIds() {
		return singleAccountingApplicationIds;
	}
	public void setSingleAccountingApplicationIds(String[] singleAccountingApplicationIds) {
		this.singleAccountingApplicationIds = singleAccountingApplicationIds;
	}
	public String getStartSingleAccountingApplicationTime() {
		return startSingleAccountingApplicationTime;
	}
	public void setStartSingleAccountingApplicationTime(String startSingleAccountingApplicationTime) {
		this.startSingleAccountingApplicationTime = startSingleAccountingApplicationTime;
	}
	public String getEndSingleAccountingApplicationTime() {
		return endSingleAccountingApplicationTime;
	}
	public void setEndSingleAccountingApplicationTime(String endSingleAccountingApplicationTime) {
		this.endSingleAccountingApplicationTime = endSingleAccountingApplicationTime;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<String> getPaymentRecordIds() {
		return paymentRecordIds;
	}
	public void setPaymentRecordIds(List<String> paymentRecordIds) {
		this.paymentRecordIds = paymentRecordIds;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}
