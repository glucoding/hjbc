package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplicationStatus;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecord;

public interface SingleAccountingApplicationDAO {
	/*此类实现为大宗新增部分*/
	void changeSingleAccountingApplicationStatus(String singleApplicationId, SingleAccountingApplicationStatus status, String operator);
	
	List<SingleAccountingApplication> getSingleAccountingApplications(String queryCondition, String operator);
	
	String submitSingleAccountingApplication(SingleAccountingApplication saa, String operator);
	
	String submitSingleAccountingApplicationByReceivingRecord(ReceivingRecord rr, String operator);
	
	void withdrawSingleAccountingApplications(String saaId, String remarks, String operator);
}
