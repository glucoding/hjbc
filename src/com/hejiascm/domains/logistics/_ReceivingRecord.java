package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecord;

public class _ReceivingRecord extends ReceivingRecord {

	public _ReceivingRecord() {
		// TODO Auto-generated constructor stub
	}

	public _ReceivingRecord(String id, String receivingRecordFormId, String deliveryRecordId,
			String singleAccountingApplicationId, String orderId, String contractId, String contractVersion,
			String submitterId, String name, String description, String[] qualityRecordIds, Property[] properties,
			Goods[] goods, Currency amount, String notes, int status, Attachment[] attachments,
			List<Operation> operations) {
		super(id, receivingRecordFormId, deliveryRecordId, singleAccountingApplicationId, orderId, contractId,
				contractVersion, submitterId, name, description, qualityRecordIds, properties, goods, amount, notes,
				status, attachments, operations);
		// TODO Auto-generated constructor stub
	}

}
