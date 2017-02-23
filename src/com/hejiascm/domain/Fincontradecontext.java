
package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Fincontradecontext implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	Integer type;
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
	public Fincontradecontext() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Fincontradecontext that) {
		setId(that.getId());
		setType(that.getType());
		setFinancingcontract(that.getFinancingcontract());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("type=[").append(type).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((type== null) ? 0 : type.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Fincontradecontext))
	        return false;
	    Fincontradecontext equalCheck = (Fincontradecontext) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((type == null && equalCheck.type != null) || (type != null && equalCheck.type == null))
	        return false;
	    if (type!= null && !type.equals(equalCheck.type))
	        return false;

	    return true;
	}
}
