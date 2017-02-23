package com.hejiascm.domain;

import java.util.List;

public class Paymentapplication {
	private String id;
	private String version;
	private String contractId;
	private List<Participant> participants;
	private String submitterId;
	private String submitTime;
	private String lastUpdateTime;
	private int paymentType;
	private String[] paymentBackgroundIds;
	private double paymentTotal;
	private double paidTotal;
	private String[] paymentRecordsIds;
	private double cashRatio;
	private String voucherRatio;
	private List<Operation> operations;
	private String[] toActionParticipants;
	private String remarks;
	private int status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public String getSubmitterId() {
		return submitterId;
	}
	public void setSubmitterId(String submitterId) {
		this.submitterId = submitterId;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public String[] getPaymentBackgroundIds() {
		return paymentBackgroundIds;
	}
	public void setPaymentBackgroundIds(String[] paymentBackgroundIds) {
		this.paymentBackgroundIds = paymentBackgroundIds;
	}
	public double getPaymentTotal() {
		return paymentTotal;
	}
	public void setPaymentTotal(double paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	public double getPaidTotal() {
		return paidTotal;
	}
	public void setPaidTotal(double paidTotal) {
		this.paidTotal = paidTotal;
	}
	public String[] getPaymentRecordsIds() {
		return paymentRecordsIds;
	}
	public void setPaymentRecordsIds(String[] paymentRecordsIds) {
		this.paymentRecordsIds = paymentRecordsIds;
	}
	public double getCashRatio() {
		return cashRatio;
	}
	public void setCashRatio(double cashRatio) {
		this.cashRatio = cashRatio;
	}
	public String getVoucherRatio() {
		return voucherRatio;
	}
	public void setVoucherRatio(String voucherRatio) {
		this.voucherRatio = voucherRatio;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public String[] getToActionParticipants() {
		return toActionParticipants;
	}
	public void setToActionParticipants(String[] toActionParticipants) {
		this.toActionParticipants = toActionParticipants;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
