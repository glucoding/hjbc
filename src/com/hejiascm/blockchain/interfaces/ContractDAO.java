package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.hejiascm.domains.tradecontract._TradeContract;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContractTerminationRequest;

public interface ContractDAO {
	public void cancelTradeContractTerminationRequest(String contractId, String terminationId, String remarks, String operator);
	
	public String changeTradeContract(_TradeContract contract, String operator);
	
	public void confirmTradeContract(String contractId, String version, Attachment[] attas,String operator);
	
	public void confirmTradeContractChange(String contractId, String version, String operator);
	
	public void confirmTradeContractTerminationRequest(String contractId, String contractTerminationId, String operator);
	
	public void discardTradeContractVersion(String contractId, String version, String remarks, String operator);
	
	public List<_TradeContract> getTradeContracts(String query, String operator);
	
	public List<TradeContractTerminationRequest> getTradeContractTerminationRequest(String query, String operator);
	
	public void rejectTradeContract(String contractId, String version, String remarks, String operator);
	
	public void rejectTradeContractChange(String contractId, String version, String remarks, String operator);
	
	public void rejectTradeContractTerminationRequest(String contractId, String version, String remarks, String operator);
	
	public String reviseTradeContract(_TradeContract contract, String operator);
	
	public String submitTradeContract(_TradeContract contract, String oeprator);
	
	public String submitTradeContractTerminationRequest(String contractId, String terminateTime, String remarks, String operator);
}
