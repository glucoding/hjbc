package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;

public class Orginfo implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String taxpayerId;
	Integer role;
	String summary;
	Integer state;
	String orgType;
	String orgAddress;
	String orgRep;
	String establishDate;
	String validityTerm;
	String businessScope;
	String orgCode;
	String taxCode;
	String tel;
	String opid;
	String registrationId;
	Integer registrationAmount;
	String admin;
	String email;
	String mobile;
	String password;
	String orgCat;
	String invitingMobile;
	String authCode;
	String mobileAuthCode;
	String orgCodeTerm;
	String openApprovAuthNum;
	String orgTrustCode;
	String repCerType;
	String repCerNum;
	String repCerTerm;
	String agentName;
	String agentType;
	String agentCerNum;
	String agentCerTerm;
	String agentEmail;
	String regAddr;
	String comAddr;
	String iniSubTime;
	String approveTime;
	String quitTime;
	java.util.Set<com.hejiascm.domain.Orginfoattachment> orginfoattachments; 
	java.util.Set<com.hejiascm.domain.Bankaccountinfo> bankaccountinfos;

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
	public void setTaxpayerId(String taxpayerId) {
		this.taxpayerId = taxpayerId;
	}

	/**
	 */
	public String getTaxpayerId() {
		return this.taxpayerId;
	}

	/**
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 */
	public Integer getRole() {
		return this.role;
	}

	/**
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 */
	public String getSummary() {
		return this.summary;
	}

	/**
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 */
	public Integer getState() {
		return this.state;
	}

	/**
	 */
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	/**
	 */
	public String getOrgType() {
		return this.orgType;
	}

	/**
	 */
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	/**
	 */
	public String getOrgAddress() {
		return this.orgAddress;
	}

	/**
	 */
	public void setOrgRep(String orgRep) {
		this.orgRep = orgRep;
	}

	/**
	 */
	public String getOrgRep() {
		return this.orgRep;
	}

	/**
	 */
	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	/**
	 */
	//@JsonSerialize(using=JsonDateSerializer.class)
	public String getEstablishDate() {
		return this.establishDate;
	}

	/**
	 */
	public void setValidityTerm(String validityTerm) {
		this.validityTerm = validityTerm;
	}

	/**
	 */
	public String getValidityTerm() {
		return this.validityTerm;
	}

	/**
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	/**
	 */
	public String getBusinessScope() {
		return this.businessScope;
	}

	/**
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 */
	public String getOrgCode() {
		return this.orgCode;
	}

	/**
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 */
	public String getTaxCode() {
		return this.taxCode;
	}

	/**
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 */
	public String getTel() {
		return this.tel;
	}

	/**
	 */
	public void setOpid(String opid) {
		this.opid = opid;
	}

	/**
	 */
	public String getOpid() {
		return this.opid;
	}

	/**
	 */
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	/**
	 */
	public String getRegistrationId() {
		return this.registrationId;
	}

	/**
	 */
	public void setRegistrationAmount(Integer registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	/**
	 */
	public Integer getRegistrationAmount() {
		return this.registrationAmount;
	}

	/**
	 */
	public void setAdmin(String admin) {
		this.admin = admin;
	}

	/**
	 */
	public String getAdmin() {
		return this.admin;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setOrginfoattachments(Set<Orginfoattachment> orginfoattachments) {

		System.out.println("*************"+orginfoattachments.size());
		for(Orginfoattachment a : orginfoattachments){
			a.setOrginfo(this);
			System.out.println("ADDRESS" + a.getAddress());
		}
		this.orginfoattachments = orginfoattachments;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Orginfoattachment> getOrginfoattachments() {
		if (orginfoattachments == null) {
			orginfoattachments = new java.util.LinkedHashSet<com.hejiascm.domain.Orginfoattachment>();
		}
		return orginfoattachments;
	}

	/**
	 */
	public void setBankaccountinfos(Set<Bankaccountinfo> bankaccountinfos) {
		for(Bankaccountinfo b : bankaccountinfos){
			b.setOrginfo(this);
		}
		this.bankaccountinfos = bankaccountinfos;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Bankaccountinfo> getBankaccountinfos() {
		if (bankaccountinfos == null) {
			bankaccountinfos = new java.util.LinkedHashSet<com.hejiascm.domain.Bankaccountinfo>();
		}
		return bankaccountinfos;
	}
	
	/**
	 */
	public void setIniSubTime(String tsp) {
		this.iniSubTime = tsp;
	}

	/**
	 */
	//@JsonSerialize(using=JsonDateSerializer.class)
	public String getIniSubTime() {
		return this.iniSubTime;
	}
	
	/**
	 */
	public void setApproveTime(String approveTime) {
		this.approveTime = approveTime;
	}

	/**
	 */
	//@JsonSerialize(using=JsonDateSerializer.class)
	public String getApproveTime() {
		return this.approveTime;
	}
	
	/**
	 */
	public void setQuitTime(String quitTime) {
		this.quitTime = quitTime;
	}

	/**
	 */
	//@JsonSerialize(using=JsonDateSerializer.class)
	public String getQuitTime() {
		return this.quitTime;
	}
	
	public String getOrgCat() {
		return orgCat;
	}

	public void setOrgCat(String orgCat) {
		this.orgCat = orgCat;
	}

	public String getInvitingMobile() {
		return invitingMobile;
	}

	public void setInvitingMobile(String invitingMobile) {
		this.invitingMobile = invitingMobile;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getMobileAuthCode() {
		return mobileAuthCode;
	}

	public void setMobileAuthCode(String mobileAuthCode) {
		this.mobileAuthCode = mobileAuthCode;
	}

	public String getOrgCodeTerm() {
		return orgCodeTerm;
	}

	public void setOrgCodeTerm(String orgCodeTerm) {
		this.orgCodeTerm = orgCodeTerm;
	}

	public String getOpenApprovAuthNum() {
		return openApprovAuthNum;
	}

	public void setOpenApprovAuthNum(String openApprovAuthNum) {
		this.openApprovAuthNum = openApprovAuthNum;
	}

	public String getOrgTrustCode() {
		return orgTrustCode;
	}

	public void setOrgTrustCode(String orgTrustCode) {
		this.orgTrustCode = orgTrustCode;
	}

	public String getRepCerType() {
		return repCerType;
	}

	public void setRepCerType(String repCerType) {
		this.repCerType = repCerType;
	}

	public String getRepCerNum() {
		return repCerNum;
	}

	public void setRepCerNum(String repCerNum) {
		this.repCerNum = repCerNum;
	}

	public String getRepCerTerm() {
		return repCerTerm;
	}

	public void setRepCerTerm(String repCerTerm) {
		this.repCerTerm = repCerTerm;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentType() {
		return agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	public String getAgentCerNum() {
		return agentCerNum;
	}

	public void setAgentCerNum(String agentCerNum) {
		this.agentCerNum = agentCerNum;
	}

	public String getAgentCerTerm() {
		return agentCerTerm;
	}

	public void setAgentCerTerm(String agentCerTerm) {
		this.agentCerTerm = agentCerTerm;
	}

	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public String getRegAddr() {
		return regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getComAddr() {
		return comAddr;
	}

	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}

	/**
	 */
	public Orginfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Orginfo that) {
		setId(that.getId());
		setName(that.getName());
		setTaxpayerId(that.getTaxpayerId());
		setRole(that.getRole());
		setSummary(that.getSummary());
		setState(that.getState());
		setOrgType(that.getOrgType());
		setOrgAddress(that.getOrgAddress());
		setOrgRep(that.getOrgRep());
		setEstablishDate(that.getEstablishDate());
		setValidityTerm(that.getValidityTerm());
		setBusinessScope(that.getBusinessScope());
		setOrgCode(that.getOrgCode());
		setTaxCode(that.getTaxCode());
		setTel(that.getTel());
		setOpid(that.getOpid());
		setRegistrationId(that.getRegistrationId());
		setRegistrationAmount(that.getRegistrationAmount());
		setAdmin(that.getAdmin());
		setEmail(that.getEmail());
		setMobile(that.getMobile());
		setPassword(that.getPassword());
		setIniSubTime(that.getIniSubTime());
		setApproveTime(that.getApproveTime());
		setQuitTime(that.getQuitTime());
		setOrginfoattachments(new java.util.LinkedHashSet<com.hejiascm.domain.Orginfoattachment>(that.getOrginfoattachments()));
		setBankaccountinfos(new java.util.LinkedHashSet<com.hejiascm.domain.Bankaccountinfo>(that.getBankaccountinfos()));
		setOrgCat(that.getOrgCat());
		setInvitingMobile(that.getInvitingMobile());
		setAuthCode(that.getAuthCode());
		setMobileAuthCode(that.getMobileAuthCode());
		setOrgCodeTerm(that.getOrgCodeTerm());
		setOpenApprovAuthNum(that.getOpenApprovAuthNum());
		setOrgTrustCode(that.getOrgTrustCode());
		setRepCerType(that.getRepCerType());
		setRepCerNum(that.getRepCerNum());
		setRepCerTerm(that.getRepCerTerm());
		setAgentName(that.getAgentName());
		setAgentType(that.getAgentType());
		setAgentCerNum(that.getAgentCerNum());
		setAgentCerTerm(that.getAgentCerTerm());
		setAgentEmail(that.getAgentEmail());
		setRegAddr(that.getRegAddr());
		setComAddr(that.getComAddr());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("taxpayerId=[").append(taxpayerId).append("] ");
		buffer.append("role=[").append(role).append("] ");
		buffer.append("summary=[").append(summary).append("] ");
		buffer.append("state=[").append(state).append("] ");
		buffer.append("orgType=[").append(orgType).append("] ");
		buffer.append("orgAddress=[").append(orgAddress).append("] ");
		buffer.append("orgRep=[").append(orgRep).append("] ");
		buffer.append("establishDate=[").append(establishDate).append("] ");
		buffer.append("validityTerm=[").append(validityTerm).append("] ");
		buffer.append("businessScope=[").append(businessScope).append("] ");
		buffer.append("orgCode=[").append(orgCode).append("] ");
		buffer.append("taxCode=[").append(taxCode).append("] ");
		buffer.append("tel=[").append(tel).append("] ");
		buffer.append("opid=[").append(opid).append("] ");
		buffer.append("registrationId=[").append(registrationId).append("] ");
		buffer.append("registrationAmount=[").append(registrationAmount).append("] ");
		buffer.append("admin=[").append(admin).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("mobile=[").append(mobile).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("iniSubTime=[").append(iniSubTime).append("] ");
		buffer.append("approveTime=[").append(approveTime).append("] ");
		buffer.append("quitTime=[").append(quitTime).append("] ");
		buffer.append("orgCat=[").append(orgCat).append("] ");
		buffer.append("invitingMobile=[").append(invitingMobile).append("] ");
		buffer.append("authCod=[").append(authCode).append("] ");
		buffer.append("mobileAuthCode=[").append(mobileAuthCode).append("] ");
		buffer.append("orgCodeTerm=[").append(orgCodeTerm).append("] ");
		buffer.append("openApprovAuthNum=[").append(openApprovAuthNum).append("] ");
		buffer.append("orgTrustCode=[").append(orgTrustCode).append("] ");
		buffer.append("repCerType=[").append(repCerType).append("] ");
		buffer.append("repCerNum=[").append(repCerNum).append("] ");
		buffer.append("repCerTerm=[").append(repCerTerm).append("] ");
		buffer.append("agentName=[").append(agentName).append("] ");
		buffer.append("agentType=[").append(agentType).append("] ");
		buffer.append("agentCerNum=[").append(agentCerNum).append("] ");
		buffer.append("agentCerTerm=[").append(agentCerTerm).append("] ");
		buffer.append("agentEmail=[").append(agentEmail).append("] ");
		buffer.append("regAddr=[").append(regAddr).append("] ");
		buffer.append("comAddr=[").append(comAddr).append("] ");

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
		if (!(obj instanceof Orginfo))
			return false;
		Orginfo equalCheck = (Orginfo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
