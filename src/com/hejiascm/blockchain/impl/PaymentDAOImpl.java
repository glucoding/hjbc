package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.PaymentDAO;
import com.hejiascm.domains.payment.PaymentCalculation;
import com.ibm.crl.bc.hejia.sdk.GlobalConf;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingProxy;
import com.ibm.crl.bc.hejia.sdk.payment.CashPaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentProxy;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentReason;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentSubRecord;
import com.ibm.crl.bc.hejia.sdk.payment.VoucherPaymentRecord;

@Component("PaymentDAO")
public class PaymentDAOImpl implements PaymentDAO {

	public PaymentDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changePaymentApplication(PaymentApplication pa, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirmPayemntApplication(String payAppId, String remarks, String operator) {
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payProxy.confirmPaymentApplication(payAppId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public String confirmPaymentRecord(String payId, String reviewRemarks, String operator) {
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payProxy.confirmPaymentRecord(payId, reviewRemarks);
			return "1";
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
			return "0";
		}
	}

	@Override
	public void deletePaymentRecord(String payId, String reviewRemarks, String operator) {
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payProxy.deletePaymentRecord(payId, reviewRemarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public PaymentApplication getPaymentApplicationById(String id, String operator) {
		PaymentApplication pa = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			pa = payProxy.getPaymentApplicationById(id);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return pa;
	}

	@Override
	public List<PaymentApplication> getPaymentApplicationHistory(String query, String operator) {
		List<PaymentApplication> pas = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			pas = payProxy.getPaymentApplicationHistory(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return pas;
	}

	@Override
	public PaymentApplication[] getPaymentApplications(String query, String operator) {
		PaymentApplication[] pas = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			pas = payProxy.getPaymentApplications(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return pas;
	}
	

	@Override
	public PaymentRecord getPaymentRecordById(String id, String operator) {
		PaymentRecord pr = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			pr = payProxy.getPaymentRecordById(id);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public PaymentRecord[] getPaymentRecords(String query, String operator) {
		PaymentRecord[] prs = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			prs = payProxy.getPaymentRecords(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return prs;
	}

	@Override
	public void rejectPaymentApplication(String payAppId, String remarks, String operator) {
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payProxy.rejectPaymentApplication(payAppId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void rejectPaymentApplicationChange(String paymentApplicationChangeId, String remarks, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rejectPaymentRecord(String payId, String reviewRemarks, String operator) {
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payProxy.rejectPaymentRecord(payId, reviewRemarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public String submitPaymentApplication(PaymentApplication pa, String operator) {
		String payId = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payId = payProxy.submitPaymentApplication(pa.getContractId(),
																									  pa.getPaymentReason(),
																									  pa.getPaymentContexts(), 
																									  pa.getPaymentTotal(), 
																									  pa.getCashAmount(),
																									  pa.getVoucherAmount(), 
																									  pa.getAgreement().getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return payId;
	}
	
	@Override
	public String submitCashPaymentRecord(CashPaymentRecord cpr, String operator) {
		String payId = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payId = payProxy.submitCashPaymentRecord(cpr.getBankTransferSerial(), 
					                                                                                cpr.getPayerBankAccount(), 
					                                                                                cpr.getPayeeBankAccount(), 
					                                                                                cpr.getContractId(), 
					                                                                                cpr.getAmount(), 
					                                                                                cpr.getPaymentTime(), 
					                                                                                cpr.getPaymentSubRecords(), 
					                                                                                cpr.getAttachments(),
					                                                                                cpr.getAgreement().getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return payId;
	}
	
	@Override
	public String submitReceivedCashPaymentRecord(CashPaymentRecord cpr, String operator) {
		String payId = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			payId = payProxy.submitReceivedCashPaymentRecord(cpr.getBankTransferSerial(), 
					                                                                                cpr.getPayerBankAccount(), 
					                                                                                cpr.getPayeeBankAccount().getBankAccount(),
					                                                                                cpr.getPayeeBankAccount(), 
					                                                                                cpr.getContractId(), 
					                                                                                cpr.getAmount(), 
					                                                                                cpr.getPaymentTime(), 
					                                                                                cpr.getPaymentSubRecords(), 
					                                                                                cpr.getAttachments(),
					                                                                                cpr.getAgreement().getRemarks(),
					                                                                                new Property[]{});
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return payId;
	}

	@Override
	public String submitVoucherPaymentRecord(VoucherPaymentRecord vpr, String remarks, String operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void withdrawPaymentApplication(String payAppId, String remarks, String operator) {
		// TODO Auto-generated method stub

	}

	@Override
	public PaymentSubRecord[] computePaymentSubRecord(PaymentCalculation pc, String operator) {
		PaymentSubRecord[] psrs = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			psrs = payProxy.computePaymentSubRecord(pc.getCashAmount(), pc.getPaymentApplications());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return psrs;
	}

	@Override
	public String submitDirectReceivedCashPaymentRecord(CashPaymentRecord cpr,String operator) {
		String result = null;
		try(PaymentProxy payProxy = SdkFactory.getInstance().getPaymentProxy(operator)){
			result = payProxy.submitDirectReceivedCashPaymentRecord(cpr.getContractId(),
																																	 PaymentReason.PRE_ACCOUNTING,
																																	 cpr.getBankTransferSerial(), 
																																	 cpr.getPayerBankAccount(), 
																																	 cpr.getPayeeBankAccount().getBankAccount(), 
																																	 cpr.getPayeeBankAccount(), 
																																	 cpr.getAmount(), 
																																	 cpr.getPaymentTime(), 
																																	 cpr.getPaymentSubRecords(), 
																																	 cpr.getAttachments(), 
																																	 cpr.getAgreement().getRemarks(), 
																																	 new Property[0]);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return result;
	}
}
