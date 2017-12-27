package com.hejiascm.blockchain.impl;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.TradeContextDAO;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingProxy;
import com.ibm.crl.bc.hejia.sdk.user.TradeContextProxy;

@Component("TradeContextDAO")
public class TradeContextDAOImpl implements TradeContextDAO {

	public TradeContextDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] getAll(TradeContext context, String operator) {
		String[] ids = null;
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			ids = tcProxy.getAll(context);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ids;
	}

	@Override
	public Property[] getDetail(TradeContext[] contexts, String operator) {
		Property[] ps = null;
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			ps = tcProxy.getDetail(contexts);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ps;
	}

	@Override
	public void grant(TradeContext[] contexts, String[] orgIds, String operator) {
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			tcProxy.grant(contexts, orgIds);;
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void revoke(TradeContext[] contexts, String[] orgIds, String operator) {
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			tcProxy.revoke(contexts, orgIds);;
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public TradeContext[] getGranted(String orgId, String operator) {
		TradeContext[] ts = null;
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			ts = tcProxy.getGranted(orgId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ts;
	}

	@Override
	public Property[] getDetailStatistics(TradeContext[] contexts, String operator) {
		Property[] properties= null;
		try(TradeContextProxy tcProxy = SdkFactory.getInstance().getTradeContextProxy(operator)){
			properties = tcProxy.getDetailStatistics(contexts);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		return properties;
	}

}
