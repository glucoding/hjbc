package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.OrderDAO;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.logistics.Order;
import com.ibm.crl.bc.hejia.sdk.logistics.OrderProxy;

@Component("OrderDAO")
public class OrderDAOImpl implements OrderDAO {

	public OrderDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void confirmOrder(String id, String operator) {
		try(OrderProxy op = SdkFactory.getInstance().getOrderProxy(operator)){
			op.confirmOrder(id); 
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOrder(String id, String operator) {
		try(OrderProxy op = SdkFactory.getInstance().getOrderProxy(operator)){
			op.deleteOrder(id); 
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public List<Order> getOrders(String query, String operator) {
		List<Order> ods = new ArrayList<Order>();
		try(OrderProxy op = SdkFactory.getInstance().getOrderProxy(operator)){
			ods = op.getOrders(query); 
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ods;
	}

	@Override
	public void rejectOrder(String id, String remarks, String operator) {
		try(OrderProxy op = SdkFactory.getInstance().getOrderProxy(operator)){
			op.rejectOrder(id, remarks); 
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public String submitOrder(Order o, String operator) {
		String res = null;
		try(OrderProxy op = SdkFactory.getInstance().getOrderProxy(operator)){
			res = op.submitOrder(o.getOrderFormId(), 
										     o.getContractId(),
										     o.getContractVersion(), 
										     o.getDeliveryStartTime(),
										     o.getDeliveryEndTime(), 
										     o.getOrderType(), 
										     o.getDeliveryType(), 
										     o.getName(), 
										     o.getDescription(), 
										     o.getProperties(), 
										     o.getGoods(), 
										     o.getAddress(), 
										     o.getRemarks(), 
										     o.getAttachments());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void updateOrder(Order o, String operator) {
	}

}
