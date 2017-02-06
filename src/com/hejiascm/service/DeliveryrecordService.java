package com.hejiascm.service;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Deliveryrecord entities
 * 
 */
public interface DeliveryrecordService {

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	public Deliveryrecord saveDeliveryrecordDeliveryattachments(String id, Deliveryattachment related_deliveryattachments);

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	public void saveDeliveryrecord(Deliveryrecord deliveryrecord);

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	public Deliveryrecord deleteDeliveryrecordDeliveryattachments(String deliveryrecord_id, String related_deliveryattachments_id);

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	public void deleteDeliveryrecord(Deliveryrecord deliveryrecord_1);

	/**
	 * Load an existing Deliveryrecord entity
	 * 
	 */
	public Set<Deliveryrecord> loadDeliveryrecords();

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	public Deliveryrecord deleteDeliveryrecordDeliverygoodses(String deliveryrecord_id_1, String related_deliverygoodses_id);

	/**
	 */
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id_1);

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	public Deliveryrecord saveDeliveryrecordDeliverygoodses(String id_2, Deliverygoods related_deliverygoodses);

	/**
	 * Return all Deliveryrecord entity
	 * 
	 */
	public List<Deliveryrecord> findAllDeliveryrecords(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Deliveryrecord entity
	 * 
	 */
	public Integer countDeliveryrecords();
}