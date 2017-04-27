package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.ContractDAO;
import com.hejiascm.domains.tradecontract._TradeContract;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.contract.ContractProxy;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContractTerminationRequest;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("ContractDAO")
public class ContractDAOImpl implements ContractDAO {

	public ContractDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cancelTradeContractTerminationRequest(String contractId, String terminationId, String remarks, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String changeTradeContract(_TradeContract contract, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void confirmTradeContract(String contractId, String version, String operator) {
		try(ContractProxy cp = SdkFactory.getInstance().getContractProxy(operator)){
			cp.confirmTradeContract(contractId, version);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void confirmTradeContractChange(String contractId, String version, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmTradeContractTerminationRequest(String contractId, String contractTerminationId, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void discardTradeContractVersion(String contractId, String version, String remarks, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<_TradeContract> getTradeContracts(String query, String operator) {
		List<TradeContract> cons = null;
		List<_TradeContract> _cons = null;
		try(ContractProxy cp = SdkFactory.getInstance().getContractProxy(operator)){
			cons = cp.getTradeContracts(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		if(cons == null){
			return null;
		}
		
		_cons = new ArrayList<_TradeContract>();
		for(TradeContract con : cons){
			_TradeContract _con = new _TradeContract();
			
			FatherToChildUtils.fatherToChild(con, _con);
			
			Property[] props = con.getProperties();
			if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				_con.setName(map.get("name"));
				_con.setOrgId(map.get("orgId"));
				_con.setOrgName(map.get("orgName"));
			}
			_cons.add( _con);
		}
		
		return _cons;
	}

	@Override
	public List<TradeContractTerminationRequest> getTradeContractTerminationRequest(String query, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rejectTradeContract(String contractId, String version, String remarks, String operator) {
		try(ContractProxy cp = SdkFactory.getInstance().getContractProxy(operator)){
			cp.rejectTradeContract(contractId, version, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}		
	}

	@Override
	public void rejectTradeContractChange(String contractId, String version, String remarks, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rejectTradeContractTerminationRequest(String contractId, String version, String remarks, String operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String reviseTradeContract(_TradeContract contract, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String submitTradeContract(_TradeContract contract, String operator) {
		Property[] props = new Property[]{
				new Property("orgId", contract.getOrgId()),
				new Property("orgName", contract.getOrgName()),
				new Property("name", contract.getName())
		};
		
		String res = null;
		try(ContractProxy cp = SdkFactory.getInstance().getContractProxy(operator)){
			res = cp.submitTradeContract(contract.getContractName(), 
																		  contract.getSerial(), 
																		  contract.getTerms(),
																		  contract.getContractType(), 
																		  contract.getServiceType(),
																		  contract.getEffectiveTime(),
																		  contract.getExpirationTime(), 
																		  contract.getCurrency(), 
																		  contract.getParticipants(), 
																		  props, 
																		  contract.getDataEffectiveParticipant(), 
																		  contract.getOrderSubmitterId(), 
																		  contract.getGoods(),
																		  contract.getAmount(),
																		  contract.getMeansOfTransportation(), 
																		  contract.getAttachments(), 
																		  "remarks", 
																		  contract.getDescription());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public String submitTradeContractTerminationRequest(String contractId, String terminateTime, String remarks, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

}
