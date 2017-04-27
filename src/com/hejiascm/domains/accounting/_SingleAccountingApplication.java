package com.hejiascm.domains.accounting;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.AccountingType;
import com.ibm.crl.bc.hejia.sdk.accounting.RecordEntry;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplicationStatus;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;

public class _SingleAccountingApplication extends SingleAccountingApplication {

	public _SingleAccountingApplication() {
		// TODO Auto-generated constructor stub
	}

	public _SingleAccountingApplication(String id, String contractId, AccountingType accountingType, Currency amount,
			Property[] properties, RecordEntry[] bills, Goods[] goods, String orderId, String buyerId, String buyerName,
			String sellerId, String sellerName, String remarks, SingleAccountingApplicationStatus status,
			List<Operation> operations, String createTime) {
		super(id, contractId, accountingType, amount, properties, bills, goods, orderId, buyerId, buyerName, sellerId,
				sellerName, remarks, status, operations, createTime);
		// TODO Auto-generated constructor stub
	}

}
