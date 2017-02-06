package com.hejiascm.blockchain.dao;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;
import com.hejiascm.util.EncodeTool;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.MockSdkFactory;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.organization.BankAccountEntry;
import com.ibm.crl.bc.hejia.sdk.organization.OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrganizationProxy;
import com.ibm.crl.bc.hejia.sdk.organization.Role;

@Component("BcOrgInfoDAO")
public class BcOrgInfoDAOImpl implements BcOrgInfoDAO {
	public List<Orginfo> findBcSummaryOrginfos(){
		// get the organization proxy object for 平台管理员
        OrganizationProxy adminOrgProxy = null;
        OrgSummaryInfo[] orgList = null;
        Orginfo org = null;
        List<Orginfo> orginfos = new ArrayList<Orginfo>();
		try {
			adminOrgProxy = SdkFactory.instance.getOrganizationProxy("admin");
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
		
		/**
		 * Test
		 */
		orginfos = new ArrayList<Orginfo>();
		for(int i = 0; i < 2; i++){
			org = new Orginfo();
			org.setId(MiscTool.getRandomString(10));
			org.setName(MiscTool.getRandomString(10));
			org.setRole(MiscTool.getRandomInt(1, 10));
			org.setState(MiscTool.getRandomInt(1,10));
			
			orginfos.add(org);	
		}
		
		return orginfos;
	}
	
	public List<Orginfo> findAllBcOrginfos(){
		return new ArrayList<Orginfo>();
	}
	
	public Orginfo findBcOrginfoById(String id){
		OrganizationProxy adminOrgProxy = null;
        OrgInfo orgBc = null;
        Orginfo org = null;
//		try {
//			adminOrgProxy = SdkFactory.instance.getOrganizationProxy("admin");
//			orgBc = adminOrgProxy.getOrgById(id);
//		} catch (BlockchainException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//Retrieving the properties
//		Property[] ps = orgBc.getProperties();
//		String[] ops = {"orgType", "orgAddress", "orgRep", "establishDate", "validityTerm", "businessScope",
//						"registrationId", "orgCode", "taxCode", "tel", "registrationAmount", "admin", "email",
//						"mobile", "password", "opid", "iniSubTime", "approveTime", "quitTime"};
//		org = new Orginfo();
//		String methodName = null;
//		Method m = null;
//		Class clazz = org.getClass(); 
//		for(int i = 0; i < ps.length; i++){
//			for(int j = 0; j < ops.length; j++){
//				if(ps[i].getName().equals(ops[j])){
//					methodName = "set" + ops[j].substring(0, 1).toUpperCase() + ops[j].substring(1);
//					try{
//						if(ops[j].equals("registrationAmount")){
//							m = clazz.getDeclaredMethod(methodName, Integer.class);
//							m.invoke(org, Integer.parseInt(ps[i].getValue()));
//						}else if(ops[j].equals("iniSubTime") || ops[j].equals("approveTime") || ops[j].equals("quitTime")){
//							m = clazz.getDeclaredMethod(methodName, Timestamp.class);
//							m.invoke(org, Timestamp.valueOf(ps[i].getValue()));
//						}else{
//							m = clazz.getDeclaredMethod(methodName, String.class);
//							m.invoke(org, ps[i].getValue()); 
//						}
//					}catch(NoSuchMethodException e){
//						e.printStackTrace();
//					}catch(SecurityException e){
//						e.printStackTrace();
//					}catch(Exception e){
//						e.printStackTrace();
//					}
//				}
//			}   
//		}
//		
//		//Setting the common attributes
//		org.setName(orgBc.getName());
//		org.setTaxpayerId(orgBc.getTaxpayerId());
//		org.setId(orgBc.getId());
//		org.setRole(orgBc.getRole());
//		org.setSummary(orgBc.getSummary());
//		org.setState(orgBc.getState().getValue());
//		
//		//Setting bankAccounts and attchements
//		Set<Orginfoattachment> oias = new LinkedHashSet<Orginfoattachment>();
//		Attachment[] atts = orgBc.getAttachments();
//		for(int i = 0; i < atts.length; i++){
//			Orginfoattachment oia = new Orginfoattachment();
//			oia.setAddress(atts[i].getUri());
//			oia.setDescription(atts[i].getDescription());
//			oia.setOrginfo(org);
//			oias.add(oia);
//		}
//		org.setOrginfoattachments(oias);
//		
//		Set<Bankaccountinfo> bais = new LinkedHashSet<Bankaccountinfo>();
//		BankAccountEntry[] baeBc = orgBc.getBankAccounts();
//		for(int i = 0; i < baeBc.length; i++){
//			Bankaccountinfo bai = new Bankaccountinfo();
//			bai.setBankAccount(baeBc[i].getBankAccountInfo().getBankAccount());
//			bai.setBankId(baeBc[i].getBankAccountInfo().getBankId());
//			bai.setBankName(baeBc[i].getBankAccountInfo().getBankName());
//			bai.setFriendlyName(baeBc[i].getFriendlyName());
//			bai.setOrgFullName(baeBc[i].getBankAccountInfo().getOrgFullName());
//			bai.setOrginfo(org);
//			bai.setType(baeBc[i].getType());
//			bais.add(bai);
//		}
//		org.setBankaccountinfos(bais);
		
		/**
		 * Test
		 */
		org = new Orginfo();
		LinkedHashSet<Bankaccountinfo> bais = new LinkedHashSet<Bankaccountinfo>();
		for(int i = 0; i < 2; i++){
			Bankaccountinfo bai = new Bankaccountinfo();
			bai.setBankAccount(MiscTool.getRandomString(10));
			bai.setBankId(MiscTool.getRandomString(10));
			bai.setBankName(MiscTool.getRandomString(10));
			bai.setFriendlyName(MiscTool.getRandomString(10));
			bai.setId(MiscTool.getRandomString(10));
			bai.setOrgFullName(MiscTool.getRandomString(10));
			bai.setType(MiscTool.getRandomString(10));
			
			bais.add(bai);
		}
		Set<Orginfoattachment> oias = new LinkedHashSet<Orginfoattachment>();
		for(int i = 0; i < 2; i++){
			Orginfoattachment oia = new Orginfoattachment();
			oia.setAddress(MiscTool.getRandomString(10));
			
			oias.add(oia);
		}
		
		org.setAdmin(MiscTool.getRandomString(10));
		org.setApproveTime(new Timestamp(System.currentTimeMillis()));
		org.setBankaccountinfos(bais);
		org.setBusinessScope(MiscTool.getRandomString(10));
		org.setEmail(MiscTool.getRandomString(10));
		org.setEstablishDate(new Timestamp(System.currentTimeMillis()));
		org.setId(MiscTool.getRandomString(10));
		org.setIniSubTime(new Timestamp(System.currentTimeMillis()));
		org.setMobile(MiscTool.getRandomString(10));
		org.setName(MiscTool.getRandomString(10));
		org.setOpid(MiscTool.getRandomString(10));
		org.setOrgAddress(MiscTool.getRandomString(10));
		org.setOrgCode(MiscTool.getRandomString(10));
		org.setOrginfoattachments(oias);
		org.setOrgRep(MiscTool.getRandomString(10));
		org.setOrgType(MiscTool.getRandomString(10));
		org.setPassword(MiscTool.getRandomString(10));
		org.setQuitTime(new Timestamp(System.currentTimeMillis()));
		org.setRegistrationAmount(MiscTool.getRandomInt(10, 100));
		org.setRegistrationId(MiscTool.getRandomString(10));
		org.setRole(MiscTool.getRandomInt(1, 10));
		org.setState(MiscTool.getRandomInt(1, 10));
		org.setSummary(MiscTool.getRandomString(10));
		org.setTaxCode(MiscTool.getRandomString(10));
		org.setTaxpayerId(MiscTool.getRandomString(10));
		org.setTel(MiscTool.getRandomString(10));
		org.setValidityTerm(MiscTool.getRandomString(10));
		
		return org;
	}
	
	public void registerBcOrginfo(Orginfo org){
		// get the organization proxy object for 平台管理员
        OrganizationProxy adminOrgProxy = null;
		try {
			adminOrgProxy = SdkFactory.instance.getOrganizationProxy("admin");
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
                new Property("establishDate", org.getEstablishDate().toString()),
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
                new Property("iniSubTime", org.getIniSubTime().toString()),
                new Property("approveTime", org.getApproveTime().toString()),
                new Property("quitTime", org.getQuitTime().toString())
        };
          
        BankAccountEntry[] bae = new BankAccountEntry[10];
        int i = 0;
        for(Bankaccountinfo b : org.getBankaccountinfos()){
        	//BankAccountInfo bai = new BankAccountInfo(b.getOrgFullName(),b.getBankAccount(), b.getBankName(), b.getBankId());
        	//bae[i] = new BankAccountEntry(b.getFriendlyName(), b.getType(), bai);
        }
        String adminUserName = org.getAdmin();//"org_12345_admin";

        // register an organization
        Attachment[] atts = new Attachment[org.getOrginfoattachments().size()];
        int j = 0;
        for(Orginfoattachment o : org.getOrginfoattachments()){
        	atts[j] = new Attachment(
                            o.getAddress(),
                            o.getDescription(),
                            EncodeTool.digestFile(o.getAddress(), "SHA-256"));
        	j++;
        }
        
        try {
			OrgRegisterResponse res = adminOrgProxy.register(
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
			adminOrgProxy = SdkFactory.instance.getOrganizationProxy("admin");
			adminOrgProxy.deactivate(id);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
