package com.hejiascm.domains.org;

import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;

public class _OrgUpdateRequest extends OrgUpdateRequest {
	private _OrgInfo oldInfo;
	private _OrgInfo newInfo;

	public _OrgUpdateRequest() {
		// TODO Auto-generated constructor stub
	}

	public _OrgInfo getOldInfo() {
		return oldInfo;
	}

	public void setOldInfo(_OrgInfo oldInfo) {
		this.oldInfo = oldInfo;
	}

	public _OrgInfo getNewInfo() {
		return newInfo;
	}

	public void setNewInfo(_OrgInfo newInfo) {
		this.newInfo = newInfo;
	}
	
	

}
