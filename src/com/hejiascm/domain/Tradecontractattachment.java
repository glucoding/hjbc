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
		@NamedQuery(name = "findAllTradecontractattachments", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment"),
		@NamedQuery(name = "findTradecontractattachmentByContent", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.content = ?1"),
		@NamedQuery(name = "findTradecontractattachmentByContentContaining", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.content like ?1"),
		@NamedQuery(name = "findTradecontractattachmentByDescription", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.description = ?1"),
		@NamedQuery(name = "findTradecontractattachmentByDescriptionContaining", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.description like ?1"),
		@NamedQuery(name = "findTradecontractattachmentById", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.id = ?1"),
		@NamedQuery(name = "findTradecontractattachmentByIdContaining", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.id like ?1"),
		@NamedQuery(name = "findTradecontractattachmentByPrimaryKey", query = "select myTradecontractattachment from Tradecontractattachment myTradecontractattachment where myTradecontractattachment.id = ?1") })
@Table(catalog = "hjdb", name = "TradeContractAttachment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Tradecontractattachment")
public class Tradecontractattachment implements Serializable {
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

	@Column(name = "content")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String content;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "contractid", referencedColumnName = "id") })
	@XmlTransient
	Tradecontract tradecontract;

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
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 */
	public String getContent() {
		return this.content;
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
	public void setTradecontract(Tradecontract tradecontract) {
		this.tradecontract = tradecontract;
	}

	/**
	 */
	@JsonIgnore
	public Tradecontract getTradecontract() {
		return tradecontract;
	}

	/**
	 */
	public Tradecontractattachment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Tradecontractattachment that) {
		setId(that.getId());
		setContent(that.getContent());
		setDescription(that.getDescription());
		setTradecontract(that.getTradecontract());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("description=[").append(description).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((content== null) ? 0 : content.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Tradecontractattachment))
	        return false;
	    Tradecontractattachment equalCheck = (Tradecontractattachment) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((content== null && equalCheck.content != null) || (content != null && equalCheck.content == null))
	        return false;
	    if (content!= null && !content.equals(equalCheck.content))
	        return false;

	    return true;
	} 
}
