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
		@NamedQuery(name = "findAllTradecontracts", query = "select myTradecontract from Tradecontract myTradecontract"),
		@NamedQuery(name = "findTradecontractByChangeStatus", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.changeStatus = ?1"),
		@NamedQuery(name = "findTradecontractByContractType", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.contractType = ?1"),
		@NamedQuery(name = "findTradecontractByCurrency", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.currency = ?1"),
		@NamedQuery(name = "findTradecontractByCurrencyContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.currency like ?1"),
		@NamedQuery(name = "findTradecontractByCurrentEffectiveVersion", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.currentEffectiveVersion = ?1"),
		@NamedQuery(name = "findTradecontractByCurrentEffectiveVersionContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.currentEffectiveVersion like ?1"),
		@NamedQuery(name = "findTradecontractByDataEffectivePaticipant", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.dataEffectivePaticipant = ?1"),
		@NamedQuery(name = "findTradecontractByDataEffectivePaticipantContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.dataEffectivePaticipant like ?1"),
		@NamedQuery(name = "findTradecontractByDescription", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.description = ?1"),
		@NamedQuery(name = "findTradecontractByDescriptionContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.description like ?1"),
		@NamedQuery(name = "findTradecontractByEffectiveTime", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.effectiveTime = ?1"),
		@NamedQuery(name = "findTradecontractByEffectiveTimeContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.effectiveTime like ?1"),
		@NamedQuery(name = "findTradecontractByExecutionStatus", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.executionStatus = ?1"),
		@NamedQuery(name = "findTradecontractByExpirationTime", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.expirationTime = ?1"),
		@NamedQuery(name = "findTradecontractByExpirationTimeContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.expirationTime like ?1"),
		@NamedQuery(name = "findTradecontractById", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.id = ?1"),
		@NamedQuery(name = "findTradecontractByIdContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.id like ?1"),
		@NamedQuery(name = "findTradecontractByMeansOfTransportation", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.meansOfTransportation = ?1"),
		@NamedQuery(name = "findTradecontractByMeansOfTransportationContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.meansOfTransportation like ?1"),
		@NamedQuery(name = "findTradecontractByOrderSubmitterId", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.orderSubmitterId = ?1"),
		@NamedQuery(name = "findTradecontractByOrderSubmitterIdContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.orderSubmitterId like ?1"),
		@NamedQuery(name = "findTradecontractByOrgid", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.orgid = ?1"),
		@NamedQuery(name = "findTradecontractByOrgidContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.orgid like ?1"),
		@NamedQuery(name = "findTradecontractByPreviousVersion", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.previousVersion = ?1"),
		@NamedQuery(name = "findTradecontractByPreviousVersionContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.previousVersion like ?1"),
		@NamedQuery(name = "findTradecontractByPrimaryKey", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.id = ?1"),
		@NamedQuery(name = "findTradecontractByRemarks", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.remarks = ?1"),
		@NamedQuery(name = "findTradecontractByRemarksContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.remarks like ?1"),
		@NamedQuery(name = "findTradecontractBySerial", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.serial = ?1"),
		@NamedQuery(name = "findTradecontractBySerialContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.serial like ?1"),
		@NamedQuery(name = "findTradecontractByServiceType", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.serviceType = ?1"),
		@NamedQuery(name = "findTradecontractByVersion", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.version = ?1"),
		@NamedQuery(name = "findTradecontractByVersionContaining", query = "select myTradecontract from Tradecontract myTradecontract where myTradecontract.version like ?1") })
@Table(catalog = "hjdb", name = "TradeContract")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Tradecontract")
@XmlRootElement(namespace = "HejiaSCM/com/hejiascm/domain")
public class Tradecontract implements Serializable {
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
	 * ?????
	 * 
	 */

	@Column(name = "version")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String version;
	/**
	 * ????
	 * 
	 */

	@Column(name = "serial")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String serial;
	/**
	 * ????
	 * 
	 */

	@Column(name = "contractType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer contractType;
	/**
	 * ????
	 * 
	 */

	@Column(name = "serviceType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer serviceType;
	/**
	 * ?????????
	 * 
	 */

	@Column(name = "effectiveTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String effectiveTime;
	/**
	 * ?????????
	 * 
	 */

	@Column(name = "expirationTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expirationTime;
	/**
	 * ??
	 * 
	 */

	@Column(name = "currency")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String currency;
	/**
	 * ???????id
	 * 
	 */

	@Column(name = "dataEffectivePaticipant")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String dataEffectivePaticipant;
	/**
	 * ????????????ID
	 * 
	 */

	@Column(name = "orderSubmitterId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orderSubmitterId;
	/**
	 * ????
	 * 
	 */

	@Column(name = "meansOfTransportation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String meansOfTransportation;
	/**
	 * ????
	 * 
	 */

	@Column(name = "executionStatus")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer executionStatus;
	/**
	 * ??????
	 * 
	 */

	@Column(name = "changeStatus")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer changeStatus;
	/**
	 * ???????????
	 * 
	 */

	@Column(name = "previousVersion")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String previousVersion;
	/**
	 */

	@Column(name = "currentEffectiveVersion")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String currentEffectiveVersion;
	/**
	 * ??????
	 * 
	 */

	@Column(name = "remarks")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String remarks;
	/**
	 * ????
	 * 
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "orgid")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgid;

	/**
	 */
	@OneToMany(mappedBy = "tradecontract", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Operation> operations;
	/**
	 */
	@OneToMany(mappedBy = "tradecontract", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Contractgoods> contractgoodses;
	/**
	 */
	@OneToMany(mappedBy = "tradecontract", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Participant> participants;
	/**
	 */
	@OneToMany(mappedBy = "tradecontract", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Tradecontractattachment> tradecontractattachments;
	/**
	 */
	@OneToMany(mappedBy = "tradecontract", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.hejiascm.domain.Term> terms;

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
	 * ?????
	 * 
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * ?????
	 * 
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * ????
	 * 
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * ????
	 * 
	 */
	public String getSerial() {
		return this.serial;
	}

	/**
	 * ????
	 * 
	 */
	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}

	/**
	 * ????
	 * 
	 */
	public Integer getContractType() {
		return this.contractType;
	}

	/**
	 * ????
	 * 
	 */
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * ????
	 * 
	 */
	public Integer getServiceType() {
		return this.serviceType;
	}

	/**
	 * ?????????
	 * 
	 */
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	/**
	 * ?????????
	 * 
	 */
	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	/**
	 * ?????????
	 * 
	 */
	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	/**
	 * ?????????
	 * 
	 */
	public String getExpirationTime() {
		return this.expirationTime;
	}

	/**
	 * ??
	 * 
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * ??
	 * 
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * ???????id
	 * 
	 */
	public void setDataEffectivePaticipant(String dataEffectivePaticipant) {
		this.dataEffectivePaticipant = dataEffectivePaticipant;
	}

	/**
	 * ???????id
	 * 
	 */
	public String getDataEffectivePaticipant() {
		return this.dataEffectivePaticipant;
	}

	/**
	 * ????????????ID
	 * 
	 */
	public void setOrderSubmitterId(String orderSubmitterId) {
		this.orderSubmitterId = orderSubmitterId;
	}

	/**
	 * ????????????ID
	 * 
	 */
	public String getOrderSubmitterId() {
		return this.orderSubmitterId;
	}

	/**
	 * ????
	 * 
	 */
	public void setMeansOfTransportation(String meansOfTransportation) {
		this.meansOfTransportation = meansOfTransportation;
	}

	/**
	 * ????
	 * 
	 */
	public String getMeansOfTransportation() {
		return this.meansOfTransportation;
	}

	/**
	 * ????
	 * 
	 */
	public void setExecutionStatus(Integer executionStatus) {
		this.executionStatus = executionStatus;
	}

	/**
	 * ????
	 * 
	 */
	public Integer getExecutionStatus() {
		return this.executionStatus;
	}

	/**
	 * ??????
	 * 
	 */
	public void setChangeStatus(Integer changeStatus) {
		this.changeStatus = changeStatus;
	}

	/**
	 * ??????
	 * 
	 */
	public Integer getChangeStatus() {
		return this.changeStatus;
	}

	/**
	 * ???????????
	 * 
	 */
	public void setPreviousVersion(String previousVersion) {
		this.previousVersion = previousVersion;
	}

	/**
	 * ???????????
	 * 
	 */
	public String getPreviousVersion() {
		return this.previousVersion;
	}

	/**
	 */
	public void setCurrentEffectiveVersion(String currentEffectiveVersion) {
		this.currentEffectiveVersion = currentEffectiveVersion;
	}

	/**
	 */
	public String getCurrentEffectiveVersion() {
		return this.currentEffectiveVersion;
	}

	/**
	 * ??????
	 * 
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * ??????
	 * 
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * ????
	 * 
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * ????
	 * 
	 */
	public String getDescription() {
		return this.description;
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
	public void setOperations(Set<Operation> operations) {
		for(Operation o: operations){
			o.setTradecontract(this);
		}
		this.operations = operations;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Operation> getOperations() {
		if (operations == null) {
			operations = new java.util.LinkedHashSet<com.hejiascm.domain.Operation>();
		}
		return operations;
	}

	/**
	 */
	public void setContractgoodses(Set<Contractgoods> contractgoodses) {
		for(Contractgoods c : contractgoodses){
			c.setTradecontract(this);
		}
		this.contractgoodses = contractgoodses;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Contractgoods> getContractgoodses() {
		if (contractgoodses == null) {
			contractgoodses = new java.util.LinkedHashSet<com.hejiascm.domain.Contractgoods>();
		}
		return contractgoodses;
	}

	/**
	 */
	public void setParticipants(Set<Participant> participants) {
		for(Participant p : participants){
			p.setTradecontract(this);
		}
		this.participants = participants;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Participant> getParticipants() {
		if (participants == null) {
			participants = new java.util.LinkedHashSet<com.hejiascm.domain.Participant>();
		}
		return participants;
	}

	/**
	 */
	public void setTradecontractattachments(Set<Tradecontractattachment> tradecontractattachments) {
		for(Tradecontractattachment t : tradecontractattachments){
			t.setTradecontract(this);
		}
		this.tradecontractattachments = tradecontractattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Tradecontractattachment> getTradecontractattachments() {
		if (tradecontractattachments == null) {
			tradecontractattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Tradecontractattachment>();
		}
		return tradecontractattachments;
	}

	/**
	 */
	public void setTerms(Set<Term> terms) {
		for(Term t : terms){
			t.setTradecontract(this);
		}
		this.terms = terms;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Term> getTerms() {
		if (terms == null) {
			terms = new java.util.LinkedHashSet<com.hejiascm.domain.Term>();
		}
		return terms;
	}

	/**
	 */
	public Tradecontract() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Tradecontract that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setSerial(that.getSerial());
		setContractType(that.getContractType());
		setServiceType(that.getServiceType());
		setEffectiveTime(that.getEffectiveTime());
		setExpirationTime(that.getExpirationTime());
		setCurrency(that.getCurrency());
		setDataEffectivePaticipant(that.getDataEffectivePaticipant());
		setOrderSubmitterId(that.getOrderSubmitterId());
		setMeansOfTransportation(that.getMeansOfTransportation());
		setExecutionStatus(that.getExecutionStatus());
		setChangeStatus(that.getChangeStatus());
		setPreviousVersion(that.getPreviousVersion());
		setCurrentEffectiveVersion(that.getCurrentEffectiveVersion());
		setRemarks(that.getRemarks());
		setDescription(that.getDescription());
		setOrgid(that.getOrgid());
		setOperations(new java.util.LinkedHashSet<com.hejiascm.domain.Operation>(that.getOperations()));
		setContractgoodses(new java.util.LinkedHashSet<com.hejiascm.domain.Contractgoods>(that.getContractgoodses()));
		setParticipants(new java.util.LinkedHashSet<com.hejiascm.domain.Participant>(that.getParticipants()));
		setTradecontractattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Tradecontractattachment>(that.getTradecontractattachments()));
		setTerms(new java.util.LinkedHashSet<com.hejiascm.domain.Term>(that.getTerms()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("serial=[").append(serial).append("] ");
		buffer.append("contractType=[").append(contractType).append("] ");
		buffer.append("serviceType=[").append(serviceType).append("] ");
		buffer.append("effectiveTime=[").append(effectiveTime).append("] ");
		buffer.append("expirationTime=[").append(expirationTime).append("] ");
		buffer.append("currency=[").append(currency).append("] ");
		buffer.append("dataEffectivePaticipant=[").append(dataEffectivePaticipant).append("] ");
		buffer.append("orderSubmitterId=[").append(orderSubmitterId).append("] ");
		buffer.append("meansOfTransportation=[").append(meansOfTransportation).append("] ");
		buffer.append("executionStatus=[").append(executionStatus).append("] ");
		buffer.append("changeStatus=[").append(changeStatus).append("] ");
		buffer.append("previousVersion=[").append(previousVersion).append("] ");
		buffer.append("currentEffectiveVersion=[").append(currentEffectiveVersion).append("] ");
		buffer.append("remarks=[").append(remarks).append("] ");
		buffer.append("description=[").append(description).append("] ");
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
		if (!(obj instanceof Tradecontract))
			return false;
		Tradecontract equalCheck = (Tradecontract) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
