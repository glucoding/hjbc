package com.hejiascm.service;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Receivingrecord entities
 * 
 */

@Service("ReceivingrecordService")
@Transactional
public class ReceivingrecordServiceImpl implements ReceivingrecordService {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

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
	 * Instantiates a new ReceivingrecordServiceImpl.
	 *
	 */
	public ReceivingrecordServiceImpl() {
	}

	/**
	 * Return all Receivingrecord entity
	 * 
	 */
	@Transactional
	public List<Receivingrecord> findAllReceivingrecords(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Receivingrecord>(receivingrecordDAO.findAllReceivingrecords(startResult, maxRows));
	}

	/**
	 * Return a count of all Receivingrecord entity
	 * 
	 */
	@Transactional
	public Integer countReceivingrecords() {
		return ((Long) receivingrecordDAO.createQuerySingleResult("select count(o) from Receivingrecord o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@Transactional
	public Receivingrecord deleteReceivingrecordReceivingattachments(String receivingrecord_id, String related_receivingattachments_id) {
		Receivingattachment related_receivingattachments = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(related_receivingattachments_id, -1, -1);

		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		related_receivingattachments.setReceivingrecord(null);
		receivingrecord.getReceivingattachments().remove(related_receivingattachments);

		receivingattachmentDAO.remove(related_receivingattachments);
		receivingattachmentDAO.flush();

		return receivingrecord;
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public void deleteReceivingrecord(Receivingrecord receivingrecord) {
		receivingrecordDAO.remove(receivingrecord);
		receivingrecordDAO.flush();
	}

	/**
	 * Load an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public Set<Receivingrecord> loadReceivingrecords() {
		return receivingrecordDAO.findAllReceivingrecords();
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@Transactional
	public Receivingrecord saveReceivingrecordReceivinggoodses(String id, Receivinggoods related_receivinggoodses) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(id, -1, -1);
		Receivinggoods existingreceivinggoodses = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(related_receivinggoodses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingreceivinggoodses != null) {
			existingreceivinggoodses.setId(related_receivinggoodses.getId());
			existingreceivinggoodses.setSerial(related_receivinggoodses.getSerial());
			existingreceivinggoodses.setName(related_receivinggoodses.getName());
			existingreceivinggoodses.setDescription(related_receivinggoodses.getDescription());
			existingreceivinggoodses.setSpecs(related_receivinggoodses.getSpecs());
			existingreceivinggoodses.setUnit(related_receivinggoodses.getUnit());
			existingreceivinggoodses.setQuantity(related_receivinggoodses.getQuantity());
			existingreceivinggoodses.setProducer(related_receivinggoodses.getProducer());
			existingreceivinggoodses.setUnitPrice(related_receivinggoodses.getUnitPrice());
			existingreceivinggoodses.setTaxRate(related_receivinggoodses.getTaxRate());
			existingreceivinggoodses.setTotalAmount(related_receivinggoodses.getTotalAmount());
			related_receivinggoodses = existingreceivinggoodses;
		} else {
			related_receivinggoodses = receivinggoodsDAO.store(related_receivinggoodses);
			receivinggoodsDAO.flush();
		}

		related_receivinggoodses.setReceivingrecord(receivingrecord);
		receivingrecord.getReceivinggoodses().add(related_receivinggoodses);
		related_receivinggoodses = receivinggoodsDAO.store(related_receivinggoodses);
		receivinggoodsDAO.flush();

		receivingrecord = receivingrecordDAO.store(receivingrecord);
		receivingrecordDAO.flush();

		return receivingrecord;
	}

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@Transactional
	public Receivingrecord deleteReceivingrecordReceivinggoodses(String receivingrecord_id, String related_receivinggoodses_id) {
		Receivinggoods related_receivinggoodses = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(related_receivinggoodses_id, -1, -1);

		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		related_receivinggoodses.setReceivingrecord(null);
		receivingrecord.getReceivinggoodses().remove(related_receivinggoodses);

		receivinggoodsDAO.remove(related_receivinggoodses);
		receivinggoodsDAO.flush();

		return receivingrecord;
	}

	/**
	 */
	@Transactional
	public Receivingrecord findReceivingrecordByPrimaryKey(String id) {
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(id);
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Transactional
	public void saveReceivingrecord(Receivingrecord receivingrecord) {
		Receivingrecord existingReceivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());

		if (existingReceivingrecord != null) {
			if (existingReceivingrecord != receivingrecord) {
				existingReceivingrecord.setId(receivingrecord.getId());
				existingReceivingrecord.setReceivingFormId(receivingrecord.getReceivingFormId());
				existingReceivingrecord.setDeliveryRecordId(receivingrecord.getDeliveryRecordId());
				existingReceivingrecord.setOrderId(receivingrecord.getOrderId());
				existingReceivingrecord.setContractId(receivingrecord.getContractId());
				existingReceivingrecord.setContractVersion(receivingrecord.getContractVersion());
				existingReceivingrecord.setSubmitterId(receivingrecord.getSubmitterId());
				existingReceivingrecord.setSubmitTime(receivingrecord.getSubmitTime());
				existingReceivingrecord.setLastUpdateTime(receivingrecord.getLastUpdateTime());
				existingReceivingrecord.setAmount(receivingrecord.getAmount());
				existingReceivingrecord.setNotes(receivingrecord.getNotes());
				existingReceivingrecord.setName(receivingrecord.getName());
				existingReceivingrecord.setDescription(receivingrecord.getDescription());
				existingReceivingrecord.setQualityRecordIds(receivingrecord.getQualityRecordIds());
				existingReceivingrecord.setStatus(receivingrecord.getStatus());
				existingReceivingrecord.setDriver(receivingrecord.getDriver());
				existingReceivingrecord.setTruckNum(receivingrecord.getTruckNum());
				existingReceivingrecord.setOrgid(receivingrecord.getOrgid());
			}
			receivingrecord = receivingrecordDAO.store(existingReceivingrecord);
		} else {
			receivingrecord = receivingrecordDAO.store(receivingrecord);
		}
		receivingrecordDAO.flush();
	}

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@Transactional
	public Receivingrecord saveReceivingrecordReceivingattachments(String id, Receivingattachment related_receivingattachments) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(id, -1, -1);
		Receivingattachment existingreceivingattachments = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(related_receivingattachments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingreceivingattachments != null) {
			existingreceivingattachments.setId(related_receivingattachments.getId());
			existingreceivingattachments.setAddress(related_receivingattachments.getAddress());
			existingreceivingattachments.setDescription(related_receivingattachments.getDescription());
			related_receivingattachments = existingreceivingattachments;
		} else {
			related_receivingattachments = receivingattachmentDAO.store(related_receivingattachments);
			receivingattachmentDAO.flush();
		}

		related_receivingattachments.setReceivingrecord(receivingrecord);
		receivingrecord.getReceivingattachments().add(related_receivingattachments);
		related_receivingattachments = receivingattachmentDAO.store(related_receivingattachments);
		receivingattachmentDAO.flush();

		receivingrecord = receivingrecordDAO.store(receivingrecord);
		receivingrecordDAO.flush();

		return receivingrecord;
	}
}
