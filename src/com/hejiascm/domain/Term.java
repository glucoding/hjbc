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
		@NamedQuery(name = "findAllTerms", query = "select myTerm from Term myTerm"),
		@NamedQuery(name = "findTermByContent", query = "select myTerm from Term myTerm where myTerm.content = ?1"),
		@NamedQuery(name = "findTermByContentContaining", query = "select myTerm from Term myTerm where myTerm.content like ?1"),
		@NamedQuery(name = "findTermByDescription", query = "select myTerm from Term myTerm where myTerm.description = ?1"),
		@NamedQuery(name = "findTermByDescriptionContaining", query = "select myTerm from Term myTerm where myTerm.description like ?1"),
		@NamedQuery(name = "findTermById", query = "select myTerm from Term myTerm where myTerm.id = ?1"),
		@NamedQuery(name = "findTermByIdContaining", query = "select myTerm from Term myTerm where myTerm.id like ?1"),
		@NamedQuery(name = "findTermByName", query = "select myTerm from Term myTerm where myTerm.name = ?1"),
		@NamedQuery(name = "findTermByNameContaining", query = "select myTerm from Term myTerm where myTerm.name like ?1"),
		@NamedQuery(name = "findTermByPrimaryKey", query = "select myTerm from Term myTerm where myTerm.id = ?1"),
		@NamedQuery(name = "findTermByType", query = "select myTerm from Term myTerm where myTerm.type = ?1"),
		@NamedQuery(name = "findTermByTypeContaining", query = "select myTerm from Term myTerm where myTerm.type like ?1") })
@Table(catalog = "hjdb", name = "Term")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Term")
public class Term implements Serializable {
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

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 * ?????????????
	 * 
	 */

	@Column(name = "content")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String content;
	/**
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;

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
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * ?????????????
	 * 
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * ?????????????
	 * 
	 */
	public String getContent() {
		return this.content;
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
	public Term() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Term that) {
		setId(that.getId());
		setName(that.getName());
		setDescription(that.getDescription());
		setContent(that.getContent());
		setType(that.getType());
		setTradecontract(that.getTradecontract());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("type=[").append(type).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((name== null) ? 0 : name.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Term))
	        return false;
	    Term equalCheck = (Term) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((name == null && equalCheck.name != null) || (name != null && equalCheck.name == null))
	        return false;
	    if (name!= null && !name.equals(equalCheck.name))
	        return false;

	    return true;
	}
}
