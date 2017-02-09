package com.hejiascm.blockchain.dao;

import java.util.List;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Tradecontract;

public interface BcTradeContractDAO {
	public List<Tradecontract> findBcContracts();
	
	public List<Tradecontract> findAllBcContracts();
	
	public List<Tradecontract> getTradeContracts(String id, String ver, String maxTime, String minTime, String parId);
	
	public String submitBcContract(Tradecontract tc);

	public void confirmBcTradeContract(String id, String ver);
	
	public String reviseBcContract(String id);
	
	public void rejectBcContract(Tradecontract tc);
	
	public void confirmBcContract(Tradecontract tc);
}
