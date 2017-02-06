package com.hejiascm.blockchain.dao;

import java.util.Set;

import com.hejiascm.domain.Receivingrecord;

public interface BcReceivingRecordDAO {
	public String submitBcReceivingRecord(Receivingrecord rr);
	
	public Set<Receivingrecord> getBcReceivingRecords(String id, String contractId, String contractVersion, String orderId, String orderFormId);
}
