package com.hejiascm.service;

import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Receivinggoods entities
 * 
 */

@Service("ReceivinggoodsService")
@Transactional
public class ReceivinggoodsServiceImpl implements ReceivinggoodsService {

	/**
	 * DAO injected by Spring that manages Receivinggoods entities
	 * 
	 */
	@Autowired
	private ReceivinggoodsDAO receivinggoodsDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Instantiates a new ReceivinggoodsServiceImpl.
	 *
	 */
	public ReceivinggoodsServiceImpl() {
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public Receivinggoods deleteReceivinggoodsReceivingrecord(String receivinggoods_id, String related_receivingrecord_id) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods_id, -1, -1);
		Receivingrecord related_receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id, -1, -1);

		receivinggoods.setReceivingrecord(null);
		related_receivingrecord.getReceivinggoodses().remove(receivinggoods);
		receivinggoods = receivinggoodsDAO.store(receivinggoods);
		receivinggoodsDAO.flush();

		related_receivingrecord = receivingrecordDAO.store(related_receivingrecord);
		receivingrecordDAO.flush();

		receivingrecordDAO.remove(related_receivingrecord);
		receivingrecordDAO.flush();

		return receivinggoods;
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public Receivinggoods saveReceivinggoodsReceivingrecord(String id, Receivingrecord related_receivingrecord) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(id, -1, -1);
		Receivingrecord existingreceivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord.getId());

		// copy into the existing record to preserve existing relationships
		if (existingreceivingrecord != null) {
			existingreceivingrecord.setId(related_receivingrecord.getId());
			existingreceivingrecord.setReceivingFormId(related_receivingrecord.getReceivingFormId());
			existingreceivingrecord.setDeliveryRecordId(related_receivingrecord.getDeliveryRecordId());
			existingreceivingrecord.setOrderId(related_receivingrecord.getOrderId());
			existingreceivingrecord.setContractId(related_receivingrecord.getContractId());
			existingreceivingrecord.setContractVersion(related_receivingrecord.getContractVersion());
			existingreceivingrecord.setSubmitterId(related_receivingrecord.getSubmitterId());
			existingreceivingrecord.setSubmitTime(related_receivingrecord.getSubmitTime());
			existingreceivingrecord.setLastUpdateTime(related_receivingrecord.getLastUpdateTime());
			existingreceivingrecord.setAmount(related_receivingrecord.getAmount());
			existingreceivingrecord.setNotes(related_receivingrecord.getNotes());
			existingreceivingrecord.setName(related_receivingrecord.getName());
			existingreceivingrecord.setDescription(related_receivingrecord.getDescription());
			existingreceivingrecord.setQualityRecordIds(related_receivingrecord.getQualityRecordIds());
			existingreceivingrecord.setStatus(related_receivingrecord.getStatus());
			existingreceivingrecord.setDriver(related_receivingrecord.getDriver());
			existingreceivingrecord.setTruckNum(related_receivingrecord.getTruckNum());
			existingreceivingrecord.setOrgid(related_receivingrecord.getOrgid());
			related_receivingrecord = existingreceivingrecord;
		} else {
			related_receivingrecord = receivingrecordDAO.store(related_receivingrecord);
			receivingrecordDAO.flush();
		}

		receivinggoods.setReceivingrecord(related_receivingrecord);
		related_receivingrecord.getReceivinggoodses().add(receivinggoods);
		receivinggoods = receivinggoodsDAO.store(receivinggoods);
		receivinggoodsDAO.flush();

		related_receivingrecord = receivingrecordDAO.store(related_receivingrecord);
		receivingrecordDAO.flush();

		return receivinggoods;
	}

	/**
	 * Load an existing Receivinggoods entity
	 * 
	 */
	@Transactional
	public Set<Receivinggoods> loadReceivinggoodss() {
		return receivinggoodsDAO.findAllReceivinggoodss();
	}

	/**
	 * Return a count of all Receivinggoods entity
	 * 
	 */
	@Transactional
	public Integer countReceivinggoodss() {
		return ((Long) receivinggoodsDAO.createQuerySingleResult("select count(o) from Receivinggoods o").getSingleResult()).intValue();
	}

	/**
	 * Return all Receivinggoods entity
	 * 
	 */
	@Transactional
	public List<Receivinggoods> findAllReceivinggoodss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Receivinggoods>(receivinggoodsDAO.findAllReceivinggoodss(startResult, maxRows));
	}

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@Transactional
	public void deleteReceivinggoods(Receivinggoods receivinggoods) {
		receivinggoodsDAO.remove(receivinggoods);
		receivinggoodsDAO.flush();
	}

	/**
	 */
	@Transactional
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id) {
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(id);
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@Transactional
	public void saveReceivinggoods(Receivinggoods receivinggoods) {
		Receivinggoods existingReceivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods.getId());

		if (existingReceivinggoods != null) {
			if (existingReceivinggoods != receivinggoods) {
				existingReceivinggoods.setId(receivinggoods.getId());
				existingReceivinggoods.setSerial(receivinggoods.getSerial());
				existingReceivinggoods.setName(receivinggoods.getName());
				existingReceivinggoods.setDescription(receivinggoods.getDescription());
				existingReceivinggoods.setSpecs(receivinggoods.getSpecs());
				existingReceivinggoods.setUnit(receivinggoods.getUnit());
				existingReceivinggoods.setQuantity(receivinggoods.getQuantity());
				existingReceivinggoods.setProducer(receivinggoods.getProducer());
				existingReceivinggoods.setUnitPrice(receivinggoods.getUnitPrice());
				existingReceivinggoods.setTaxRate(receivinggoods.getTaxRate());
				existingReceivinggoods.setTotalAmount(receivinggoods.getTotalAmount());
			}
			receivinggoods = receivinggoodsDAO.store(existingReceivinggoods);
		} else {
			receivinggoods = receivinggoodsDAO.store(receivinggoods);
		}
		receivinggoodsDAO.flush();
	}
}
