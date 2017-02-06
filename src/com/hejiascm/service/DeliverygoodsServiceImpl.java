package com.hejiascm.service;

import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Deliverygoods entities
 * 
 */

@Service("DeliverygoodsService")
@Transactional
public class DeliverygoodsServiceImpl implements DeliverygoodsService {

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
	 * Instantiates a new DeliverygoodsServiceImpl.
	 *
	 */
	public DeliverygoodsServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id) {
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(id);
	}

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@Transactional
	public void saveDeliverygoods(Deliverygoods deliverygoods) {
		Deliverygoods existingDeliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods.getId());

		if (existingDeliverygoods != null) {
			if (existingDeliverygoods != deliverygoods) {
				existingDeliverygoods.setId(deliverygoods.getId());
				existingDeliverygoods.setSerial(deliverygoods.getSerial());
				existingDeliverygoods.setName(deliverygoods.getName());
				existingDeliverygoods.setDescription(deliverygoods.getDescription());
				existingDeliverygoods.setSpecs(deliverygoods.getSpecs());
				existingDeliverygoods.setUnit(deliverygoods.getUnit());
				existingDeliverygoods.setQuantity(deliverygoods.getQuantity());
				existingDeliverygoods.setProducer(deliverygoods.getProducer());
				existingDeliverygoods.setUnitPrice(deliverygoods.getUnitPrice());
				existingDeliverygoods.setTaxRate(deliverygoods.getTaxRate());
				existingDeliverygoods.setTotalAmount(deliverygoods.getTotalAmount());
			}
			deliverygoods = deliverygoodsDAO.store(existingDeliverygoods);
		} else {
			deliverygoods = deliverygoodsDAO.store(deliverygoods);
		}
		deliverygoodsDAO.flush();
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Deliverygoods saveDeliverygoodsDeliveryrecord(String id, Deliveryrecord related_deliveryrecord) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(id, -1, -1);
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

		deliverygoods.setDeliveryrecord(related_deliveryrecord);
		related_deliveryrecord.getDeliverygoodses().add(deliverygoods);
		deliverygoods = deliverygoodsDAO.store(deliverygoods);
		deliverygoodsDAO.flush();

		related_deliveryrecord = deliveryrecordDAO.store(related_deliveryrecord);
		deliveryrecordDAO.flush();

		return deliverygoods;
	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@Transactional
	public void deleteDeliverygoods(Deliverygoods deliverygoods) {
		deliverygoodsDAO.remove(deliverygoods);
		deliverygoodsDAO.flush();
	}

	/**
	 * Load an existing Deliverygoods entity
	 * 
	 */
	@Transactional
	public Set<Deliverygoods> loadDeliverygoodss() {
		return deliverygoodsDAO.findAllDeliverygoodss();
	}

	/**
	 * Return all Deliverygoods entity
	 * 
	 */
	@Transactional
	public List<Deliverygoods> findAllDeliverygoodss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Deliverygoods>(deliverygoodsDAO.findAllDeliverygoodss(startResult, maxRows));
	}

	/**
	 * Return a count of all Deliverygoods entity
	 * 
	 */
	@Transactional
	public Integer countDeliverygoodss() {
		return ((Long) deliverygoodsDAO.createQuerySingleResult("select count(o) from Deliverygoods o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@Transactional
	public Deliverygoods deleteDeliverygoodsDeliveryrecord(String deliverygoods_id, String related_deliveryrecord_id) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods_id, -1, -1);
		Deliveryrecord related_deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id, -1, -1);

		deliverygoods.setDeliveryrecord(null);
		related_deliveryrecord.getDeliverygoodses().remove(deliverygoods);
		deliverygoods = deliverygoodsDAO.store(deliverygoods);
		deliverygoodsDAO.flush();

		related_deliveryrecord = deliveryrecordDAO.store(related_deliveryrecord);
		deliveryrecordDAO.flush();

		deliveryrecordDAO.remove(related_deliveryrecord);
		deliveryrecordDAO.flush();

		return deliverygoods;
	}
}
