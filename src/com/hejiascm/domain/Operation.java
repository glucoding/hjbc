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
		@NamedQuery(name = "findAllOperations", query = "select myOperation from Operation myOperation"),
		@NamedQuery(name = "findOperationById", query = "select myOperation from Operation myOperation where myOperation.id = ?1"),
		@NamedQuery(name = "findOperationByIdContaining", query = "select myOperation from Operation myOperation where myOperation.id like ?1"),
		@NamedQuery(name = "findOperationByOperatorId", query = "select myOperation from Operation myOperation where myOperation.operatorId = ?1"),
		@NamedQuery(name = "findOperationByOperatorIdContaining", query = "select myOperation from Operation myOperation where myOperation.operatorId like ?1"),
		@NamedQuery(name = "findOperationByPrimaryKey", query = "select myOperation from Operation myOperation where myOperation.id = ?1"),
		@NamedQuery(name = "findOperationByTime", query = "select myOperation from Operation myOperation where myOperation.time = ?1"),
		@NamedQuery(name = "findOperationByTimeContaining", query = "select myOperation from Operation myOperation where myOperation.time like ?1"),
		@NamedQuery(name = "findOperationByType", query = "select myOperation from Operation myOperation where myOperation.type = ?1") })
@Table(catalog = "hjdb", name = "Operation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Operation")
public class Operation implements Serializable {
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

	@Column(name = "operatorId")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String operatorId;
	/**
	 */

	@Column(name = "time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String time;
	/**
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer type;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "contractId", referencedColumnName = "id") })
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
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 */
	public String getOperatorId() {
		return this.operatorId;
	}

	/**
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 */
	public Integer getType() {
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
	public Operation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Operation that) {
		setId(that.getId());
		setOperatorId(that.getOperatorId());
		setTime(that.getTime());
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
		buffer.append("operatorId=[").append(operatorId).append("] ");
		buffer.append("time=[").append(time).append("] ");
		buffer.append("type=[").append(type).append("] ");

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
		if (!(obj instanceof Operation))
			return false;
		Operation equalCheck = (Operation) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
