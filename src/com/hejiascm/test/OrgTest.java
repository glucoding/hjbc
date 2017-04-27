package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.OrgnizationDAOImpl;
import com.hejiascm.blockchain.interfaces.OrganizationDAO;
import com.hejiascm.domains.org._OrgInfo;

public class OrgTest {
	OrgnizationDAOImpl oDAO;
	@Before
	public void setUp() throws Exception {
		oDAO = new OrgnizationDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		_OrgInfo[] orgs = oDAO.getOrgs("{}");
	}

}
