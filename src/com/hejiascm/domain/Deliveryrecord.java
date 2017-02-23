package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Deliveryrecord implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String deliveryFormId;
	String name;
	String description;
	String orderId;
	String contractId;
	String contractVersion;
	String submitterId;
	String submitTime;
	String lastUpdateTime;
	String buyerId;
	String buyerName;
	String sellerId;
	String sellerName;
	String consignerId;
	String consignerName;
	String consigneeId;
	String consigneeName;
	String consignerAddress;
	String consigneeAddress;
	BigDecimal amount;
	String notes;
	Integer status;
	String driver;
	String truckNum;
	String orgId;
	String deliveryFillTime;
	String consignerOrgName;
	String consignerTel;
	String consigneeOrgName;
	String consigneeTel;
	String deliveryFillName;
	
	java.util.Set<com.hejiascm.domain.Deliverygoods> deliverygoodses;
	java.util.Set<com.hejiascm.domain.Deliveryattachment> deliveryattachments;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setDeliveryFormId(String deliveryFormId) {
		this.deliveryFormId = deliveryFormId;
	}

	public String getDeliveryFormId() {
		return this.deliveryFormId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getContractVersion() {
		return this.contractVersion;
	}

	public void setSubmitterId(String submitterId) {
		this.submitterId = submitterId;
	}

	public String getSubmitterId() {
		return this.submitterId;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setConsignerId(String consignerId) {
		this.consignerId = consignerId;
	}

	public String getConsignerId() {
		return this.consignerId;
	}

	public void setConsigneeId(String consigneeId) {
		this.consigneeId = consigneeId;
	}

	public String getConsigneeId() {
		return this.consigneeId;
	}

	public void setConsignerAddress(String consignerAddress) {
		this.consignerAddress = consignerAddress;
	}

	public String getConsignerAddress() {
		return this.consignerAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setTruckNum(String truckNum) {
		this.truckNum = truckNum;
	}

	public String getTruckNum() {
		return this.truckNum;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgId() {
		return this.orgId;
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
	
	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public void setDeliverygoodses(Set<Deliverygoods> deliverygoodses) {
		for(Deliverygoods d : deliverygoodses){
			d.setDeliveryrecord(this);
		}
		this.deliverygoodses = deliverygoodses;
	}

	//@JsonIgnore
	public Set<Deliverygoods> getDeliverygoodses() {
		if (deliverygoodses == null) {
			deliverygoodses = new java.util.LinkedHashSet<com.hejiascm.domain.Deliverygoods>();
		}
		return deliverygoodses;
	}

	public void setDeliveryattachments(Set<Deliveryattachment> deliveryattachments) {
		for(Deliveryattachment d : deliveryattachments){
			d.setDeliveryrecord(this);
		}
		this.deliveryattachments = deliveryattachments;
	}

	//@JsonIgnore
	public Set<Deliveryattachment> getDeliveryattachments() {
		if (deliveryattachments == null) {
			deliveryattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Deliveryattachment>();
		}
		return deliveryattachments;
	}

	public Deliveryrecord() {
	}

	public void copy(Deliveryrecord that) {
		setId(that.getId());
		setDeliveryFormId(that.getDeliveryFormId());
		setName(that.getName());
		setDescription(that.getDescription());
		setOrderId(that.getOrderId());
		setContractId(that.getContractId());
		setContractVersion(that.getContractVersion());
		setSubmitterId(that.getSubmitterId());
		setSubmitTime(that.getSubmitTime());
		setLastUpdateTime(that.getLastUpdateTime());
		setBuyerId(that.getBuyerId());
		setSellerId(that.getSellerId());
		setConsignerId(that.getConsignerId());
		setConsigneeId(that.getConsigneeId());
		setConsignerAddress(that.getConsignerAddress());
		setConsigneeAddress(that.getConsigneeAddress());
		setAmount(that.getAmount());
		setNotes(that.getNotes());
		setStatus(that.getStatus());
		setDriver(that.getDriver());
		setTruckNum(that.getTruckNum());
		setOrgId(that.getOrgId());
		setDeliverygoodses(new java.util.LinkedHashSet<com.hejiascm.domain.Deliverygoods>(that.getDeliverygoodses()));
		setDeliveryattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Deliveryattachment>(that.getDeliveryattachments()));
	}

	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("deliveryFormId=[").append(deliveryFormId).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("orderId=[").append(orderId).append("] ");
		buffer.append("contractId=[").append(contractId).append("] ");
		buffer.append("contractVersion=[").append(contractVersion).append("] ");
		buffer.append("submitterId=[").append(submitterId).append("] ");
		buffer.append("submitTime=[").append(submitTime).append("] ");
		buffer.append("lastUpdateTime=[").append(lastUpdateTime).append("] ");
		buffer.append("buyerId=[").append(buyerId).append("] ");
		buffer.append("buyeeId=[").append(sellerId).append("] ");
		buffer.append("consignerId=[").append(consignerId).append("] ");
		buffer.append("consigneeId=[").append(consigneeId).append("] ");
		buffer.append("consignerAddress=[").append(consignerAddress).append("] ");
		buffer.append("consigneeAddress=[").append(consigneeAddress).append("] ");
		buffer.append("amount=[").append(amount).append("] ");
		buffer.append("notes=[").append(notes).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("driver=[").append(driver).append("] ");
		buffer.append("truckNum=[").append(truckNum).append("] ");
		buffer.append("orgId=[").append(orgId).append("] ");

		return buffer.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Deliveryrecord))
			return false;
		Deliveryrecord equalCheck = (Deliveryrecord) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
