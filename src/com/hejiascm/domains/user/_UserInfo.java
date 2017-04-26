package com.hejiascm.domains.user;

import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.user.UserInfo;

public class _UserInfo extends UserInfo {
	private String password;
	private String fullName;
	private String mobile;
	private String enabled;
	private String code;

	public _UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public _UserInfo(String name, String orgId, String[] roles, Property[] properties) {
		super(name, orgId, roles, properties);
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
