package com.hejiascm.domains.payment;

import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;

public class PaymentCalculation {

	public PaymentCalculation() {
		// TODO Auto-generated constructor stub
	}
	
	Currency cashAmount;
	PaymentApplication[] paymentApplications;
	
	public Currency getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(Currency cashAmount) {
		this.cashAmount = cashAmount;
	}
	public PaymentApplication[] getPaymentApplications() {
		return paymentApplications;
	}
	public void setPaymentApplications(PaymentApplication[] paymentApplications) {
		this.paymentApplications = paymentApplications;
	}
	
	

}
