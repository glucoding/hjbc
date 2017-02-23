package com.hejiascm.blockchain;

import java.util.Set;

import com.hejiascm.domain.Deliveryrecord;

public interface BcDeliveryRecordDAO {
	public Set<Deliveryrecord> getBcDeliveryRecords(String id, String contractId, String contractVersion, String orderId); 
	
	public String submitBcDeliveryRecord(Deliveryrecord dr);
}
