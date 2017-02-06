package com.hejiascm.service;

import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Deliverygoods entities
 * 
 */
public interface DeliverygoodsService {

	/**
	 */
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id);

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	public void saveDeliverygoods(Deliverygoods deliverygoods);

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	public Deliverygoods saveDeliverygoodsDeliveryrecord(String id_1, Deliveryrecord related_deliveryrecord);

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	public void deleteDeliverygoods(Deliverygoods deliverygoods_1);

	/**
	 * Load an existing Deliverygoods entity
	 * 
	 */
	public Set<Deliverygoods> loadDeliverygoodss();

	/**
	 * Return all Deliverygoods entity
	 * 
	 */
	public List<Deliverygoods> findAllDeliverygoodss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Deliverygoods entity
	 * 
	 */
	public Integer countDeliverygoodss();

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	public Deliverygoods deleteDeliverygoodsDeliveryrecord(String deliverygoods_id, String related_deliveryrecord_id);
}