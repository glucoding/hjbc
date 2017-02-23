package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;

public class Bankaccountentry implements Serializable {
	private static final long serialVersionUID = 1L;

	String id;

	String fiendlyName;

	String type;

	String bankAccountInfo;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setFiendlyName(String fiendlyName) {
		this.fiendlyName = fiendlyName;
	}

	public String getFiendlyName() {
		return this.fiendlyName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setBankAccountInfo(String bankAccountInfo) {
		this.bankAccountInfo = bankAccountInfo;
	}

	public String getBankAccountInfo() {
		return this.bankAccountInfo;
	}

	public Bankaccountentry() {
	}

	public void copy(Bankaccountentry that) {
		setId(that.getId());
		setFiendlyName(that.getFiendlyName());
		setType(that.getType());
		setBankAccountInfo(that.getBankAccountInfo());
	}

	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("fiendlyName=[").append(fiendlyName).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("bankAccountInfo=[").append(bankAccountInfo).append("] ");

		return buffer.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Bankaccountentry))
			return false;
		Bankaccountentry equalCheck = (Bankaccountentry) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
