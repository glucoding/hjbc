package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.logistics.QualityRecord;

public interface QualityRecordDAO {
	List<QualityRecord> getQualityRecords(String condition, String operator);
	
	String submitQualityRecord(QualityRecord qr, String operator);
}
