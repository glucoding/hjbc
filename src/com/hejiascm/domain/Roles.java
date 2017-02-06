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
		@NamedQuery(name = "findAllRoless", query = "select myRoles from Roles myRoles"),
		@NamedQuery(name = "findRolesByPrimaryKey", query = "select myRoles from Roles myRoles where myRoles.roleid = ?1"),
		@NamedQuery(name = "findRolesByRoleName", query = "select myRoles from Roles myRoles where myRoles.roleName = ?1"),
		@NamedQuery(name = "findRolesByRoleNameContaining", query = "select myRoles from Roles myRoles where myRoles.roleName like ?1"),
		@NamedQuery(name = "findRolesByRoleid", query = "select myRoles from Roles myRoles where myRoles.roleid = ?1"),
		@NamedQuery(name = "findRolesByRoleidContaining", query = "select myRoles from Roles myRoles where myRoles.roleid like ?1"),
		@NamedQuery(name = "findRolesByUserid", query = "select myRoles from Roles myRoles where myRoles.userid = ?1"),
		@NamedQuery(name = "findRolesByUseridContaining", query = "select myRoles from Roles myRoles where myRoles.userid like ?1") })
@Table(catalog = "hjdb", name = "roles")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Roles")
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@XmlElement
	String roleid;
	/**
	 */

	@Column(name = "roleName", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roleName;
	/**
	 */

	@Column(name = "userid", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userid;

	/**
	 */
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	/**
	 */
	public String getRoleid() {
		return this.roleid;
	}

	/**
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 */
	public String getUserid() {
		return this.userid;
	}

	/**
	 */
	public Roles() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Roles that) {
		setRoleid(that.getRoleid());
		setRoleName(that.getRoleName());
		setUserid(that.getUserid());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roleid=[").append(roleid).append("] ");
		buffer.append("roleName=[").append(roleName).append("] ");
		buffer.append("userid=[").append(userid).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roleid == null) ? 0 : roleid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Roles))
			return false;
		Roles equalCheck = (Roles) obj;
		if ((roleid == null && equalCheck.roleid != null) || (roleid != null && equalCheck.roleid == null))
			return false;
		if (roleid != null && !roleid.equals(equalCheck.roleid))
			return false;
		return true;
	}
}
