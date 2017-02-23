package com.hejiascm.blockchain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Preaccounting;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingProxy;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;

@Component("BcPreAccountingDAO")
public class BcPreAccountingDAOImpl implements BcPreAccountingDAO {
	ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public List<Preaccounting> bcGetPreAccountings() {
		// assemble query conditions
//		HashMap<String, Object> query = new HashMap<String, Object>();
//		if(id!=null)
//				query.put("orgId", orgId);
//		String queryCondition = null;
//		try {
//				queryCondition = mapper.writeValueAsString(query);
//		} catch (JsonProcessingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//		}
		String queryCondition = "{}";
		// execute getReceivingRecords() interface
		List<PreAccounting> pabcs = null;
		try {
			String userName = "current user name";
			PreAccountingProxy sdk = SdkFactory.instance.getPreAccountingProxy(userName);
			pabcs = sdk.getPreAccountings(queryCondition);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Preaccounting> pas = new ArrayList<Preaccounting>();
		for(PreAccounting pabc : pabcs){
			Preaccounting pa = new Preaccounting();
			pa.setBuyerId(pabc.getBuyerId());
			pa.setContractId(pabc.getContractId());
			pa.setEndSingleAccountingApplicationTime(pabc.getEndSingleAccountingApplicatoinTime());
			pa.setFinancingApplicationId(pabc.getFinancingApplicationId());
			pa.setFinancingContractId(pabc.getFinancingContractId());
			
			Goods[] gbcs = pabc.getGoods();
			List<Contractgoods> gs = new ArrayList<Contractgoods>();
			for(Goods gbc : gbcs){
				Contractgoods g = new Contractgoods();
				g.setDescription(gbc.getDescription());
				g.setId(gbc.getId());
				g.setName(gbc.getName());
				g.setProducer(gbc.getProducer());
				g.setQuantity(BigDecimal.valueOf(gbc.getQuantity()));
				g.setSerial(gbc.getSerial());
				g.setSpecs(gbc.getSpecs());
				g.setTaxRate(BigDecimal.valueOf(gbc.getTaxRate()));
				g.setTotalAmount(BigDecimal.valueOf(gbc.getTaxRate()));
				g.setUnit(gbc.getUnit());
				g.setUnitPrice(BigDecimal.valueOf(gbc.getUnitPrice().getAmount()));
				gs.add(g);
			}
			pa.setGoods(gs);
			pa.setId(pabc.getId());
			pa.setNotes(pabc.getNotes());
			pa.setOperations(null);
			pa.setOrderId(pabc.getOrderId());
			pa.setPaidAmount(pabc.getPaidAmount().getAmount());
			pa.setPaymentRecordIds(pabc.getPaymentRecordIds());
			pa.setPreAccountingFinancingStatus(pabc.getPreAccountingFinancingStatus());
			pa.setSellerId(pabc.getBuyeeId());
			pa.setSingleAccountingApplicationIds(pabc.getSingleAccountingApplicationIds());
			pa.setStartSingleAccountingApplicationTime(pabc.getStartSingleAccountingApplicatoinTime());
			pa.setStatus(pabc.getStatus());
			pa.setTotalAmount(pabc.getTotalAmount().getAmount());
			pa.setType(pabc.getType());
			
			pas.add(pa);
		}
		
		return pas;
	}

	@Override
	public String bcSubmitPreAccounting(Preaccounting pa) {
		String contractId = pa.getContractId();
		int type = pa.getType();
		Currency totalAmount = new Currency();
		totalAmount.setAmount(pa.getTotalAmount());
		totalAmount.setType("RMB");
		String orderId = pa.getOrderId();
		String buyerId = pa.getBuyerId();
		String buyeeId = pa.getSellerId();
		List<Contractgoods> gs = pa.getGoods();
		Goods[] goods = new Goods[gs.size()];
		int i = 0;
		for(Contractgoods g : gs){
			goods[i] = new Goods();
			goods[i].setDescription(g.getDescription());
			goods[i].setId(g.getId());
			goods[i].setName(g.getName());
			goods[i].setProducer(g.getProducer());
			goods[i].setQuantity(g.getQuantity().longValue());
			goods[i].setSerial(g.getSerial());
			goods[i].setSpecs(g.getSpecs());
			goods[i].setTaxRate(g.getTaxRate().doubleValue());
			Currency c = new Currency();
			c.setAmount(g.getTotalAmount().doubleValue());
			c.setType("RMB");
			goods[i].setTotalAmount(c);
			goods[i].setUnit(g.getUnit());
			Currency c2 = new Currency();
			c2.setAmount(g.getUnitPrice().doubleValue());
			c2.setType("RMB");
			goods[i].setUnitPrice(c2);
			i++;
		}
		
		String[] singleAccountingApplicationIds = pa.getSingleAccountingApplicationIds();
		String notes = pa.getNotes();
		List<String> paymentRecordIds = pa.getPaymentRecordIds();
		
		String pid = null;
		try {
			String userName = "user";
			PreAccountingProxy sdk = SdkFactory.instance.getPreAccountingProxy(userName);
			pid  = sdk.submitPreAccounting(contractId,
																				type, 
																				totalAmount, 
																				orderId, 
																				buyerId, 
																				buyeeId, 
																				goods, 
																				singleAccountingApplicationIds, 
																				notes, 
																				paymentRecordIds);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pid;
	}

	@Override
	public void bcWithdrawPreAccounting(String preId, String notes) {
		try{
			String userName = "user";
			PreAccountingProxy sdk = SdkFactory.instance.getPreAccountingProxy(userName);
			sdk.withdrawPreAccounting(preId, notes);
		}catch(BlockchainException e){
			e.printStackTrace();
		}
	}

}
