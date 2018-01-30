package com.hejiascm.blockchain.impl;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.FinancingDAO;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.financing.ExpectedRepayment;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingExecution;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingIntention;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingProxy;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingRequest;
import com.ibm.crl.bc.hejia.sdk.financing.ReceivableTransferRequest;
import com.ibm.crl.bc.hejia.sdk.financing.RepaymentDetail;

@Component("FinancingDAO")
public class FinancingDAOImpl implements FinancingDAO {

	public FinancingDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void closeRequest(String requestId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.closeRequest(requestId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void confirmContract(String fconId, String remarks, Attachment[] attas, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmContract(fconId, remarks, attas);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void confirmLoanRecord(String fconId, String transferId, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmLoanRecord(fconId, transferId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public String confirmRepaymentRecord(String fconId, String transferId, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmRepaymentRecord(fconId, transferId);
			return "1";
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
			return "0";
		}

	}

	@Override
	public void confirmRequest(String requestId, String remarks, Attachment[] attas, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmRequest(requestId, remarks, attas);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public String createContract(FinancingContract fc, String finInstId, String operator) {
		String finConId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finConId = finProxy.createContract(fc.getSerial(), 
																					 fc.getFinancingType(), 
																					 fc.getName(), 
																					 fc.getDescription(), 
																					 fc.getFinancingRequestId(), 
																					 finInstId,
																					 fc.getTradeContext(),
																					 fc.getTradeContractId(), 
																					 fc.getTerms(), 
																					 fc.getIntention(), 
																					 fc.getFinancingAmount(), 
																					 fc.getFee(), 
																					 fc.getFinancingRate(), 
																					 fc.getOverdueRate(), 
																					 fc.getLendingDate(), 
																					 fc.getRepaymentDate(), 
																					 fc.getPrepaymentAllowed(),
																					 fc.getRepaymentMethod(),
																					 fc.getRepaymentPlan(), 
																					 fc.getAttachments(),
																					 fc.getEffectiveTime(), 
																					 fc.getRemarks(), 
																					 fc.getProperties());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return finConId;
	}

	@Override
	public String createLoanRecord(TransferRecord tr, String finConId, String operator) {
		String trId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			trId = finProxy.createLoanRecord(finConId, 
																	 tr.getSerial(), 
																	 tr.getAmount(), 
																	 tr.getTime(), 
																	 tr.getPayerOrgId(), 
																	 tr.getPayerBankAccountInfo(), 
																	 tr.getPayeeOrgId(), 
																	 tr.getPayeeBankAccountInfo(), 
																	 tr.getAttachments(), 
																	 tr.getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trId;
	}

	@Override
	public String createRepaymentRecord(TransferRecord tr, String finConId, String operator) {
		String trId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			trId = finProxy.createRepaymentRecord(finConId, 
																	 tr.getSerial(), 
																	 tr.getAmount(), 
																	 tr.getTime(), 
																	 tr.getPayerOrgId(), 
																	 tr.getPayerBankAccountInfo(), 
																	 tr.getPayeeOrgId(), 
																	 tr.getPayeeBankAccountInfo(), 
																	 tr.getAttachments(), 
																	 tr.getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trId;
	}

	@Override
	public String createRepaymentTransfer(TransferRecord tr, String finConId, String operator) {
		String trId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.createRepaymentTransfer(finConId, 
																	 tr.getAmount(), 
																	 tr.getPayeeOrgId(),
																	 tr.getPayeeBankAccountInfo(), 
																	 tr.getRemarks());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trId;
	}

	@Override
	public String createRequest(FinancingRequest fr, String operator) {
		String reqId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			reqId = finProxy.createRequest(fr.getFinancingType(), 
															   fr.getTradeContext(), 
															   fr.getTradeContractId(), 
															   fr.getTradeOverview(), 
															   fr.getTradeAmount(), 
															   fr.getFinancingAmount(), 
															   fr.getFee(), 
															   fr.getIntention(), 
															   fr.getFinancingRate(), 
															   fr.getOverdueRate(), 
															   fr.getLendingDate(), 
															   fr.getRepaymentDate(), 
															   fr.getPrepaymentAllowed(), 
															   fr.getRepaymentMethod(), 
															   fr.getAttachments(), 
															   fr.getProperties(), 
															   "remarks",
															   fr.getEffectiveBiddingTime());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		return reqId;
	}

	@Override
	public void discloseRequest(String requestId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.discloseRequest(requestId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public FinancingContract getContractById(String fconId, String operator) {
		FinancingContract fc = null; 
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fc = finProxy.getContractById(fconId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		return fc;
	}

	@Override
	public FinancingContract[] getContracts(String query, String operator) {
		FinancingContract[] fcs = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fcs = finProxy.getContracts(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fcs;
	}

	@Override
	public FinancingExecution getExecutionByContractId(String fconId, String operator) {
		FinancingExecution fe = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fe = finProxy.getExecutionByContractID(fconId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fe;
	}

	@Override
	public FinancingExecution[] getExecutions(String query, String operator) {
		FinancingExecution[] fes = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fes = finProxy.getExecutions(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fes;
	}

	@Override
	public TransferRecord[] getLoanRecords(String fconId, String operator) {
		TransferRecord[] trs = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			trs = finProxy.getLoanRecords(fconId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trs;
	}

	@Override
	public TransferRecord[] getRepaymentRecords(String fconId, String operator) {
		TransferRecord[] trs = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			trs = finProxy.getRepaymentRecords(fconId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return trs;
	}

	@Override
	public FinancingRequest getRequestById(String requestId, String operator) {
		FinancingRequest fr = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fr = finProxy.getRequestById(requestId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fr;
	}

	@Override
	public FinancingRequest[] getRequests(String query, String operator) {
		FinancingRequest[] frs = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			frs = finProxy.getRequests(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return frs;
	}

	@Override
	public void rejectContract(String fconId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.rejectContract(fconId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public void rejectRequest(String requestId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.rejectRequest(requestId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public void terminateRepayment(String fconId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.terminateRepayment(fconId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void updateContractParticipant(String fconId, String name, BankAccountInfo bankInfo, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.updateContractParticipant(fconId, name, bankInfo);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void cancelIntention(String finIntentionId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.cancelIntention(finIntentionId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void cancelRequest(String finReqId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.cancelRequest(finReqId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public String createIntention(FinancingIntention intention, String operator) {
		String intentionId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			intentionId = finProxy.createIntention(intention.getFinancingRequestId(), 
																   intention.getDescription(),
																   intention.getFinancingAmount(), 
																   intention.getFee(), 
																   intention.getFinancingRate(), 
																   intention.getOverdueRate(), 
																   intention.getLendingDate(), 
																   intention.getRepaymentDate(), 
																   intention.getPrepaymentAllowed(), 
																   intention.getRepaymentMethod(), 
																   intention.getRepaymentPlan(), 
																   intention.getEffectiveTime(), 
																   intention.getProperties());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return intentionId;
	}

	@Override
	public FinancingIntention getIntentionById(String finIntentionId, String operator) {
		FinancingIntention fi = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fi = finProxy.getIntentionById(finIntentionId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fi;
	}

	@Override
	public FinancingIntention[] getIntentions(String query, String operator) {
		FinancingIntention[] fis = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fis = finProxy.getIntentions(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fis;
	}

	@Override
	public FinancingIntention[] getIntentionsByFinRequest(String finReqId, String operator) {
		FinancingIntention[] fis = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			fis = finProxy.getIntentionsByFinRequest(finReqId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return fis;
	}

	@Override
	public void selectIntention(String finIntentionId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.selectIntention(finIntentionId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void unselectIntention(String finIntentionId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.unselectIntention(finIntentionId, remarks);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateIntention(FinancingIntention fi, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.updateIntention(fi.getId(), 
																   fi.getDescription(), 
																   fi.getFinancingAmount(), 
																   fi.getFee(), 
																   fi.getFinancingRate(), 
																   fi.getOverdueRate(), 
																   fi.getLendingDate(), 
																   fi.getRepaymentDate(), 
																   fi.getPrepaymentAllowed(), 
																   fi.getRepaymentMethod(), 
																   fi.getRepaymentPlan(), 
																   fi.getEffectiveTime(), 
																   fi.getProperties());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public ExpectedRepayment getExpectedRepayment(String finConId, String expectedTime, String operator) {
		ExpectedRepayment erp = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			erp = finProxy.getExpectedRepayment(finConId, expectedTime);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};
		
		return erp;
	}

	@Override
	public String createReceivableTransferRequest(ReceivableTransferRequest rtr, String operator) {
		String result = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			result = finProxy.createReceivableTransferRequest(rtr.getSerial(), 
																												 rtr.getName(), 
																												 rtr.getDescription(), 
																												 rtr.getFinancingIntentionId(),
																												 rtr.getTransferFromOrg(), 
																												 rtr.getTransferToOrg(), 
																												 rtr.getPayerOrg(), 
																												 rtr.getApplicationOrg(),
																												 rtr.getTradeContext(), 
																												 rtr.getTradeContractId(), 
																												 rtr.getTradeAmount(), 
																												 rtr.getAttachments(), 
																												 rtr.getProperties());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};
		return result;
	}

	@Override
	public ReceivableTransferRequest getReceivableTransferRequestById(String id, String operator) {
		ReceivableTransferRequest rtr = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			rtr = finProxy.getReceivableTransferRequestById(id);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};
		return rtr;
	}

	@Override
	public ReceivableTransferRequest[] getReceivableTransferRequests(String condition, String operator) {
		ReceivableTransferRequest[] rtrs = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			rtrs = finProxy.getReceivableTransferRequests(condition);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};
		return rtrs;
	}

	@Override
	public void rejectReceivableTransferRequest(String id, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.rejectReceivableTransferRequest(id, null, remarks);//第二个参数attahment[]设为null
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};	
	}

	@Override
	public String createIntentionWithReceivableTransferRequest(FinancingIntention intention, String operator) {
		String intentionId = null;
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			intentionId = finProxy.createIntention(intention.getFinancingRequestId(), 
																   intention.getDescription(),
																   intention.getFinancingAmount(), 
																   intention.getFee(), 
																   intention.getFinancingRate(), 
																   intention.getOverdueRate(), 
																   intention.getLendingDate(), 
																   intention.getRepaymentDate(), 
																   intention.getPrepaymentAllowed(), 
																   intention.getRepaymentMethod(), 
																   intention.getRepaymentPlan(), 
																   intention.getEffectiveTime(), 
																   intention.getProperties(),
																   intention.getReceivableTransferRequired());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return intentionId;
	}

	@Override
	public void confirmReceivableTransferRequest(String id, Attachment[] attachments, String remark, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmReceivableTransferRequest(id, attachments, remark);//第二个参数attahment[]设为null
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};		
	}

	@Override
	public void withdrawReceivableTransferRequest(String id, Attachment[] attachments, String remark, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.withdrawReceivableTransferRequest(id, attachments, remark);//第二个参数attahment[]设为null
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};	
	}

	@Override
	public void confirmRepaymentRecordWithDetail(String finConId, String transferRecordId, RepaymentDetail rd,
			String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.confirmRepaymentRecordWithDetail(finConId, transferRecordId, rd);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};	
	}

	@Override
	public void rejectLoanRecord(String finConId, String transferRecId, String remarks, String operator) {
		try(FinancingProxy finProxy = SdkFactory.getInstance().getFinancingProxy(operator)){
			finProxy.rejectLoanRecord(finConId, transferRecId, remarks);;
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		};	
	}

}
