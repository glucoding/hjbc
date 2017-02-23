package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Tradecontract implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String version;
	String serial;
	Integer contractType;
	Integer serviceType;
	String effectiveTime;
	String expirationTime;
	String currency;
	String dataEffectivePaticipant;
	String orderSubmitterId;
	String meansOfTransportation;
	Integer executionStatus;
	Integer changeStatus;
	String previousVersion;
	String currentEffectiveVersion;
	String remarks;
	String description;
	String orgid;
	String name;
	String orgName;
	java.util.Set<com.hejiascm.domain.Operation> operations;
	java.util.Set<com.hejiascm.domain.Contractgoods> contractgoodses;
	java.util.Set<com.hejiascm.domain.Participant> participants;
	java.util.Set<com.hejiascm.domain.Tradecontractattachment> tradecontractattachments;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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
		setName(that.getName());
		setName(that.getOrgName());
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
		buffer.append("name=[").append(name).append("])");
		buffer.append("orgName=[").append(orgName).append("])");
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
