package com.hejiascm.domains.tradecontract;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.contract.Participant;
import com.ibm.crl.bc.hejia.sdk.contract.Term;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract;

public class _TradeContract extends TradeContract {

	public _TradeContract() {
		// TODO Auto-generated constructor stub
	}

	public _TradeContract(String id, String uuid, String serial, String version, Term[] terms, int contractType,
			int serviceType, List<Operation> operations, String submissionTime, String effectiveTime,
			String expirationTime, String currency, Participant[] participants, Property[] properties,
			String dataEffectiveParticipant, String orderSubmitterId, Goods[] goods, String meansOfTransportation,
			int executionStatus, int changeStatus, String previousVersion, String currentEffectiveVersion,
			Attachment[] attachments, String description) {
		super(id, uuid, serial, version, terms, contractType, serviceType, operations, submissionTime, effectiveTime,
				expirationTime, currency, participants, properties, dataEffectiveParticipant, orderSubmitterId, goods,
				meansOfTransportation, executionStatus, changeStatus, previousVersion, currentEffectiveVersion,
				attachments, description);
		// TODO Auto-generated constructor stub
	}

}
