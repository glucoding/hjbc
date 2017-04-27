package com.hejiascm.domains.accounting;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.AccountingType;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingFinancingStatus;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingStatus;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;

public class _PreAccounting extends PreAccounting {

	public _PreAccounting() {
		// TODO Auto-generated constructor stub
	}

	public _PreAccounting(String id, String accountingSerialNumber, String contractId, AccountingType type,
			Goods[] goods, String orderId, String buyerId, String sellerId, Currency totalAmount, Currency paidAmount,
			PreAccountingFinancingStatus preAccountingFinancingStatus, String financingApplicationId,
			String financingContractId, String[] singleAccountingApplicationIds, String remarks,
			List<String> paymentRecordIds, PreAccountingStatus status, String startSingleAccountingApplicationTime,
			String endSingleAccountingApplicationTime, List<Operation> operations) {
		super(id, accountingSerialNumber, contractId, type, goods, orderId, buyerId, sellerId, totalAmount, paidAmount,
				preAccountingFinancingStatus, financingApplicationId, financingContractId,
				singleAccountingApplicationIds, remarks, paymentRecordIds, status, startSingleAccountingApplicationTime,
				endSingleAccountingApplicationTime, operations);
		// TODO Auto-generated constructor stub
	}

	public _PreAccounting(String id, String accountingSerialNumber, String contractId, AccountingType preAccountingType,
			Goods[] goods, String orderId, String buyerId, String sellerId, Currency totalAmount, Currency paidAmount,
			PreAccountingFinancingStatus preAccountingFinancingStatus, String financingApplicationId,
			String financingContractId, String[] singleAccountingApplicationIds, String remarks,
			List<String> paymentRecordIds, PreAccountingStatus status, String startSingleAccountingApplicationTime,
			String endSingleAccountingApplicationTime, List<Operation> operations, Property[] properties) {
		super(id, accountingSerialNumber, contractId, preAccountingType, goods, orderId, buyerId, sellerId, totalAmount,
				paidAmount, preAccountingFinancingStatus, financingApplicationId, financingContractId,
				singleAccountingApplicationIds, remarks, paymentRecordIds, status, startSingleAccountingApplicationTime,
				endSingleAccountingApplicationTime, operations, properties);
		// TODO Auto-generated constructor stub
	}

}
