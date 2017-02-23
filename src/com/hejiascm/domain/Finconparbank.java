
package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Finconparbank implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String friendlyName;
	String type;
	String orgFullName;
	String bankName;
	String bankAccount;
	String bankId;
	String orgid;
	Finconparticipant finconparticipant;

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
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	/**
	 */
	public String getFriendlyName() {
		return this.friendlyName;
	}

	/**
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 */
	public String getType() {
		return this.type;
	}

	/**
	 */
	public void setOrgFullName(String orgFullName) {
		this.orgFullName = orgFullName;
	}

	/**
	 */
	public String getOrgFullName() {
		return this.orgFullName;
	}

	/**
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 */
	public String getBankName() {
		return this.bankName;
	}

	/**
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}

	/**
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	/**
	 */
	public String getBankId() {
		return this.bankId;
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
	public void setFinconparticipant(Finconparticipant finconparticipant) {
		this.finconparticipant = finconparticipant;
	}

	/**
	 */
	@JsonIgnore
	public Finconparticipant getFinconparticipant() {
		return finconparticipant;
	}

	/**
	 */
	public Finconparbank() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Finconparbank that) {
		setId(that.getId());
		setFriendlyName(that.getFriendlyName());
		setType(that.getType());
		setOrgFullName(that.getOrgFullName());
		setBankName(that.getBankName());
		setBankAccount(that.getBankAccount());
		setBankId(that.getBankId());
		setOrgid(that.getOrgid());
		setFinconparticipant(that.getFinconparticipant());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("friendlyName=[").append(friendlyName).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("orgFullName=[").append(orgFullName).append("] ");
		buffer.append("bankName=[").append(bankName).append("] ");
		buffer.append("bankAccount=[").append(bankAccount).append("] ");
		buffer.append("bankId=[").append(bankId).append("] ");
		buffer.append("orgid=[").append(orgid).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((friendlyName== null) ? 0 : friendlyName.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Finconparbank))
	        return false;
	   Finconparbank equalCheck = (Finconparbank) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((friendlyName == null && equalCheck.friendlyName != null) ||( friendlyName != null && equalCheck.friendlyName == null))
	        return false;
	    if (friendlyName!= null && !friendlyName.equals(equalCheck.friendlyName))
	        return false;

	    return true;
	}
}
