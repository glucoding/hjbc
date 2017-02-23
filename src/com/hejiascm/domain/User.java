package com.hejiascm.domain;

public class User {
	private String name;
	private String orgId;
	private String[] roles;
	private String toBeDecided;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public String getToBeDecided() {
		return toBeDecided;
	}
	public void setToBeDecided(String toBeDecided) {
		this.toBeDecided = toBeDecided;
	}
	
	
}
