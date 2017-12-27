package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.blockchain.impl.OrgnizationDAOImpl;
import com.hejiascm.blockchain.interfaces.OrganizationDAO;
import com.hejiascm.domains.org._OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;

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
		ObjectMapper mapper = new ObjectMapper();
		OrgUpdateRequest[] ours = oDAO.getOrgUpdateRequests("{}", "admin");
		
		try {
			System.out.println(mapper.writeValueAsString(ours));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
