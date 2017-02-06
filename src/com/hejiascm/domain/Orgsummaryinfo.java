package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;

import javax.persistence.GeneratedValue;
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
		@NamedQuery(name = "findAllOrgsummaryinfos", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo"),
		@NamedQuery(name = "findOrgsummaryinfoById", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo where myOrgsummaryinfo.id = ?1"),
		@NamedQuery(name = "findOrgsummaryinfoByName", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo where myOrgsummaryinfo.name = ?1"),
		@NamedQuery(name = "findOrgsummaryinfoByNameContaining", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo where myOrgsummaryinfo.name like ?1"),
		@NamedQuery(name = "findOrgsummaryinfoByPrimaryKey", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo where myOrgsummaryinfo.id = ?1"),
		@NamedQuery(name = "findOrgsummaryinfoByRole", query = "select myOrgsummaryinfo from Orgsummaryinfo myOrgsummaryinfo where myOrgsummaryinfo.role = ?1") })
@Table(catalog = "hjdb", name = "OrgSummaryInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Orgsummaryinfo")
public class Orgsummaryinfo implements Serializable {
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

	@Column(name = "name", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "role", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer role;

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
	public Orgsummaryinfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Orgsummaryinfo that) {
		setId(that.getId());
		setName(that.getName());
		setRole(that.getRole());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("role=[").append(role).append("] ");

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
		if (!(obj instanceof Orgsummaryinfo))
			return false;
		Orgsummaryinfo equalCheck = (Orgsummaryinfo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
