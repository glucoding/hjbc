
package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Financingcontract implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String serial;
	String financingType;
	String name;
	String description;
	String financingRequestId;
	String tradeContractId;
	String intention;
	BigDecimal financingAmount;
	BigDecimal fee;
	BigDecimal financingRate;
	BigDecimal overdueRate;
	String lendingDate;
	String repaymentDate;
	String prepaymentAllowed;
	Integer repaymentMethod;
	String repaymentPlan;
	String applicantOrgId;
	String applicationTime;
	String effectiveTime;
	String financingExecutionId;
	Integer status;
	String remarks;
	java.util.Set<com.hejiascm.domain.Fincontradecontext> fincontradecontexts;
	java.util.Set<com.hejiascm.domain.Finconterm> finconterms;
	java.util.Set<com.hejiascm.domain.Finconparticipant> finconparticipants;
	java.util.Set<com.hejiascm.domain.Finconattachment> finconattachments;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setFinancingType(String financingType) {
		this.financingType = financingType;
	}

	public String getFinancingType() {
		return this.financingType;
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
	
	public void setFinancingRequestId(String financingRequestId) {
		this.financingRequestId = financingRequestId;
	}

	public String getFinancingRequestId() {
		return this.financingRequestId;
	}

	public void setTradeContractId(String tradeContractId) {
		this.tradeContractId = tradeContractId;
	}

	public String getTradeContractId() {
		return this.tradeContractId;
	}

	public void setIntention(String intention) {
		this.intention = intention;
	}

	public String getIntention() {
		return this.intention;
	}

	public void setFinancingAmount(BigDecimal financingAmount) {
		this.financingAmount = financingAmount;
	}

	public BigDecimal getFinancingAmount() {
		return this.financingAmount;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFinancingRate(BigDecimal financingRate) {
		this.financingRate = financingRate;
	}

	public BigDecimal getFinancingRate() {
		return this.financingRate;
	}

	public void setOverdueRate(BigDecimal overdueRate) {
		this.overdueRate = overdueRate;
	}

	public BigDecimal getOverdueRate() {
		return this.overdueRate;
	}

	public void setLendingDate(String lendingDate) {
		this.lendingDate = lendingDate;
	}

	public String getLendingDate() {
		return this.lendingDate;
	}

	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	public String getRepaymentDate() {
		return this.repaymentDate;
	}

	public void setPrepaymentAllowed(String prepaymentAllowed) {
		this.prepaymentAllowed = prepaymentAllowed;
	}

	public String getPrepaymentAllowed() {
		return this.prepaymentAllowed;
	}

	public void setRepaymentMethod(Integer repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public Integer getRepaymentMethod() {
		return this.repaymentMethod;
	}

	public void setRepaymentPlan(String repaymentPlan) {
		this.repaymentPlan = repaymentPlan;
	}

	public String getRepaymentPlan() {
		return this.repaymentPlan;
	}

	public void setApplicantOrgId(String applicantOrgId) {
		this.applicantOrgId = applicantOrgId;
	}

	public String getApplicantOrgId() {
		return this.applicantOrgId;
	}

	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getApplicationTime() {
		return this.applicationTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setFinancingExecutionId(String financingExecutionId) {
		this.financingExecutionId = financingExecutionId;
	}

	public String getFinancingExecutionId() {
		return this.financingExecutionId;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setFincontradecontexts(Set<Fincontradecontext> fincontradecontexts) {
		for(Fincontradecontext f : fincontradecontexts){
			f.setFinancingcontract(this);
		}
		this.fincontradecontexts = fincontradecontexts;
	}

	//@JsonIgnore
	public Set<Fincontradecontext> getFincontradecontexts() {
		if (fincontradecontexts == null) {
			fincontradecontexts = new java.util.LinkedHashSet<com.hejiascm.domain.Fincontradecontext>();
		}
		return fincontradecontexts;
	}

	public void setFinconterms(Set<Finconterm> finconterms) {
		for(Finconterm f : finconterms){
			f.setFinancingcontract(this);
		}
		this.finconterms = finconterms;
	}

	//@JsonIgnore
	public Set<Finconterm> getFinconterms() {
		if (finconterms == null) {
			finconterms = new java.util.LinkedHashSet<com.hejiascm.domain.Finconterm>();
		}
		return finconterms;
	}

	public void setFinconparticipants(Set<Finconparticipant> finconparticipants) {
		for(Finconparticipant f : finconparticipants){
			f.setFinancingcontract(this);
		}
		this.finconparticipants = finconparticipants;
	}

	//@JsonIgnore
	public Set<Finconparticipant> getFinconparticipants() {
		if (finconparticipants == null) {
			finconparticipants = new java.util.LinkedHashSet<com.hejiascm.domain.Finconparticipant>();
		}
		return finconparticipants;
	}

	public void setFinconattachments(Set<Finconattachment> finconattachments) {
		for(Finconattachment f : finconattachments){
			f.setFinancingcontract(this);
		}
		this.finconattachments = finconattachments;
	}

	//@JsonIgnore
	public Set<Finconattachment> getFinconattachments() {
		if (finconattachments == null) {
			finconattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Finconattachment>();
		}
		return finconattachments;
	}

	public Financingcontract() {
	}

	public void copy(Financingcontract that) {
		setId(that.getId());
		setSerial(that.getSerial());
		setFinancingType(that.getFinancingType());
		setName(that.getName());
		setDescription(that.getDescription());
		setFinancingRequestId(that.getFinancingRequestId());
		setTradeContractId(that.getTradeContractId());
		setIntention(that.getIntention());
		setFinancingAmount(that.getFinancingAmount());
		setFee(that.getFee());
		setFinancingRate(that.getFinancingRate());
		setOverdueRate(that.getOverdueRate());
		setLendingDate(that.getLendingDate());
		setRepaymentDate(that.getRepaymentDate());
		setPrepaymentAllowed(that.getPrepaymentAllowed());
		setRepaymentMethod(that.getRepaymentMethod());
		setRepaymentPlan(that.getRepaymentPlan());
		setApplicantOrgId(that.getApplicantOrgId());
		setApplicationTime(that.getApplicationTime());
		setEffectiveTime(that.getEffectiveTime());
		setFinancingExecutionId(that.getFinancingExecutionId());
		setStatus(that.getStatus());
		setRemarks(that.getRemarks());
		setFincontradecontexts(new java.util.LinkedHashSet<com.hejiascm.domain.Fincontradecontext>(that.getFincontradecontexts()));
		setFinconterms(new java.util.LinkedHashSet<com.hejiascm.domain.Finconterm>(that.getFinconterms()));
		setFinconparticipants(new java.util.LinkedHashSet<com.hejiascm.domain.Finconparticipant>(that.getFinconparticipants()));
		setFinconattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Finconattachment>(that.getFinconattachments()));
	}

	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("serial=[").append(serial).append("] ");
		buffer.append("financingType=[").append(financingType).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("financingRequestId=[").append(financingRequestId).append("] ");
		buffer.append("tradeContractId=[").append(tradeContractId).append("] ");
		buffer.append("intention=[").append(intention).append("] ");
		buffer.append("financingAmount=[").append(financingAmount).append("] ");
		buffer.append("fee=[").append(fee).append("] ");
		buffer.append("financingRate=[").append(financingRate).append("] ");
		buffer.append("overdueRate=[").append(overdueRate).append("] ");
		buffer.append("lendingDate=[").append(lendingDate).append("] ");
		buffer.append("repaymentDate=[").append(repaymentDate).append("] ");
		buffer.append("prepaymentAllowed=[").append(prepaymentAllowed).append("] ");
		buffer.append("repaymentMethod=[").append(repaymentMethod).append("] ");
		buffer.append("repaymentPlan=[").append(repaymentPlan).append("] ");
		buffer.append("applicantOrgId=[").append(applicantOrgId).append("] ");
		buffer.append("applicationTime=[").append(applicationTime).append("] ");
		buffer.append("effectiveTime=[").append(effectiveTime).append("] ");
		buffer.append("financingExecutionId=[").append(financingExecutionId).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("remarks=[").append(remarks).append("] ");

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
		if (!(obj instanceof Financingcontract))
			return false;
		Financingcontract equalCheck = (Financingcontract) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
