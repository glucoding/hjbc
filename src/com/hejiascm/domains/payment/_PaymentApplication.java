package com.hejiascm.domains.payment;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Agreement;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentReason;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentStatus;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentSubRecord;

public class _PaymentApplication extends PaymentApplication {

	public _PaymentApplication() {
		// TODO Auto-generated constructor stub
	}

	public _PaymentApplication(String id, String version, String contractId, PaymentReason paymentReason,
			TradeContext[] paymentContexts, Currency paymentTotal, Currency paidAmount,
			List<PaymentSubRecord> paymentSubRecords, Double cashAmount, Double voucherAmount,
			PaymentStatus paymentStatus, Agreement agreement) {
		super(id, version, contractId, paymentReason, paymentContexts, paymentTotal, paidAmount, paymentSubRecords,
				cashAmount, voucherAmount, paymentStatus, agreement);
		// TODO Auto-generated constructor stub
	}

}
