package com.hejiascm.service;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Receivingattachment entities
 * 
 */

@Service("ReceivingattachmentService")
@Transactional
public class ReceivingattachmentServiceImpl implements
		ReceivingattachmentService {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Instantiates a new ReceivingattachmentServiceImpl.
	 *
	 */
	public ReceivingattachmentServiceImpl() {
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public Receivingattachment deleteReceivingattachmentReceivingrecord(String receivingattachment_id, String related_receivingrecord_id) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment_id, -1, -1);
		Receivingrecord related_receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id, -1, -1);

		receivingattachment.setReceivingrecord(null);
		related_receivingrecord.getReceivingattachments().remove(receivingattachment);
		receivingattachment = receivingattachmentDAO.store(receivingattachment);
		receivingattachmentDAO.flush();

		related_receivingrecord = receivingrecordDAO.store(related_receivingrecord);
		receivingrecordDAO.flush();

		receivingrecordDAO.remove(related_receivingrecord);
		receivingrecordDAO.flush();

		return receivingattachment;
	}

	/**
	 * Load an existing Receivingattachment entity
	 * 
	 */
	@Transactional
	public Set<Receivingattachment> loadReceivingattachments() {
		return receivingattachmentDAO.findAllReceivingattachments();
	}

	/**
	 * Return a count of all Receivingattachment entity
	 * 
	 */
	@Transactional
	public Integer countReceivingattachments() {
		return ((Long) receivingattachmentDAO.createQuerySingleResult("select count(o) from Receivingattachment o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public Receivingattachment saveReceivingattachmentReceivingrecord(String id, Receivingrecord related_receivingrecord) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(id, -1, -1);
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

		receivingattachment.setReceivingrecord(related_receivingrecord);
		related_receivingrecord.getReceivingattachments().add(receivingattachment);
		receivingattachment = receivingattachmentDAO.store(receivingattachment);
		receivingattachmentDAO.flush();

		related_receivingrecord = receivingrecordDAO.store(related_receivingrecord);
		receivingrecordDAO.flush();

		return receivingattachment;
	}

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@Transactional
	public void saveReceivingattachment(Receivingattachment receivingattachment) {
		Receivingattachment existingReceivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment.getId());

		if (existingReceivingattachment != null) {
			if (existingReceivingattachment != receivingattachment) {
				existingReceivingattachment.setId(receivingattachment.getId());
				existingReceivingattachment.setAddress(receivingattachment.getAddress());
				existingReceivingattachment.setDescription(receivingattachment.getDescription());
			}
			receivingattachment = receivingattachmentDAO.store(existingReceivingattachment);
		} else {
			receivingattachment = receivingattachmentDAO.store(receivingattachment);
		}
		receivingattachmentDAO.flush();
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@Transactional
	public void deleteReceivingattachment(Receivingattachment receivingattachment) {
		receivingattachmentDAO.remove(receivingattachment);
		receivingattachmentDAO.flush();
	}

	/**
	 * Return all Receivingattachment entity
	 * 
	 */
	@Transactional
	public List<Receivingattachment> findAllReceivingattachments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Receivingattachment>(receivingattachmentDAO.findAllReceivingattachments(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id) {
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(id);
	}
}
