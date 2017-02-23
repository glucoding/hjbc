package com.hejiascm.domains.accounting;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;

public class _PreAccounting extends PreAccounting {

	public _PreAccounting() {
		// TODO Auto-generated constructor stub
	}

	public _PreAccounting(String id, String contractId, Integer type, Goods[] goods, String orderId, String buyerId,
			String buyeeId, Currency totalAmount, Currency paidAmount, int preAccountingFinancingStatus,
			String financingApplicationId, String financingContractId, String[] singleAccountingApplicationIds,
			String notes, List<String> paymentRecordIds, int status, String startSingleAccountingApplicatoinTime,
			String endSingleAccountingApplicatoinTime, List<Operation> operations) {
		super(id, contractId, type, goods, orderId, buyerId, buyeeId, totalAmount, paidAmount,
				preAccountingFinancingStatus, financingApplicationId, financingContractId,
				singleAccountingApplicationIds, notes, paymentRecordIds, status, startSingleAccountingApplicatoinTime,
				endSingleAccountingApplicatoinTime, operations);
		// TODO Auto-generated constructor stub
	}

}
