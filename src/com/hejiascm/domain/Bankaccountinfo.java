package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
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
		@NamedQuery(name = "findAllBankaccountinfos", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo"),
		@NamedQuery(name = "findBankaccountinfoByBankAccount", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankAccount = ?1"),
		@NamedQuery(name = "findBankaccountinfoByBankAccountContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankAccount like ?1"),
		@NamedQuery(name = "findBankaccountinfoByBankId", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankId = ?1"),
		@NamedQuery(name = "findBankaccountinfoByBankIdContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankId like ?1"),
		@NamedQuery(name = "findBankaccountinfoByBankName", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankName = ?1"),
		@NamedQuery(name = "findBankaccountinfoByBankNameContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.bankName like ?1"),
		@NamedQuery(name = "findBankaccountinfoByFriendlyName", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.friendlyName = ?1"),
		@NamedQuery(name = "findBankaccountinfoByFriendlyNameContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.friendlyName like ?1"),
		@NamedQuery(name = "findBankaccountinfoById", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.id = ?1"),
		@NamedQuery(name = "findBankaccountinfoByIdContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.id like ?1"),
		@NamedQuery(name = "findBankaccountinfoByOrgFullName", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.orgFullName = ?1"),
		@NamedQuery(name = "findBankaccountinfoByOrgFullNameContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.orgFullName like ?1"),
		@NamedQuery(name = "findBankaccountinfoByPrimaryKey", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.id = ?1"),
		@NamedQuery(name = "findBankaccountinfoByType", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.type = ?1"),
		@NamedQuery(name = "findBankaccountinfoByTypeContaining", query = "select myBankaccountinfo from Bankaccountinfo myBankaccountinfo where myBankaccountinfo.type like ?1") })
@Table(catalog = "hjdb", name = "BankAccountInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Bankaccountinfo")
public class Bankaccountinfo implements Serializable {
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

	@Column(name = "friendlyName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String friendlyName;
	/**
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;
	/**
	 */

	@Column(name = "orgFullName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgFullName;
	/**
	 */

	@Column(name = "bankName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bankName;
	/**
	 */

	@Column(name = "bankAccount")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bankAccount;
	/**
	 */

	@Column(name = "bankId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bankId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "orgid", referencedColumnName = "id") })
	@XmlTransient
	Orginfo orginfo;

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
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	/**
	 */
	public String getFriendlyName() {
		return this.friendlyName;
	}

	/**
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 */
	public String getType() {
		return this.type;
	}

	/**
	 */
	public void setOrgFullName(String orgFullName) {
		this.orgFullName = orgFullName;
	}

	/**
	 */
	public String getOrgFullName() {
		return this.orgFullName;
	}

	/**
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 */
	public String getBankName() {
		return this.bankName;
	}

	/**
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}

	/**
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	/**
	 */
	public String getBankId() {
		return this.bankId;
	}

	/**
	 */
	public void setOrginfo(Orginfo orginfo) {
		this.orginfo = orginfo;
	}

	/**
	 */
	@JsonIgnore
	public Orginfo getOrginfo() {
		return orginfo;
	}

	/**
	 */
	public Bankaccountinfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Bankaccountinfo that) {
		setId(that.getId());
		setFriendlyName(that.getFriendlyName());
		setType(that.getType());
		setOrgFullName(that.getOrgFullName());
		setBankName(that.getBankName());
		setBankAccount(that.getBankAccount());
		setBankId(that.getBankId());
		setOrginfo(that.getOrginfo());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("friendlyName=[").append(friendlyName).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("orgFullName=[").append(orgFullName).append("] ");
		buffer.append("bankName=[").append(bankName).append("] ");
		buffer.append("bankAccount=[").append(bankAccount).append("] ");
		buffer.append("bankId=[").append(bankId).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((friendlyName== null) ? 0 : friendlyName.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Bankaccountinfo))
	        return false;
	    Bankaccountinfo equalCheck = (Bankaccountinfo) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((friendlyName== null && equalCheck.friendlyName != null) || (friendlyName != null && equalCheck.friendlyName == null))
	        return false;
	    if (friendlyName!= null && !friendlyName.equals(equalCheck.friendlyName))
	        return false;

	    return true;
	} 
}
