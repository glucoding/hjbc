package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String orderFormId;
	String contractId;
	String contractVersion;
	String submitterId;
	String submitTime;
	String lastUpdateTime;
	String deliveryStartTime;
	String delivertyEndTime;
	String type;
	String deliveryType;
	String name;
	String description;
	String address;
	String notes;
	Integer status;
	String orgid;
	java.util.Set<com.hejiascm.domain.Ordergoods> ordergoodses;
	java.util.Set<com.hejiascm.domain.Orderattachment> orderattachments;

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
	 * order number
	 * 
	 */
	public void setOrderFormId(String orderFormId) {
		this.orderFormId = orderFormId;
	}

	/**
	 * order number
	 * 
	 */
	public String getOrderFormId() {
		return this.orderFormId;
	}

	/**
	 * associate with the contract
	 * 
	 */
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	/**
	 * associate with the contract
	 * 
	 */
	public String getContractId() {
		return this.contractId;
	}

	/**
	 * indicate the contract version
	 * 
	 */
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	/**
	 * indicate the contract version
	 * 
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
	public void setDeliveryStartTime(String deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

	/**
	 */
	public String getDeliveryStartTime() {
		return this.deliveryStartTime;
	}

	/**
	 */
	public void setDelivertyEndTime(String delivertyEndTime) {
		this.delivertyEndTime = delivertyEndTime;
	}

	/**
	 */
	public String getDelivertyEndTime() {
		return this.delivertyEndTime;
	}

	/**
	 * Type for the order
	 * 
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Type for the order
	 * 
	 */
	public String getType() {
		return this.type;
	}

	/**
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 */
	public String getDeliveryType() {
		return this.deliveryType;
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
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
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
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	/**
	 */
	public String getOrgid() {
		return this.orgid;
	}

	/**
	 */
	public void setOrdergoodses(Set<Ordergoods> ordergoodses) {
		for(Ordergoods o : ordergoodses){
			o.setOrder(this);
		}
		this.ordergoodses = ordergoodses;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Ordergoods> getOrdergoodses() {
		if (ordergoodses == null) {
			ordergoodses = new java.util.LinkedHashSet<com.hejiascm.domain.Ordergoods>();
		}
		return ordergoodses;
	}

	/**
	 */
	public void setOrderattachments(Set<Orderattachment> orderattachments) {
		for(Orderattachment o : orderattachments){
			o.setOrder(this);
		}
		this.orderattachments = orderattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Orderattachment> getOrderattachments() {
		if (orderattachments == null) {
			orderattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Orderattachment>();
		}
		return orderattachments;
	}

	/**
	 */
	public Order() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Order that) {
		setId(that.getId());
		setOrderFormId(that.getOrderFormId());
		setContractId(that.getContractId());
		setContractVersion(that.getContractVersion());
		setSubmitterId(that.getSubmitterId());
		setSubmitTime(that.getSubmitTime());
		setLastUpdateTime(that.getLastUpdateTime());
		setDeliveryStartTime(that.getDeliveryStartTime());
		setDelivertyEndTime(that.getDelivertyEndTime());
		setType(that.getType());
		setDeliveryType(that.getDeliveryType());
		setName(that.getName());
		setDescription(that.getDescription());
		setAddress(that.getAddress());
		setNotes(that.getNotes());
		setStatus(that.getStatus());
		setOrgid(that.getOrgid());
		setOrdergoodses(new java.util.LinkedHashSet<com.hejiascm.domain.Ordergoods>(that.getOrdergoodses()));
		setOrderattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Orderattachment>(that.getOrderattachments()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("orderFormId=[").append(orderFormId).append("] ");
		buffer.append("contractId=[").append(contractId).append("] ");
		buffer.append("contractVersion=[").append(contractVersion).append("] ");
		buffer.append("submitterId=[").append(submitterId).append("] ");
		buffer.append("submitTime=[").append(submitTime).append("] ");
		buffer.append("lastUpdateTime=[").append(lastUpdateTime).append("] ");
		buffer.append("deliveryStartTime=[").append(deliveryStartTime).append("] ");
		buffer.append("delivertyEndTime=[").append(delivertyEndTime).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("deliveryType=[").append(deliveryType).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("notes=[").append(notes).append("] ");
		buffer.append("status=[").append(status).append("] ");
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
		if (!(obj instanceof Order))
			return false;
		Order equalCheck = (Order) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
