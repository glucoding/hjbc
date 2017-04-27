package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.ReceivingRecordDAOImpl;
import com.hejiascm.domains.logistics._ReceivingRecord;


public class ReceivingTest {
	ReceivingRecordDAOImpl rDAO;
	@Before
	public void setUp() throws Exception {
		rDAO = new ReceivingRecordDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*List<_ReceivingRecord> rs = rDAO.getReceivingRecords("{\"id\": \"03cd9302-634c-40d6-914d-d292397bacf5\"}", "ppp");
		for(_ReceivingRecord r: rs){
			System.out.println(r.getId());
		}*/
	}

}
