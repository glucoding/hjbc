package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.Order;
import com.ibm.crl.bc.hejia.sdk.logistics.OrderStatus;
import com.ibm.crl.bc.hejia.sdk.logistics.OrderType;

public class _Order extends Order {

	public _Order() {
		// TODO Auto-generated constructor stub
	}

	public _Order(String id, String orderFormId, String contractId, String contractVersion, String deliveryStartTime,
			String deliveryEndTime, OrderType orderType, String deliveryType, String name, String description,
			Property[] properties, Goods[] goods, String address, String remarks, OrderStatus status,
			Attachment[] attachments, List<Operation> operations) {
		super(id, orderFormId, contractId, contractVersion, deliveryStartTime, deliveryEndTime, orderType, deliveryType,
				name, description, properties, goods, address, remarks, status, attachments, operations);
		// TODO Auto-generated constructor stub
	}

}
