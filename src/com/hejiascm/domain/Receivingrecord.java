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
		@NamedQuery(name = "findAllReceivingrecords", query = "select myReceivingrecord from Receivingrecord myReceivingrecord"),
		@NamedQuery(name = "findReceivingrecordByAmount", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.amount = ?1"),
		@NamedQuery(name = "findReceivingrecordByContractId", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.contractId = ?1"),
		@NamedQuery(name = "findReceivingrecordByContractIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.contractId like ?1"),
		@NamedQuery(name = "findReceivingrecordByContractVersion", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.contractVersion = ?1"),
		@NamedQuery(name = "findReceivingrecordByContractVersionContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.contractVersion like ?1"),
		@NamedQuery(name = "findReceivingrecordByDeliveryRecordId", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.deliveryRecordId = ?1"),
		@NamedQuery(name = "findReceivingrecordByDeliveryRecordIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.deliveryRecordId like ?1"),
		@NamedQuery(name = "findReceivingrecordByDescription", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.description = ?1"),
		@NamedQuery(name = "findReceivingrecordByDescriptionContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.description like ?1"),
		@NamedQuery(name = "findReceivingrecordByDriver", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.driver = ?1"),
		@NamedQuery(name = "findReceivingrecordByDriverContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.driver like ?1"),
		@NamedQuery(name = "findReceivingrecordById", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.id = ?1"),
		@NamedQuery(name = "findReceivingrecordByIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.id like ?1"),
		@NamedQuery(name = "findReceivingrecordByLastUpdateTime", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.lastUpdateTime = ?1"),
		@NamedQuery(name = "findReceivingrecordByLastUpdateTimeContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.lastUpdateTime like ?1"),
		@NamedQuery(name = "findReceivingrecordByName", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.name = ?1"),
		@NamedQuery(name = "findReceivingrecordByNameContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.name like ?1"),
		@NamedQuery(name = "findReceivingrecordByNotes", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.notes = ?1"),
		@NamedQuery(name = "findReceivingrecordByNotesContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.notes like ?1"),
		@NamedQuery(name = "findReceivingrecordByOrderId", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.orderId = ?1"),
		@NamedQuery(name = "findReceivingrecordByOrderIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.orderId like ?1"),
		@NamedQuery(name = "findReceivingrecordByOrgid", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.orgid = ?1"),
		@NamedQuery(name = "findReceivingrecordByOrgidContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.orgid like ?1"),
		@NamedQuery(name = "findReceivingrecordByPrimaryKey", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.id = ?1"),
		@NamedQuery(name = "findReceivingrecordByQualityRecordIds", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.qualityRecordIds = ?1"),
		@NamedQuery(name = "findReceivingrecordByQualityRecordIdsContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.qualityRecordIds like ?1"),
		@NamedQuery(name = "findReceivingrecordByReceivingFormId", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.receivingFormId = ?1"),
		@NamedQuery(name = "findReceivingrecordByReceivingFormIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.receivingFormId like ?1"),
		@NamedQuery(name = "findReceivingrecordByStatus", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.status = ?1"),
		@NamedQuery(name = "findReceivingrecordBySubmitTime", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.submitTime = ?1"),
		@NamedQuery(name = "findReceivingrecordBySubmitTimeContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.submitTime like ?1"),
		@NamedQuery(name = "findReceivingrecordBySubmitterId", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.submitterId = ?1"),
		@NamedQuery(name = "findReceivingrecordBySubmitterIdContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.submitterId like ?1"),
		@NamedQuery(name = "findReceivingrecordByTruckNum", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.truckNum = ?1"),
		@NamedQuery(name = "findReceivingrecordByTruckNumContaining", query = "select myReceivingrecord from Receivingrecord myReceivingrecord where myReceivingrecord.truckNum like ?1") })
@Table(catalog = "hjdb", name = "ReceivingRecord")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Receivingrecord")
@XmlRootElement(namespace = "HejiaSCM/com/hejiascm/domain")
public class Receivingrecord implements Serializable {
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

	@Column(name = "receivingFormId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String receivingFormId;
	/**
	 */

	@Column(name = "deliveryRecordId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String deliveryRecordId;
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

	@Column(name = "qualityRecordIds")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String qualityRecordIds;
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

	@Column(name = "orgid")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgid;

	/**
	 */
	@OneToMany(mappedBy = "receivingrecord", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Receivinggoods> receivinggoodses;
	/**
	 */
	@OneToMany(mappedBy = "receivingrecord", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
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
