package com.hejiascm.blockchain;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;
import com.hejiascm.util.Constants;
import com.hejiascm.util.EncodeTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecord;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecordProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("BcReceivingRecordDAO)")
public class BcReceivingRecordDAOImpl implements BcReceivingRecordDAO {
	ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public String submitBcReceivingRecord(Receivingrecord rr) {
		// prepare receiving record =========================================
		String receivingFormId = rr.getReceivingFormId();
		String deliveryRecordId = rr.getDeliveryRecordId();
		String name = rr.getName();
		String description = rr.getDescription();
		String orderId = rr.getOrderId();
		String contractId = rr.getContractId();
		String contractVersion = rr.getContractVersion();
		
		//2.28无质检
		String[] qualityRecordIds = null;
		Currency amount = new Currency(rr.getAmount().doubleValue(), "CNY");
		String notes = rr.getNotes();
		int status = rr.getStatus();

		Property[] properties = new Property[] { new Property("truckNum", rr.getTruckNum()),
												 new Property("driver", rr.getDriver()),
												 new Property("orgId", rr.getOrgid()),
												 new Property("deliveryFillTime", rr.getDeliveryFillTime()),
												 new Property("consignerOrgName", rr.getConsignerOrgName()),
												 new Property("consignerName", rr.getConsignerName()),
												 new Property("consignerTel", rr.getConsignerTel()),
												 new Property("consigneeOrgName", rr.getConsigneeOrgName()),
												 new Property("consigneeName", rr.getConsigneeName()),
												 new Property("consigneeTel", rr.getConsigneeTel()),
												 new Property("deliveryFillName", rr.getDeliveryFillName())};
				
		Set<Receivinggoods> rgs = rr.getReceivinggoodses();
		Goods[] rgbcs = new Goods[rgs.size()];
		int i = 0;
		for(Receivinggoods rg : rgs){
			Currency unitPrice = new Currency(rg.getUnitPrice().doubleValue(), "CNY");
			Currency totalAmount = new Currency(rg.getTotalAmount().doubleValue(), "CNY");
			Goods gbc = new Goods(rr.getReceivingFormId(),
		            			  rg.getSerial(),
		        			      rg.getName(),
					        	  rg.getDescription(),
					        	  rg.getSpecs(),
					        	  rg.getUnit(),
					        	  rg.getQuantity().longValue(),
					        	  rg.getProducer(),
					        	  unitPrice,
					        	  rg.getTaxRate().doubleValue(),
					        	  totalAmount);
				rgbcs[i] = gbc;
				i++;
			}
				
			Attachment[] atts = new Attachment[rr.getReceivingattachments().size()];
			int j = 0;
			for(Receivingattachment rt : rr.getReceivingattachments()){
			 	atts[j] = new Attachment(
			  				rt.getAddress(),
			   				rt.getDescription(),
			   				rt.getHash());
					j++;
			}

			// submit receiving record ==========================================
			String receivingId = null;
			try {
				String userName = "current user name";
				ReceivingRecordProxy sdk = SdkFactory.instance.getReceivingRecordProxy(userName);
				receivingId = sdk.submitReceivingRecord(
				        receivingFormId,
				        deliveryRecordId,
				        orderId,
				        contractId,
				        contractVersion,
				        name,
				        description,
				        qualityRecordIds,
				        properties,
				        rgbcs,
				        amount,
				        notes,
				        status,
				        atts);
			} catch (BlockchainException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return receivingId;
}

	@Override
	public Set<Receivingrecord> getBcReceivingRecords(String id, String contractId, String contractVersion, String orderId) {
		// assemble query conditions
		HashMap<String, Object> query = new HashMap<String, Object>();
		if(id!=null)
			query.put("id", id);
		if(contractId!=null)
			query.put("contractId", contractId);
		if(contractVersion!=null)
			query.put("contractVersion", contractVersion);
		if(orderId!=null)
			query.put("orderId", orderId);
		String queryCondition = null;
		try {
			queryCondition = mapper.writeValueAsString(query);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// execute getReceivingRecords() interface
		List<ReceivingRecord> rrbcs = null;
		try {
			String userName = "current user name";
			ReceivingRecordProxy sdk = SdkFactory.instance.getReceivingRecordProxy(userName);
			rrbcs = sdk.getReceivingRecords(queryCondition);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Receivingrecord> rrs = new LinkedHashSet<Receivingrecord>();
		for (ReceivingRecord rrbc : rrbcs) {
			Receivingrecord rr = new Receivingrecord();
			rr.setAmount(BigDecimal.valueOf(rrbc.getAmount().getAmount()));
			rr.setContractId(rrbc.getContractId());
			rr.setContractVersion(rrbc.getContractVersion());
			rr.setDeliveryRecordId(rrbc.getDeliveryRecordId());
			
			Set<Receivingattachment> ras = new LinkedHashSet<Receivingattachment>();
			com.ibm.crl.bc.hejia.sdk.common.Attachment[] rabcs = rrbc.getAttachments();
			for(int j = 0; j < rabcs.length; j++){
				Receivingattachment ra = new Receivingattachment();
				ra.setAddress(rabcs[j].getUri());
				ra.setDescription(rabcs[j].getDescription());
				ra.setReceivingrecord(rr);
				
				ras.add(ra);
			}
 			rr.setReceivingattachments(ras);;
 			
 			rr.setReceivingFormId(rrbc.getReceivingRecordFormId());
 			
 			Set<Receivinggoods> rgs = new LinkedHashSet<Receivinggoods>();
 			Goods[] rgbcs = rrbc.getGoods();
 			for(int k = 0; k < rgbcs.length; k++){
 				Receivinggoods rg = new Receivinggoods();
 				rg.setReceivingrecord(rr);
 				rg.setDescription(rgbcs[k].getDescription());
 				rg.setId(rgbcs[k].getId());
 				rg.setName(rgbcs[k].getName());
 				rg.setProducer(rgbcs[k].getProducer());
 				rg.setQuantity(rgbcs[k].getQuantity().intValue());
 				rg.setSerial(rgbcs[k].getSerial());
 				rg.setSpecs(rgbcs[k].getSpecs());
 				rg.setTaxRate(BigDecimal.valueOf(rgbcs[k].getTaxRate()));
 				rg.setTotalAmount(BigDecimal.valueOf(rgbcs[k].getTotalAmount().getAmount()));
 				rg.setUnit(rgbcs[k].getUnit());
 				rg.setUnitPrice(BigDecimal.valueOf(rgbcs[k].getUnitPrice().getAmount()));
 				
 				rgs.add(rg);
 			}
 			rr.setReceivinggoodses(rgs);
 			rr.setDescription(rrbc.getDescription());
 			
 			//Retrieving the properties
 			Property[] ps = rrbc.getProperties();
 			HashMap<String,String> map = (HashMap<String, String>) PropertySerializer.fromProperties(ps);
 			rr.setTruckNum(map.get("truckNum"));
 			rr.setDriver(map.get("driver"));
 			rr.setOrgid(map.get("orgid"));
 			rr.setDeliveryFillTime(map.get("deliveryFillTime"));
 			rr.setConsignerOrgName(map.get("consignerOrgName"));
 			rr.setConsignerName(map.get("consignerName"));
 			rr.setConsigneeOrgName(map.get("consigneeOrgName"));
 			rr.setConsignerTel(map.get("consignerTel"));
 			rr.setConsigneeName(map.get("consigneeName"));
 			rr.setConsigneeTel(map.get("consigneeTel"));
 			rr.setDeliveryFillName(map.get("deliveryFillName"));

 			
 			rr.setId(rrbc.getId());
 			//rr.setLastUpdateTime(rrbc.getLastUpdateTime());
 			rr.setName(rrbc.getName());
 			rr.setNotes(rrbc.getNotes());
 			rr.setOrderId(rrbc.getOrderId());
 			rr.setStatus(rrbc.getStatus());
 			rr.setSubmitterId(rrbc.getSubmitterId());
 			//rr.setSubmitTime(rrbc.getSubmitTime());
 			
 			rrs.add(rr);
		}
		
		return rrs;
	}

}
