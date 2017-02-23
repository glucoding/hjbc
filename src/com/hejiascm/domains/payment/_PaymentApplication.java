package com.hejiascm.domains.payment;

import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.contract.Participant;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;

public class _PaymentApplication extends PaymentApplication {

	public _PaymentApplication() {
		// TODO Auto-generated constructor stub
	}

	public _PaymentApplication(String id, String version, String contractId, Participant[] participants,
			String submitterId, String submitTime, int paymentType, String[] paymentBackgroundIds,
			Currency paymentTotal, Double cashRatio, Double voucherRatio, String remarks, int status) {
		super(id, version, contractId, participants, submitterId, submitTime, paymentType, paymentBackgroundIds,
				paymentTotal, cashRatio, voucherRatio, remarks, status);
		// TODO Auto-generated constructor stub
	}

}
