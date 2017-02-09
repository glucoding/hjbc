package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hejiascm.util.TimestampAdapter;
import com.hejiascm.web.rest.JsonDateSerializer;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrginfos", query = "select myOrginfo from Orginfo myOrginfo"),
		@NamedQuery(name = "findOrginfoByAdmin", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.admin = ?1"),
		@NamedQuery(name = "findOrginfoByAdminContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.admin like ?1"),
		@NamedQuery(name = "findOrginfoByBusinessScope", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.businessScope = ?1"),
		@NamedQuery(name = "findOrginfoByBusinessScopeContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.businessScope like ?1"),
		@NamedQuery(name = "findOrginfoByEmail", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.email = ?1"),
		@NamedQuery(name = "findOrginfoByEmailContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.email like ?1"),
		@NamedQuery(name = "findOrginfoByEstablishDate", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.establishDate = ?1"),
		@NamedQuery(name = "findOrginfoByEstablishDateAfter", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.establishDate > ?1"),
		@NamedQuery(name = "findOrginfoByEstablishDateBefore", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.establishDate < ?1"),
		@NamedQuery(name = "findOrginfoById", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.id = ?1"),
		@NamedQuery(name = "findOrginfoByIdContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.id like ?1"),
		@NamedQuery(name = "findOrginfoByMobile", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.mobile = ?1"),
		@NamedQuery(name = "findOrginfoByMobileContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.mobile like ?1"),
		@NamedQuery(name = "findOrginfoByName", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.name = ?1"),
		@NamedQuery(name = "findOrginfoByNameContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.name like ?1"),
		@NamedQuery(name = "findOrginfoByOpid", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.opid = ?1"),
		@NamedQuery(name = "findOrginfoByOpidContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.opid like ?1"),
		@NamedQuery(name = "findOrginfoByOrgAddress", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgAddress = ?1"),
		@NamedQuery(name = "findOrginfoByOrgAddressContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgAddress like ?1"),
		@NamedQuery(name = "findOrginfoByOrgCode", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgCode = ?1"),
		@NamedQuery(name = "findOrginfoByOrgCodeContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgCode like ?1"),
		@NamedQuery(name = "findOrginfoByOrgRep", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgRep = ?1"),
		@NamedQuery(name = "findOrginfoByOrgRepContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgRep like ?1"),
		@NamedQuery(name = "findOrginfoByOrgType", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgType = ?1"),
		@NamedQuery(name = "findOrginfoByOrgTypeContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.orgType like ?1"),
		@NamedQuery(name = "findOrginfoByPassword", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.password = ?1"),
		@NamedQuery(name = "findOrginfoByPasswordContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.password like ?1"),
		@NamedQuery(name = "findOrginfoByPrimaryKey", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.id = ?1"),
		@NamedQuery(name = "findOrginfoByRegistrationAmount", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.registrationAmount = ?1"),
		@NamedQuery(name = "findOrginfoByRegistrationId", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.registrationId = ?1"),
		@NamedQuery(name = "findOrginfoByRegistrationIdContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.registrationId like ?1"),
		@NamedQuery(name = "findOrginfoByRole", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.role = ?1"),
		@NamedQuery(name = "findOrginfoByState", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.state = ?1"),
		@NamedQuery(name = "findOrginfoBySummary", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.summary = ?1"),
		@NamedQuery(name = "findOrginfoBySummaryContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.summary like ?1"),
		@NamedQuery(name = "findOrginfoByTaxCode", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.taxCode = ?1"),
		@NamedQuery(name = "findOrginfoByTaxCodeContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.taxCode like ?1"),
		@NamedQuery(name = "findOrginfoByTaxpayerId", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.taxpayerId = ?1"),
		@NamedQuery(name = "findOrginfoByTaxpayerIdContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.taxpayerId like ?1"),
		@NamedQuery(name = "findOrginfoByTel", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.tel = ?1"),
		@NamedQuery(name = "findOrginfoByTelContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.tel like ?1"),
		@NamedQuery(name = "findOrginfoByValidityTerm", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.validityTerm = ?1"),
		@NamedQuery(name = "findOrginfoByValidityTermContaining", query = "select myOrginfo from Orginfo myOrginfo where myOrginfo.validityTerm like ?1") })
@Table(catalog = "hjdb", name = "OrgInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Orginfo")
@XmlRootElement(namespace = "HejiaSCM/com/hejiascm/domain")
public class Orginfo implements Serializable {
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

	@Column(name = "name")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "taxpayerId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String taxpayerId;
	/**
	 */

	@Column(name = "role")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer role;
	/**
	 */

	@Column(name = "summary")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String summary;
	/**
	 */

	@Column(name = "state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer state;
	/**
	 */

	@Column(name = "orgType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgType;
	/**
	 */

	@Column(name = "orgAddress")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgAddress;
	/**
	 */

	@Column(name = "orgRep")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgRep;
	/**
	 */
	//@Temporal(TemporalType.DATE)
	@Column(name = "establishDate")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	@XmlJavaTypeAdapter(value=TimestampAdapter.class,type=Timestamp.class)
	Timestamp establishDate;
	/**
	 */

	@Column(name = "validityTerm")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String validityTerm;
	/**
	 */

	@Column(name = "businessScope")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String businessScope;
	/**
	 */

	@Column(name = "orgCode")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgCode;
	/**
	 */

	@Column(name = "taxCode")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String taxCode;
	/**
	 */

	@Column(name = "tel")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String tel;
	/**
	 */

	@Column(name = "opid")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String opid;
	/**
	 */

	@Column(name = "registrationId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String registrationId;
	/**
	 */

	@Column(name = "registrationAmount")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer registrationAmount;
	/**
	 */

	@Column(name = "admin")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String admin;
	/**
	 */

	@Column(name = "email")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "mobile")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobile;
	/**
	 */
	
	@Column(name = "password")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	
	@Column(name = "orgCat")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgCat;
	
	@Column(name = "invitingMobile")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String invitingMobile;
	
	@Column(name = "authCode")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String authCode;

	@Column(name = "mobileAuthCode")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobileAuthCode;
	
	@Column(name = "orgCodeTerm")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgCodeTerm;
	
	@Column(name = "openApprovAuthNum")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String openApprovAuthNum;
	
	@Column(name = "orgTrustCode")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgTrustCode;
	
	@Column(name = "repCerType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String repCerType;
	
	@Column(name = "repCerNum")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String repCerNum;
	
	@Column(name = "repCerTerm")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String repCerTerm;
	
	@Column(name = "agentName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String agentName;
	
	@Column(name = "agentType")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String agentType;
	
	@Column(name = "agentCerNum")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String agentCerNum;
	
	@Column(name = "agentCerTerm")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String agentCerTerm;
	
	@Column(name = "agentEmail")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String agentEmail;
	
	@Column(name = "regAddr")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String regAddr;
	
	@Column(name = "comAddr")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String comAddr;

	@Column(name = "iniSubTime", nullable = true)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	@XmlJavaTypeAdapter(value=TimestampAdapter.class,type=Timestamp.class)
	Timestamp iniSubTime;
	
	@Column(name = "approveTime", nullable = true)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	@XmlJavaTypeAdapter(value=TimestampAdapter.class,type=Timestamp.class)
	Timestamp approveTime;
	
	@Column(name = "quitTime", nullable = true)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	@XmlJavaTypeAdapter(value=TimestampAdapter.class,type=Timestamp.class)
	Timestamp quitTime;

	/**
	 */
	@OneToMany(mappedBy = "orginfo", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	//@JsonManagedReference
	java.util.Set<com.hejiascm.domain.Orginfoattachment> orginfoattachments; 
	/**
	 */
	@OneToMany(mappedBy = "orginfo", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
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
	public void setEstablishDate(Timestamp establishDate) {
		this.establishDate = establishDate;
	}

	/**
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Timestamp getEstablishDate() {
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
	public void setIniSubTime(Timestamp tsp) {
		this.iniSubTime = tsp;
	}

	/**
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Timestamp getIniSubTime() {
		return this.iniSubTime;
	}
	
	/**
	 */
	public void setApproveTime(Timestamp approveTime) {
		this.approveTime = approveTime;
	}

	/**
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Timestamp getApproveTime() {
		return this.approveTime;
	}
	
	/**
	 */
	public void setQuitTime(Timestamp quitTime) {
		this.quitTime = quitTime;
	}

	/**
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Timestamp getQuitTime() {
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
