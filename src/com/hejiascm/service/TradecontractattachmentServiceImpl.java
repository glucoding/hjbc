package com.hejiascm.service;

import com.hejiascm.dao.TradecontractDAO;
import com.hejiascm.dao.TradecontractattachmentDAO;

import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Tradecontractattachment entities
 * 
 */

@Service("TradecontractattachmentService")
@Transactional
public class TradecontractattachmentServiceImpl implements
		TradecontractattachmentService {

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * DAO injected by Spring that manages Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentDAO tradecontractattachmentDAO;

	/**
	 * Instantiates a new TradecontractattachmentServiceImpl.
	 *
	 */
	public TradecontractattachmentServiceImpl() {
	}

	/**
	 * Load an existing Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public Set<Tradecontractattachment> loadTradecontractattachments() {
		return tradecontractattachmentDAO.findAllTradecontractattachments();
	}

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public void saveTradecontractattachment(Tradecontractattachment tradecontractattachment) {
		Tradecontractattachment existingTradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment.getId());

		if (existingTradecontractattachment != null) {
			if (existingTradecontractattachment != tradecontractattachment) {
				existingTradecontractattachment.setId(tradecontractattachment.getId());
				existingTradecontractattachment.setContent(tradecontractattachment.getContent());
				existingTradecontractattachment.setDescription(tradecontractattachment.getDescription());
			}
			tradecontractattachment = tradecontractattachmentDAO.store(existingTradecontractattachment);
		} else {
			tradecontractattachment = tradecontractattachmentDAO.store(tradecontractattachment);
		}
		tradecontractattachmentDAO.flush();
	}

	/**
	 */
	@Transactional
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id) {
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(id);
	}

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public void deleteTradecontractattachment(Tradecontractattachment tradecontractattachment) {
		tradecontractattachmentDAO.remove(tradecontractattachment);
		tradecontractattachmentDAO.flush();
	}

	/**
	 * Return all Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public List<Tradecontractattachment> findAllTradecontractattachments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Tradecontractattachment>(tradecontractattachmentDAO.findAllTradecontractattachments(startResult, maxRows));
	}

	/**
	 * Return a count of all Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public Integer countTradecontractattachments() {
		return ((Long) tradecontractattachmentDAO.createQuerySingleResult("select count(o) from Tradecontractattachment o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Tradecontractattachment deleteTradecontractattachmentTradecontract(String tradecontractattachment_id, String related_tradecontract_id) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment_id, -1, -1);
		Tradecontract related_tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		tradecontractattachment.setTradecontract(null);
		related_tradecontract.getTradecontractattachments().remove(tradecontractattachment);
		tradecontractattachment = tradecontractattachmentDAO.store(tradecontractattachment);
		tradecontractattachmentDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		tradecontractDAO.remove(related_tradecontract);
		tradecontractDAO.flush();

		return tradecontractattachment;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Tradecontractattachment saveTradecontractattachmentTradecontract(String id, Tradecontract related_tradecontract) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(id, -1, -1);
		Tradecontract existingtradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtradecontract != null) {
			existingtradecontract.setId(related_tradecontract.getId());
			existingtradecontract.setVersion(related_tradecontract.getVersion());
			existingtradecontract.setSerial(related_tradecontract.getSerial());
			existingtradecontract.setContractType(related_tradecontract.getContractType());
			existingtradecontract.setServiceType(related_tradecontract.getServiceType());
			existingtradecontract.setEffectiveTime(related_tradecontract.getEffectiveTime());
			existingtradecontract.setExpirationTime(related_tradecontract.getExpirationTime());
			existingtradecontract.setCurrency(related_tradecontract.getCurrency());
			existingtradecontract.setDataEffectivePaticipant(related_tradecontract.getDataEffectivePaticipant());
			existingtradecontract.setOrderSubmitterId(related_tradecontract.getOrderSubmitterId());
			existingtradecontract.setMeansOfTransportation(related_tradecontract.getMeansOfTransportation());
			existingtradecontract.setExecutionStatus(related_tradecontract.getExecutionStatus());
			existingtradecontract.setChangeStatus(related_tradecontract.getChangeStatus());
			existingtradecontract.setPreviousVersion(related_tradecontract.getPreviousVersion());
			existingtradecontract.setCurrentEffectiveVersion(related_tradecontract.getCurrentEffectiveVersion());
			existingtradecontract.setRemarks(related_tradecontract.getRemarks());
			existingtradecontract.setDescription(related_tradecontract.getDescription());
			existingtradecontract.setOrgid(related_tradecontract.getOrgid());
			related_tradecontract = existingtradecontract;
		} else {
			related_tradecontract = tradecontractDAO.store(related_tradecontract);
			tradecontractDAO.flush();
		}

		tradecontractattachment.setTradecontract(related_tradecontract);
		related_tradecontract.getTradecontractattachments().add(tradecontractattachment);
		tradecontractattachment = tradecontractattachmentDAO.store(tradecontractattachment);
		tradecontractattachmentDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		return tradecontractattachment;
	}
}
