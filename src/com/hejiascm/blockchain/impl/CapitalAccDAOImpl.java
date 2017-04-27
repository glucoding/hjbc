package com.hejiascm.blockchain.impl;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.hejiascm.blockchain.interfaces.CapitalAccDAO;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.capitalacc.BankTransferRecord;
import com.ibm.crl.bc.hejia.sdk.capitalacc.CapitalAccProxy;
import com.ibm.crl.bc.hejia.sdk.capitalacc.CapitalAccount;
import com.ibm.crl.bc.hejia.sdk.capitalacc.SubAccount;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.contract.ContractProxy;

@Component("CapitalAccDAO")
public class CapitalAccDAOImpl implements CapitalAccDAO {
	 public Logger log = Logger.getLogger("reqTime_logger"); 

	public CapitalAccDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cancelSubAccount(String subAccId, String operator) {
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			sp.cancelSubAccount(subAccId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public String createCapitalAccount(CapitalAccount cap, String operator) {
		String id = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			id = sp.createCapitalAccount(cap.getOrgId(), 
													    		cap.getIncomeAccId(), 
													    		cap.getOutlayAccId());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public String createSubAccount(SubAccount sub, String operator) {
		String id = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			id = sp.createSubAccount(sub.getOrgId(), 
													    		sub.getType(), 
													    		sub.getProperties(),
													    		sub.getBankAccountInfo());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public String createWithdrawTransfer(TransferRecord tr, String operator) {
		String id = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			id = sp.createWithdrawTransfer(tr.getAmount(), tr.getPayeeBankAccountInfo(), tr.getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void failToTransfer(String transferId, String remarks, String operator) {
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			sp.failToTransfer(transferId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public BankTransferRecord getBankTransferRecordById(String transferId, String operator) {
		BankTransferRecord btr = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			btr = sp.getBankTransferRecordByID(transferId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return btr;
	}

	@Override
	public BankTransferRecord[] getBankTransferRecords(String query, String operator) {
		BankTransferRecord[] btrs = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			btrs = sp.getBankTransferRecords(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return btrs;
	}

	@Override
	public CapitalAccount getCapitalAccountByOrgId(String orgId, String operator) {
		CapitalAccount ca = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			ca = sp.getCapitalAccountByOrgID(orgId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ca;
	}

	@Override
	public SubAccount getSubAccountById(String id, String operator) {
		SubAccount sub = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			sub = sp.getSubAccountByID(id);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return sub;
	}

	@Override
	public SubAccount[] getSubAccounts(String query, String operator) {
		SubAccount[] subs = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			subs = sp.getSubAccounts(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return subs;
	}

	@Override
	public TransferRecord getTransferRecordById(String transferId, String operator) {
		TransferRecord tr = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			tr = sp.getTransferRecordByID(transferId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return tr;
	}

	@Override
	public TransferRecord[] getTransferRecords(String query, String operator) {
		TransferRecord[] trs = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			trs = sp.getTransferRecords(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trs;
	}

	@Override
	public void processTransferRecord(String transferId, String remarks, String serial, String operator) {
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			sp.processTransferRecord(transferId, remarks, serial);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public String submitBankTransferRecord(BankTransferRecord tr, String operator) {
		String id = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			id = sp.submitBankTransferRecord(tr.getOrgId(), 
																				  tr.getTransferRecordId(), 
																				  tr.getSubAccId(), 
																				  tr.getSerial(), 
																				  tr.getOppBankAccountInfo(), 
																				  tr.getType(),
																				  tr.getAmount(), 
																				  tr.getTime(), 
																				  tr.getProperties());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public String succeedToTransfer(BankTransferRecord tr, String operator) {
		String id = null;
		try(CapitalAccProxy sp = SdkFactory.getInstance().getCapitalAccountProxy(operator)){
			id = sp.succeedToTransfer(tr.getTransferRecordId(), 
																   tr.getOrgId(), 
																   tr.getSubAccId(), 
																   tr.getSerial(), 
																   tr.getOppBankAccountInfo(), 
																   tr.getType(), 
																   tr.getAmount(), 
																   tr.getTime(), 
																   tr.getProperties(), 
																   "remarks");
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void suspendSubAccount(String subId, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSubAccount(SubAccount sub, String operator) {
		// TODO Auto-generated method stub

	}

}
