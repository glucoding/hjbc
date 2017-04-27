package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingFinancingStatus;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Property;

public interface PreAccountingDAO {
	PreAccounting sumAndRange(PreAccounting preAccounting, SingleAccountingApplication[] singleAccountingApplications, String operator);
	
	List<PreAccounting> getPreAccountings(String query, String operator);
	
	void confirmPreAccounting(String id, String remarks, String operator);
	
	void payPreAccounting(String preAccountingId, Currency amount, String pyamentRecordId, String operator);
	
	String submitPreAccounting(PreAccounting pa, String operator);
	
	void updatePreAccountingFinancingStatus(String preId, PreAccountingFinancingStatus preFinStatus, String finAppId, String finConId, String operator);
	
	void updatePreAccountingProperties(String id, Property[] properties, String operator);
	
	void withdrawPreAccounting(String preId, String remarks, String operator);
	
	void generatePreAccounting(String operator);
}
