package com.hejiascm.domains.accounting;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.Invoice;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;

public class _Invoice extends Invoice {

	public _Invoice() {
		// TODO Auto-generated constructor stub
	}

	public _Invoice(String id, String serial, String[] preAccountingApplicationIds, String[] orderIds,
			String contractId, String contractVersion, String invoiceInfo, Attachment[] attachments,
			String[] confirmedParticipants, int status, String createTime, String buyerName,
			String buyerTaxpayerRecognizeNumber, String buyerAddress, String buyerTel, String buyerBank,
			String buyerAccount, Goods[] goods, Currency amount, Double taxRate, Currency tax, Currency total,
			Double leviedInTotalNumber, String leviedInTotalWord, String sellerName,
			String sellerTaxpayerRecognizeNumber, String sellerAddress, String sellerTel, String sellerBank,
			String sellerAccount, int invoiceType, String invoiceName, String invoiceDescription,
			String invoiceOtherContent, String notes, String payeeName, String recheckerName, String drawerName,
			List<Operation> operations) {
		super(id, serial, preAccountingApplicationIds, orderIds, contractId, contractVersion, invoiceInfo, attachments,
				confirmedParticipants, status, createTime, buyerName, buyerTaxpayerRecognizeNumber, buyerAddress,
				buyerTel, buyerBank, buyerAccount, goods, amount, taxRate, tax, total, leviedInTotalNumber,
				leviedInTotalWord, sellerName, sellerTaxpayerRecognizeNumber, sellerAddress, sellerTel, sellerBank,
				sellerAccount, invoiceType, invoiceName, invoiceDescription, invoiceOtherContent, notes, payeeName,
				recheckerName, drawerName, operations);
		// TODO Auto-generated constructor stub
	}

}
