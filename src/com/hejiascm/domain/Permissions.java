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
		@NamedQuery(name = "findAllPermissionss", query = "select myPermissions from Permissions myPermissions"),
		@NamedQuery(name = "findPermissionsByPermissionName", query = "select myPermissions from Permissions myPermissions where myPermissions.permissionName = ?1"),
		@NamedQuery(name = "findPermissionsByPermissionNameContaining", query = "select myPermissions from Permissions myPermissions where myPermissions.permissionName like ?1"),
		@NamedQuery(name = "findPermissionsByPermissionid", query = "select myPermissions from Permissions myPermissions where myPermissions.permissionid = ?1"),
		@NamedQuery(name = "findPermissionsByPermissionidContaining", query = "select myPermissions from Permissions myPermissions where myPermissions.permissionid like ?1"),
		@NamedQuery(name = "findPermissionsByPrimaryKey", query = "select myPermissions from Permissions myPermissions where myPermissions.permissionid = ?1"),
		@NamedQuery(name = "findPermissionsByRoleid", query = "select myPermissions from Permissions myPermissions where myPermissions.roleid = ?1"),
		@NamedQuery(name = "findPermissionsByRoleidContaining", query = "select myPermissions from Permissions myPermissions where myPermissions.roleid like ?1") })
@Table(catalog = "hjdb", name = "permissions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Permissions")
public class Permissions implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "permissionid", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@XmlElement
	String permissionid;
	/**
	 */

	@Column(name = "permissionName", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String permissionName;
	/**
	 */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roleid;

	/**
	 */
	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}

	/**
	 */
	public String getPermissionid() {
		return this.permissionid;
	}

	/**
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 */
	public String getPermissionName() {
		return this.permissionName;
	}

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
	public Permissions() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Permissions that) {
		setPermissionid(that.getPermissionid());
		setPermissionName(that.getPermissionName());
		setRoleid(that.getRoleid());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("permissionid=[").append(permissionid).append("] ");
		buffer.append("permissionName=[").append(permissionName).append("] ");
		buffer.append("roleid=[").append(roleid).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((permissionid == null) ? 0 : permissionid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Permissions))
			return false;
		Permissions equalCheck = (Permissions) obj;
		if ((permissionid == null && equalCheck.permissionid != null) || (permissionid != null && equalCheck.permissionid == null))
			return false;
		if (permissionid != null && !permissionid.equals(equalCheck.permissionid))
			return false;
		return true;
	}
}
