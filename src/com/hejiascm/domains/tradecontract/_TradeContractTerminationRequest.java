package com.hejiascm.domains.tradecontract;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.common.Operation;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContractTerminationRequest;

public class _TradeContractTerminationRequest extends TradeContractTerminationRequest {

	public _TradeContractTerminationRequest() {
		// TODO Auto-generated constructor stub
	}

	public _TradeContractTerminationRequest(String id, String contractId, String submitterId,
			List<Operation> operations, String terminateTime, String[] confirmedParticipants,
			ContractTerminationStatus status, String remarks) {
		super(id, contractId, submitterId, operations, terminateTime, confirmedParticipants, status, remarks);
		// TODO Auto-generated constructor stub
	}

}
