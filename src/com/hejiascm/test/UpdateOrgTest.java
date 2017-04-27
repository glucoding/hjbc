package com.hejiascm.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.OrgnizationDAOImpl;
import com.hejiascm.blockchain.interfaces.OrganizationDAO;
import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;

public class UpdateOrgTest {
	OrganizationDAO orgDAO;

	@Before
	public void setUp() throws Exception {
		orgDAO = new OrgnizationDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		OrgUpdateRequest o = orgDAO.getUpdateRequestById("e9b6640b-dab5-4283-92ef-31060ef7f961", "admin");
		System.out.println(o.getUpdateInfo().getProperty("agentName"));
	}

}
