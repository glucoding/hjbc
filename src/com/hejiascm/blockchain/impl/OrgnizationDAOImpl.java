package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.hejiascm.blockchain.interfaces.OrganizationDAO;
import com.hejiascm.domains.org._OrgInfo;
import com.hejiascm.domains.org._OrgUpdateRequest;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.DocStatus;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.organization.OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;
import com.ibm.crl.bc.hejia.sdk.organization.OrganizationProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("OrgnizationDAO")
public class OrgnizationDAOImpl implements OrganizationDAO {
	 public Logger log = Logger.getLogger("reqTime_logger"); 
	
	public OrgnizationDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate(String orgId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void approveUpdate(String orgId, String requestId, String operator) {
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			op.approveUpdate(orgId, requestId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void cancelUpdate(String requestId, String operator) {
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			op.cancelUpdate(requestId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public void deActivate(String orgId) {
		// TODO Auto-generated method stub

	}

	@Override
	public _OrgInfo getOrgById(String orgId) {
		OrgInfo org = null;
		String username = "admin";
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(username)){
			org = op.getOrgById(orgId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_OrgInfo _org = new _OrgInfo();
		//FatherToChildUtils.fatherToChild(org, _org);
		_org.setName(org.getName());
		_org.setTaxpayerId(org.getTaxpayerId());
		_org.setId(org.getId());
		_org.setRole(org.getRole());
		_org.setSummary(org.getSummary());
		//_org.setProperties(org.getProperties());
		_org.setBankAccounts(org.getBankAccounts());
		_org.setAttachments(org.getAttachments());
		_org.setState(org.getState());
		
		Property[] props = org.getProperties();
		if(props != null){
			Map<String,String> map = PropertySerializer.fromProperties(props);	
			_org.setOrgType(map.get("orgType"));
			_org.setOrgAddress(map.get("orgAddress"));
			_org.setOrgRep(map.get("orgRep"));
			_org.setEstablishDate(map.get("establishDate"));
			_org.setValidityTerm(map.get("validityTerm"));
			_org.setBusinessScope(map.get("businessScope"));
			_org.setRegistrationId(map.get("registrationId"));
			_org.setOrgCode(map.get("orgCode"));
			_org.setTaxCode(map.get("taxCode"));
			_org.setTel(map.get("tel"));
			_org.setRegistrationAmount(map.get("registrationAmount"));
			_org.setAdmin(map.get("admin"));
			_org.setEmail(map.get("email"));
			_org.setMobile(map.get("mobile"));
			_org.setPassword(map.get("password"));
			_org.setOpid(map.get("opid"));
			_org.setSubmitTime(map.get("submitTime"));
			_org.setApproveTime(map.get("approveTime"));
			_org.setQuitTime(map.get("quitTime"));
			_org.setOrgCat(map.get("orgCat"));
			_org.setInvitingMobile(map.get("invitingMobile"));
			_org.setAuthCode(map.get("authCode"));
			_org.setMobileAuthCode(map.get("mobileAuthCode"));
			_org.setOrgCodeTerm(map.get("orgCodeTerm"));
			_org.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
			_org.setOrgTrustCode(map.get("orgTrustCode"));
			_org.setRepCerType(map.get("repCerType"));
			_org.setRepCerNum(map.get("repCerNum"));
			_org.setRepCerTerm(map.get("repCerTerm"));
			_org.setAgentName(map.get("agentName"));
			_org.setAgentType(map.get("agentType"));
			_org.setAgentCerNum(map.get("agentCerNum"));
			_org.setAgentCerTerm(map.get("agentCerTerm"));
			_org.setAgentEmail(map.get("agentEmail"));
			_org.setRegAddr(map.get("regAddr"));
			_org.setComAddr(map.get("comAddr"));
			_org.setFinanceGrantNo(map.get("financeGrantNo"));
		}
		return _org;
	}

	@Override
	public OrgSummaryInfo[] getOrgList() {
		OrgSummaryInfo[] orgs = null;
		String username = "admin";
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(username)){
			orgs = op.getOrgList();
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return orgs;
	}

	@Override
	public _OrgInfo[] getOrgs(String query) {
		OrgInfo[] orgs = null;
		_OrgInfo[] _orgs = null;
		String username = "admin";
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(username)){
			orgs = op.getOrgs(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_orgs = new _OrgInfo[orgs.length];
		int i = 0;
		for(OrgInfo org : orgs){
			_OrgInfo _org = new _OrgInfo();
			//FatherToChildUtils.fatherToChild(org, _org);
			_org.setName(org.getName());
			_org.setTaxpayerId(org.getTaxpayerId());
			_org.setId(org.getId());
			_org.setRole(org.getRole());
			_org.setSummary(org.getSummary());
			//_org.setProperties(org.getProperties());
			_org.setBankAccounts(org.getBankAccounts());
			_org.setAttachments(org.getAttachments());
			_org.setState(org.getState());
			
			Property[] props = org.getProperties();
			if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				_org.setOrgType(map.get("orgType"));
				_org.setOrgAddress(map.get("orgAddress"));
				_org.setOrgRep(map.get("orgRep"));
				_org.setEstablishDate(map.get("establishDate"));
				_org.setValidityTerm(map.get("validityTerm"));
				_org.setBusinessScope(map.get("businessScope"));
				_org.setRegistrationId(map.get("registrationId"));
				_org.setOrgCode(map.get("orgCode"));
				_org.setTaxCode(map.get("taxCode"));
				_org.setTel(map.get("tel"));
				_org.setRegistrationAmount(map.get("registrationAmount"));
				_org.setAdmin(map.get("admin"));
				_org.setEmail(map.get("email"));
				_org.setMobile(map.get("mobile"));
				_org.setPassword(map.get("password"));
				_org.setOpid(map.get("opid"));
				_org.setSubmitTime(map.get("submitTime"));
				_org.setApproveTime(map.get("approveTime"));
				_org.setQuitTime(map.get("quitTime"));
				_org.setOrgCat(map.get("orgCat"));
				_org.setInvitingMobile(map.get("invitingMobile"));
				_org.setAuthCode(map.get("authCode"));
				_org.setMobileAuthCode(map.get("mobileAuthCode"));
				_org.setOrgCodeTerm(map.get("orgCodeTerm"));
				_org.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
				_org.setOrgTrustCode(map.get("orgTrustCode"));
				_org.setRepCerType(map.get("repCerType"));
				_org.setRepCerNum(map.get("repCerNum"));
				_org.setRepCerTerm(map.get("repCerTerm"));
				_org.setAgentName(map.get("agentName"));
				_org.setAgentType(map.get("agentType"));
				_org.setAgentCerNum(map.get("agentCerNum"));
				_org.setAgentCerTerm(map.get("agentCerTerm"));
				_org.setAgentEmail(map.get("agentEmail"));
				_org.setRegAddr(map.get("regAddr"));
				_org.setComAddr(map.get("comAddr"));
				_org.setFinanceGrantNo(map.get("financeGrantNo"));
			}
			_orgs[i] = _org;
			i++;
		}
		
		return _orgs;
	}

	@Override
	public OrgRegisterResponse register(_OrgInfo org) {
		Property[] props = new Property[]{
				new Property("orgType", org.getOrgType()),
				new Property("orgAddress", org.getOrgAddress()),
				new Property("orgRep", org.getOrgRep()),
				new Property("establishDate", org.getEstablishDate()),
				new Property("validityTerm", org.getValidityTerm()),
				new Property("businessScope", org.getBusinessScope()),
				new Property("registrationId", org.getRegistrationId()),
				new Property("orgCode", org.getOrgCode()),
				new Property("taxCode", org.getTaxCode()),
				new Property("tel", org.getTel()),
				new Property("registrationAmount", org.getRegistrationAmount()),
				new Property("admin", org.getAdmin()),
				new Property("email", org.getEmail()),
				new Property("mobile", org.getMobile()),
				new Property("pasword", org.getPassword()),
				new Property("opid", org.getOpid()),
				new Property("submitTime", org.getSubmitTime()),
				new Property("approveTime", org.getApproveTime()),
				new Property("quitTime", org.getQuitTime()),
				new Property("orgCat", org.getOrgCat()),
				new Property("invitingMobile", org.getInvitingMobile()),
				new Property("authCode", org.getAuthCode()),
				new Property("mobileAuthCode", org.getMobileAuthCode()),
				new Property("orgCodeTerm", org.getOrgCodeTerm()),
				new Property("openApprovAuthNum", org.getOpenApprovAuthNum()),
				new Property("orgTrustCode", org.getOrgTrustCode()),
				new Property("repCerType", org.getRepCerType()),
				new Property("repCerNum", org.getRepCerNum()),
				new Property("repCerTerm", org.getRepCerTerm()),
				new Property("agentName", org.getAgentName()),
				new Property("agentCerNum", org.getAgentCerNum()),
				new Property("agentType", org.getAgentType()),
				new Property("agentCerTerm", org.getAgentCerTerm()),
				new Property("agentEmail", org.getAgentEmail()),
				new Property("regAddr", org.getRegAddr()),
				new Property("comAddr", org.getComAddr()),
				new Property("financeGrantNo", org.getFinanceGrantNo())
		};
		
		OrgRegisterResponse res = null;
		String username = "admin";
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(username)){
			res = op.register(org.getName(), 
									   org.getTaxpayerId(),
									   org.getRole(), 
									   org.getSummary(), 
									   props,
									   org.getBankAccounts(), 
									   org.getEmail(), 
									   org.getAttachments());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		
		return res;
	}

	@Override
	public void leave(String orgId, String reason, String operator) {
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			op.leave(orgId, reason);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public _OrgUpdateRequest[] getAllUpdateRequest(String operator) {
		OrgUpdateRequest[] oursBc = null;
		
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			oursBc = op.getAllUpdateRequests();
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_OrgUpdateRequest[] ours = new _OrgUpdateRequest[oursBc.length];
		int i = 0;
		
		for(OrgUpdateRequest ourBc: oursBc){
					_OrgUpdateRequest our = new _OrgUpdateRequest();
					FatherToChildUtils.fatherToChild(ourBc, our);
					
					_OrgInfo oldOrg = new _OrgInfo();
					_OrgInfo newOrg = new _OrgInfo();
					
					FatherToChildUtils.fatherToChild(ourBc.getCurrentInfo(), oldOrg);
					FatherToChildUtils.fatherToChild(ourBc.getUpdateInfo(), newOrg);
					
					Property[] propsForOld = ourBc.getCurrentInfo().getProperties();
					if(propsForOld != null){
						Map<String,String> map = PropertySerializer.fromProperties(propsForOld);
						oldOrg.setOrgType(map.get("orgType"));
						oldOrg.setOrgAddress(map.get("orgAddress"));
						oldOrg.setOrgRep(map.get("orgRep"));
						oldOrg.setEstablishDate(map.get("establishDate"));
						oldOrg.setValidityTerm(map.get("validityTerm"));
						oldOrg.setBusinessScope(map.get("businessScope"));
						oldOrg.setRegistrationId(map.get("registrationId"));
						oldOrg.setOrgCode(map.get("orgCode"));
						oldOrg.setTaxCode(map.get("taxCode"));
						oldOrg.setTel(map.get("tel"));
						oldOrg.setRegistrationAmount(map.get("registrationAmount"));
						oldOrg.setAdmin(map.get("admin"));
						oldOrg.setEmail(map.get("email"));
						oldOrg.setMobile(map.get("mobile"));
						oldOrg.setPassword(map.get("password"));
						oldOrg.setOpid(map.get("opid"));
						oldOrg.setSubmitTime(map.get("submitTime"));
						oldOrg.setApproveTime(map.get("approveTime"));
						oldOrg.setQuitTime(map.get("quitTime"));
						oldOrg.setOrgCat(map.get("orgCat"));
						oldOrg.setInvitingMobile(map.get("invitingMobile"));
						oldOrg.setAuthCode(map.get("authCode"));
						oldOrg.setMobileAuthCode(map.get("mobileAuthCode"));
						oldOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
						oldOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
						oldOrg.setOrgTrustCode(map.get("orgTrustCode"));
						oldOrg.setRepCerType(map.get("repCerType"));
						oldOrg.setRepCerNum(map.get("repCerNum"));
						oldOrg.setRepCerTerm(map.get("repCerTerm"));
						oldOrg.setAgentName(map.get("agentName"));
						oldOrg.setAgentType(map.get("agentType"));
						oldOrg.setAgentCerNum(map.get("agentCerNum"));
						oldOrg.setAgentCerTerm(map.get("agentCerTerm"));
						oldOrg.setAgentEmail(map.get("agentEmail"));
						oldOrg.setRegAddr(map.get("regAddr"));
						oldOrg.setComAddr(map.get("comAddr"));
						oldOrg.setFinanceGrantNo(map.get("financeGrantNo"));
					}
					our.setOldInfo(oldOrg);
					
					Property[] propsForNew = ourBc.getUpdateInfo().getProperties();
					if(propsForNew != null){
						Map<String,String> map = PropertySerializer.fromProperties(propsForNew);
						newOrg.setOrgType(map.get("orgType"));
						newOrg.setOrgAddress(map.get("orgAddress"));
						newOrg.setOrgRep(map.get("orgRep"));
						newOrg.setEstablishDate(map.get("establishDate"));
						newOrg.setValidityTerm(map.get("validityTerm"));
						newOrg.setBusinessScope(map.get("businessScope"));
						newOrg.setRegistrationId(map.get("registrationId"));
						newOrg.setOrgCode(map.get("orgCode"));
						newOrg.setTaxCode(map.get("taxCode"));
						newOrg.setTel(map.get("tel"));
						newOrg.setRegistrationAmount(map.get("registrationAmount"));
						newOrg.setAdmin(map.get("admin"));
						newOrg.setEmail(map.get("email"));
						newOrg.setMobile(map.get("mobile"));
						newOrg.setPassword(map.get("password"));
						newOrg.setOpid(map.get("opid"));
						newOrg.setSubmitTime(map.get("submitTime"));
						newOrg.setApproveTime(map.get("approveTime"));
						newOrg.setQuitTime(map.get("quitTime"));
						newOrg.setOrgCat(map.get("orgCat"));
						newOrg.setInvitingMobile(map.get("invitingMobile"));
						newOrg.setAuthCode(map.get("authCode"));
						newOrg.setMobileAuthCode(map.get("mobileAuthCode"));
						newOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
						newOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
						newOrg.setOrgTrustCode(map.get("orgTrustCode"));
						newOrg.setRepCerType(map.get("repCerType"));
						newOrg.setRepCerNum(map.get("repCerNum"));
						newOrg.setRepCerTerm(map.get("repCerTerm"));
						newOrg.setAgentName(map.get("agentName"));
						newOrg.setAgentType(map.get("agentType"));
						newOrg.setAgentCerNum(map.get("agentCerNum"));
						newOrg.setAgentCerTerm(map.get("agentCerTerm"));
						newOrg.setAgentEmail(map.get("agentEmail"));
						newOrg.setRegAddr(map.get("regAddr"));
						newOrg.setComAddr(map.get("comAddr"));
						newOrg.setFinanceGrantNo(map.get("financeGrantNo"));
					}
					our.setNewInfo(newOrg);
					ours[i++] = our;
		}
		
		return ours;
	}

	@Override
	public _OrgUpdateRequest[] getMyUpdateRequests(DocStatus status, String operator) {
		OrgUpdateRequest[] oursBc = null;
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			oursBc = op.getMyUpdateRequests(status);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_OrgUpdateRequest[] ours = new _OrgUpdateRequest[oursBc.length];
		int i = 0;
		
		for(OrgUpdateRequest ourBc: oursBc){
					_OrgUpdateRequest our = new _OrgUpdateRequest();
					FatherToChildUtils.fatherToChild(ourBc, our);
					
					_OrgInfo oldOrg = new _OrgInfo();
					_OrgInfo newOrg = new _OrgInfo();
					
					FatherToChildUtils.fatherToChild(ourBc.getCurrentInfo(), oldOrg);
					FatherToChildUtils.fatherToChild(ourBc.getUpdateInfo(), newOrg);
					
					Property[] propsForOld = ourBc.getCurrentInfo().getProperties();
					if(propsForOld != null){
						Map<String,String> map = PropertySerializer.fromProperties(propsForOld);
						oldOrg.setOrgType(map.get("orgType"));
						oldOrg.setOrgAddress(map.get("orgAddress"));
						oldOrg.setOrgRep(map.get("orgRep"));
						oldOrg.setEstablishDate(map.get("establishDate"));
						oldOrg.setValidityTerm(map.get("validityTerm"));
						oldOrg.setBusinessScope(map.get("businessScope"));
						oldOrg.setRegistrationId(map.get("registrationId"));
						oldOrg.setOrgCode(map.get("orgCode"));
						oldOrg.setTaxCode(map.get("taxCode"));
						oldOrg.setTel(map.get("tel"));
						oldOrg.setRegistrationAmount(map.get("registrationAmount"));
						oldOrg.setAdmin(map.get("admin"));
						oldOrg.setEmail(map.get("email"));
						oldOrg.setMobile(map.get("mobile"));
						oldOrg.setPassword(map.get("password"));
						oldOrg.setOpid(map.get("opid"));
						oldOrg.setSubmitTime(map.get("submitTime"));
						oldOrg.setApproveTime(map.get("approveTime"));
						oldOrg.setQuitTime(map.get("quitTime"));
						oldOrg.setOrgCat(map.get("orgCat"));
						oldOrg.setInvitingMobile(map.get("invitingMobile"));
						oldOrg.setAuthCode(map.get("authCode"));
						oldOrg.setMobileAuthCode(map.get("mobileAuthCode"));
						oldOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
						oldOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
						oldOrg.setOrgTrustCode(map.get("orgTrustCode"));
						oldOrg.setRepCerType(map.get("repCerType"));
						oldOrg.setRepCerNum(map.get("repCerNum"));
						oldOrg.setRepCerTerm(map.get("repCerTerm"));
						oldOrg.setAgentName(map.get("agentName"));
						oldOrg.setAgentType(map.get("agentType"));
						oldOrg.setAgentCerNum(map.get("agentCerNum"));
						oldOrg.setAgentCerTerm(map.get("agentCerTerm"));
						oldOrg.setAgentEmail(map.get("agentEmail"));
						oldOrg.setRegAddr(map.get("regAddr"));
						oldOrg.setComAddr(map.get("comAddr"));
						oldOrg.setFinanceGrantNo(map.get("financeGrantNo"));
					}
					our.setOldInfo(oldOrg);
					
					Property[] propsForNew = ourBc.getUpdateInfo().getProperties();
					if(propsForNew != null){
						Map<String,String> map = PropertySerializer.fromProperties(propsForNew);
						newOrg.setOrgType(map.get("orgType"));
						newOrg.setOrgAddress(map.get("orgAddress"));
						newOrg.setOrgRep(map.get("orgRep"));
						newOrg.setEstablishDate(map.get("establishDate"));
						newOrg.setValidityTerm(map.get("validityTerm"));
						newOrg.setBusinessScope(map.get("businessScope"));
						newOrg.setRegistrationId(map.get("registrationId"));
						newOrg.setOrgCode(map.get("orgCode"));
						newOrg.setTaxCode(map.get("taxCode"));
						newOrg.setTel(map.get("tel"));
						newOrg.setRegistrationAmount(map.get("registrationAmount"));
						newOrg.setAdmin(map.get("admin"));
						newOrg.setEmail(map.get("email"));
						newOrg.setMobile(map.get("mobile"));
						newOrg.setPassword(map.get("password"));
						newOrg.setOpid(map.get("opid"));
						newOrg.setSubmitTime(map.get("submitTime"));
						newOrg.setApproveTime(map.get("approveTime"));
						newOrg.setQuitTime(map.get("quitTime"));
						newOrg.setOrgCat(map.get("orgCat"));
						newOrg.setInvitingMobile(map.get("invitingMobile"));
						newOrg.setAuthCode(map.get("authCode"));
						newOrg.setMobileAuthCode(map.get("mobileAuthCode"));
						newOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
						newOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
						newOrg.setOrgTrustCode(map.get("orgTrustCode"));
						newOrg.setRepCerType(map.get("repCerType"));
						newOrg.setRepCerNum(map.get("repCerNum"));
						newOrg.setRepCerTerm(map.get("repCerTerm"));
						newOrg.setAgentName(map.get("agentName"));
						newOrg.setAgentType(map.get("agentType"));
						newOrg.setAgentCerNum(map.get("agentCerNum"));
						newOrg.setAgentCerTerm(map.get("agentCerTerm"));
						newOrg.setAgentEmail(map.get("agentEmail"));
						newOrg.setRegAddr(map.get("regAddr"));
						newOrg.setComAddr(map.get("comAddr"));
						newOrg.setFinanceGrantNo(map.get("financeGrantNo"));
					}
					our.setNewInfo(newOrg);
					ours[i++] = our;
		}
		
		return ours;
	}

	@Override
	public void rejectUpdate(String orgId, String requestId, String operator) {
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			op.rejectUpdate(orgId, requestId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public OrgUpdateRequest submitUpdateRequest(String orgId, String requestTime, _OrgInfo org,String operator){
			OrgUpdateRequest our = null;
			OrgInfo obc = new OrgInfo();
			Property[] props = new Property[]{
					new Property("orgType", org.getOrgType()),
					new Property("orgAddress", org.getOrgAddress()),
					new Property("orgRep", org.getOrgRep()),
					new Property("establishDate", org.getEstablishDate()),
					new Property("validityTerm", org.getValidityTerm()),
					new Property("businessScope", org.getBusinessScope()),
					new Property("registrationId", org.getRegistrationId()),
					new Property("orgCode", org.getOrgCode()),
					new Property("taxCode", org.getTaxCode()),
					new Property("tel", org.getTel()),
					new Property("registrationAmount", org.getRegistrationAmount()),
					new Property("admin", org.getAdmin()),
					new Property("email", org.getEmail()),
					new Property("mobile", org.getMobile()),
					new Property("pasword", org.getPassword()),
					new Property("opid", org.getOpid()),
					new Property("submitTime", org.getSubmitTime()),
					new Property("approveTime", org.getApproveTime()),
					new Property("quitTime", org.getQuitTime()),
					new Property("orgCat", org.getOrgCat()),
					new Property("invitingMobile", org.getInvitingMobile()),
					new Property("authCode", org.getAuthCode()),
					new Property("mobileAuthCode", org.getMobileAuthCode()),
					new Property("orgCodeTerm", org.getOrgCodeTerm()),
					new Property("openApprovAuthNum", org.getOpenApprovAuthNum()),
					new Property("orgTrustCode", org.getOrgTrustCode()),
					new Property("repCerType", org.getRepCerType()),
					new Property("repCerNum", org.getRepCerNum()),
					new Property("repCerTerm", org.getRepCerTerm()),
					new Property("agentName", org.getAgentName()),
					new Property("agentCerNum", org.getAgentCerNum()),
					new Property("agentType", org.getAgentType()),
					new Property("agentCerTerm", org.getAgentCerTerm()),
					new Property("agentEmail", org.getAgentEmail()),
					new Property("regAddr", org.getRegAddr()),
					new Property("comAddr", org.getComAddr()),
					new Property("financeGrantNo", org.getFinanceGrantNo())
			};
			obc.setProperties(props);
			obc.setAttachments(org.getAttachments());
			obc.setBankAccounts(org.getBankAccounts());
			obc.setId(org.getId());
			obc.setName(org.getName());
			obc.setRole(org.getRole());
			obc.setState(org.getState());
			obc.setSummary(org.getSummary());
			obc.setTaxpayerId(org.getTaxpayerId());
			
			try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
				our = op.submitUpdateRequest(orgId, requestTime, obc);
			}catch(BlockchainException | IOException e){
				e.printStackTrace();
			}
			return our;
	}

	@Override
	public void update(String orgId, Property[] properties, String operator) {
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			op.update(orgId, properties);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public _OrgUpdateRequest getUpdateRequestById(String requestId, String operator) {
		OrgUpdateRequest ourBc = null;
		_OrgUpdateRequest our =  new _OrgUpdateRequest();
		try(OrganizationProxy op = SdkFactory.getInstance().getOrganizationProxy(operator)){
			ourBc = op.getUpdateRequestById(requestId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_OrgInfo oldOrg = new _OrgInfo();
		_OrgInfo newOrg = new _OrgInfo();
		
		FatherToChildUtils.fatherToChild(ourBc.getCurrentInfo(), oldOrg);
		FatherToChildUtils.fatherToChild(ourBc.getUpdateInfo(), newOrg);
		FatherToChildUtils.fatherToChild(ourBc, our);
		
		Property[] propsForOld = ourBc.getCurrentInfo().getProperties();
		Property[] propsForNew = ourBc.getUpdateInfo().getProperties();
		
		//System.out.println("##########################"+propsForNew.length);
		
		if(propsForOld != null){
			Map<String,String> map = PropertySerializer.fromProperties(propsForOld);
			oldOrg.setOrgType(map.get("orgType"));
			oldOrg.setOrgAddress(map.get("orgAddress"));
			oldOrg.setOrgRep(map.get("orgRep"));
			oldOrg.setEstablishDate(map.get("establishDate"));
			oldOrg.setValidityTerm(map.get("validityTerm"));
			oldOrg.setBusinessScope(map.get("businessScope"));
			oldOrg.setRegistrationId(map.get("registrationId"));
			oldOrg.setOrgCode(map.get("orgCode"));
			oldOrg.setTaxCode(map.get("taxCode"));
			oldOrg.setTel(map.get("tel"));
			oldOrg.setRegistrationAmount(map.get("registrationAmount"));
			oldOrg.setAdmin(map.get("admin"));
			oldOrg.setEmail(map.get("email"));
			oldOrg.setMobile(map.get("mobile"));
			oldOrg.setPassword(map.get("password"));
			oldOrg.setOpid(map.get("opid"));
			oldOrg.setSubmitTime(map.get("submitTime"));
			oldOrg.setApproveTime(map.get("approveTime"));
			oldOrg.setQuitTime(map.get("quitTime"));
			oldOrg.setOrgCat(map.get("orgCat"));
			oldOrg.setInvitingMobile(map.get("invitingMobile"));
			oldOrg.setAuthCode(map.get("authCode"));
			oldOrg.setMobileAuthCode(map.get("mobileAuthCode"));
			oldOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
			oldOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
			oldOrg.setOrgTrustCode(map.get("orgTrustCode"));
			oldOrg.setRepCerType(map.get("repCerType"));
			oldOrg.setRepCerNum(map.get("repCerNum"));
			oldOrg.setRepCerTerm(map.get("repCerTerm"));
			oldOrg.setAgentName(map.get("agentName"));
			oldOrg.setAgentType(map.get("agentType"));
			oldOrg.setAgentCerNum(map.get("agentCerNum"));
			oldOrg.setAgentCerTerm(map.get("agentCerTerm"));
			oldOrg.setAgentEmail(map.get("agentEmail"));
			oldOrg.setRegAddr(map.get("regAddr"));
			oldOrg.setComAddr(map.get("comAddr"));
			oldOrg.setFinanceGrantNo(map.get("financeGrantNo"));
		}
		our.setOldInfo(oldOrg);
		
		if(propsForNew != null){
			Map<String,String> map = PropertySerializer.fromProperties(propsForNew);
			newOrg.setOrgType(map.get("orgType"));
			newOrg.setOrgAddress(map.get("orgAddress"));
			newOrg.setOrgRep(map.get("orgRep"));
			newOrg.setEstablishDate(map.get("establishDate"));
			newOrg.setValidityTerm(map.get("validityTerm"));
			newOrg.setBusinessScope(map.get("businessScope"));
			newOrg.setRegistrationId(map.get("registrationId"));
			newOrg.setOrgCode(map.get("orgCode"));
			newOrg.setTaxCode(map.get("taxCode"));
			newOrg.setTel(map.get("tel"));
			newOrg.setRegistrationAmount(map.get("registrationAmount"));
			newOrg.setAdmin(map.get("admin"));
			newOrg.setEmail(map.get("email"));
			newOrg.setMobile(map.get("mobile"));
			newOrg.setPassword(map.get("password"));
			newOrg.setOpid(map.get("opid"));
			newOrg.setSubmitTime(map.get("submitTime"));
			newOrg.setApproveTime(map.get("approveTime"));
			newOrg.setQuitTime(map.get("quitTime"));
			newOrg.setOrgCat(map.get("orgCat"));
			newOrg.setInvitingMobile(map.get("invitingMobile"));
			newOrg.setAuthCode(map.get("authCode"));
			newOrg.setMobileAuthCode(map.get("mobileAuthCode"));
			newOrg.setOrgCodeTerm(map.get("orgCodeTerm"));
			newOrg.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
			newOrg.setOrgTrustCode(map.get("orgTrustCode"));
			newOrg.setRepCerType(map.get("repCerType"));
			newOrg.setRepCerNum(map.get("repCerNum"));
			newOrg.setRepCerTerm(map.get("repCerTerm"));
			newOrg.setAgentName(map.get("agentName"));
			newOrg.setAgentType(map.get("agentType"));
			newOrg.setAgentCerNum(map.get("agentCerNum"));
			newOrg.setAgentCerTerm(map.get("agentCerTerm"));
			newOrg.setAgentEmail(map.get("agentEmail"));
			newOrg.setRegAddr(map.get("regAddr"));
			newOrg.setComAddr(map.get("comAddr"));
			newOrg.setFinanceGrantNo(map.get("financeGrantNo"));
		}
		our.setNewInfo(newOrg);
		
		return our;
	}

}
