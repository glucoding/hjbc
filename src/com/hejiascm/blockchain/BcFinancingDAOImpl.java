package com.hejiascm.blockchain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Financingcontract;
import com.hejiascm.domain.Financingexecution;
import com.hejiascm.domain.Financingrequest;
import com.hejiascm.domain.Finconattachment;
import com.hejiascm.domain.Finconparticipant;
import com.hejiascm.domain.Finconterm;
import com.hejiascm.domain.Fincontradecontext;
import com.hejiascm.domain.Finreqattachment;
import com.hejiascm.domain.Finreqtradecontext;
import com.hejiascm.domain.Repaymentdetail;
import com.hejiascm.domain.Transferrecord;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;
import com.ibm.crl.bc.hejia.sdk.common.TradeContextType;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingProxy;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingTerm;
import com.ibm.crl.bc.hejia.sdk.financing.RepaymentMethod;

@Component("BcFinancingDAO")
public class BcFinancingDAOImpl implements BcFinancingDAO {

	@Override
	public void bcConfirmContract(String finConId, String remarks) {
		try {
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			financingProxy.confirmLoanRecord(finConId, remarks);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void bcConfirmLoanRecord(String finConId, String tranRecId) {
		try {
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			financingProxy.confirmLoanRecord(finConId, tranRecId);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void bcConfirmRequest(String finReqId, String remarks) {
		try {
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			financingProxy.confirmRequest(finReqId, remarks);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String bcCreateContract(Financingcontract fiCon) {
		String serial = fiCon.getSerial();
		String financingType = fiCon.getFinancingType();
		String name = fiCon.getName();
		String description = fiCon.getDescription();
		String financingRequestID = fiCon.getFinancingRequestId();
		String finInstID = null;
		for(Finconparticipant fcp : fiCon.getFinconparticipants()){
			if(fcp.getRole() == 3){
				finInstID = fcp.getName();
			}
		}
		Set<Fincontradecontext> fctcs = fiCon.getFincontradecontexts();
		TradeContext[] tcbcs = new TradeContext[fctcs.size()];
		int i = 0;
		for(Fincontradecontext fctc : fctcs){
			tcbcs[i] = new TradeContext();
			tcbcs[i].setId(fctc.toString());
			switch(fctc.getType()){
			case 1:
				tcbcs[i].setType(TradeContextType.TRADING_CONTRACT);
				break;
			case 2:
				tcbcs[i].setType(TradeContextType.ORDER);
				break;
			case 3:
				tcbcs[i].setType(TradeContextType.PAYMENT_APPLICATION);
				break;
			case 4:
				tcbcs[i].setType(TradeContextType.FIN_CONTRACT);
				break;
			}
			i++;
		}
		String tradeContractID = fiCon.getTradeContractId();
		Set<Finconterm> fcts = fiCon.getFinconterms();
		FinancingTerm[] ftbcs = new FinancingTerm[fcts.size()];
		int j = 0;
		for(Finconterm fct:fcts){
			ftbcs[j] = new FinancingTerm();
			ftbcs[j].setContent(fct.getContent());
			ftbcs[j].setDescription(fct.getDescription());
			ftbcs[j].setId(fct.getId());
			ftbcs[j].setName(fct.getName());
			j++;
		}
		String intention = fiCon.getIntention();
		Currency financingAmount = new Currency();
		financingAmount.setAmount(fiCon.getFinancingAmount().doubleValue());
		Currency fee = new Currency();
		fee.setAmount(fiCon.getFee().doubleValue());
		Double financingRate = fiCon.getFinancingRate().doubleValue() ;
		Double overdueRate = fiCon.getOverdueRate().doubleValue(); 
		String lendingDate = fiCon.getLendingDate(); 
		String repaymentDate = fiCon.getRepaymentDate();
		Boolean prepaymentAllowed = Boolean.valueOf(fiCon.getPrepaymentAllowed());
		RepaymentMethod repaymentMethod = null;
		switch(fiCon.getRepaymentMethod()){
		case 1:
			repaymentMethod = RepaymentMethod.BALLOON_PAYMENT;
			break;
		case 2:
			repaymentMethod = RepaymentMethod.ONE_TIME_DEBT_SERVICE;
			break;
		case 10:
			repaymentMethod = RepaymentMethod.OTHER;
			break;
		}
		String repaymentPlan = fiCon.getRepaymentPlan();
		Set<Finconattachment> fcatts = fiCon.getFinconattachments();
		Attachment[] atts = new Attachment[fcatts.size()];
		int k = 0;
		for(Finconattachment fcatt : fcatts){
			atts[k] = new Attachment();
			atts[k].setDescription(fcatt.getDescription());
			atts[k].setHash(fcatt.getHash());
			atts[k].setUri(fcatt.getAddress());
			k++;
		}
		String effectiveTime = fiCon.getEffectiveTime();
		String remarks = fiCon.getRemarks();
		Property[] properties = null;
		String cid = null;
		try {
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			cid = financingProxy.createContract(serial,
																									  financingType, 
																									  name, 
																									  description, 
																									  financingRequestID,
																									  finInstID, 
																									  tcbcs, 
																									  tradeContractID,
																									  ftbcs, 
																									  intention, 
																									  financingAmount, 
																									  fee, 
																									  financingRate,
																									  overdueRate, 
																									  lendingDate, 
																									  repaymentDate, 
																									  prepaymentAllowed, 
																									  repaymentMethod, 
																									  repaymentPlan, 
																									  atts,
																									  effectiveTime, 
																									  remarks, 
																									  properties);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cid;
	}

	@Override
	public String bcCreateLoanRecord(Transferrecord record, String finConId) {
		String financingContractID = finConId;
		String serial = record.getSerial();
		
		Currency amount = new Currency();
		amount.setAmount(record.getAmount());
		amount.setType("RMB");
		
		String time = record.getTime();
		String payerOrgID = record.getPayeeOrgID();
		BankAccountInfo payerBankAccountInfo = new BankAccountInfo();
		payerBankAccountInfo.setBankAccount(record.getPayerBankAccountInfo().getBankAccount());
		payerBankAccountInfo.setBankId(record.getPayerBankAccountInfo().getBankId());
		payerBankAccountInfo.setBankName(record.getPayerBankAccountInfo().getBankName());
		
		String payeeOrgID = record.getPayeeOrgID();
		BankAccountInfo payeeBankAccountInfo = new BankAccountInfo();
		payeeBankAccountInfo.setBankAccount(record.getPayeeBankAccountInfo().getBankAccount());
		payeeBankAccountInfo.setBankId(record.getPayeeBankAccountInfo().getBankId());
		payeeBankAccountInfo.setBankName(record.getPayeeBankAccountInfo().getBankName());
		
		List<Finconattachment> attachments = record.getAttachments();
		Attachment[] atts = new Attachment[attachments.size()];
		int i = 0;
		for(Finconattachment fca : attachments){
			atts[i] = new Attachment();
			atts[i].setDescription(fca.getDescription());
			atts[i].setHash(fca.getHash());
			atts[i].setUri(fca.getAddress());
			i++;
		}
		String remarks = record.getRemards();
		
		String loanRecId = null;
		try{
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			loanRecId =	financingProxy.createLoanRecord(financingContractID, 
																										   serial, 
																										   amount,
																										   time, 
																										   payerOrgID, 
																										   payerBankAccountInfo, 
																										   payeeOrgID, 
																										   payeeBankAccountInfo, 
																										  atts, 
																										  remarks);
		}catch(BlockchainException e){
			e.printStackTrace();
		}
		
		return loanRecId;
	}

	@Override
	public String bcCreateRepaymentRecord(Transferrecord record, String finConId) {
		String financingContractID = finConId;
		String serial = record.getSerial();
		
		Currency amount = new Currency();
		amount.setAmount(record.getAmount());
		amount.setType("RMB");
		
		String time = record.getTime();
		String payerOrgID = record.getPayeeOrgID();
		BankAccountInfo payerBankAccountInfo = new BankAccountInfo();
		payerBankAccountInfo.setBankAccount(record.getPayerBankAccountInfo().getBankAccount());
		payerBankAccountInfo.setBankId(record.getPayerBankAccountInfo().getBankId());
		payerBankAccountInfo.setBankName(record.getPayerBankAccountInfo().getBankName());
		
		String payeeOrgID = record.getPayeeOrgID();
		BankAccountInfo payeeBankAccountInfo = new BankAccountInfo();
		payeeBankAccountInfo.setBankAccount(record.getPayeeBankAccountInfo().getBankAccount());
		payeeBankAccountInfo.setBankId(record.getPayeeBankAccountInfo().getBankId());
		payeeBankAccountInfo.setBankName(record.getPayeeBankAccountInfo().getBankName());
		
		List<Finconattachment> attachments = record.getAttachments();
		Attachment[] atts = new Attachment[attachments.size()];
		int i = 0;
		for(Finconattachment fca : attachments){
			atts[i] = new Attachment();
			atts[i].setDescription(fca.getDescription());
			atts[i].setHash(fca.getHash());
			atts[i].setUri(fca.getAddress());
			i++;
		}
		String remarks = record.getRemards();
		
		String repaymentRecId = null;
		try{
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			repaymentRecId =	financingProxy.createRepaymentRecord(financingContractID, 
																										   serial, 
																										   amount,
																										   time, 
																										   payerOrgID, 
																										   payerBankAccountInfo, 
																										   payeeOrgID, 
																										   payeeBankAccountInfo, 
																										  atts, 
																										  remarks);
		}catch(BlockchainException e){
			e.printStackTrace();
		}
		
		return repaymentRecId;
	}

	@Override
	public String createRequest(Financingrequest fr) {
		String financingType = fr.getFinancingType();
		Set<Finreqtradecontext> frcontexts = fr.getFinreqtradecontexts();
		TradeContext[] tradeContext = new TradeContext[frcontexts.size()];
		int i = 0;
		for(Finreqtradecontext frcontext : frcontexts){
			tradeContext[i] = new TradeContext();
			tradeContext[i].setId(frcontext.getId());
			switch(frcontext.getType()){
			case 1:
				tradeContext[i].setType(TradeContextType.TRADING_CONTRACT);
				break;
			case 2:
				tradeContext[i].setType(TradeContextType.ORDER);
				break;
			case 3:
				tradeContext[i].setType(TradeContextType.PAYMENT_APPLICATION);
				break;
			case 4:
				tradeContext[i].setType(TradeContextType.FIN_CONTRACT);
				break;
			}
			i++;
		}
		String tradeContractID = fr.getTradeContractId();
		String tradeOverview = fr.getTradeOverview();
		Currency tradeAmount = new Currency();
		tradeAmount.setAmount(fr.getTradeAmount().doubleValue());
		tradeAmount.setType("RMB");
		Currency financingAmount = new Currency();
		financingAmount.setAmount(fr.getFinancingAmount().doubleValue());
		financingAmount.setType("RMB");
		Currency fee = new Currency();
		fee.setAmount(fr.getFee().doubleValue());
		fee.setType("RMB");
		String intention = fr.getIntention();
		double financingRate = fr.getFinancingRate().doubleValue();
		double overdueRate = fr.getOverdueRate().doubleValue();
		String lendingDate = fr.getLendingDate();
		String repaymentDate = fr.getRepaymentDate();
		boolean prepaymentAllowed = true;
		if(fr.getPrepaymentAllowed().equals("1")){
			prepaymentAllowed = true;
		}else{
			prepaymentAllowed = false;
		}
		RepaymentMethod repaymentMethod = null;
		switch(fr.getRepaymentMethod()){
		case 1:
			repaymentMethod = RepaymentMethod.BALLOON_PAYMENT;
			break;
		case 2:
			repaymentMethod = RepaymentMethod.ONE_TIME_DEBT_SERVICE;
			break;
		case 10:
			repaymentMethod = RepaymentMethod.OTHER;
			break;
		}
		Set<Finreqattachment> attachments = fr.getFinreqattachments();
		Attachment[] atts = new Attachment[attachments.size()];
		int j = 0;
		for(Finreqattachment fca : attachments){
			atts[j] = new Attachment();
			atts[j].setDescription(fca.getDescription());
			atts[j].setHash(fca.getHash());
			atts[j].setUri(fca.getAddress());
			j++;
		}
		Property[] properties = null;
		String remarks = null;
		
		String finReqId = null;
		try{
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			finReqId = financingProxy.createRequest(financingType,
																			tradeContext, 
																			tradeContractID, 
																			tradeOverview, 
																			tradeAmount, 
																			financingAmount, 
																			fee, 
																			intention, 
																			financingRate, 
																			overdueRate, 
																			lendingDate, 
																			repaymentDate,
																			prepaymentAllowed, 
																			repaymentMethod, 
																			atts, 
																			properties, 
																			remarks);
	}catch(BlockchainException e){
			e.printStackTrace();
		}
		return finReqId;
	}

	@Override
	public void bcDiscloseRequest(String finReqId, String remarks) {
		try{
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			financingProxy.discloseRequest(finReqId, remarks);
		}catch(BlockchainException e){
			e.printStackTrace();
		}
	}

	@Override
	public Financingcontract bcGetContractById(String finconId) {
		FinancingContract fcbc = null;
		try{
			FinancingProxy financingProxy = SdkFactory.instance.getFinancingProxy("admin");
			fcbc = financingProxy.getContractById(finconId);
		}catch(BlockchainException e){
			e.printStackTrace();
		}
		Financingcontract fc = new Financingcontract();
		fc.setApplicantOrgId(fcbc.getApplicantOrgID());
		fc.setApplicationTime(fcbc.getApplicationTime());
		fc.setDescription(fcbc.getDescription());
		fc.setEffectiveTime(fcbc.getEffectiveTime());
		fc.setFee(BigDecimal.valueOf(fcbc.getFee().getAmount()));
	    fc.setFinancingAmount(BigDecimal.valueOf(fcbc.getFinancingAmount().getAmount()));
		//fc.setFinancingExecutionId(fcbc.getFinancing);
		return null;
	}

	@Override
	public List<Financingcontract> bcGetContracts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Financingexecution bcGetExecutionByContractId(String finconId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Financingexecution> bcGetExecutions(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferrecord> bcGetLoanRecords(String finconId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferrecord> bcGetRepaymentRecords(String finconId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Financingrequest bcGetRequestById(String finreqId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Financingrequest> bcGetRequests(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bcRejectContract(String finconId, String remarks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bcRejectRequest(String finreqId, String remarks) {
		// TODO Auto-generated method stub

	}
	
	public Financingexecution getFE(){
		Financingexecution fe = new Financingexecution();
		fe.setBorrowerOrgID("xxx");
		fe.setFinancingContractID("xxx");
		fe.setId("xxx");
		fe.setLenderOrgID("xxx");
		fe.setLoanAmount(200);
		fe.setLoanRecordID(new String[]{"xxx", "xxx"});
		fe.setLoanStatus(1);
		List<Repaymentdetail> rds = new ArrayList<Repaymentdetail>();
		for(int i=0; i < 2; i++){
			Repaymentdetail rd = new Repaymentdetail();
			rd.setInterestPaid(1);
			rd.setInterestRemained(2);
			rd.setPrincipalPaid(2);
			rd.setPrincipalRemained(3);
			rd.setRepaymentRecordID("xxx");
			rd.setTime("xxx");
			rds.add(rd);
		}
		fe.setRepaymentDetails(rds);
		fe.setRepaymentRecordID(new String[]{"xxx","xxx"});
		fe.setRepaymentStatus(2);
		fe.setTotalInterestPaid(2);
		fe.setTotalPrincipalPaid(3);
		
		return fe;
	}
	
	public Transferrecord getRecord(){
		Transferrecord tr = new Transferrecord();
		tr.setAmount(999);
		List<Finconattachment> fas = new ArrayList<Finconattachment>();
		for(int i = 0; i < 2; i++){
			Finconattachment fa = new Finconattachment();
			fa.setAddress("xxx");
			fa.setDescription("xxx");
			fa.setHash("xxx");
			fa.setId("xxx");
			fas.add(fa);
		}
		tr.setAttachments(fas);
		tr.setBankStatus(2);
		tr.setBankTransferRecordID(new String[]{"xxx","xxx"});
		tr.setId("xxx");
		tr.setOperations(null);
		
		Bankaccountinfo ba = new Bankaccountinfo();
		ba.setBankAccount("xxx");
		ba.setBankId("xxx");
		ba.setBankName("xxx");
		ba.setId("xxx");
		ba.setFriendlyName("friendly name");
		ba.setOrgFullName("full name");
		ba.setType("xxx");
		tr.setPayeeBankAccountInfo(ba);
		
		tr.setPayeeOrgID("xxx");
		tr.setPayerBankAccountInfo(ba);
		tr.setPayerOrgID("xxx");
		tr.setRemards("xxx");
		tr.setSerial("xxx");
		tr.setStatus(2);
		tr.setSubmitterOrgId("xxx");
		tr.setTime("xxx");
		List<Fincontradecontext> fcs = new ArrayList<Fincontradecontext>();
		for(int j = 0; j < 2; j++){
			Fincontradecontext fc = new Fincontradecontext();
			fc.setId("xxx");
			fc.setType(2);
			fcs.add(fc);
		}
		tr.setTradeContexts(fcs);
		tr.setType(2);
		return tr;
	}

}
