package com.hejiascm.blockchain.interfaces;

import com.hejiascm.domains.org._OrgInfo;
import com.hejiascm.domains.org._OrgRegisterResponse;
import com.hejiascm.domains.org._OrgSummaryInfo;
import com.hejiascm.domains.org._OrgUpdateRequest;
import com.ibm.crl.bc.hejia.sdk.common.DocStatus;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.organization.OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;

public interface OrganizationDAO {
	public void activate(String orgId);
	
	public void approveUpdate(String orgId, String requestId, String operator);
	
	public void cancelUpdate(String requestId, String operator);
	
	public void deActivate(String orgId);
	
	public _OrgUpdateRequest[] getAllUpdateRequest(String operator);
	
	public _OrgUpdateRequest[] getMyUpdateRequests(DocStatus status, String operator);
	
	public _OrgUpdateRequest getUpdateRequestById(String requestId, String operator);
	
	public _OrgUpdateRequest[] getOrgUpdateRequests(String condition, String operator);
	
	public _OrgInfo getOrgById(String orgId);
	
	public OrgSummaryInfo[] getOrgList();
	
	public _OrgInfo[] getOrgs(String query);
	
	public void leave(String orgId, String reason, String operator);
	
	public OrgRegisterResponse register(_OrgInfo org);
	
	public void rejectUpdate(String orgId, String requestId, String operator);
	
	public OrgUpdateRequest submitUpdateRequest(String orgId, String requestTime, _OrgInfo updatedInfo, String operator);
	
	public void update(String orgId, Property[] properties, String operator);
}
