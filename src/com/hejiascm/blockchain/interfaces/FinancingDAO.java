package com.hejiascm.blockchain.interfaces;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.financing.ExpectedRepayment;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingExecution;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingIntention;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingRequest;
import com.ibm.crl.bc.hejia.sdk.financing.ReceivableTransferRequest;
import com.ibm.crl.bc.hejia.sdk.financing.RepaymentDetail;

public interface FinancingDAO {
	void closeRequest(String requestId, String remarks, String operator);
	
	void confirmContract(String fconId, String remarks, Attachment[] attas, String operator);
	
	void confirmLoanRecord(String fconId, String transferId, String operator);
	
	String confirmRepaymentRecord(String fconId, String transferId, String operator);
	
	void confirmRequest(String requestId, String remarks, Attachment[] attas, String operator);
	
	String createContract(FinancingContract fc, String finInstId, String operator);
	
	String createLoanRecord(TransferRecord tr, String finConId, String operator);
	
	String createRepaymentRecord(TransferRecord tr, String finConId, String operator);
	
	String createRepaymentTransfer(TransferRecord tr, String finConId, String operator);
	
	String createRequest(FinancingRequest fr, String operator);
	
	void discloseRequest(String requestId, String remarks, String operator);
	
	FinancingContract getContractById(String fconId, String operator);
	
	FinancingContract[] getContracts(String query, String operator);
	
	ExpectedRepayment getExpectedRepayment(String finConId, String expectedTime, String operator);
	
	FinancingExecution getExecutionByContractId(String fconId, String operator);
	
	FinancingExecution[] getExecutions(String query, String operator);
	
	TransferRecord[] getLoanRecords(String fconId, String operator);
	
	TransferRecord[] getRepaymentRecords(String fconId, String operator);
	
	FinancingRequest getRequestById(String requestId, String operator);
	
	FinancingRequest[] getRequests(String query, String operator);
	
	void rejectContract(String fconId, String remarks, String operator);
	
	void rejectRequest(String requestId, String remarks, String operator);
	
	void terminateRepayment(String fconId, String remarks, String operator);
	
	void updateContractParticipant(String fconId, String name, BankAccountInfo bankInfo, String operator);
	
	/*
	 * New addition after 4.7
	 */
	void cancelIntention(String finIntentionId, String remarks, String operator);
	
	void cancelRequest(String finReqId, String remarks, String operator);
	
	String createIntention(FinancingIntention intension, String operator);
	
	String createIntentionWithReceivableTransferRequest(FinancingIntention intention, String operator);
	
	String createReceivableTransferRequest(ReceivableTransferRequest rtr, String operator);
	
	FinancingIntention getIntentionById(String finIntentionId, String operator);
	
	FinancingIntention[] getIntentions(String query, String operator);
	
	FinancingIntention[] getIntentionsByFinRequest(String finReqId, String operator);
	
	ReceivableTransferRequest getReceivableTransferRequestById(String id, String operator);
	
	ReceivableTransferRequest[] getReceivableTransferRequests(String condition, String operator);
	
	void rejectReceivableTransferRequest(String id, String remarks, String operator);
	
	void selectIntention(String finIntentionId, String remarks, String operator);
	
	void unselectIntention(String finIntentionId, String remarks, String operator);
	
	void updateIntention(FinancingIntention fi, String operator);
	
	void confirmReceivableTransferRequest(java.lang.String id, Attachment[] attachments, java.lang.String remark, String operator) ;
	
	void withdrawReceivableTransferRequest(java.lang.String id, Attachment[] attachments, java.lang.String remark,String operator);
	
	void confirmRepaymentRecordWithDetail(String finConId, String transferRecordId, RepaymentDetail rd, String operator);

	void rejectLoanRecord(String finConId, String transferRecId, String remarks, String operator);
}
