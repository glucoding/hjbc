package com.hejiascm.blockchain.dao;

import java.util.Set;

import com.hejiascm.domain.Deliveryrecord;

public interface BcDeliveryRecordDAO {
	public Set<Deliveryrecord> getBcDeliveryRecords(String id); 
	
	public String submitBcDeliveryRecord(Deliveryrecord dr);
}
