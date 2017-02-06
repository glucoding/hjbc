package com.hejiascm.service;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Orderattachment entities
 * 
 */
public interface OrderattachmentService {

	/**
	 * Return all Orderattachment entity
	 * 
	 */
	public List<Orderattachment> findAllOrderattachments(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	public void deleteOrderattachment(Orderattachment orderattachment);

	/**
	 * Load an existing Orderattachment entity
	 * 
	 */
	public Set<Orderattachment> loadOrderattachments();

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	public void saveOrderattachment(Orderattachment orderattachment_1);

	/**
	 * Save an existing Order entity
	 * 
	 */
	public Orderattachment saveOrderattachmentOrder(String id, Order related_order);

	/**
	 */
	public Orderattachment findOrderattachmentByPrimaryKey(String id_1);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public Orderattachment deleteOrderattachmentOrder(String orderattachment_id, String related_order_id);

	/**
	 * Return a count of all Orderattachment entity
	 * 
	 */
	public Integer countOrderattachments();
}