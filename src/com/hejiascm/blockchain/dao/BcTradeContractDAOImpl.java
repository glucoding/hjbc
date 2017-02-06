package com.hejiascm.blockchain.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;
import com.hejiascm.util.EncodeTool;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.contract.ContractProxy;
import com.ibm.crl.bc.hejia.sdk.contract.Term;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract;

@Component("BcTradeContractDAO")
public class BcTradeContractDAOImpl implements BcTradeContractDAO{

	@Override
	public void confirmBcTradeContract(String id, String ver, String opid, String opTime) {
		try {
			ContractProxy contractInterface = SdkFactory.instance.getContractProxy();
			contractInterface.confirmTradeContract(id, ver, opid, opTime);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Tradecontract> findBcContracts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tradecontract> findAllBcContracts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tradecontract> findBcContractById(String id, String ver) {
		List<TradeContract> tcbcs = null;
		Set<com.hejiascm.domain.Contractgoods> gs = null;
		try {
			ContractProxy contractInterface = SdkFactory.instance.getContractProxy();
			String queryCondition = "{contractId:" + id + "," + "contractVersion:" + ver + "}";
			tcbcs = contractInterface.getTradeContract(queryCondition);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		List<Tradecontract> tcs = new ArrayList<Tradecontract>();
//		int i = 0;
//		for(TradeContract tcbc : tcbcs){
//			tcbc = tcbcs.get(i);
//			Tradecontract tc = new Tradecontract();
//			tc.setChangeStatus(tcbc.getChangeStatus());
//			tc.setContractType(tc.getContractType());
//			tc.setCurrency(tcbc.getCurrency());
//			tc.setCurrentEffectiveVersion(tcbc.getCurrentEffectiveVersion());
//			tc.setDataEffectivePaticipant(tcbc.getDataEffectiveParticipant());
//			tc.setDescription(tcbc.getDescription());
//			tc.setEffectiveTime(tcbc.getEffectiveTime());
//			tc.setExecutionStatus(tcbc.getExecutionStatus());
//			tc.setExpirationTime(tcbc.getExpirationTime());
//			//Goods 请ibm调整为集合类型
//			//tc.setGoodses(tcbc.getGoods());
//			tc.setId(tcbc.getId());
//			tc.setMeansOfTransportation(tcbc.getMeansOfTransportation());
//			Set<Operation> ops = new LinkedHashSet<Operation>();
//			com.ibm.crl.bc.hejia.sdk.common.Operation[] opsbc = tcbc.getOperations();
//			for(int j = 0; j < opsbc.length; j++){
//				Operation o = new Operation();
//				o.setOperatorId(opsbc[j].getOperatorId());
//				o.setTime(opsbc[j].getTime());
//				o.setTradecontract(tc);
//				o.setType(opsbc[j].getType());
//				
//				ops.add(o);
//			}
//			tc.setOperations(ops);
//			tc.setOrderSubmitterId(tcbc.getOrderSubmitterId());
//			tc.setOrgid("wait to get from user service");
//			
//			Set<Participant> ps = new LinkedHashSet<Participant>();
//			com.ibm.crl.bc.hejia.sdk.contract.Participant[] psbc = tcbc.getParticipants();
//			for(int k = 0; k < psbc.length; k ++){
//				Participant p = new Participant();
//				p.setId(psbc[k].getId());
//				p.setName(psbc[k].getName());
//				p.setPermission(psbc[k].getPermission());
//				p.setRole(psbc[k].getRole());
//				p.setSignedTime(psbc[k].getSignedTime());
//				p.setTradecontract(tc);
//				//status is removed from ibm's participant design
//				ps.add(p);
//			}
//			tc.setParticipants(ps);
//			tc.setPreviousVersion(tcbc.getPreviousVersion());
//			tc.setRemarks(tcbc.getRemarks());
//			tc.setSerial(tcbc.getSerial());
//			tc.setServiceType(tcbc.getServiceType());
//			
//			Set<com.hejiascm.domain.Term> ts = new LinkedHashSet<com.hejiascm.domain.Term>();
//			Term[] tsbc = tcbc.getTerms();
//			for(int m = 0; m < tsbc.length; m ++){
//				com.hejiascm.domain.Term t = new com.hejiascm.domain.Term();
//				t.setContent(tsbc[m].getContent());
//				t.setDescription(tsbc[m].getDescription());
//				t.setId(tsbc[m].getId());
//				t.setName(tsbc[m].getName());
//				t.setTradecontract(tc);
//				t.setType(tsbc[m].getType());
//				
//				ts.add(t);
//			}
//			tc.setTerms(ts);
//			
//			Set<Tradecontractattachment> tcas = new LinkedHashSet<Tradecontractattachment>();
//			com.ibm.crl.bc.hejia.sdk.common.Attachment[] asbc = tcbc.getAttachments();
//			for(int n = 0; n < asbc.length; n++){
//				Tradecontractattachment tca = new Tradecontractattachment();
//				tca.setContent(asbc[n].getUri());
//				tca.setDescription(asbc[n].getDescription());
//				tca.setTradecontract(tc);
//				
//				tcas.add(tca);
//			}
// 			tc.setTradecontractattachments(tcas);
// 			
// 			tc.setVersion(tcbc.getVersion());
// 			
// 			tcs.add(tc);
//			i++;
//		}
		
		/**
		 * TEST
		 */
		List<Tradecontract> tcs = new ArrayList<Tradecontract>();
		for(int i = 0; i < 2; i++){
			Tradecontract tc = new Tradecontract();
			tc.setChangeStatus(MiscTool.getRandomInt(1, 10));
			tc.setContractType(MiscTool.getRandomInt(1, 10));
			tc.setCurrency(MiscTool.getRandomString(10));
			tc.setCurrentEffectiveVersion(MiscTool.getRandomString(10));
			tc.setDataEffectivePaticipant(MiscTool.getRandomString(10));
			tc.setDescription(MiscTool.getRandomString(10));
			tc.setEffectiveTime(MiscTool.getRandomString(10));
			tc.setExecutionStatus(MiscTool.getRandomInt(1, 10));
			tc.setExpirationTime(MiscTool.getRandomString(10));
			//Goods 请ibm调整为集合类型
			//tc.setGoodses(tcbc.getGoods());
			tc.setId(MiscTool.getRandomString(10));
			tc.setMeansOfTransportation(MiscTool.getRandomString(10));
			Set<Operation> ops = new LinkedHashSet<Operation>();
			for(int j = 0; j < 2; j++){
				Operation o = new Operation();
				o.setOperatorId(MiscTool.getRandomString(10));
				o.setTime(MiscTool.getRandomString(10));
				o.setTradecontract(tc);
				o.setType(MiscTool.getRandomInt(1, 10));
				
				ops.add(o);
			}
			tc.setOperations(ops);
			tc.setOrderSubmitterId(MiscTool.getRandomString(10));
			tc.setOrgid("wait to get from user service");
			
			Set<Participant> ps = new LinkedHashSet<Participant>();
			for(int k = 0; k < 2; k ++){
				Participant p = new Participant();
				p.setId(MiscTool.getRandomString(10));
				p.setName(MiscTool.getRandomString(10));
				p.setPermission(MiscTool.getRandomString(10));
				p.setRole(MiscTool.getRandomString(10));
				p.setSignedTime(MiscTool.getRandomString(10));
				p.setTradecontract(tc);
				//status is removed from ibm's participant design
				ps.add(p);
			}
			tc.setParticipants(ps);
			tc.setPreviousVersion(MiscTool.getRandomString(10));
			tc.setRemarks(MiscTool.getRandomString(10));
			tc.setSerial(MiscTool.getRandomString(10));
			tc.setServiceType(MiscTool.getRandomInt(1, 10));
			
			Set<com.hejiascm.domain.Term> ts = new LinkedHashSet<com.hejiascm.domain.Term>();
			for(int m = 0; m < 2; m ++){
				com.hejiascm.domain.Term t = new com.hejiascm.domain.Term();
				t.setContent(MiscTool.getRandomString(10));
				t.setDescription(MiscTool.getRandomString(10));
				t.setId(MiscTool.getRandomString(10));
				t.setName(MiscTool.getRandomString(10));
				t.setTradecontract(tc);
				t.setType(MiscTool.getRandomString(10));
				
				ts.add(t);
			}
			tc.setTerms(ts);
			
			Set<Tradecontractattachment> tcas = new LinkedHashSet<Tradecontractattachment>();
			for(int n = 0; n < 2; n++){
				Tradecontractattachment tca = new Tradecontractattachment();
				tca.setContent(MiscTool.getRandomString(10));
				tca.setDescription(MiscTool.getRandomString(10));
				tca.setTradecontract(tc);
				
				tcas.add(tca);
			}
 			tc.setTradecontractattachments(tcas);
 			
 			tc.setVersion(MiscTool.getRandomString(10));
 			
 			tcs.add(tc);
		}
		
		return tcs;
	}

	@Override
	public String submitBcContract(Tradecontract tc) {
	       //甲方提交合同
	      String serialId = tc.getSerial();//"MOCK_SERIAL";
	      int contractType = tc.getContractType();
	      String submitterId = null;
	      String submitTime = MiscTool.getCurrentTime();//"2016-01-26T09:00:00Z";
	      String effectiveTime = tc.getEffectiveTime();//"2017-02-01T09:00:00Z";
	      String expirationTime = tc.getExpirationTime();//"2018-02-01T09:00:00Z";
	      String currencyType = tc.getCurrency();//"RMB";
	      String dataEffectiveParticipant = tc.getDataEffectivePaticipant();//"62ecdbf6-2e82-40df-b5cd-46a334a54d8d";
	      String orderSubmitterId = tc.getOrderSubmitterId();//"62ecdbf6-2e82-40df-b5cd-46a334a54d8d";
	      String meansOfTransportation = tc.getMeansOfTransportation();//"AIR";
	      String remarks = tc.getRemarks();//"CREATION_REMARKS";
	      String description = tc.getDescription();
	      
	      Goods goods = new Goods();
	      Goods[] gs = new Goods[tc.getContractgoodses().size()];
	      int i = 0;
	      for(com.hejiascm.domain.Contractgoods g : tc.getContractgoodses()){
	      	gs[i] = new Goods(
	                      g.getId(),g.getSerial(),g.getName(),g.getDescription(),
	                      g.getSpecs(),g.getUnit(),g.getQuantity().longValue(),g.getProducer(),
	                      new Currency(g.getUnitPrice().doubleValue(), "RMB"), g.getTaxRate().doubleValue(),  
	                      new Currency(g.getTotalAmount().doubleValue(), "RMB"));
	      		i++;
	      }
	      
	      Property[] participantProperties = new Property[]{};
	      
	      Attachment[] atts = new Attachment[tc.getTradecontractattachments().size()];
	      int j = 0;
	      for(Tradecontractattachment t : tc.getTradecontractattachments()){
	      	atts[j] = new Attachment(
	                      t.getContent(),
	                      t.getDescription(),
	                      EncodeTool.digestFile(t.getContent(), "SHA-256"));
	      		j++;
	      }
	      
	      Term[] terms = new Term[20];
	      Set<com.hejiascm.domain.Term> ts = tc.getTerms();
	      int k = 0;
	      for(com.hejiascm.domain.Term t : ts){
	    	  Term tbc = new Term();
	    	  tbc.setId(t.getId());
	    	  tbc.setName(t.getName());
	    	  tbc.setContent(t.getContent());
	    	  tbc.setDescription(t.getDescription());
	    	  tbc.setType(t.getType());
	    	  
	    	  terms[k] = tbc;
	      } 

	      String contractId = null;
	      try {
	    	ContractProxy contractInterface = SdkFactory.instance.getContractProxy();
			contractId = contractInterface.submitTradeContract(
			          serialId,
			          terms,
			          contractType,
			          submitterId,
			          submitTime,
			          effectiveTime,
			          expirationTime,
			          currencyType,
			          participantProperties,
			          dataEffectiveParticipant,
			          orderSubmitterId,
			          goods,
			          meansOfTransportation,
			          atts,
			          remarks,
			          description
			          );
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contractId;
	}

	@Override
	public String reviseBcContract(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rejectBcContract(Tradecontract tc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmBcContract(Tradecontract tc) {
		// TODO Auto-generated method stub
		
	}

}
