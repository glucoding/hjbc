package com.hejiascm.service;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Deliveryrecord entities
 * 
 */

@Service("DeliveryrecordService")
@Transactional
public class DeliveryrecordServiceImpl implements DeliveryrecordService {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

	/**
	 * DAO injected by Spring that manages Deliverygoods entities
	 * 
	 */
	@Autowired
	private DeliverygoodsDAO deliverygoodsDAO;

	/**
	 * DAO injected by Spring that manages Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordDAO deliveryrecordDAO;

	/**
	 * Instantiates a new DeliveryrecordServiceImpl.
	 *
	 */
	public DeliveryrecordServiceImpl() {
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@Transactional
	public Deliveryrecord saveDeliveryrecordDeliveryattachments(String id, Deliveryattachment related_deliveryattachments) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(id, -1, -1);
		Deliveryattachment existingdeliveryattachments = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(related_deliveryattachments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdeliveryattachments != null) {
			existingdeliveryattachments.setId(related_deliveryattachments.getId());
			existingdeliveryattachments.setAddress(related_deliveryattachments.getAddress());
			existingdeliveryattachments.setDescription(related_deliveryattachments.getDescription());
			related_deliveryattachments = existingdeliveryattachments;
		} else {
			related_deliveryattachments = deliveryattachmentDAO.store(related_deliveryattachments);
			deliveryattachmentDAO.flush();
		}

		related_deliveryattachments.setDeliveryrecord(deliveryrecord);
		deliveryrecord.getDeliveryattachments().add(related_deliveryattachments);
		related_deliveryattachments = deliveryattachmentDAO.store(related_deliveryattachments);
		deliveryattachmentDAO.flush();

		deliveryrecord = deliveryrecordDAO.store(deliveryrecord);
		deliveryrecordDAO.flush();

		return deliveryrecord;
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public void saveDeliveryrecord(Deliveryrecord deliveryrecord) {
		Deliveryrecord existingDeliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());

		if (existingDeliveryrecord != null) {
			if (existingDeliveryrecord != deliveryrecord) {
				existingDeliveryrecord.setId(deliveryrecord.getId());
				existingDeliveryrecord.setDeliveryFormId(deliveryrecord.getDeliveryFormId());
				existingDeliveryrecord.setName(deliveryrecord.getName());
				existingDeliveryrecord.setDescription(deliveryrecord.getDescription());
				existingDeliveryrecord.setOrderId(deliveryrecord.getOrderId());
				existingDeliveryrecord.setContractId(deliveryrecord.getContractId());
				existingDeliveryrecord.setContractVersion(deliveryrecord.getContractVersion());
				existingDeliveryrecord.setSubmitterId(deliveryrecord.getSubmitterId());
				existingDeliveryrecord.setSubmitTime(deliveryrecord.getSubmitTime());
				existingDeliveryrecord.setLastUpdateTime(deliveryrecord.getLastUpdateTime());
				existingDeliveryrecord.setBuyerId(deliveryrecord.getBuyerId());
				existingDeliveryrecord.setBuyeeId(deliveryrecord.getBuyeeId());
				existingDeliveryrecord.setConsignerId(deliveryrecord.getConsignerId());
				existingDeliveryrecord.setConsigneeId(deliveryrecord.getConsigneeId());
				existingDeliveryrecord.setConsignerAddress(deliveryrecord.getConsignerAddress());
				existingDeliveryrecord.setConsigneeAddress(deliveryrecord.getConsigneeAddress());
				existingDeliveryrecord.setAmount(deliveryrecord.getAmount());
				existingDeliveryrecord.setNotes(deliveryrecord.getNotes());
				existingDeliveryrecord.setStatus(deliveryrecord.getStatus());
				existingDeliveryrecord.setDriver(deliveryrecord.getDriver());
				existingDeliveryrecord.setTruckNum(deliveryrecord.getTruckNum());
				existingDeliveryrecord.setOrgId(deliveryrecord.getOrgId());
			}
			deliveryrecord = deliveryrecordDAO.store(existingDeliveryrecord);
		} else {
			deliveryrecord = deliveryrecordDAO.store(deliveryrecord);
		}
		deliveryrecordDAO.flush();
	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@Transactional
	public Deliveryrecord deleteDeliveryrecordDeliveryattachments(String deliveryrecord_id, String related_deliveryattachments_id) {
		Deliveryattachment related_deliveryattachments = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(related_deliveryattachments_id, -1, -1);

		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		related_deliveryattachments.setDeliveryrecord(null);
		deliveryrecord.getDeliveryattachments().remove(related_deliveryattachments);

		deliveryattachmentDAO.remove(related_deliveryattachments);
		deliveryattachmentDAO.flush();

		return deliveryrecord;
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public void deleteDeliveryrecord(Deliveryrecord deliveryrecord) {
		deliveryrecordDAO.remove(deliveryrecord);
		deliveryrecordDAO.flush();
	}

	/**
	 * Load an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Set<Deliveryrecord> loadDeliveryrecords() {
		return deliveryrecordDAO.findAllDeliveryrecords();
	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@Transactional
	public Deliveryrecord deleteDeliveryrecordDeliverygoodses(String deliveryrecord_id, String related_deliverygoodses_id) {
		Deliverygoods related_deliverygoodses = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(related_deliverygoodses_id, -1, -1);

		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		related_deliverygoodses.setDeliveryrecord(null);
		deliveryrecord.getDeliverygoodses().remove(related_deliverygoodses);

		deliverygoodsDAO.remove(related_deliverygoodses);
		deliverygoodsDAO.flush();

		return deliveryrecord;
	}

	/**
	 */
	@Transactional
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id) {
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(id);
	}

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@Transactional
	public Deliveryrecord saveDeliveryrecordDeliverygoodses(String id, Deliverygoods related_deliverygoodses) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(id, -1, -1);
		Deliverygoods existingdeliverygoodses = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(related_deliverygoodses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdeliverygoodses != null) {
			existingdeliverygoodses.setId(related_deliverygoodses.getId());
			existingdeliverygoodses.setSerial(related_deliverygoodses.getSerial());
			existingdeliverygoodses.setName(related_deliverygoodses.getName());
			existingdeliverygoodses.setDescription(related_deliverygoodses.getDescription());
			existingdeliverygoodses.setSpecs(related_deliverygoodses.getSpecs());
			existingdeliverygoodses.setUnit(related_deliverygoodses.getUnit());
			existingdeliverygoodses.setQuantity(related_deliverygoodses.getQuantity());
			existingdeliverygoodses.setProducer(related_deliverygoodses.getProducer());
			existingdeliverygoodses.setUnitPrice(related_deliverygoodses.getUnitPrice());
			existingdeliverygoodses.setTaxRate(related_deliverygoodses.getTaxRate());
			existingdeliverygoodses.setTotalAmount(related_deliverygoodses.getTotalAmount());
			related_deliverygoodses = existingdeliverygoodses;
		} else {
			related_deliverygoodses = deliverygoodsDAO.store(related_deliverygoodses);
			deliverygoodsDAO.flush();
		}

		related_deliverygoodses.setDeliveryrecord(deliveryrecord);
		deliveryrecord.getDeliverygoodses().add(related_deliverygoodses);
		related_deliverygoodses = deliverygoodsDAO.store(related_deliverygoodses);
		deliverygoodsDAO.flush();

		deliveryrecord = deliveryrecordDAO.store(deliveryrecord);
		deliveryrecordDAO.flush();

		return deliveryrecord;
	}

	/**
	 * Return all Deliveryrecord entity
	 * 
	 */
	@Transactional
	public List<Deliveryrecord> findAllDeliveryrecords(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Deliveryrecord>(deliveryrecordDAO.findAllDeliveryrecords(startResult, maxRows));
	}

	/**
	 * Return a count of all Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Integer countDeliveryrecords() {
		return ((Long) deliveryrecordDAO.createQuerySingleResult("select count(o) from Deliveryrecord o").getSingleResult()).intValue();
	}
}
