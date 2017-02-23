
package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Finconparticipant implements Serializable {
	private static final long serialVersionUID = 1L;
	String orgId;
	String name;
	Integer role;
	Integer permission;
	Financingcontract financingcontract;
	java.util.Set<com.hejiascm.domain.Finconparbank> finconparbanks;

	/**
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 */
	public String getOrgId() {
		return this.orgId;
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
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 */
	public Integer getRole() {
		return this.role;
	}

	/**
	 */
	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	/**
	 */
	public Integer getPermission() {
		return this.permission;
	}

	/**
	 */
	public void setFinancingcontract(Financingcontract financingcontract) {
		this.financingcontract = financingcontract;
	}

	/**
	 */
	@JsonIgnore
	public Financingcontract getFinancingcontract() {
		return financingcontract;
	}

	/**
	 */
	public void setFinconparbanks(Set<Finconparbank> finconparbanks) {
		for(Finconparbank f : finconparbanks){
			f.setFinconparticipant(this);
		}
		this.finconparbanks = finconparbanks;
	}

	/**
	 */
	//@JsonIgnore
	public Set<Finconparbank> getFinconparbanks() {
		if (finconparbanks == null) {
			finconparbanks = new java.util.LinkedHashSet<com.hejiascm.domain.Finconparbank>();
		}
		return finconparbanks;
	}

	/**
	 */
	public Finconparticipant() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Finconparticipant that) {
		setOrgId(that.getOrgId());
		setName(that.getName());
		setRole(that.getRole());
		setPermission(that.getPermission());
		setFinancingcontract(that.getFinancingcontract());
		setFinconparbanks(new java.util.LinkedHashSet<com.hejiascm.domain.Finconparbank>(that.getFinconparbanks()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orgId=[").append(orgId).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("role=[").append(role).append("] ");
		buffer.append("permission=[").append(permission).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((orgId == null) ? 0 : orgId.hashCode()));
	    result = (int) (prime * result + ((name== null) ? 0 : name.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Finconparticipant))
	        return false;
	   Finconparticipant equalCheck = (Finconparticipant) obj;
	    if ((orgId == null && equalCheck.orgId != null) || (orgId != null && equalCheck.orgId == null))
	        return false;
	    if (orgId != null && !orgId.equals(equalCheck.orgId))
	        return false;
	    if ((name == null && equalCheck.name != null) || (name != null && equalCheck.name == null))
	        return false;
	    if (name!= null && !name.equals(equalCheck.name))
	        return false;

	    return true;
	}
}
