package com.hejiascm.blockchain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;
import com.hejiascm.util.Constants;
import com.hejiascm.util.EncodeTool;
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
	    String deliveryStartTime = o.getDeliveryStartTime();
	    String deliveryEndTime = o.getDelivertyEndTime();
	    int type = Integer.valueOf(o.getType());
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
								   g.getSpecs(),
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
                            oa.getHash());
        	j++;
        }
		String userName = "current user name";
	    OrderProxy sdk = null;
	    String orderId = null;
		try {
			sdk = SdkFactory.instance.getOrderProxy(userName);
			orderId = sdk.submitOrder(
		            orderFormId,
		            contractId,
		            contractVersion,
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
		            atts);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderId;
	}

	@Override
	public void confirmBcOrder(String id) {
		String userName = "current user name";

		try {
			OrderProxy sdk = SdkFactory.instance.getOrderProxy(userName);
			sdk.confirmOrder(id);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//区块链尚缺一个使用合同号、版本号来查询订单的方法
	@Override
	public List<Order> getBcOrders(String id, String orderFormId, String contractId, String contractVersion, String orgId, String status) {
		String userName = "current user name";
		
		HashMap<String,Object> params = new HashMap<String, Object>();
		if(id!=null)
			params.put("id",id);
		if(orderFormId!=null)	
			params.put("orderFormId", orderFormId);
		if(contractId!=null)
			params.put("contractId", contractId);
		if(contractVersion!=null)
			params.put("contractVersion", contractVersion);
		if(orgId!=null)
			params.put("toActionParticipantId", orgId);
		if(status!=null)
			params.put("status", status);
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
		
		List<Order> os = new ArrayList<Order>();
		for (com.ibm.crl.bc.hejia.sdk.logistics.Order obc : obcs) {
			Order o = new Order();
			o.setAddress(obc.getAddress());
			o.setContractId(obc.getContractId());
			o.setContractVersion(obc.getContractVersion());
			o.setDelivertyEndTime(obc.getDeliveryEndTime());
			o.setDeliveryStartTime(obc.getDeliveryStartTime());
			o.setDeliveryType(obc.getDeliveryType());
			o.setDescription(obc.getDescription());
			o.setId(obc.getId());
			//o.setLastUpdateTime(obc.getLastUpdateTime()); This method is removed by IBM
			o.setName(obc.getName());
			o.setNotes(obc.getNotes());
			
			Set<Ordergoods> ogs = new LinkedHashSet<Ordergoods>();
			Goods[] gbcs = obc.getGoods();
			for(int i = 0; i < gbcs.length; i ++){
				Ordergoods og = new Ordergoods();
				og.setDescription(gbcs[i].getDescription());
				og.setId(gbcs[i].getId());
				og.setName(gbcs[i].getName());
				og.setOrder(o);
				og.setProducer(gbcs[i].getProducer());
				og.setQuantity(gbcs[i].getQuantity().intValue());
				og.setSerial(gbcs[i].getSerial());
				og.setSpecs(gbcs[i].getSpecs());
				og.setTaxRate(BigDecimal.valueOf(gbcs[i].getTaxRate()));
				og.setTotalAmount(BigDecimal.valueOf(gbcs[i].getTotalAmount().getAmount()));
				og.setUnit(gbcs[i].getUnit());
				og.setUnitPrice(BigDecimal.valueOf(gbcs[i].getUnitPrice().getAmount()));
				
				ogs.add(og);
			}
			o.setOrdergoodses(ogs);
			
			Set<Orderattachment> oas = new LinkedHashSet<Orderattachment>();
			Attachment[] atts = obc.getAttachments();
			for(int i = 0; i < atts.length; i++){
				Orderattachment oa = new Orderattachment();
				oa.setAddress(atts[i].getUri());
				oa.setDescription(atts[i].getDescription());
				oa.setOrder(o);
				
				oas.add(oa);
			}
			o.setOrderattachments(oas);
			
			o.setStatus(obc.getStatus());
			o.setType(String.valueOf(obc.getType()));
			
			os.add(o);
		}
		
		return os;
	}
	
	@Override
	public void deleteOrder(String id){
		String userName = "current user name";
		try {
			OrderProxy sdk = SdkFactory.instance.getOrderProxy(userName);
			sdk.deleteOrder(id);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
