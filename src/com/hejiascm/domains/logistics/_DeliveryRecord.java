package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.DeliveryRecord;

public class _DeliveryRecord extends DeliveryRecord {

	public _DeliveryRecord() {
		// TODO Auto-generated constructor stub
	}

	public _DeliveryRecord(String id, String deliveryRecordFormId, String name, String description, String orderId,
			String contractId, String contractVersion, String buyerId, String buyerName, String sellerId,
			String sellerName, String consignerId, String consignerName, String consigneeId, String consigneeName,
			String consignerAddress, String consigneeAddress, String[] qualityRecordIds, Property[] properties,
			Goods[] goods, Currency amount, String notes, int status, Attachment[] attachments,
			List<Operation> operations) {
		super(id, deliveryRecordFormId, name, description, orderId, contractId, contractVersion, buyerId, buyerName,
				sellerId, sellerName, consignerId, consignerName, consigneeId, consigneeName, consignerAddress,
				consigneeAddress, qualityRecordIds, properties, goods, amount, notes, status, attachments, operations);
		// TODO Auto-generated constructor stub
	}

}
