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
		@NamedQuery(name = "findAllUserss", query = "select myUsers from Users myUsers"),
		@NamedQuery(name = "findUsersByEnabled", query = "select myUsers from Users myUsers where myUsers.enabled = ?1"),
		@NamedQuery(name = "findUsersByPasssalt", query = "select myUsers from Users myUsers where myUsers.passsalt = ?1"),
		@NamedQuery(name = "findUsersByPasssaltContaining", query = "select myUsers from Users myUsers where myUsers.passsalt like ?1"),
		@NamedQuery(name = "findUsersByPassword", query = "select myUsers from Users myUsers where myUsers.password = ?1"),
		@NamedQuery(name = "findUsersByPasswordContaining", query = "select myUsers from Users myUsers where myUsers.password like ?1"),
		@NamedQuery(name = "findUsersByPrimaryKey", query = "select myUsers from Users myUsers where myUsers.userid = ?1"),
		@NamedQuery(name = "findUsersByUserid", query = "select myUsers from Users myUsers where myUsers.userid = ?1"),
		@NamedQuery(name = "findUsersByUseridContaining", query = "select myUsers from Users myUsers where myUsers.userid like ?1"),
		@NamedQuery(name = "findUsersByUsername", query = "select myUsers from Users myUsers where myUsers.username = ?1"),
		@NamedQuery(name = "findUsersByUsernameContaining", query = "select myUsers from Users myUsers where myUsers.username like ?1"), 
		@NamedQuery(name = "findUsersByOrgid", query = "select myUsers from Users myUsers where myUsers.orgid = ?1"),
		@NamedQuery(name = "findUsersByFullName", query = "select myUsers from Users myUsers where myUsers.fullName = ?1") })
@Table(catalog = "hjdb", name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "userid", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@XmlElement
	String userid;
	/**
	 */

	@Column(name = "username")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
	/**
	 */

	@Column(name = "password")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */
	
	@Column(name = "fullName")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fullName;
	/**
	 */

	@Column(name = "passsalt")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String passsalt;
	/**
	 */

	@Column(name = "enabled")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean enabled;
	
	@Column(name = "orgid")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgid;

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
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 */
	public String getFullName() {
		return this.fullName;
	}

	/**
	 */
	public void setPasssalt(String passsalt) {
		this.passsalt = passsalt;
	}

	/**
	 */
	public String getPasssalt() {
		return this.passsalt;
	}

	/**
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}
	
	/**
	 */
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	/**
	 */
	public String getOrgid() {
		return this.orgid;
	}

	/**
	 */
	public Users() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Users that) {
		setUserid(that.getUserid());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setFullName(that.getFullName());
		setPasssalt(that.getPasssalt());
		setEnabled(that.getEnabled());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("userid=[").append(userid).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("fullName=[").append(fullName).append("] ");
		buffer.append("passsalt=[").append(passsalt).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((userid == null) ? 0 : userid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Users))
			return false;
		Users equalCheck = (Users) obj;
		if ((userid == null && equalCheck.userid != null) || (userid != null && equalCheck.userid == null))
			return false;
		if (userid != null && !userid.equals(equalCheck.userid))
			return false;
		return true;
	}
}
