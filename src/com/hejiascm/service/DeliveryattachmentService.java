package com.hejiascm.service;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Deliveryattachment entities
 * 
 */
public interface DeliveryattachmentService {

	/**
	 * Return a count of all Deliveryattachment entity
	 * 
	 */
	public Integer countDeliveryattachments();

	/**
	 * Return all Deliveryattachment entity
	 * 
	 */
	public List<Deliveryattachment> findAllDeliveryattachments(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Deliveryattachment entity
	 * 
	 */
	public Set<Deliveryattachment> loadDeliveryattachments();

	/**
	 */
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id);

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	public Deliveryattachment deleteDeliveryattachmentDeliveryrecord(String deliveryattachment_id, String related_deliveryrecord_id);

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	public void saveDeliveryattachment(Deliveryattachment deliveryattachment);

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	public Deliveryattachment saveDeliveryattachmentDeliveryrecord(String id_1, Deliveryrecord related_deliveryrecord);

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	public void deleteDeliveryattachment(Deliveryattachment deliveryattachment_1);
}