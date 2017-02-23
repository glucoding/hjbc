
package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Finconterm implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String description;
	String content;
	Financingcontract financingcontract;

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
	public Finconterm() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Finconterm that) {
		setId(that.getId());
		setName(that.getName());
		setDescription(that.getDescription());
		setContent(that.getContent());
		setFinancingcontract(that.getFinancingcontract());
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
	    if (!(obj instanceof Finconterm))
	        return false;
	    Finconterm equalCheck = (Finconterm) obj;
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
