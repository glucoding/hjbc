package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.DocStatus;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecord;

public class _ReceivingRecord extends ReceivingRecord {
	private String truckNum;
	private String driver;
	private String orgId;
	private String deliveryFillTime;
	private String consignerOrgName;
	private String consignerTel;
	private String consigneeOrgName;
	private String consigneeTel;
	private String deliveryFillName;
	private String consignerMan;
	private String consigneeMan;


	public _ReceivingRecord() {
		// TODO Auto-generated constructor stub
	}

	public _ReceivingRecord(String id, String receivingRecordFormId, String deliveryRecordId,
			String singleAccountingApplicationId, String orderId, String contractId, String contractVersion,
			String submitterId, String name, String description, String[] qualityRecordIds, Property[] properties,
			Goods[] goods, Currency amount, String remarks, DocStatus status, Attachment[] attachments,
			List<Operation> operations) {
		super(id, receivingRecordFormId, deliveryRecordId, singleAccountingApplicationId, orderId, contractId,
				contractVersion, submitterId, name, description, qualityRecordIds, properties, goods, amount,remarks,
				status, attachments, operations);
		// TODO Auto-generated constructor stub
	}

	public String getTruckNum() {
		return truckNum;
	}

	public void setTruckNum(String truckNum) {
		this.truckNum = truckNum;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getDeliveryFillTime() {
		return deliveryFillTime;
	}

	public void setDeliveryFillTime(String deliveryFillTime) {
		this.deliveryFillTime = deliveryFillTime;
	}

	public String getConsignerOrgName() {
		return consignerOrgName;
	}

	public void setConsignerOrgName(String consignerOrgName) {
		this.consignerOrgName = consignerOrgName;
	}

	public String getConsignerTel() {
		return consignerTel;
	}

	public void setConsignerTel(String consignerTel) {
		this.consignerTel = consignerTel;
	}

	public String getConsigneeOrgName() {
		return consigneeOrgName;
	}

	public void setConsigneeOrgName(String consigneeOrgName) {
		this.consigneeOrgName = consigneeOrgName;
	}

	public String getConsigneeTel() {
		return consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	public String getDeliveryFillName() {
		return deliveryFillName;
	}

	public void setDeliveryFillName(String deliveryFillName) {
		this.deliveryFillName = deliveryFillName;
	}
	
	
	public String getConsignerMan() {
		return consignerMan;
	}

	public void setConsignerMan(String consignerMan) {
		this.consignerMan = consignerMan;
	}
	


	public String getConsigneeMan() {
		return consigneeMan;
	}

	public void setConsigneeMan(String consigneeMan) {
		this.consigneeMan = consigneeMan;
	}
}
