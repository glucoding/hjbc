package com.hejiascm.service;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Ordergoods;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Ordergoods entities
 * 
 */
public interface OrdergoodsService {

	/**
	 * Return a count of all Ordergoods entity
	 * 
	 */
	public Integer countOrdergoodss();

	/**
	 */
	public Ordergoods findOrdergoodsByPrimaryKey(String id);

	/**
	 * Load an existing Ordergoods entity
	 * 
	 */
	public Set<Ordergoods> loadOrdergoodss();

	/**
	 * Save an existing Order entity
	 * 
	 */
	public Ordergoods saveOrdergoodsOrder(String id_1, Order related_order);

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	public void saveOrdergoods(Ordergoods ordergoods);

	/**
	 * Return all Ordergoods entity
	 * 
	 */
	public List<Ordergoods> findAllOrdergoodss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	public void deleteOrdergoods(Ordergoods ordergoods_1);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public Ordergoods deleteOrdergoodsOrder(String ordergoods_id, String related_order_id);
}