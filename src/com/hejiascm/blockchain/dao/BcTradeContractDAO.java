package com.hejiascm.blockchain.dao;

import java.util.List;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Tradecontract;

public interface BcTradeContractDAO {
	public List<Tradecontract> findBcContracts();
	
	public List<Tradecontract> findAllBcContracts();
	
	public List<Tradecontract> findBcContractById(String id, String ver);
	
	public String submitBcContract(Tradecontract tc);

	public void confirmBcTradeContract(String id, String ver, String opid, String opTime);
	
	public String reviseBcContract(String id);
	
	public void rejectBcContract(Tradecontract tc);
	
	public void confirmBcContract(Tradecontract tc);
}
