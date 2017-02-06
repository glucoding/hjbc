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
		@NamedQuery(name = "findAllParticipants", query = "select myParticipant from Participant myParticipant"),
		@NamedQuery(name = "findParticipantById", query = "select myParticipant from Participant myParticipant where myParticipant.id = ?1"),
		@NamedQuery(name = "findParticipantByIdContaining", query = "select myParticipant from Participant myParticipant where myParticipant.id like ?1"),
		@NamedQuery(name = "findParticipantByName", query = "select myParticipant from Participant myParticipant where myParticipant.name = ?1"),
		@NamedQuery(name = "findParticipantByNameContaining", query = "select myParticipant from Participant myParticipant where myParticipant.name like ?1"),
		@NamedQuery(name = "findParticipantByPermission", query = "select myParticipant from Participant myParticipant where myParticipant.permission = ?1"),
		@NamedQuery(name = "findParticipantByPermissionContaining", query = "select myParticipant from Participant myParticipant where myParticipant.permission like ?1"),
		@NamedQuery(name = "findParticipantByPrimaryKey", query = "select myParticipant from Participant myParticipant where myParticipant.id = ?1"),
		@NamedQuery(name = "findParticipantByRole", query = "select myParticipant from Participant myParticipant where myParticipant.role = ?1"),
		@NamedQuery(name = "findParticipantByRoleContaining", query = "select myParticipant from Participant myParticipant where myParticipant.role like ?1"),
		@NamedQuery(name = "findParticipantBySignedTime", query = "select myParticipant from Participant myParticipant where myParticipant.signedTime = ?1"),
		@NamedQuery(name = "findParticipantBySignedTimeContaining", query = "select myParticipant from Participant myParticipant where myParticipant.signedTime like ?1"),
		@NamedQuery(name = "findParticipantByStatus", query = "select myParticipant from Participant myParticipant where myParticipant.status = ?1") })
@Table(catalog = "hjdb", name = "Participant")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Participant")
public class Participant implements Serializable {
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

	@Column(name = "role")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String role;
	/**
	 */

	@Column(name = "permission")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String permission;
	/**
	 */

	@Column(name = "status")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer status;
	/**
	 */

	@Column(name = "signedTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String signedTime;

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
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	/**
	 */
	public String getPermission() {
		return this.permission;
	}

	/**
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 */
	public void setSignedTime(String signedTime) {
		this.signedTime = signedTime;
	}

	/**
	 */
	public String getSignedTime() {
		return this.signedTime;
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
	public Participant() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Participant that) {
		setId(that.getId());
		setName(that.getName());
		setRole(that.getRole());
		setPermission(that.getPermission());
		setStatus(that.getStatus());
		setSignedTime(that.getSignedTime());
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
		buffer.append("role=[").append(role).append("] ");
		buffer.append("permission=[").append(permission).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("signedTime=[").append(signedTime).append("] ");

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
	    if (!(obj instanceof Participant))
	        return false;
	    Participant equalCheck = (Participant) obj;
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
