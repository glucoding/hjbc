package com.hejiascm.service;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */
public interface OrderService {

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	public Order saveOrderOrdergoodses(String id, Ordergoods related_ordergoodses);

	/**
	 * Return all Order entity
	 * 
	 */
	public List<Order> findAllOrders(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Order entity
	 * 
	 */
	public void saveOrder(Order order);

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	public Order deleteOrderOrdergoodses(String order_id, String related_ordergoodses_id);

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	public Order deleteOrderOrderattachments(String order_id_1, String related_orderattachments_id);

	/**
	 * Load an existing Order entity
	 * 
	 */
	public Set<Order> loadOrders();

	/**
	 * Return a count of all Order entity
	 * 
	 */
	public Integer countOrders();

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	public Order saveOrderOrderattachments(String id_1, Orderattachment related_orderattachments);

	/**
	 */
	public Order findOrderByPrimaryKey(String id_2);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public void deleteOrder(Order order_1);
}