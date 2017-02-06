package com.hejiascm.blockchain.dao;

import java.util.List;

import com.hejiascm.domain.Order;

public interface BcOrderDAO {
	public String submitBcOrder(Order o);
	
	public void confirmBcOrder(String id, String orderFormId, String contractId, String contractVersion);
	
	public List<Order> getBcOrder(String id, String orderFormId, String contractId, String contractVersion);
}
