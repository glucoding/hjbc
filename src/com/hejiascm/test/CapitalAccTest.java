package com.hejiascm.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.CapitalAccDAOImpl;

public class CapitalAccTest {
	CapitalAccDAOImpl capDAO;
	
	@Before
	public void setUp() throws Exception {
		capDAO = new CapitalAccDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//System.out.println(capDAO.getCapitalAccountByOrgId("64faa618-bff6-489e-833c-8025c1a492ff", "zhihong_liang@qq.com").getIncomeAccId());
		System.out.println(capDAO.getSubAccountById("15d904f9-ed3d-4a42-a9a1-2acf03d15e98", "zhihong_liang@qq.com").getBankAccountInfo().getBankAccount());
	}

}
