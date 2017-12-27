package com.hejiascm.blockchain.interfaces;

import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;

public interface TradeContextDAO {
	String[] getAll(TradeContext context, String operator);
	
	Property[] getDetail(TradeContext[] contexts, String operator);
	
	void grant(TradeContext[] contexts, String[] orgIds, String operator);
	
	void revoke(TradeContext[] contexts, String[] orgIds, String operator);
	
	TradeContext[] getGranted(String orgId, String operator);
	
	Property[] getDetailStatistics(TradeContext[] contexts, String operator);
}
