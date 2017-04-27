package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.PreAccountingDAO;
import com.hejiascm.test.PreAccountingGeneratorTask;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingFinancingStatus;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingProxy;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Property;

@Component("PreAccountingDAO")
public class PreAccountingDAOImpl implements PreAccountingDAO {

	public PreAccountingDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PreAccounting sumAndRange(PreAccounting preAccounting,
			SingleAccountingApplication[] singleAccountingApplications, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PreAccounting> getPreAccountings(String query, String operator) {
		List<PreAccounting> preAccs = null;
		try(PreAccountingProxy paProxy = SdkFactory.getInstance().getPreAccountingProxy(operator)){
			preAccs= paProxy.getPreAccountings(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return preAccs;
	}

	@Override
	public void payPreAccounting(String preAccountingId, Currency amount, String pyamentRecordId, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String submitPreAccounting(PreAccounting pa, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePreAccountingFinancingStatus(String preId, PreAccountingFinancingStatus preFinStatus,
			String finAppId, String finConId, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePreAccountingProperties(String id, Property[] properties, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawPreAccounting(String preId, String remarks, String operator) {
		try(PreAccountingProxy paProxy = SdkFactory.getInstance().getPreAccountingProxy(operator)){
			paProxy.withdrawPreAccounting(preId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public void confirmPreAccounting(String id, String remarks, String operator) {
		try(PreAccountingProxy paProxy = SdkFactory.getInstance().getPreAccountingProxy(operator)){
			paProxy.confirmPreAccounting(id, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void generatePreAccounting(String operator){
		PreAccountingGeneratorTask generator = null;
		generator = new PreAccountingGeneratorTask(operator);
		generator.run();
	}

}
