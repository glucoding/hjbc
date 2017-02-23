package com.hejiascm.blockchain;

import java.util.List;

import com.hejiascm.domain.Order;

public interface BcOrderDAO {
	public String submitBcOrder(Order o);
	
	public void confirmBcOrder(String id);
	
	public List<Order> getBcOrders(String id, String orderFormId, String contractId, String contractVersion, String orgId, String status);

	public void deleteOrder(String id);
}
