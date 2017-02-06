package com.hejiascm.service;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Deliveryattachment entities
 * 
 */

@Service("DeliveryattachmentService")
@Transactional
public class DeliveryattachmentServiceImpl implements DeliveryattachmentService {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

	/**
	 * DAO injected by Spring that manages Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordDAO deliveryrecordDAO;

	/**
	 * Instantiates a new DeliveryattachmentServiceImpl.
	 *
	 */
	public DeliveryattachmentServiceImpl() {
	}

	/**
	 * Return a count of all Deliveryattachment entity
	 * 
	 */
	@Transactional
	public Integer countDeliveryattachments() {
		return ((Long) deliveryattachmentDAO.createQuerySingleResult("select count(o) from Deliveryattachment o").getSingleResult()).intValue();
	}

	/**
	 * Return all Deliveryattachment entity
	 * 
	 */
	@Transactional
	public List<Deliveryattachment> findAllDeliveryattachments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Deliveryattachment>(deliveryattachmentDAO.findAllDeliveryattachments(startResult, maxRows));
	}

	/**
	 * Load an existing Deliveryattachment entity
	 * 
	 */
	@Transactional
	public Set<Deliveryattachment> loadDeliveryattachments() {
		return deliveryattachmentDAO.findAllDeliveryattachments();
	}

	/**
	 */
	@Transactional
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id) {
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(id);
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Deliveryattachment deleteDeliveryattachmentDeliveryrecord(String deliveryattachment_id, String related_deliveryrecord_id) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment_id, -1, -1);
		Deliveryrecord related_deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id, -1, -1);

		deliveryattachment.setDeliveryrecord(null);
		related_deliveryrecord.getDeliveryattachments().remove(deliveryattachment);
		deliveryattachment = deliveryattachmentDAO.store(deliveryattachment);
		deliveryattachmentDAO.flush();

		related_deliveryrecord = deliveryrecordDAO.store(related_deliveryrecord);
		deliveryrecordDAO.flush();

		deliveryrecordDAO.remove(related_deliveryrecord);
		deliveryrecordDAO.flush();

		return deliveryattachment;
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@Transactional
	public void saveDeliveryattachment(Deliveryattachment deliveryattachment) {
		Deliveryattachment existingDeliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment.getId());

		if (existingDeliveryattachment != null) {
			if (existingDeliveryattachment != deliveryattachment) {
				existingDeliveryattachment.setId(deliveryattachment.getId());
				existingDeliveryattachment.setAddress(deliveryattachment.getAddress());
				existingDeliveryattachment.setDescription(deliveryattachment.getDescription());
			}
			deliveryattachment = deliveryattachmentDAO.store(existingDeliveryattachment);
		} else {
			deliveryattachment = deliveryattachmentDAO.store(deliveryattachment);
		}
		deliveryattachmentDAO.flush();
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Deliveryattachment saveDeliveryattachmentDeliveryrecord(String id, Deliveryrecord related_deliveryrecord) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(id, -1, -1);
		Deliveryrecord existingdeliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdeliveryrecord != null) {
			existingdeliveryrecord.setId(related_deliveryrecord.getId());
			existingdeliveryrecord.setDeliveryFormId(related_deliveryrecord.getDeliveryFormId());
			existingdeliveryrecord.setName(related_deliveryrecord.getName());
			existingdeliveryrecord.setDescription(related_deliveryrecord.getDescription());
			existingdeliveryrecord.setOrderId(related_deliveryrecord.getOrderId());
			existingdeliveryrecord.setContractId(related_deliveryrecord.getContractId());
			existingdeliveryrecord.setContractVersion(related_deliveryrecord.getContractVersion());
			existingdeliveryrecord.setSubmitterId(related_deliveryrecord.getSubmitterId());
			existingdeliveryrecord.setSubmitTime(related_deliveryrecord.getSubmitTime());
			existingdeliveryrecord.setLastUpdateTime(related_deliveryrecord.getLastUpdateTime());
			existingdeliveryrecord.setBuyerId(related_deliveryrecord.getBuyerId());
			existingdeliveryrecord.setBuyeeId(related_deliveryrecord.getBuyeeId());
			existingdeliveryrecord.setConsignerId(related_deliveryrecord.getConsignerId());
			existingdeliveryrecord.setConsigneeId(related_deliveryrecord.getConsigneeId());
			existingdeliveryrecord.setConsignerAddress(related_deliveryrecord.getConsignerAddress());
			existingdeliveryrecord.setConsigneeAddress(related_deliveryrecord.getConsigneeAddress());
			existingdeliveryrecord.setAmount(related_deliveryrecord.getAmount());
			existingdeliveryrecord.setNotes(related_deliveryrecord.getNotes());
			existingdeliveryrecord.setStatus(related_deliveryrecord.getStatus());
			existingdeliveryrecord.setDriver(related_deliveryrecord.getDriver());
			existingdeliveryrecord.setTruckNum(related_deliveryrecord.getTruckNum());
			existingdeliveryrecord.setOrgId(related_deliveryrecord.getOrgId());
			related_deliveryrecord = existingdeliveryrecord;
		} else {
			related_deliveryrecord = deliveryrecordDAO.store(related_deliveryrecord);
			deliveryrecordDAO.flush();
		}

		deliveryattachment.setDeliveryrecord(related_deliveryrecord);
		related_deliveryrecord.getDeliveryattachments().add(deliveryattachment);
		deliveryattachment = deliveryattachmentDAO.store(deliveryattachment);
		deliveryattachmentDAO.flush();

		related_deliveryrecord = deliveryrecordDAO.store(related_deliveryrecord);
		deliveryrecordDAO.flush();

		return deliveryattachment;
	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@Transactional
	public void deleteDeliveryattachment(Deliveryattachment deliveryattachment) {
		deliveryattachmentDAO.remove(deliveryattachment);
		deliveryattachmentDAO.flush();
	}
}
