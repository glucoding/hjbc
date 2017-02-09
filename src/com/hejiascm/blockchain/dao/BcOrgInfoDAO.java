package com.hejiascm.blockchain.dao;

import java.util.List;
import java.util.Set;

import com.hejiascm.domain.Orginfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;

public interface BcOrgInfoDAO {
	public List<Orginfo> findBcSummaryOrginfos();
	
	//IBM尚未提供全取对象接口
	public List<Orginfo> findAllBcOrginfos();
	
	public Orginfo findBcOrginfoById(String id);
	
	public OrgRegisterResponse registerBcOrginfo(Orginfo org);
	
	public void deactivateBcOrg(String id);
}
