package com.hejiascm.util;

import com.ibm.crl.bc.hejia.sdk.common.TradeContext;

public class TradeContextHelper {
	private TradeContext[] tradeContexts;
	private String[] orgIds;
	
	public TradeContext[] getTradeContexts() {
		return tradeContexts;
	}
	public void setTradeContexts(TradeContext[] tradeContexts) {
		this.tradeContexts = tradeContexts;
	}
	public String[] getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(String[] orgIds) {
		this.orgIds = orgIds;
	}
	

}
