
package com.hejiascm.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Financingrequest implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String financingType;
	String tradeContractId;
	String tradeOverview;
	BigDecimal tradeAmount;
	BigDecimal financingAmount;
	BigDecimal fee;
	String intention;
	BigDecimal financingRate;
	BigDecimal overdueRate;
	String lendingDate;
	String repaymentDate;
	String prepaymentAllowed;
	Integer repaymentMethod;
	String applicationOrgId;
	String applicationTime;
	Integer effectiveStatus;
	Integer publicStatus;
	String financingContractId;
	java.util.Set<com.hejiascm.domain.Finreqparticipant> finreqparticipants;
	java.util.Set<com.hejiascm.domain.Finreqattachment> finreqattachments;
	java.util.Set<com.hejiascm.domain.Finreqtradecontext> finreqtradecontexts;

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
	public void setFinancingType(String financingType) {
		this.financingType = financingType;
	}

	/**
	 */
	public String getFinancingType() {
		return this.financingType;
	}

	/**
	 */
	public void setTradeContractId(String tradeContractId) {
		this.tradeContractId = tradeContractId;
	}

	/**
	 */
	public String getTradeContractId() {
		return this.tradeContractId;
	}

	/**
	 */
	public void setTradeOverview(String tradeOverview) {
		this.tradeOverview = tradeOverview;
	}

	/**
	 */
	public String getTradeOverview() {
		return this.tradeOverview;
	}

	/**
	 */
	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	/**
	 */
	public BigDecimal getTradeAmount() {
		return this.tradeAmount;
	}

	/**
	 */
	public void setFinancingAmount(BigDecimal financingAmount) {
		this.financingAmount = financingAmount;
	}

	/**
	 */
	public BigDecimal getFinancingAmount() {
		return this.financingAmount;
	}

	/**
	 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	/**
	 */
	public BigDecimal getFee() {
		return this.fee;
	}

	/**
	 */
	public void setIntention(String intention) {
		this.intention = intention;
	}

	/**
	 */
	public String getIntention() {
		return this.intention;
	}

	/**
	 */
	public void setFinancingRate(BigDecimal financingRate) {
		this.financingRate = financingRate;
	}

	/**
	 */
	public BigDecimal getFinancingRate() {
		return this.financingRate;
	}

	/**
	 */
	public void setOverdueRate(BigDecimal overdueRate) {
		this.overdueRate = overdueRate;
	}

	/**
	 */
	public BigDecimal getOverdueRate() {
		return this.overdueRate;
	}

	/**
	 */
	public void setLendingDate(String lendingDate) {
		this.lendingDate = lendingDate;
	}

	/**
	 */
	public String getLendingDate() {
		return this.lendingDate;
	}

	/**
	 */
	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	/**
	 */
	public String getRepaymentDate() {
		return this.repaymentDate;
	}

	/**
	 */
	public void setPrepaymentAllowed(String prepaymentAllowed) {
		this.prepaymentAllowed = prepaymentAllowed;
	}

	/**
	 */
	public String getPrepaymentAllowed() {
		return this.prepaymentAllowed;
	}

	/**
	 */
	public void setRepaymentMethod(Integer repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	/**
	 */
	public Integer getRepaymentMethod() {
		return this.repaymentMethod;
	}

	/**
	 */
	public void setApplicationOrgId(String applicationOrgId) {
		this.applicationOrgId = applicationOrgId;
	}

	/**
	 */
	public String getApplicationOrgId() {
		return this.applicationOrgId;
	}

	/**
	 */
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}

	/**
	 */
	public String getApplicationTime() {
		return this.applicationTime;
	}

	/**
	 */
	public void setEffectiveStatus(Integer effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

	/**
	 */
	public Integer getEffectiveStatus() {
		return this.effectiveStatus;
	}

	/**
	 */
	public void setPublicStatus(Integer publicStatus) {
		this.publicStatus = publicStatus;
	}

	/**
	 */
	public Integer getPublicStatus() {
		return this.publicStatus;
	}

	/**
	 */
	public void setFinancingContractId(String financingContractId) {
		this.financingContractId = financingContractId;
	}

	/**
	 */
	public String getFinancingContractId() {
		return this.financingContractId;
	}

	/**
	 */
	public void setFinreqparticipants(Set<Finreqparticipant> finreqparticipants) {
		for(Finreqparticipant f : finreqparticipants){
			f.setFinancingrequest(this);
		}
		this.finreqparticipants = finreqparticipants;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Finreqparticipant> getFinreqparticipants() {
		if (finreqparticipants == null) {
			finreqparticipants = new java.util.LinkedHashSet<com.hejiascm.domain.Finreqparticipant>();
		}
		return finreqparticipants;
	}

	/**
	 */
	public void setFinreqattachments(Set<Finreqattachment> finreqattachments) {
		for(Finreqattachment f : finreqattachments){
			f.setFinancingrequest(this);
		}
		this.finreqattachments = finreqattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Finreqattachment> getFinreqattachments() {
		if (finreqattachments == null) {
			finreqattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Finreqattachment>();
		}
		return finreqattachments;
	}

	/**
	 */
	public void setFinreqtradecontexts(Set<Finreqtradecontext> finreqtradecontexts) {
		for(Finreqtradecontext f : finreqtradecontexts){
			f.setFinancingrequest(this);
		}
		this.finreqtradecontexts = finreqtradecontexts;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Finreqtradecontext> getFinreqtradecontexts() {
		if (finreqtradecontexts == null) {
			finreqtradecontexts = new java.util.LinkedHashSet<com.hejiascm.domain.Finreqtradecontext>();
		}
		return finreqtradecontexts;
	}

	/**
	 */
	public Financingrequest() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Financingrequest that) {
		setId(that.getId());
		setFinancingType(that.getFinancingType());
		setTradeContractId(that.getTradeContractId());
		setTradeOverview(that.getTradeOverview());
		setTradeAmount(that.getTradeAmount());
		setFinancingAmount(that.getFinancingAmount());
		setFee(that.getFee());
		setIntention(that.getIntention());
		setFinancingRate(that.getFinancingRate());
		setOverdueRate(that.getOverdueRate());
		setLendingDate(that.getLendingDate());
		setRepaymentDate(that.getRepaymentDate());
		setPrepaymentAllowed(that.getPrepaymentAllowed());
		setRepaymentMethod(that.getRepaymentMethod());
		setApplicationOrgId(that.getApplicationOrgId());
		setApplicationTime(that.getApplicationTime());
		setEffectiveStatus(that.getEffectiveStatus());
		setPublicStatus(that.getPublicStatus());
		setFinancingContractId(that.getFinancingContractId());
		setFinreqparticipants(new java.util.LinkedHashSet<com.hejiascm.domain.Finreqparticipant>(that.getFinreqparticipants()));
		setFinreqattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Finreqattachment>(that.getFinreqattachments()));
		setFinreqtradecontexts(new java.util.LinkedHashSet<com.hejiascm.domain.Finreqtradecontext>(that.getFinreqtradecontexts()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("financingType=[").append(financingType).append("] ");
		buffer.append("tradeContractId=[").append(tradeContractId).append("] ");
		buffer.append("tradeOverview=[").append(tradeOverview).append("] ");
		buffer.append("tradeAmount=[").append(tradeAmount).append("] ");
		buffer.append("financingAmount=[").append(financingAmount).append("] ");
		buffer.append("fee=[").append(fee).append("] ");
		buffer.append("intention=[").append(intention).append("] ");
		buffer.append("financingRate=[").append(financingRate).append("] ");
		buffer.append("overdueRate=[").append(overdueRate).append("] ");
		buffer.append("lendingDate=[").append(lendingDate).append("] ");
		buffer.append("repaymentDate=[").append(repaymentDate).append("] ");
		buffer.append("prepaymentAllowed=[").append(prepaymentAllowed).append("] ");
		buffer.append("repaymentMethod=[").append(repaymentMethod).append("] ");
		buffer.append("applicationOrgId=[").append(applicationOrgId).append("] ");
		buffer.append("applicationTime=[").append(applicationTime).append("] ");
		buffer.append("effectiveStatus=[").append(effectiveStatus).append("] ");
		buffer.append("publicStatus=[").append(publicStatus).append("] ");
		buffer.append("financingContractId=[").append(financingContractId).append("] ");

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
		if (!(obj instanceof Financingrequest))
			return false;
		Financingrequest equalCheck = (Financingrequest) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
