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
		@NamedQuery(name = "findAllDeliveryattachments", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment"),
		@NamedQuery(name = "findDeliveryattachmentByAddress", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.address = ?1"),
		@NamedQuery(name = "findDeliveryattachmentByAddressContaining", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.address like ?1"),
		@NamedQuery(name = "findDeliveryattachmentByDescription", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.description = ?1"),
		@NamedQuery(name = "findDeliveryattachmentByDescriptionContaining", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.description like ?1"),
		@NamedQuery(name = "findDeliveryattachmentById", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.id = ?1"),
		@NamedQuery(name = "findDeliveryattachmentByIdContaining", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.id like ?1"),
		@NamedQuery(name = "findDeliveryattachmentByPrimaryKey", query = "select myDeliveryattachment from Deliveryattachment myDeliveryattachment where myDeliveryattachment.id = ?1") })
@Table(catalog = "hjdb", name = "DeliveryAttachment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Deliveryattachment")
public class Deliveryattachment implements Serializable {
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
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "deliveryId", referencedColumnName = "id") })
	@XmlTransient
	Deliveryrecord deliveryrecord;

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
		return this.description;
	}

	/**
	 */
	public void setDeliveryrecord(Deliveryrecord deliveryrecord) {
		this.deliveryrecord = deliveryrecord;
	}

	/**
	 */
	@JsonIgnore
	public Deliveryrecord getDeliveryrecord() {
		return deliveryrecord;
	}

	/**
	 */
	public Deliveryattachment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Deliveryattachment that) {
		setId(that.getId());
		setAddress(that.getAddress());
		setDescription(that.getDescription());
		setDeliveryrecord(that.getDeliveryrecord());
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
	    if (!(obj instanceof Deliveryattachment))
	        return false;
	    Deliveryattachment equalCheck = (Deliveryattachment) obj;
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
