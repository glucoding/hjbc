package com.hejiascm.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.TradeContextDAOImpl;
import com.hejiascm.blockchain.interfaces.TradeContextDAO;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;
import com.ibm.crl.bc.hejia.sdk.common.TradeContextType;

public class TradeContextTest {
	TradeContextDAO tcDAO;
	TradeContext tc;
	String orgId;
	String operator;
	
	@Before
	public void setUp() throws Exception {
		tcDAO = new TradeContextDAOImpl();
		tc = new TradeContext();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//operator = "waq88945@rcasd.com";
		//orgId = "179419e4-ebef-4571-8c2f-c159f4503ade";
		operator = "cfw52967@rcasd.com";//医院账号
		//orgId = "7eaa1b37-62a0-4412-8e4e-8edd9d2be1f9";
		orgId =  "f2d5c08b-997b-4612-9a1e-8685f080b7f3";//金融机构ID
		tc.setId("b5b44474-5992-467c-9b8b-f0085d8bca90"/*" 7420015f-2d7b-4b57-9d9c-4d6f28638d41"*/);
		tc.setType(TradeContextType.PRE_ACCOUNTING);
		//tcDAO.grant(tc, orgId, operator);
		System.out.println("Grant finished");
		
		
		operator = "cfw52967@rcasd.com";//"vkj90563@rcasd.com";
		//com.ibm.crl.bc.hejia.sdk.common.Property[] ps = tcDAO.getDetail(tc, operator);
//		for(com.ibm.crl.bc.hejia.sdk.common.Property p: ps){
//			System.out.println(p.getName());
//			System.out.println(p.getValue());
//		}
	}

}
