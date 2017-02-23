package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.LogisticsRecord;

public class _LogisticsRecord extends LogisticsRecord {

	public _LogisticsRecord() {
		// TODO Auto-generated constructor stub
	}

	public _LogisticsRecord(String id, String logisticsFormId, String orderId, String contractId,
			String contractVersion, String precedence, int precedenceType, String buyerId, String buyeeId,
			String consignerId, String consigneeId, String generateTime, String name, String description,
			Property[] properties, Goods[] goods, String notes, Attachment[] attachments, List<Operation> operations) {
		super(id, logisticsFormId, orderId, contractId, contractVersion, precedence, precedenceType, buyerId, buyeeId,
				consignerId, consigneeId, generateTime, name, description, properties, goods, notes, attachments,
				operations);
		// TODO Auto-generated constructor stub
	}

}
