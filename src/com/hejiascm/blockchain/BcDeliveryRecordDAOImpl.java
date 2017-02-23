package com.hejiascm.blockchain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;
import com.hejiascm.util.Constants;
import com.hejiascm.util.EncodeTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.DeliveryRecord;
import com.ibm.crl.bc.hejia.sdk.logistics.DeliveryRecordProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("BcDeliveryRecordDAO")
public class BcDeliveryRecordDAOImpl implements BcDeliveryRecordDAO {
	
	ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public Set<Deliveryrecord> getBcDeliveryRecords(String id, String contractId, String contractVersion, String orderId) {
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
		//query.put("orderFormId", orderFormId);
		String queryCondition = null;
		try {
			queryCondition = mapper.writeValueAsString(query);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// execute getDeliveryRecords() interface
		List<DeliveryRecord> drbcs = null;
		try {
			String userName = "current user name";
			DeliveryRecordProxy sdk = SdkFactory.instance.getDeliveryRecordProxy(userName);
			drbcs = sdk.getDeliveryRecords(queryCondition);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Deliveryrecord> drs = new LinkedHashSet<Deliveryrecord>();
		for (DeliveryRecord drbc : drbcs) {
			Deliveryrecord dr = new Deliveryrecord();
			dr.setAmount(BigDecimal.valueOf(drbc.getAmount().getAmount()));
			//dr.setBuyeeId(drbc.getBuyeeId());IBM removed this attribute
			dr.setBuyerId(drbc.getBuyerId());
			dr.setBuyerName(drbc.getBuyerName());
			dr.setSellerId(drbc.getSellerId());
			dr.setSellerName(drbc.getSellerName());
			dr.setConsigneeAddress(drbc.getConsigneeAddress());
			dr.setConsigneeId(drbc.getConsignerId());
			dr.setConsigneeName(drbc.getConsigneeName());
			dr.setConsignerId(drbc.getConsignerId());
			dr.setConsignerName(drbc.getConsigneeName());
			dr.setContractId(drbc.getContractId());
			dr.setContractVersion(drbc.getContractVersion());
			
			Set<Deliveryattachment> das = new LinkedHashSet<Deliveryattachment>();
			com.ibm.crl.bc.hejia.sdk.common.Attachment[] dabcs = drbc.getAttachments();
			for(int j = 0; j < dabcs.length; j++){
				Deliveryattachment da = new Deliveryattachment();
				da.setAddress(dabcs[j].getUri());
				da.setDescription(dabcs[j].getDescription());
				da.setDeliveryrecord(dr);
				
				das.add(da);
			}
 			dr.setDeliveryattachments(das);;
 			
 			dr.setDeliveryFormId(drbc.getDeliveryRecordFormId());
 			
 			Set<Deliverygoods> dgs = new LinkedHashSet<Deliverygoods>();
 			Goods[] dgbcs = drbc.getGoods();
 			for(int k = 0; k < dgbcs.length; k++){
 				Deliverygoods dg = new Deliverygoods();
 				dg.setDeliveryrecord(dr);
 				dg.setDescription(dgbcs[k].getDescription());
 				dg.setId(dgbcs[k].getId());
 				dg.setName(dgbcs[k].getName());
 				dg.setProducer(dgbcs[k].getProducer());
 				dg.setQuantity(dgbcs[k].getQuantity().intValue());
 				dg.setSerial(dgbcs[k].getSerial());
 				dg.setSpecs(dgbcs[k].getSpecs());
 				dg.setTaxRate(BigDecimal.valueOf(dgbcs[k].getTaxRate()));
 				dg.setTotalAmount(BigDecimal.valueOf(dgbcs[k].getTotalAmount().getAmount()));
 				dg.setUnit(dgbcs[k].getUnit());
 				dg.setUnitPrice(BigDecimal.valueOf(dgbcs[k].getUnitPrice().getAmount()));
 				
 				dgs.add(dg);
 			}
 			dr.setDeliverygoodses(dgs);
 			dr.setDescription(drbc.getDescription());
 			
 			//Retrieving the properties
 			Property[] ps = drbc.getProperties();
 			HashMap<String, String> map = (HashMap<String, String>) PropertySerializer.fromProperties(ps);
 			dr.setTruckNum(map.get("truckNum"));
 			dr.setDriver(map.get("driver"));
 			dr.setOrgId(map.get("orgId"));
 			dr.setDeliveryFillTime(map.get("deliveryFillTime"));
 			dr.setConsignerOrgName(map.get("consignerOrgName"));
 			dr.setConsigneeOrgName(map.get("consigneeOrgName"));
 			dr.setConsignerTel(map.get("consignerTel"));
 			dr.setConsigneeTel(map.get("consigneeTel"));
 			dr.setDeliveryFillName(map.get("deliveryFillName"));

 			dr.setId(drbc.getId());
 			//dr.setLastUpdateTime(drbc.getLastUpdateTime());
 			dr.setName(drbc.getName());
 			dr.setNotes(drbc.getNotes());
 			dr.setOrderId(drbc.getOrderId());
 			dr.setStatus(drbc.getStatus());
 			//dr.setSubmitterId(drbc.getSubmitterId());
 			//dr.setSubmitTime(drbc.getSubmitTime());
 			
 			drs.add(dr);
		}
		
		return drs;
	}

	@Override
	public String submitBcDeliveryRecord(Deliveryrecord dr) {
		// prepare delivery record =========================================
		String deliveryFormId = dr.getDeliveryFormId();
		String name = dr.getName();
		String description = dr.getDescription();
		String orderId = dr.getOrderId();
		String contractId = dr.getContractId();
		String contractVersion = dr.getContractVersion();
		String buyerId = dr.getBuyerId();
		String buyerName = dr.getBuyerName();
		String sellerId = dr.getSellerId();
		String sellerName = dr.getSellerName();
		String consignerId = dr.getConsignerId();
		String consignerName = dr.getConsignerName();
		String consigneeId = dr.getConsigneeId();
		String consigneeName = dr.getConsigneeName();
		String consignerAddress = dr.getConsignerAddress();
		String consigneeAddress = dr.getConsigneeAddress();
		//2.28无质检
		String[] qualityRecordIds = null;
		Currency amount = new Currency(dr.getAmount().doubleValue(), "CNY");
		String notes = dr.getNotes();
		int status = dr.getStatus();

		Property[] properties = new Property[] { new Property("truckNum", dr.getTruckNum()),
												 new Property("driver", dr.getDriver()),
												 new Property("orgId", dr.getOrgId()),
												 new Property("deliveryFillTime", dr.getDeliveryFillTime()),
												 new Property("consignerOrgName", dr.getConsignerOrgName()),
												 new Property("consignerTel", dr.getConsignerTel()),
												 new Property("consigneeOrgName", dr.getConsigneeOrgName()),
												 new Property("consigneeTel", dr.getConsigneeTel()),
												 new Property("deliveryFillName", dr.getDeliveryFillName())};
		
		Set<Deliverygoods> dgs = dr.getDeliverygoodses();
		Goods[] gbcs = new Goods[dgs.size()];
		int i = 0;
		for(Deliverygoods dg : dgs){
			Currency unitPrice = new Currency(dg.getUnitPrice().doubleValue(), "CNY");
			Currency totalAmount = new Currency(dg.getTotalAmount().doubleValue(), "CNY");
			Goods gbc = new Goods(dr.getDeliveryFormId(),
			        			   dg.getSerial(),
			        			   dg.getName(),
			        			   dg.getDescription(),
			        			   dg.getSpecs(),
			        			   dg.getUnit(),
			        			   dg.getQuantity().longValue(),
			        			   dg.getProducer(),
			        			   unitPrice,
			        			   dg.getTaxRate().doubleValue(),
			        			   totalAmount);
			gbcs[i] = gbc;
			i++;
		}
		
	    Attachment[] atts = new Attachment[dr.getDeliveryattachments().size()];
	    int j = 0;
	    for(Deliveryattachment dt : dr.getDeliveryattachments()){
	    	atts[j] = new Attachment(
	    				dt.getAddress(),
	    				dt.getDescription(),
	    				dt.getHash());
	      				j++;
	    }

		// submit delivery record ==========================================
		String deliveryId = null;
		try {
			String userName = "current user name";
			DeliveryRecordProxy sdk = SdkFactory.instance.getDeliveryRecordProxy(userName);
			deliveryId = sdk.submitDeliveryRecord(
			        deliveryFormId,
			        name,
			        description,
			        orderId,
			        contractId,
			        contractVersion,
			        buyerId,
			        buyerName,
			        sellerId,
			        sellerName,
			        consignerId,
			        consignerName,
			        consigneeId,
			        consigneeName,
			        consignerAddress,
			        consigneeAddress,
			        qualityRecordIds,
			        properties,
			        gbcs,
			        amount,
			        notes,
			        atts);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deliveryId;
	}

}
