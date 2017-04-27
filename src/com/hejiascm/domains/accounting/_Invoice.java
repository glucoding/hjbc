package com.hejiascm.domains.accounting;

import com.ibm.crl.bc.hejia.sdk.accounting.Invoice;
import com.ibm.crl.bc.hejia.sdk.accounting.InvoiceParticipant;
import com.ibm.crl.bc.hejia.sdk.accounting.InvoiceType;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;

public class _Invoice extends Invoice {

	public _Invoice() {
		// TODO Auto-generated constructor stub
	}

	public _Invoice(String id, String serial, String contractId, String contractVersion, InvoiceParticipant buyerInfo,
			InvoiceParticipant sellerInfo, String[] preAccountingApplicationIds, String[] orderIds,
			InvoiceType invoiceType, String name, String description, String issueTime, Attachment[] attachments,
			Goods[] goods, Currency amount, Double taxRate, Currency taxAmount, Currency totalAmount, String remarks,
			Property[] properties) {
		super(id, serial, contractId, contractVersion, buyerInfo, sellerInfo, preAccountingApplicationIds, orderIds,
				invoiceType, name, description, issueTime, attachments, goods, amount, taxRate, taxAmount, totalAmount,
				remarks, properties);
		// TODO Auto-generated constructor stub
	}

}
