package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Receivingrecord implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String receivingFormId;
	String deliveryRecordId;
	String orderId;
	String contractId;
	String contractVersion;
	String submitterId;
	String submitTime;
	String lastUpdateTime;
	BigDecimal amount;
	String notes;
	String name;
	String description;
	String qualityRecordIds;
	Integer status;
	String driver;
	String truckNum;
	String orgid;
	String deliveryFillTime;
	String consignerOrgName;
	String consignerName;
	String consignerTel;
	String consigneeOrgName;
	String consigneeName;
	String consigneeTel;
	String deliveryFillName;
	
	java.util.Set<com.hejiascm.domain.Receivinggoods> receivinggoodses;
	java.util.Set<com.hejiascm.domain.Receivingattachment> receivingattachments;

	/**
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 */
	public String getId() {
		return this.id;
	}

	/**
	 */
	public void setReceivingFormId(String receivingFormId) {
		this.receivingFormId = receivingFormId;
	}

	/**
	 */
	public String getReceivingFormId() {
		return this.receivingFormId;
	}

	/**
	 */
	public void setDeliveryRecordId(String deliveryRecordId) {
		this.deliveryRecordId = deliveryRecordId;
	}

	/**
	 */
	public String getDeliveryRecordId() {
		return this.deliveryRecordId;
	}

	/**
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 */
	public String getOrderId() {
		return this.orderId;
	}

	/**
	 */
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	/**
	 */
	public String getContractId() {
		return this.contractId;
	}

	/**
	 */
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	/**
	 */
	public String getContractVersion() {
		return this.contractVersion;
	}

	/**
	 */
	public void setSubmitterId(String submitterId) {
		this.submitterId = submitterId;
	}

	/**
	 */
	public String getSubmitterId() {
		return this.submitterId;
	}

	/**
	 */
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 */
	public String getSubmitTime() {
		return this.submitTime;
	}

	/**
	 */
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 */
	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	/**
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 */
	public BigDecimal getAmount() {
		return this.amount;
	}

	/**
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 */
	public String getNotes() {
		return this.notes;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setQualityRecordIds(String qualityRecordIds) {
		this.qualityRecordIds = qualityRecordIds;
	}

	/**
	 */
	public String getQualityRecordIds() {
		return this.qualityRecordIds;
	}

	/**
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 */
	public String getDriver() {
		return this.driver;
	}

	/**
	 */
	public void setTruckNum(String truckNum) {
		this.truckNum = truckNum;
	}

	/**
	 */
	public String getTruckNum() {
		return this.truckNum;
	}

	/**
	 */
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	/**
	 */
	public String getOrgid() {
		return this.orgid;
	}
	
	public String getDeliveryFillTime() {
		return deliveryFillTime;
	}

	public void setDeliveryFillTime(String deliveryFillTime) {
		this.deliveryFillTime = deliveryFillTime;
	}

	public String getConsignerOrgName() {
		return consignerOrgName;
	}

	public void setConsignerOrgName(String consignerOrgName) {
		this.consignerOrgName = consignerOrgName;
	}

	public String getConsignerName() {
		return consignerName;
	}

	public void setConsignerName(String consignerName) {
		this.consignerName = consignerName;
	}

	public String getConsignerTel() {
		return consignerTel;
	}

	public void setConsignerTel(String consignerTel) {
		this.consignerTel = consignerTel;
	}

	public String getConsigneeOrgName() {
		return consigneeOrgName;
	}

	public void setConsigneeOrgName(String consigneeOrgName) {
		this.consigneeOrgName = consigneeOrgName;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneeTel() {
		return consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	public String getDeliveryFillName() {
		return deliveryFillName;
	}

	public void setDeliveryFillName(String deliveryFillName) {
		this.deliveryFillName = deliveryFillName;
	}

	/**
	 */
	public void setReceivinggoodses(Set<Receivinggoods> receivinggoodses) {
		for(Receivinggoods r : receivinggoodses){
			r.setReceivingrecord(this);
		}
		this.receivinggoodses = receivinggoodses;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Receivinggoods> getReceivinggoodses() {
		if (receivinggoodses == null) {
			receivinggoodses = new java.util.LinkedHashSet<com.hejiascm.domain.Receivinggoods>();
		}
		return receivinggoodses;
	}

	/**
	 */
	public void setReceivingattachments(Set<Receivingattachment> receivingattachments) {
		for(Receivingattachment r : receivingattachments){
			r.setReceivingrecord(this);
		}
		this.receivingattachments = receivingattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Receivingattachment> getReceivingattachments() {
		if (receivingattachments == null) {
			receivingattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Receivingattachment>();
		}
		return receivingattachments;
	}

	/**
	 */
	public Receivingrecord() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Receivingrecord that) {
		setId(that.getId());
		setReceivingFormId(that.getReceivingFormId());
		setDeliveryRecordId(that.getDeliveryRecordId());
		setOrderId(that.getOrderId());
		setContractId(that.getContractId());
		setContractVersion(that.getContractVersion());
		setSubmitterId(that.getSubmitterId());
		setSubmitTime(that.getSubmitTime());
		setLastUpdateTime(that.getLastUpdateTime());
		setAmount(that.getAmount());
		setNotes(that.getNotes());
		setName(that.getName());
		setDescription(that.getDescription());
		setQualityRecordIds(that.getQualityRecordIds());
		setStatus(that.getStatus());
		setDriver(that.getDriver());
		setTruckNum(that.getTruckNum());
		setOrgid(that.getOrgid());
		setReceivinggoodses(new java.util.LinkedHashSet<com.hejiascm.domain.Receivinggoods>(that.getReceivinggoodses()));
		setReceivingattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Receivingattachment>(that.getReceivingattachments()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("receivingFormId=[").append(receivingFormId).append("] ");
		buffer.append("deliveryRecordId=[").append(deliveryRecordId).append("] ");
		buffer.append("orderId=[").append(orderId).append("] ");
		buffer.append("contractId=[").append(contractId).append("] ");
		buffer.append("contractVersion=[").append(contractVersion).append("] ");
		buffer.append("submitterId=[").append(submitterId).append("] ");
		buffer.append("submitTime=[").append(submitTime).append("] ");
		buffer.append("lastUpdateTime=[").append(lastUpdateTime).append("] ");
		buffer.append("amount=[").append(amount).append("] ");
		buffer.append("notes=[").append(notes).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("qualityRecordIds=[").append(qualityRecordIds).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("driver=[").append(driver).append("] ");
		buffer.append("truckNum=[").append(truckNum).append("] ");
		buffer.append("orgid=[").append(orgid).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Receivingrecord))
			return false;
		Receivingrecord equalCheck = (Receivingrecord) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
