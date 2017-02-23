package com.hejiascm.domains.logistics;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.QualityRecord;

public class _QualityRecord extends QualityRecord {

	public _QualityRecord() {
		// TODO Auto-generated constructor stub
	}

	public _QualityRecord(String id, String qualityFormId, int type, String orderId, String contractId,
			String contractVersion, String inspector, String inspectionTime, String name, String description,
			Property[] properties, Goods goods, String notes, int status, Attachment[] attachments,
			List<Operation> operations) {
		super(id, qualityFormId, type, orderId, contractId, contractVersion, inspector, inspectionTime, name,
				description, properties, goods, notes, status, attachments, operations);
		// TODO Auto-generated constructor stub
	}

}
