package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.PreAccountingDAOImpl;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;

public class TriggerPreAccountingTest {
	PreAccountingGeneratorTask generator = null;
	PreAccountingDAOImpl praDAO;
	List<PreAccounting> pras = null;
	
	@Before
	public void setUp() throws Exception {
		generator = new PreAccountingGeneratorTask("qrx66791@uzrip.com");////tsa51556@rcasd.com
		praDAO = new PreAccountingDAOImpl();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		generator.run();
		/*pras = praDAO.getPreAccountings("{}", "zhihong_liang@qq.com");
		for(PreAccounting pra : pras){
			System.out.println(pra.getId());
		}*/
	}

}
