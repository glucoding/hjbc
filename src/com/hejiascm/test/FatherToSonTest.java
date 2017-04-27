package com.hejiascm.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hejiascm.domains.org._OrgSummaryInfo;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.organization.OrgState;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;

public class FatherToSonTest {
	_OrgSummaryInfo oson =  new _OrgSummaryInfo();
	OrgSummaryInfo ofather = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ofather = new OrgSummaryInfo();
		ofather.setId("123");
		ofather.setName("xxx");
		ofather.setRole(2);
		ofather.setState(OrgState.ACTIVE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		FatherToChildUtils.fatherToChild(ofather, oson);
		System.out.println(oson.getName());
	}

}
