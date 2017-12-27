package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.blockchain.impl.FinancingDAOImpl;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.financing.FinContractParticipant;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingExecution;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingRequest;

public class FinancingTest {
	FinancingDAOImpl fDAO;
	
	@Before
	public void setUp() throws Exception {
		fDAO = new FinancingDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*fDAO.confirmRequest("287ba1b0-4816-4376-98dc-8a38405c1c6b", "hello", "zhihong_liang@qq.com");*/
		/*FinancingRequest[] frs = fDAO.getRequests("{\"id\":\"287ba1b0-4816-4376-98dc-8a38405c1c6b\"}", "zhihong_liang@qq.com");
		for(FinancingRequest fr:frs){
			System.out.println("*****************"+fr.getApplicantOrgId());
		}*/
		ObjectMapper mapper = new ObjectMapper();
		/*FinContractParticipant fcp = new FinContractParticipant();
		FinancingContract fc = new FinancingContract();
		FinContractParticipant[] fcps = new FinContractParticipant[1];
		BankAccountInfo bai = new BankAccountInfo();
		fcp.setBankAccountInfo(bai);
		fcps[0] = fcp;
		fc.setParticipants(fcps);*/

		//fc.setSerial(serial)
		//fDAO.createContract(fc, "9235fa0b-99e9-405a-aa54-e283f0e6ba89", "zhihong_liang@qq.com");
		FinancingExecution[] fes = fDAO.getExecutions("{}", "jt03@aa.com");
		try {
			System.out.println(mapper.writeValueAsString(fes));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
