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
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract.ChangeStatus;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract.ContractType;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract.ExecutionStatus;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract.ServiceType;

public class _TradeContract extends TradeContract {
	private String orgId;
	private String orgName;
	private String name;

	public _TradeContract() {
		// TODO Auto-generated constructor stub
	}

	public _TradeContract(String id, String contractName, String uuid, String serial, String version, Term[] terms,
			ContractType contractType, ServiceType serviceType, List<Operation> operations, String submissionTime,
			String effectiveTime, String expirationTime, String currency, Participant[] participants,
			Property[] properties, String dataEffectiveParticipant, String orderSubmitterId, Goods[] goods,
			Currency amount, String meansOfTransportation, ExecutionStatus executionStatus, ChangeStatus changeStatus,
			String previousVersion, String currentEffectiveVersion, Attachment[] attachments, String description)  {
		super(id, contractName, uuid, serial, version, terms, contractType, serviceType, operations, submissionTime,
				effectiveTime, expirationTime, currency, participants, properties, dataEffectiveParticipant,
				orderSubmitterId, goods, amount, meansOfTransportation, executionStatus, changeStatus, previousVersion,
				currentEffectiveVersion, attachments, description);
		// TODO Auto-generated constructor stub
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
