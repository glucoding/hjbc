package com.hejiascm.blockchain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;
import com.hejiascm.util.Constants;
import com.hejiascm.util.EncodeTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.organization.BankAccountEntry;
import com.ibm.crl.bc.hejia.sdk.organization.OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrganizationProxy;
import com.ibm.crl.bc.hejia.sdk.organization.Role;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("BcOrgInfoDAO")
public class BcOrgInfoDAOImpl implements BcOrgInfoDAO {
	
	public List<Orginfo> findBcSummaryOrginfos(){
		// get the organization proxy object for 平台管理员
        OrganizationProxy adminOrgProxy = null;
        OrgSummaryInfo[] orgList = null;
        Orginfo org = null;
        List<Orginfo> orginfos = new ArrayList<Orginfo>();
		try {
			adminOrgProxy = SdkFactory.bcInstance.getOrganizationProxy("admin");
			orgList = adminOrgProxy.getOrgList();
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(OrgSummaryInfo osi : orgList){
			org = new Orginfo();
			org.setId(osi.getId());
			org.setName(osi.getName());
			org.setRole(osi.getRole());
			org.setState(osi.getState().getValue());
			
			orginfos.add(org);
		}
		
		return orginfos;
	}
	
	public List<Orginfo> findAllBcOrginfos(){
		OrganizationProxy adminOrgProxy = null;
        OrgInfo[] orgBcs = null;
        List<Orginfo> orgs =  new ArrayList<Orginfo>();;
		try {
			adminOrgProxy = SdkFactory.bcInstance.getOrganizationProxy("admin");
			orgBcs = adminOrgProxy.getOrgs("{}");
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Orginfo org = null;
		OrgInfo orgBc = null;
		for(int i = 0; i < orgBcs.length-1; i++ ){
			org  = new Orginfo();
			orgBc = orgBcs[i];
			
			//Retrieving the properties
			Property[] ps = orgBc.getProperties();
		    HashMap<String,String> map = (HashMap<String, String>) PropertySerializer.fromProperties(ps);
			org.setOrgType(map.get("orgType"));
			org.setOrgAddress(map.get("orgAddress"));
			org.setOrgType(map.get("orgType"));
		    System.out.println(org.getEstablishDate());
			org.setEstablishDate(map.get("establishDate"));
		    org.setValidityTerm(map.get("validityTerm"));
		    org.setBusinessScope(map.get("businessScope"));
		    org.setRegistrationId(map.get("registrationId"));
		    org.setOrgCode(map.get("orgCode"));
		    org.setTaxCode(map.get("taxCode"));
		    org.setTel(map.get("tel"));
		   
		    try{
		    		 if(!map.get("registrationAmount").equals("null") || map.get("registrationAmount")!= null){
		    			 org.setRegistrationAmount(Integer.valueOf(map.get("registrationAmount")));
		    		 }else{
		    			 org.setRegistrationAmount(0);
		    		 }
		    	}catch(NumberFormatException e){
		    		org.setRegistrationAmount(0);
		    	}catch(Exception e){
		    		org.setRegistrationAmount(0);
		    	}
		    
		    org.setAdmin(map.get("admin"));
		    org.setEmail(map.get("email"));
		    org.setMobile(map.get("mobile"));
		    org.setPassword(map.get("password"));
		    org.setOpid(map.get("opid"));
		    org.setIniSubTime(map.get("iniSubTime"));
		    org.setApproveTime(map.get("approveTime"));
		    org.setQuitTime(map.get("quitTime"));
		    org.setOrgCat(map.get("orgCat"));
		    org.setInvitingMobile(map.get("invitingMobile"));
		    org.setAuthCode(map.get("authCode"));
		    org.setMobileAuthCode(map.get("mobileAuthCode"));
		    org.setOrgCodeTerm(map.get("orgCodeTerm"));
		    org.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
		    org.setOrgTrustCode(map.get("orgTrustCode"));
		    org.setOrgRep(map.get("orgRep"));
		    org.setRepCerType(map.get("repCerType"));
		    org.setRepCerNum(map.get("repCerNum"));
		    org.setRepCerTerm(map.get("repCerTerm"));
		    org.setAgentName(map.get("agentName"));
		    org.setAgentType(map.get("agentType"));
		    org.setAgentCerNum(map.get("agentCerNum"));
		    org.setAgentCerTerm(map.get("agentCerTerm"));
		    org.setAgentEmail(map.get("agentEmail"));
		    org.setRegAddr(map.get("regAddr"));
		    org.setComAddr(map.get("comAddr"));
		    
			//Setting the common attributes
			org.setName(orgBc.getName());
			org.setTaxpayerId(orgBc.getTaxpayerId());
			org.setId(orgBc.getId());
			org.setRole(orgBc.getRole());
			org.setSummary(orgBc.getSummary());
			org.setState(orgBc.getState().getValue());
			
			//Setting bankAccounts and attchements
			Set<Orginfoattachment> oias = new LinkedHashSet<Orginfoattachment>();
			Attachment[] atts = orgBc.getAttachments();
			for(int j = 0; j < atts.length; j++){
				Orginfoattachment oia = new Orginfoattachment();
				oia.setAddress(atts[j].getUri());
				oia.setDescription(atts[j].getDescription());
				oia.setOrginfo(org);
				oias.add(oia);
			}
			org.setOrginfoattachments(oias);
			
			Set<Bankaccountinfo> bais = new LinkedHashSet<Bankaccountinfo>();
			BankAccountEntry[] baeBc = orgBc.getBankAccounts();
			System.out.println(baeBc.length);
			System.out.println(baeBc[0].getBankAccountInfo().getBankName());
			for(int k = 0; k < baeBc.length; k++){
				Bankaccountinfo bai = new Bankaccountinfo();
				bai.setBankAccount(baeBc[k].getBankAccountInfo().getBankAccount());
				bai.setBankId(baeBc[k].getBankAccountInfo().getBankId());
				bai.setBankName(baeBc[k].getBankAccountInfo().getBankName());
				bai.setFriendlyName(baeBc[k].getFriendlyName());
				bai.setOrgFullName(baeBc[k].getBankAccountInfo().getOrgFullName());
				bai.setOrginfo(org);
				bai.setType(baeBc[k].getType());
				bais.add(bai);
			}
			org.setBankaccountinfos(bais);
			orgs.add(org);
		}
		
		return orgs;
	}
	
	public Orginfo findBcOrginfoById(String id){
		OrganizationProxy adminOrgProxy = null;
        OrgInfo orgBc = null;
        Orginfo org = null;
		try {
			adminOrgProxy = SdkFactory.bcInstance.getOrganizationProxy("admin");
			orgBc = adminOrgProxy.getOrgById(id);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		org = new Orginfo();
		
		//Retrieving the properties
		Property[] ps = orgBc.getProperties();
	    HashMap<String,String> map = (HashMap<String, String>) PropertySerializer.fromProperties(ps);
		org.setOrgType(map.get("orgType"));
		org.setOrgAddress(map.get("orgAddress"));
		org.setOrgType(map.get("orgType"));
	    System.out.println(org.getEstablishDate());
		org.setEstablishDate(map.get("establishDate"));
	    org.setValidityTerm(map.get("validityTerm"));
	    org.setBusinessScope(map.get("businessScope"));
	    org.setRegistrationId(map.get("registrationId"));
	    org.setOrgCode(map.get("orgCode"));
	    org.setTaxCode(map.get("taxCode"));
	    org.setTel(map.get("tel"));
	   
	    try{
	    		 if(!map.get("registrationAmount").equals("null") || map.get("registrationAmount")!= null){
	    			 org.setRegistrationAmount(Integer.valueOf(map.get("registrationAmount")));
	    		 }else{
	    			 org.setRegistrationAmount(0);
	    		 }
	    	}catch(NumberFormatException e){
	    		org.setRegistrationAmount(0);
	    	}catch(Exception e){
	    		org.setRegistrationAmount(0);
	    	}
	    
	    org.setAdmin(map.get("admin"));
	    org.setEmail(map.get("email"));
	    org.setMobile(map.get("mobile"));
	    org.setPassword(map.get("password"));
	    org.setOpid(map.get("opid"));
	    org.setIniSubTime(map.get("iniSubTime"));
	    org.setApproveTime(map.get("approveTime"));
	    org.setQuitTime(map.get("quitTime"));
	    org.setOrgCat(map.get("orgCat"));
	    org.setInvitingMobile(map.get("invitingMobile"));
	    org.setAuthCode(map.get("authCode"));
	    org.setMobileAuthCode(map.get("mobileAuthCode"));
	    org.setOrgCodeTerm(map.get("orgCodeTerm"));
	    org.setOpenApprovAuthNum(map.get("openApprovAuthNum"));
	    org.setOrgTrustCode(map.get("orgTrustCode"));
	    org.setOrgRep(map.get("orgRep"));
	    org.setRepCerType(map.get("repCerType"));
	    org.setRepCerNum(map.get("repCerNum"));
	    org.setRepCerTerm(map.get("repCerTerm"));
	    org.setAgentName(map.get("agentName"));
	    org.setAgentType(map.get("agentType"));
	    org.setAgentCerNum(map.get("agentCerNum"));
	    org.setAgentCerTerm(map.get("agentCerTerm"));
	    org.setAgentEmail(map.get("agentEmail"));
	    org.setRegAddr(map.get("regAddr"));
	    org.setComAddr(map.get("comAddr"));
	    
		//Setting the common attributes
		org.setName(orgBc.getName());
		org.setTaxpayerId(orgBc.getTaxpayerId());
		org.setId(orgBc.getId());
		org.setRole(orgBc.getRole());
		org.setSummary(orgBc.getSummary());
		org.setState(orgBc.getState().getValue());
		
		//Setting bankAccounts and attchements
		Set<Orginfoattachment> oias = new LinkedHashSet<Orginfoattachment>();
		Attachment[] atts = orgBc.getAttachments();
		for(int i = 0; i < atts.length; i++){
			Orginfoattachment oia = new Orginfoattachment();
			oia.setAddress(atts[i].getUri());
			oia.setDescription(atts[i].getDescription());
			oia.setOrginfo(org);
			oias.add(oia);
		}
		org.setOrginfoattachments(oias);
		
		Set<Bankaccountinfo> bais = new LinkedHashSet<Bankaccountinfo>();
		BankAccountEntry[] baeBc = orgBc.getBankAccounts();
		System.out.println(baeBc.length);
		System.out.println(baeBc[0].getBankAccountInfo().getBankName());
		for(int i = 0; i < baeBc.length; i++){
			Bankaccountinfo bai = new Bankaccountinfo();
			bai.setBankAccount(baeBc[i].getBankAccountInfo().getBankAccount());
			bai.setBankId(baeBc[i].getBankAccountInfo().getBankId());
			bai.setBankName(baeBc[i].getBankAccountInfo().getBankName());
			bai.setFriendlyName(baeBc[i].getFriendlyName());
			bai.setOrgFullName(baeBc[i].getBankAccountInfo().getOrgFullName());
			bai.setOrginfo(org);
			bai.setType(baeBc[i].getType());
			bais.add(bai);
		}
		org.setBankaccountinfos(bais);
		
		return org;
	}
	
	public OrgRegisterResponse registerBcOrginfo(Orginfo org){
		// get the organization proxy object for 平台管理员
        OrganizationProxy adminOrgProxy = null;
        OrgRegisterResponse res = null;
		try {
			adminOrgProxy = SdkFactory.bcInstance.getOrganizationProxy("admin");
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // fill in organization information
        String name = org.getName();
        String taxpayerId = org.getTaxpayerId();
        int role = Role.BROKER.getValue() | Role.SUPPLIER.getValue();
        String summary = org.getSummary();
        
        Property[] properties =   new Property[] {
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
                new Property("registrationAmount", String.valueOf(org.getRegistrationAmount())),
                new Property("admin", org.getAdmin()),
                new Property("email", org.getEmail()),
                new Property("mobile", org.getMobile()),
                new Property("password", org.getPassword()),
                new Property("opid", org.getOpid()),
                new Property("iniSubTime", org.getIniSubTime()),
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
                new Property("agentType", org.getAgentType()),
                new Property("agentCerNum", org.getAgentCerNum()),
                new Property("agentCerTerm", org.getAgentCerTerm()),
                new Property("agentEmail", org.getAgentEmail()),
                new Property("regAddr", org.getRegAddr()),
                new Property("comAddr", org.getComAddr())
        };
          
        BankAccountEntry[] bae = new BankAccountEntry[org.getBankaccountinfos().size()];
        int i = 0;
        for(Bankaccountinfo b : org.getBankaccountinfos()){
        	BankAccountInfo bai = new BankAccountInfo(b.getOrgFullName(),b.getBankAccount(), b.getBankName(), b.getBankId());
        	System.out.println(bai.getBankName());
        	bae[i] = new BankAccountEntry(b.getFriendlyName(), b.getType(), bai);
        	System.out.println(bae[i].getFriendlyName());
        	i++;
        }
        String adminUserName = org.getAdmin();

        // register an organization
        Attachment[] atts = new Attachment[org.getOrginfoattachments().size()];
        int j = 0;
        for(Orginfoattachment o : org.getOrginfoattachments()){
        	atts[j] = new Attachment(
        			        o.getAddress(),
                            o.getDescription(),
                            o.getHash());
        	j++;
        }
        
        try {
			res = adminOrgProxy.register(
			        name,
			        taxpayerId,
			        role,
			        summary,
			        properties,
			        bae,
			        adminUserName,
			        atts);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(res != null){
        	return res;
        }
        
        return null;
	}
	
	/**
	 * 冻结区块链上的企业
	 * @param Organization id
	 * @return void
	 */
	public void deactivateBcOrg(String id){
		// get the organization proxy object for 平台管理员
        OrganizationProxy adminOrgProxy = null;
		try {
			adminOrgProxy = SdkFactory.bcInstance.getOrganizationProxy("admin");
			adminOrgProxy.deactivate(id);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
