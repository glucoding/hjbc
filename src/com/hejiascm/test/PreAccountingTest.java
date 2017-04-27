package com.hejiascm.test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.PreAccountingDAOImpl;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;

public class PreAccountingTest {
	PreAccountingDAOImpl praDAO;

	@Before
	public void setUp() throws Exception {
		praDAO = new PreAccountingDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		praDAO.confirmPreAccounting("09451980-8308-4e55-94ba-d9f10912552b", "helloWorld", "zhihong_liang@qq.com");
		List<PreAccounting> pras = praDAO.getPreAccountings("{}", "zhihong_liang@qq.com");
		for(PreAccounting pra : pras){
			System.out.println(pra.getId() + ":" + pra.getStatus());
		}
	}

}
