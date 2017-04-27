package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.hejiascm.domains.logistics._ReceivingRecord;

public interface ReceivingRecordDAO {
	public List<_ReceivingRecord> getReceivingRecords(String query, String operator);
	
	public String submitRecevingRecord(_ReceivingRecord rrec, String operator);
	
	void updateReceivingRecord(_ReceivingRecord rrec, String operator);
}
