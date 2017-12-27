package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.hejiascm.domains.payment.PaymentCalculation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.payment.CashPaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentReason;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentSubRecord;
import com.ibm.crl.bc.hejia.sdk.payment.VoucherPaymentRecord;

public interface PaymentDAO {
	void changePaymentApplication(PaymentApplication pa, String operator);
	
	void confirmPayemntApplication(String payAppId, String remarks, String operator);
	
	String confirmPaymentRecord(String payId, String reviewRemarks, String operator);
	
	void deletePaymentRecord(String payId, String reviewRemarks, String operator);
	
	PaymentApplication getPaymentApplicationById(String id, String operator);
	
	List<PaymentApplication> getPaymentApplicationHistory(String query, String operator);
	
	PaymentApplication[] getPaymentApplications(String query, String operator);
	
	PaymentRecord getPaymentRecordById(String id, String operator);
	
	PaymentRecord[] getPaymentRecords(String query, String operator);
	
	void rejectPaymentApplication(String payAppId, String remarks, String operator);
	
	void rejectPaymentApplicationChange(String paymentApplicationChangeId, String remarks, String operator);
	
	void rejectPaymentRecord(String payId, String reviewRemarks, String operator);
	
	String submitCashPaymentRecord(CashPaymentRecord cpr, String operator);
	
	String submitReceivedCashPaymentRecord(CashPaymentRecord cpr, String operator);
	
	String submitPaymentApplication(PaymentApplication pa, String operator);
	
	String submitDirectReceivedCashPaymentRecord(CashPaymentRecord cpr,  String operator);
	
	String submitVoucherPaymentRecord(VoucherPaymentRecord vpr, String remarks, String operator);
	
	void withdrawPaymentApplication(String payAppId, String remarks, String operator);
	
	PaymentSubRecord[] computePaymentSubRecord(PaymentCalculation pc, String operator);
}
