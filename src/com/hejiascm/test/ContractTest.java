package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.ContractDAOImpl;
import com.hejiascm.domains.tradecontract._TradeContract;

import junit.framework.Assert;

public class ContractTest {
	ContractDAOImpl conDAO = null;
	
	@Before
	public void setUp() throws Exception {
		conDAO = new ContractDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*List<_TradeContract> cons = conDAO.getTradeContracts("{\"id\":\"3803c7bc-d038-4890-adf5-140056757bc4\"}", "ppp");
		for(_TradeContract con: cons){
			System.out.println(con.getId());
			System.out.println(con.getVersion());
		}
		Assert.assertNotNull(cons);*/
		conDAO.confirmTradeContract("b469615e-fea9-4c4a-8bc6-a0a2ac2e5600", "0.1.0","qkm10672@psoxs.com" );
	}
}
