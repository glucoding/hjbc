package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.DeliveryRecordDAOImpl;
import com.hejiascm.domains.logistics._DeliveryRecord;
import com.ibm.crl.bc.hejia.sdk.common.Currency;


public class DeliveryTest {
	DeliveryRecordDAOImpl dDAO;
	
	@Before
	public void setUp() throws Exception {
		dDAO = new DeliveryRecordDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<_DeliveryRecord> recs = dDAO.getDeliveryRecords("{}", "ppp");
		for(_DeliveryRecord rec:recs){
			System.out.println(rec.getId());
		}
	}

}
