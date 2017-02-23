package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Orginfoattachment implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String address;
	String description;
	String hash;
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
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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
