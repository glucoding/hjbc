package com.hejiascm.domains.tradecontract;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.contract.Participant;
import com.ibm.crl.bc.hejia.sdk.contract.Term;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract;

public class MyTradeContract extends TradeContract {

	public MyTradeContract() {
		// TODO Auto-generated constructor stub
	}

	public MyTradeContract(String id, String contractName, String uuid, String serial, String version, Term[] terms,
			ContractType contractType, ServiceType serviceType, List<Operation> operations, String submissionTime,
			String effectiveTime, String expirationTime, String currency, Participant[] participants,
			Property[] properties, String dataEffectiveParticipant, String orderSubmitterId, Goods[] goods,
			Currency amount, String meansOfTransportation, ExecutionStatus executionStatus, ChangeStatus changeStatus,
			String previousVersion, String currentEffectiveVersion, Attachment[] attachments, String description) {
		super(id, contractName, uuid, serial, version, terms, contractType, serviceType, operations, submissionTime,
				effectiveTime, expirationTime, currency, participants, properties, dataEffectiveParticipant,
				orderSubmitterId, goods, amount, meansOfTransportation, executionStatus, changeStatus, previousVersion,
				currentEffectiveVersion, attachments, description);
		// TODO Auto-generated constructor stub
	}

}
