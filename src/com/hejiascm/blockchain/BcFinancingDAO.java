package com.hejiascm.blockchain;

import java.util.List;

import com.hejiascm.domain.Financingcontract;
import com.hejiascm.domain.Financingexecution;
import com.hejiascm.domain.Financingrequest;
import com.hejiascm.domain.Transferrecord;

public interface BcFinancingDAO {
	public void bcConfirmContract(String finConId, String remarks);
	
	public void bcConfirmLoanRecord(String finConId, String tranRecId);
	
	public void bcConfirmRequest(String finReqId, String remarks);
	
	public String bcCreateContract(Financingcontract fiCon);
	
	public String bcCreateLoanRecord(Transferrecord record, String finConId);
	
	public String bcCreateRepaymentRecord(Transferrecord record, String finConId);
	
	public String createRequest(Financingrequest fr);
	
	public void bcDiscloseRequest(String finReqId, String remarks);
	
	public Financingcontract bcGetContractById(String finconId);
	
	public List<Financingcontract> bcGetContracts(String query);
	
	public Financingexecution bcGetExecutionByContractId(String finconId);
	
	public List<Financingexecution> bcGetExecutions(String query);
	
	public List<Transferrecord> bcGetLoanRecords(String finconId);
	
	public List<Transferrecord> bcGetRepaymentRecords(String finconId);
	
	public Financingrequest bcGetRequestById(String finreqId);
	
	public List<Financingrequest> bcGetRequests(String query);
	
	public void bcRejectContract(String finconId, String remarks);
	
	public void bcRejectRequest(String finreqId, String remarks);
	
	//public  void terminateRepayment
	//public void updateContractParticipant
	public Financingexecution getFE();
	public Transferrecord getRecord();
}