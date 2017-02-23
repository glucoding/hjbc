package com.hejiascm.blockchain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;
import com.hejiascm.util.Constants;
import com.hejiascm.util.EncodeTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.contract.ContractProxy;
import com.ibm.crl.bc.hejia.sdk.contract.Term;
import com.ibm.crl.bc.hejia.sdk.contract.TradeContract;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("BcTradeContractDAO")
public class BcTradeContractDAOImpl implements BcTradeContractDAO{
	
	private ObjectMapper mapper = new ObjectMapper(); 

	@Override
	public void confirmBcTradeContract(String id, String ver) {
		try {
			ContractProxy contractInterface = SdkFactory.instance.getContractProxy("String?");
			contractInterface.confirmTradeContract(id, ver);
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
	public List<Tradecontract> getTradeContracts(String id, String ver, String maxTime, String minTime, String parId, String exeStatus, String changeStatus, String orgId) {
		List<TradeContract> tcbcs = null;
		Set<com.hejiascm.domain.Contractgoods> gs = null;
		
		HashMap<String,Object> params = new HashMap<String, Object>();
		if(id!=null)
			params.put("id",id);
		if(ver!=null)
			params.put("ver", ver);
		if(maxTime!=null)
			params.put("maxTime", maxTime);
		if(minTime!=null)
			params.put("minTime", minTime);
		if(parId!=null)
			params.put("parId", parId);
		if(exeStatus!=null)
			params.put("executionStatus", exeStatus);
		if(parId!=null)
			params.put("changeStatus", changeStatus);
		if(orgId!=null)
			params.put("toActionParticipantId", orgId);
		String query = null;
		try {
			query = mapper.writeValueAsString(params);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ContractProxy contractInterface = SdkFactory.instance.getContractProxy("String2");
			tcbcs = contractInterface.getTradeContracts(query);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Tradecontract> tcs = new ArrayList<Tradecontract>();
		int index = 0;
		for(TradeContract tcbc : tcbcs){
			tcbc = tcbcs.get(index);
			Tradecontract tc = new Tradecontract();
			tc.setChangeStatus(tcbc.getChangeStatus());
			tc.setContractType(tcbc.getContractType());
			tc.setCurrency(tcbc.getCurrency());
			tc.setCurrentEffectiveVersion(tcbc.getCurrentEffectiveVersion());
			tc.setDataEffectivePaticipant(tcbc.getDataEffectiveParticipant());
			tc.setDescription(tcbc.getDescription());
			tc.setEffectiveTime(tcbc.getEffectiveTime());
			tc.setExecutionStatus(tcbc.getExecutionStatus());
			tc.setExpirationTime(tcbc.getExpirationTime());
			//Goods 请ibm调整为集合类型
			//tc.setGoodses(tcbc.getGoods());
			
			Set<Contractgoods> cgs = new LinkedHashSet<Contractgoods>();
			Goods[] gbcs = tcbc.getGoods();
			for(int i = 0; i < gbcs.length; i ++){
				Contractgoods cg = new Contractgoods();
				cg.setDescription(gbcs[i].getDescription());
				cg.setId(gbcs[i].getId());
				cg.setName(gbcs[i].getName());
				cg.setTradecontract(tc);
				cg.setProducer(gbcs[i].getProducer());
				cg.setQuantity(BigDecimal.valueOf(gbcs[i].getQuantity()));
				cg.setSerial(gbcs[i].getSerial());
				cg.setSpecs(gbcs[i].getSpecs());
				cg.setTaxRate(BigDecimal.valueOf(gbcs[i].getTaxRate()));
				cg.setTotalAmount(BigDecimal.valueOf(gbcs[i].getTotalAmount().getAmount()));
				cg.setUnit(gbcs[i].getUnit());
				cg.setUnitPrice(BigDecimal.valueOf(gbcs[i].getUnitPrice().getAmount()));
				
				cgs.add(cg);
			}
			tc.setContractgoodses(cgs);
			
			tc.setId(tcbc.getId());
			tc.setMeansOfTransportation(tcbc.getMeansOfTransportation());
			Set<Operation> ops = new LinkedHashSet<Operation>();
			List<com.ibm.crl.bc.hejia.sdk.common.Operation> opsbc = tcbc.getOperations();
			for(int j = 0; j < opsbc.size(); j++){
				Operation o = new Operation();
				o.setOperatorId(opsbc.get(j).getOperatorId());
				o.setTime(opsbc.get(j).getTime());
				o.setTradecontract(tc);
				o.setType(opsbc.get(j).getType());
				
				ops.add(o);
			}
			tc.setOperations(ops);
			tc.setOrderSubmitterId(tcbc.getOrderSubmitterId());
			tc.setOrgid("wait to get from user service");
			
			Set<Participant> ps = new LinkedHashSet<Participant>();
			com.ibm.crl.bc.hejia.sdk.contract.Participant[] psbc = tcbc.getParticipants();
			for(int k = 0; k < psbc.length; k ++){
				Participant p = new Participant();
				p.setId(psbc[k].getId());
				p.setName(psbc[k].getName());
				p.setPermission(psbc[k].getPermission());
				p.setRole(String.valueOf(psbc[k].getRole()));
				p.setSignedTime(psbc[k].getSignedTime());
				p.setTradecontract(tc);
				//status is removed from ibm's participant design
				ps.add(p);
			}
			tc.setParticipants(ps);
			tc.setPreviousVersion(tcbc.getPreviousVersion());
			//tc.setRemarks(tcbc.getRemarks()); 缺getRemarks方法
			tc.setSerial(tcbc.getSerial());
			tc.setServiceType(tcbc.getServiceType());
			
			Set<com.hejiascm.domain.Term> ts = new LinkedHashSet<com.hejiascm.domain.Term>();
			Term[] tsbc = tcbc.getTerms();
			for(int m = 0; m < tsbc.length; m ++){
				com.hejiascm.domain.Term t = new com.hejiascm.domain.Term();
				t.setContent(tsbc[m].getContent());
				t.setDescription(tsbc[m].getDescription());
				t.setId(tsbc[m].getId());
				t.setName(tsbc[m].getName());
				t.setTradecontract(tc);
				t.setType(tsbc[m].getType());
				
				ts.add(t);
			}
			tc.setTerms(ts);
			
			Set<Tradecontractattachment> tcas = new LinkedHashSet<Tradecontractattachment>();
			com.ibm.crl.bc.hejia.sdk.common.Attachment[] asbc = tcbc.getAttachments();
			for(int n = 0; n < asbc.length; n++){
				Tradecontractattachment tca = new Tradecontractattachment();
				tca.setAddress(asbc[n].getUri());
				tca.setDescription(asbc[n].getDescription());
				tca.setTradecontract(tc);
				
				tcas.add(tca);
			}
 			tc.setTradecontractattachments(tcas);
 			
 			tc.setVersion(tcbc.getVersion());
 			Property[] props = tcbc.getProperties();
 		    HashMap<String,String> map = (HashMap<String, String>) PropertySerializer.fromProperties(props);
 			tc.setName(map.get("name"));
 			tc.setOrgName(map.get("orgName"));
 			
 			tcs.add(tc);
			index++;
		}
		
		return tcs;
	}

	@Override
	public String submitBcContract(Tradecontract tc) {
	       //甲方提交合同
	      String serialId = tc.getSerial();//"MOCK_SERIAL";
	      int contractType = tc.getContractType().intValue();
	      String effectiveTime = tc.getEffectiveTime();//"2017-02-01T09:00:00Z";
	      String expirationTime = tc.getExpirationTime();//"2018-02-01T09:00:00Z";
	      //String currencyType = tc.getCurrency();//"RMB";
	      String dataEffectiveParticipant = tc.getDataEffectivePaticipant();//"62ecdbf6-2e82-40df-b5cd-46a334a54d8d";
	      String orderSubmitterId = tc.getOrderSubmitterId();//"62ecdbf6-2e82-40df-b5cd-46a334a54d8d";
	      String meansOfTransportation = tc.getMeansOfTransportation();//"AIR";
	      String remarks = tc.getRemarks();//"CREATION_REMARKS";
	      String description = tc.getDescription();
	      Integer serviceType = tc.getServiceType();
	      String currency = tc.getCurrency();
	      
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
	      
	      com.ibm.crl.bc.hejia.sdk.contract.Participant[] pbcs = new com.ibm.crl.bc.hejia.sdk.contract.Participant[tc.getParticipants().size()];
	      int m = 0;
	      for(Participant p : tc.getParticipants()){
	    	  pbcs[m] = new com.ibm.crl.bc.hejia.sdk.contract.Participant();
	    	  pbcs[m].setId(p.getOrgid());
	    	  pbcs[m].setName(p.getName());
	    	  pbcs[m].setPermission(p.getPermission());
	    	  pbcs[m].setRole(Integer.valueOf(p.getRole()));
	    	  pbcs[m].setSignedTime(p.getSignedTime());
	    	  //原participant有状态，现无
	    	  
	    	  m++;
	      }
	      
	      Property[] properties = new Property[]{
	    		  	new Property("name", tc.getName()),
	                new Property("orgName", tc.getOrgName())};
	      
	      
	      Attachment[] atts = new Attachment[tc.getTradecontractattachments().size()];
	      int j = 0;
	      for(Tradecontractattachment t : tc.getTradecontractattachments()){
	      	atts[j] = new Attachment(
	                      t.getAddress(),
	                      t.getDescription(),
	                      t.getHash());
	      		j++;
	      }
	      
	      Set<com.hejiascm.domain.Term> ts = tc.getTerms();
	      Term[] terms = new Term[ts.size()];
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
	    	ContractProxy contractInterface = SdkFactory.instance.getContractProxy("?");
			contractId = contractInterface.submitTradeContract(
			          serialId,
			          terms,
			          contractType,
			          serviceType,
			          effectiveTime,
			          expirationTime,
			          currency,
			          pbcs,
			          properties,
			          dataEffectiveParticipant,
			          orderSubmitterId,
			          gs,
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
