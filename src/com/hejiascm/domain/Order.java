package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.*;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrders", query = "select myOrder from Order myOrder"),
		@NamedQuery(name = "findOrderByAddress", query = "select myOrder from Order myOrder where myOrder.address = ?1"),
		@NamedQuery(name = "findOrderByAddressContaining", query = "select myOrder from Order myOrder where myOrder.address like ?1"),
		@NamedQuery(name = "findOrderByContractId", query = "select myOrder from Order myOrder where myOrder.contractId = ?1"),
		@NamedQuery(name = "findOrderByContractIdContaining", query = "select myOrder from Order myOrder where myOrder.contractId like ?1"),
		@NamedQuery(name = "findOrderByContractVersion", query = "select myOrder from Order myOrder where myOrder.contractVersion = ?1"),
		@NamedQuery(name = "findOrderByContractVersionContaining", query = "select myOrder from Order myOrder where myOrder.contractVersion like ?1"),
		@NamedQuery(name = "findOrderByDelivertyEndTime", query = "select myOrder from Order myOrder where myOrder.delivertyEndTime = ?1"),
		@NamedQuery(name = "findOrderByDelivertyEndTimeContaining", query = "select myOrder from Order myOrder where myOrder.delivertyEndTime like ?1"),
		@NamedQuery(name = "findOrderByDeliveryStartTime", query = "select myOrder from Order myOrder where myOrder.deliveryStartTime = ?1"),
		@NamedQuery(name = "findOrderByDeliveryStartTimeContaining", query = "select myOrder from Order myOrder where myOrder.deliveryStartTime like ?1"),
		@NamedQuery(name = "findOrderByDeliveryType", query = "select myOrder from Order myOrder where myOrder.deliveryType = ?1"),
		@NamedQuery(name = "findOrderByDeliveryTypeContaining", query = "select myOrder from Order myOrder where myOrder.deliveryType like ?1"),
		@NamedQuery(name = "findOrderByDescription", query = "select myOrder from Order myOrder where myOrder.description = ?1"),
		@NamedQuery(name = "findOrderByDescriptionContaining", query = "select myOrder from Order myOrder where myOrder.description like ?1"),
		@NamedQuery(name = "findOrderById", query = "select myOrder from Order myOrder where myOrder.id = ?1"),
		@NamedQuery(name = "findOrderByIdContaining", query = "select myOrder from Order myOrder where myOrder.id like ?1"),
		@NamedQuery(name = "findOrderByLastUpdateTime", query = "select myOrder from Order myOrder where myOrder.lastUpdateTime = ?1"),
		@NamedQuery(name = "findOrderByLastUpdateTimeContaining", query = "select myOrder from Order myOrder where myOrder.lastUpdateTime like ?1"),
		@NamedQuery(name = "findOrderByName", query = "select myOrder from Order myOrder where myOrder.name = ?1"),
		@NamedQuery(name = "findOrderByNameContaining", query = "select myOrder from Order myOrder where myOrder.name like ?1"),
		@NamedQuery(name = "findOrderByNotes", query = "select myOrder from Order myOrder where myOrder.notes = ?1"),
		@NamedQuery(name = "findOrderByNotesContaining", query = "select myOrder from Order myOrder where myOrder.notes like ?1"),
		@NamedQuery(name = "findOrderByOrderFormId", query = "select myOrder from Order myOrder where myOrder.orderFormId = ?1"),
		@NamedQuery(name = "findOrderByOrderFormIdContaining", query = "select myOrder from Order myOrder where myOrder.orderFormId like ?1"),
		@NamedQuery(name = "findOrderByOrgid", query = "select myOrder from Order myOrder where myOrder.orgid = ?1"),
		@NamedQuery(name = "findOrderByOrgidContaining", query = "select myOrder from Order myOrder where myOrder.orgid like ?1"),
		@NamedQuery(name = "findOrderByPrimaryKey", query = "select myOrder from Order myOrder where myOrder.id = ?1"),
		@NamedQuery(name = "findOrderByStatus", query = "select myOrder from Order myOrder where myOrder.status = ?1"),
		@NamedQuery(name = "findOrderBySubmitTime", query = "select myOrder from Order myOrder where myOrder.submitTime = ?1"),
		@NamedQuery(name = "findOrderBySubmitTimeContaining", query = "select myOrder from Order myOrder where myOrder.submitTime like ?1"),
		@NamedQuery(name = "findOrderBySubmitterId", query = "select myOrder from Order myOrder where myOrder.submitterId = ?1"),
		@NamedQuery(name = "findOrderBySubmitterIdContaining", query = "select myOrder from Order myOrder where myOrder.submitterId like ?1"),
		@NamedQuery(name = "findOrderByType", query = "select myOrder from Order myOrder where myOrder.type = ?1"),
		@NamedQuery(name = "findOrderByTypeContaining", query = "select myOrder from Order myOrder where myOrder.type like ?1") })
@Table(catalog = "hjdb", name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Order")
@XmlRootElement(namespace = "HejiaSCM/com/hejiascm/domain")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@XmlElement
	String id;
	/**
	 * order number
	 * 
	 */

	@Column(name = "orderFormId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orderFormId;
	/**
	 * associate with the contract
	 * 
	 */

	@Column(name = "contractId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contractId;
	/**
	 * indicate the contract version
	 * 
	 */

	@Column(name = "contractVersion")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contractVersion;
	/**
	 */

	@Column(name = "submitterId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String submitterId;
	/**
	 */

	@Column(name = "submitTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String submitTime;
	/**
	 */

	@Column(name = "lastUpdateTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastUpdateTime;
	/**
	 */

	@Column(name = "deliveryStartTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String deliveryStartTime;
	/**
	 */

	@Column(name = "delivertyEndTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String delivertyEndTime;
	/**
	 * Type for the order
	 * 
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;
	/**
	 */

	@Column(name = "deliveryType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String deliveryType;
	/**
	 */

	@Column(name = "name")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "address")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "notes")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String notes;
	/**
	 */

	@Column(name = "status")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer status;
	/**
	 */

	@Column(name = "orgid")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgid;

	/**
	 */
	@OneToMany(mappedBy = "order", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Ordergoods> ordergoodses;
	/**
	 */
	@OneToMany(mappedBy = "order", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
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
