package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
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
		@NamedQuery(name = "findAllDeliveryrecords", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord"),
		@NamedQuery(name = "findDeliveryrecordByAmount", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.amount = ?1"),
		@NamedQuery(name = "findDeliveryrecordByBuyeeId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.buyeeId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByBuyeeIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.buyeeId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByBuyerId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.buyerId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByBuyerIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.buyerId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsigneeAddress", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consigneeAddress = ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsigneeAddressContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consigneeAddress like ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsigneeId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consigneeId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsigneeIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consigneeId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsignerAddress", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consignerAddress = ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsignerAddressContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consignerAddress like ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsignerId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consignerId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByConsignerIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.consignerId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByContractId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.contractId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByContractIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.contractId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByContractVersion", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.contractVersion = ?1"),
		@NamedQuery(name = "findDeliveryrecordByContractVersionContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.contractVersion like ?1"),
		@NamedQuery(name = "findDeliveryrecordByDeliveryFormId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.deliveryFormId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByDeliveryFormIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.deliveryFormId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByDescription", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.description = ?1"),
		@NamedQuery(name = "findDeliveryrecordByDescriptionContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.description like ?1"),
		@NamedQuery(name = "findDeliveryrecordByDriver", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.driver = ?1"),
		@NamedQuery(name = "findDeliveryrecordByDriverContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.driver like ?1"),
		@NamedQuery(name = "findDeliveryrecordById", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.id = ?1"),
		@NamedQuery(name = "findDeliveryrecordByIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.id like ?1"),
		@NamedQuery(name = "findDeliveryrecordByLastUpdateTime", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.lastUpdateTime = ?1"),
		@NamedQuery(name = "findDeliveryrecordByLastUpdateTimeContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.lastUpdateTime like ?1"),
		@NamedQuery(name = "findDeliveryrecordByName", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.name = ?1"),
		@NamedQuery(name = "findDeliveryrecordByNameContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.name like ?1"),
		@NamedQuery(name = "findDeliveryrecordByNotes", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.notes = ?1"),
		@NamedQuery(name = "findDeliveryrecordByNotesContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.notes like ?1"),
		@NamedQuery(name = "findDeliveryrecordByOrderId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.orderId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByOrderIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.orderId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByOrgId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.orgId = ?1"),
		@NamedQuery(name = "findDeliveryrecordByOrgIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.orgId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByPrimaryKey", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.id = ?1"),
		@NamedQuery(name = "findDeliveryrecordByStatus", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.status = ?1"),
		@NamedQuery(name = "findDeliveryrecordBySubmitTime", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.submitTime = ?1"),
		@NamedQuery(name = "findDeliveryrecordBySubmitTimeContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.submitTime like ?1"),
		@NamedQuery(name = "findDeliveryrecordBySubmitterId", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.submitterId = ?1"),
		@NamedQuery(name = "findDeliveryrecordBySubmitterIdContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.submitterId like ?1"),
		@NamedQuery(name = "findDeliveryrecordByTruckNum", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.truckNum = ?1"),
		@NamedQuery(name = "findDeliveryrecordByTruckNumContaining", query = "select myDeliveryrecord from Deliveryrecord myDeliveryrecord where myDeliveryrecord.truckNum like ?1") })
@Table(catalog = "hjdb", name = "DeliveryRecord")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Deliveryrecord")
@XmlRootElement(namespace = "HejiaSCM/com/hejiascm/domain")
public class Deliveryrecord implements Serializable {
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
	 */

	@Column(name = "deliveryFormId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String deliveryFormId;
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

	@Column(name = "orderId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orderId;
	/**
	 */

	@Column(name = "contractId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contractId;
	/**
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

	@Column(name = "buyerId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String buyerId;
	/**
	 */

	@Column(name = "buyeeId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String buyeeId;
	/**
	 */

	@Column(name = "consignerId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String consignerId;
	/**
	 */

	@Column(name = "consigneeId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String consigneeId;
	/**
	 */

	@Column(name = "consignerAddress")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String consignerAddress;
	/**
	 */

	@Column(name = "consigneeAddress")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String consigneeAddress;
	/**
	 */

	@Column(name = "amount", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal amount;
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

	@Column(name = "driver")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String driver;
	/**
	 */

	@Column(name = "truckNum")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String truckNum;
	/**
	 */

	@Column(name = "orgId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgId;

	/**
	 */
	@OneToMany(mappedBy = "deliveryrecord", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Deliverygoods> deliverygoodses;
	/**
	 */
	@OneToMany(mappedBy = "deliveryrecord", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Deliveryattachment> deliveryattachments;

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
	public void setDeliveryFormId(String deliveryFormId) {
		this.deliveryFormId = deliveryFormId;
	}

	/**
	 */
	public String getDeliveryFormId() {
		return this.deliveryFormId;
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
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 */
	public String getBuyerId() {
		return this.buyerId;
	}

	/**
	 */
	public void setBuyeeId(String buyeeId) {
		this.buyeeId = buyeeId;
	}

	/**
	 */
	public String getBuyeeId() {
		return this.buyeeId;
	}

	/**
	 */
	public void setConsignerId(String consignerId) {
		this.consignerId = consignerId;
	}

	/**
	 */
	public String getConsignerId() {
		return this.consignerId;
	}

	/**
	 */
	public void setConsigneeId(String consigneeId) {
		this.consigneeId = consigneeId;
	}

	/**
	 */
	public String getConsigneeId() {
		return this.consigneeId;
	}

	/**
	 */
	public void setConsignerAddress(String consignerAddress) {
		this.consignerAddress = consignerAddress;
	}

	/**
	 */
	public String getConsignerAddress() {
		return this.consignerAddress;
	}

	/**
	 */
	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	/**
	 */
	public String getConsigneeAddress() {
		return this.consigneeAddress;
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
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 */
	public String getOrgId() {
		return this.orgId;
	}

	/**
	 */
	public void setDeliverygoodses(Set<Deliverygoods> deliverygoodses) {
		for(Deliverygoods d : deliverygoodses){
			d.setDeliveryrecord(this);
		}
		this.deliverygoodses = deliverygoodses;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Deliverygoods> getDeliverygoodses() {
		if (deliverygoodses == null) {
			deliverygoodses = new java.util.LinkedHashSet<com.hejiascm.domain.Deliverygoods>();
		}
		return deliverygoodses;
	}

	/**
	 */
	public void setDeliveryattachments(Set<Deliveryattachment> deliveryattachments) {
		for(Deliveryattachment d : deliveryattachments){
			d.setDeliveryrecord(this);
		}
		this.deliveryattachments = deliveryattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Deliveryattachment> getDeliveryattachments() {
		if (deliveryattachments == null) {
			deliveryattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Deliveryattachment>();
		}
		return deliveryattachments;
	}

	/**
	 */
	public Deliveryrecord() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
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
		setBuyeeId(that.getBuyeeId());
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

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
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
		buffer.append("buyeeId=[").append(buyeeId).append("] ");
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
