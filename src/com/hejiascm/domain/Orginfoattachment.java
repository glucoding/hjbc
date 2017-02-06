package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.xml.bind.annotation.*;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrginfoattachments", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment"),
		@NamedQuery(name = "findOrginfoattachmentByAddress", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment where myOrginfoattachment.address = ?1"),
		@NamedQuery(name = "findOrginfoattachmentByAddressContaining", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment where myOrginfoattachment.address like ?1"),
		@NamedQuery(name = "findOrginfoattachmentById", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment where myOrginfoattachment.id = ?1"),
		@NamedQuery(name = "findOrginfoattachmentByIdContaining", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment where myOrginfoattachment.id like ?1"),
		@NamedQuery(name = "findOrginfoattachmentByPrimaryKey", query = "select myOrginfoattachment from Orginfoattachment myOrginfoattachment where myOrginfoattachment.id = ?1") })
@Table(catalog = "hjdb", name = "OrgInfoAttachment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Orginfoattachment")
public class Orginfoattachment implements Serializable {
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

	@Column(name = "address")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	
	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "orgid", referencedColumnName = "id") })
	@XmlTransient
	//@JsonBackReference
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
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return description;
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
	public Orginfoattachment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Orginfoattachment that) {
		setId(that.getId());
		setAddress(that.getAddress());
		setDescription(that.getDescription());
		setOrginfo(that.getOrginfo());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("description=[").append(description).append("] ");

		return buffer.toString();
	}

	/**
	 */
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
//		return result;
//	}
//
//	/**
//	 */
//	public boolean equals(Object obj) {
//		if (obj == this)
//			return true;
//		if (!(obj instanceof Orginfoattachment))
//			return false;
//		Orginfoattachment equalCheck = (Orginfoattachment) obj;
//		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
//			return false;
//		if (id != null && !id.equals(equalCheck.id))
//			return false;
//		return true;
//	}
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((address== null) ? 0 : address.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Orginfoattachment))
	        return false;
	    Orginfoattachment equalCheck = (Orginfoattachment) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((address== null && equalCheck.address != null) || (address != null && equalCheck.address == null))
	        return false;
	    if (address!= null && !address.equals(equalCheck.address))
	        return false;

	    return true;
	} 
}
