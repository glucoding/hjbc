package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBankaccountentrys", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry"),
		@NamedQuery(name = "findBankaccountentryByBankAccountInfo", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.bankAccountInfo = ?1"),
		@NamedQuery(name = "findBankaccountentryByBankAccountInfoContaining", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.bankAccountInfo like ?1"),
		@NamedQuery(name = "findBankaccountentryByFiendlyName", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.fiendlyName = ?1"),
		@NamedQuery(name = "findBankaccountentryByFiendlyNameContaining", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.fiendlyName like ?1"),
		@NamedQuery(name = "findBankaccountentryById", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.id = ?1"),
		@NamedQuery(name = "findBankaccountentryByPrimaryKey", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.id = ?1"),
		@NamedQuery(name = "findBankaccountentryByType", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.type = ?1"),
		@NamedQuery(name = "findBankaccountentryByTypeContaining", query = "select myBankaccountentry from Bankaccountentry myBankaccountentry where myBankaccountentry.type like ?1") })
@Table(catalog = "hjdb", name = "BankAccountEntry")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Bankaccountentry")
public class Bankaccountentry implements Serializable {
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

	@Column(name = "fiendlyName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fiendlyName;
	/**
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;
	/**
	 */

	@Column(name = "bankAccountInfo")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bankAccountInfo;

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
	public void setFiendlyName(String fiendlyName) {
		this.fiendlyName = fiendlyName;
	}

	/**
	 */
	public String getFiendlyName() {
		return this.fiendlyName;
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
	public void setBankAccountInfo(String bankAccountInfo) {
		this.bankAccountInfo = bankAccountInfo;
	}

	/**
	 */
	public String getBankAccountInfo() {
		return this.bankAccountInfo;
	}

	/**
	 */
	public Bankaccountentry() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Bankaccountentry that) {
		setId(that.getId());
		setFiendlyName(that.getFiendlyName());
		setType(that.getType());
		setBankAccountInfo(that.getBankAccountInfo());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("fiendlyName=[").append(fiendlyName).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("bankAccountInfo=[").append(bankAccountInfo).append("] ");

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
		if (!(obj instanceof Bankaccountentry))
			return false;
		Bankaccountentry equalCheck = (Bankaccountentry) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
