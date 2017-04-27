package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.hejiascm.domains.logistics._DeliveryRecord;

public interface DeliveryRecordDAO {
	public List<_DeliveryRecord> getDeliveryRecords(String query, String operator);
	
	public String submitDeliveryRecord(_DeliveryRecord drec, String operator);
	
	void updateDeliveryRecord(_DeliveryRecord drec, String operator);
}
