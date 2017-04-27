package com.hejiascm.blockchain.interfaces;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.logistics.Order;

public interface OrderDAO {
	public void  confirmOrder(String id, String operator);
	
	public void deleteOrder(String id, String operator);
	
	public List<Order> getOrders(String query, String operator);
	
	public void rejectOrder(String id, String remarks, String operator);
	
	public String submitOrder(Order o, String operator);
	
	public void updateOrder(Order o, String operator);
} 
