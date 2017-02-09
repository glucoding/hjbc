package com.hejiascm.blockchain.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;
import com.hejiascm.domain.Orginfoattachment;
import com.hejiascm.util.EncodeTool;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.Attachment;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.OrderProxy;

@Component("BcOrderDAO")
public class BcOrderDAOImpl implements BcOrderDAO {
	private ObjectMapper mapper = new ObjectMapper(); 
	
	@Override
	public String submitBcOrder(Order o) {
	    // generate a order
	    String orderFormId = o.getOrderFormId();
	    String contractId = o.getContractId();
	    String contractVersion = o.getContractVersion();
	    String submitterId = o.getSubmitterId();
	    String deliveryStartTime = o.getDeliveryStartTime();
	    String deliveryEndTime = o.getDelivertyEndTime();
	    String type = o.getType();
	    String deliveryType = o.getDeliveryType();
	    String name = o.getName();
	    String description = o.getDescription();
	    Property[] properties = null;//订单结构一致，仅多orgId，可从UserInfo中获取

	    Set<Ordergoods> gs = o.getOrdergoodses();
	    Goods[] gsbc = new Goods[gs.size()];
	    int i = 0;
	    for(Ordergoods g : gs){
	    	Currency unitPrice = new Currency(g.getUnitPrice().doubleValue(), "CNY");
		    Currency totalAmount = new Currency(g.getTotalAmount().doubleValue(), "CNY");
		    Goods gbc = new Goods(g.getId(),
								   g.getSerial(),
								   g.getName(),
								   g.getDescription(),
								   g.getSpec(),
								   g.getUnit(),
								   g.getQuantity().longValue(),
								   g.getProducer(),
								   unitPrice,
								   g.getTaxRate().doubleValue(),
								   totalAmount);
		    gsbc[i] = gbc;
		    i++;
	    }
	    String address = o.getAddress();
	    String notes = o.getNotes();
	    
        Attachment[] atts = new Attachment[o.getOrderattachments().size()];
        int j = 0;
        for(Orderattachment oa : o.getOrderattachments()){
        	atts[j] = new Attachment(
                            oa.getAddress(),
                            oa.getDescription(),
                            EncodeTool.digestFile(oa.getAddress(), "SHA-256"));
        	j++;
        }
	    String submitTime = MiscTool.timeStampToString(new Timestamp(System.currentTimeMillis()));

		String userName = "current user name";
	    OrderProxy sdk = null;
	    String orderId = null;
		try {
			sdk = SdkFactory.instance.getOrderProxy(userName);
			orderId = sdk.submitOrder(
		            orderFormId,
		            contractId,
		            contractVersion,
		            submitterId,
		            deliveryStartTime,
		            deliveryEndTime,
		            type,
		            deliveryType,
		            name,
		            description,
		            properties,
		            gsbc,
		            address,
		            notes,
		            atts,
		            submitTime);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderId;
	}

	@Override
	public void confirmBcOrder(String id, String orderFormId, String contractId, String contractVersion) {
		String userName = "current user name";

		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",id);
		params.put("orderFormId", orderFormId);
		params.put("contractId", contractId);
		params.put("contractVersion", contractVersion);
		String query = null;
		try {
			query = mapper.writeValueAsString(params);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// prepare submitter id
		String submitterId = "submitter id";
		String confirmTime = MiscTool.timeStampToString(new Timestamp(System.currentTimeMillis()));;

		
		String orderId;
		try {
			OrderProxy sdk = SdkFactory.instance.getOrderProxy(userName);
			List<com.ibm.crl.bc.hejia.sdk.logistics.Order> orders = sdk.getOrders(query);
			orderId = sdk.submitOrder(
			        orders.get(0).getOrderFormId(),
			        orders.get(0).getContractId(),
			        orders.get(0).getContractVersion(),
			        submitterId,
			        orders.get(0).getDeliveryStartTime(),
			        orders.get(0).getDeliveryEndTime(),
			        orders.get(0).getType(),
			        orders.get(0).getDeliveryType(),
			        orders.get(0).getName(),
			        orders.get(0).getDescription(),
			        orders.get(0).getProperties(),
			        orders.get(0).getGoods(),
			        orders.get(0).getAddress(),
			        orders.get(0).getNotes(),
			        orders.get(0).getAttachments(),
			        confirmTime);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//区块链尚缺一个使用合同号、版本号来查询订单的方法
	@Override
	public List<Order> getBcOrder(String id, String orderFormId, String contractId, String contractVersion) {
		String userName = "current user name";
		
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",id);
		params.put("orderFormId", orderFormId);
		params.put("contractId", contractId);
		params.put("contractVersion", contractVersion);
		String query = null;
		try {
			query = mapper.writeValueAsString(params);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// execute getOrders() interface
		List<com.ibm.crl.bc.hejia.sdk.logistics.Order> obcs = null;
		try {
			OrderProxy sdk = SdkFactory.instance.getOrderProxy(userName);
			obcs = sdk.getOrders(query);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		List<Order> os = new ArrayList<Order>();
//		for (com.ibm.crl.bc.hejia.sdk.logistics.Order obc : obcs) {
//			Order o = new Order();
//			o.setAddress(obc.getAddress());
//			o.setContractId(obc.getContractId());
//			o.setContractVersion(obc.getContractVersion());
//			o.setDelivertyEndTime(obc.getDeliveryEndTime());
//			o.setDeliveryStartTime(obc.getDeliveryStartTime());
//			o.setDeliveryType(obc.getDeliveryType());
//			o.setDescription(obc.getDescription());
//			o.setId(obc.getId());
//			o.setLastUpdateTime(obc.getLastUpdateTime());
//			o.setName(obc.getName());
//			o.setNotes(obc.getNotes());
//			
//			Set<Ordergoods> ogs = new LinkedHashSet<Ordergoods>();
//			Goods[] gbcs = obc.getGoods();
//			for(int i = 0; i < gbcs.length; i ++){
//				Ordergoods og = new Ordergoods();
//				og.setDescription(gbcs[i].getDescription());
//				og.setId(gbcs[i].getId());
//				og.setName(gbcs[i].getName());
//				og.setOrder(o);
//				og.setProducer(gbcs[i].getProducer());
//				og.setQuantity(gbcs[i].getQuantity().intValue());
//				og.setSerial(gbcs[i].getSerial());
//				og.setSpec(gbcs[i].getSpecs());
//				og.setTaxRate(BigDecimal.valueOf(gbcs[i].getTaxRate()));
//				og.setTotalAmount(BigDecimal.valueOf(gbcs[i].getTotalAmount().getAmount()));
//				og.setUnit(gbcs[i].getUnit());
//				og.setUnitPrice(BigDecimal.valueOf(gbcs[i].getUnitPrice().getAmount()));
//				
//				ogs.add(og);
//			}
//			o.setOrdergoodses(ogs);
//			
//			Set<Orderattachment> oas = new LinkedHashSet<Orderattachment>();
//			Attachment[] atts = obc.getAttachments();
//			for(int i = 0; i < atts.length; i++){
//				Orderattachment oa = new Orderattachment();
//				oa.setAddress(atts[i].getUri());
//				oa.setDescription(atts[i].getDescription());
//				oa.setOrder(o);
//				
//				oas.add(oa);
//			}
//			o.setOrderattachments(oas);
//			
//			o.setStatus(obc.getStatus());
//			o.setSubmitterId(obc.getSubmitterId());
//			o.setSubmitTime(obc.getSubmitTime());
//			o.setType(obc.getType());
//			
//			os.add(o);
//		}
		
		List<Order> os = new ArrayList<Order>();
		for (int i = 0; i < 2; i++) {
			Order o = new Order();
			o.setAddress(MiscTool.getRandomString(10));
			o.setContractId(MiscTool.getRandomString(10));
			o.setContractVersion(MiscTool.getRandomString(10));
			o.setDelivertyEndTime(MiscTool.getRandomString(10));
			o.setDeliveryStartTime(MiscTool.getRandomString(10));
			o.setDeliveryType(MiscTool.getRandomString(10));
			o.setDescription(MiscTool.getRandomString(10));
			o.setId(MiscTool.getRandomString(10));
			o.setLastUpdateTime(MiscTool.getRandomString(10));
			o.setName(MiscTool.getRandomString(10));
			o.setNotes(MiscTool.getRandomString(10));
			
			Set<Ordergoods> ogs = new LinkedHashSet<Ordergoods>();
			for(int k = 0; k < 2; k ++){
				Ordergoods og = new Ordergoods();
				og.setDescription(MiscTool.getRandomString(10));
				og.setId(MiscTool.getRandomString(10));
				og.setName(MiscTool.getRandomString(10));
				og.setOrder(o);
				og.setProducer(MiscTool.getRandomString(10));
				og.setQuantity(MiscTool.getRandomInt(1, 10));
				og.setSerial(MiscTool.getRandomString(10));
				og.setSpec(MiscTool.getRandomString(10));
				og.setTaxRate(BigDecimal.valueOf(MiscTool.getRandomInt(1, 100)));
				og.setTotalAmount(BigDecimal.valueOf(MiscTool.getRandomInt(1, 100)));
				og.setUnit(MiscTool.getRandomString(10));
				og.setUnitPrice(BigDecimal.valueOf(MiscTool.getRandomInt(1, 100)));
				
				ogs.add(og);
			}
			o.setOrdergoodses(ogs);
			
			Set<Orderattachment> oas = new LinkedHashSet<Orderattachment>();
			for(int j = 0; j < 2; j++){
				Orderattachment oa = new Orderattachment();
				oa.setAddress(MiscTool.getRandomString(10));
				oa.setDescription(MiscTool.getRandomString(10));
				oa.setOrder(o);
				
				oas.add(oa);
			}
			o.setOrderattachments(oas);
			
			o.setStatus(MiscTool.getRandomInt(1, 10));
			o.setSubmitterId(MiscTool.getRandomString(10));
			o.setSubmitTime(MiscTool.getRandomString(10));
			o.setType(MiscTool.getRandomString(10));
			
			os.add(o);
		}
		
		return os;
	}

}
