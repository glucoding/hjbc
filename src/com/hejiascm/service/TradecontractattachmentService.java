package com.hejiascm.service;

import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Tradecontractattachment entities
 * 
 */
public interface TradecontractattachmentService {

	/**
	 * Load an existing Tradecontractattachment entity
	 * 
	 */
	public Set<Tradecontractattachment> loadTradecontractattachments();

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	public void saveTradecontractattachment(Tradecontractattachment tradecontractattachment);

	/**
	 */
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id);

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	public void deleteTradecontractattachment(Tradecontractattachment tradecontractattachment_1);

	/**
	 * Return all Tradecontractattachment entity
	 * 
	 */
	public List<Tradecontractattachment> findAllTradecontractattachments(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Tradecontractattachment entity
	 * 
	 */
	public Integer countTradecontractattachments();

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public Tradecontractattachment deleteTradecontractattachmentTradecontract(String tradecontractattachment_id, String related_tradecontract_id);

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public Tradecontractattachment saveTradecontractattachmentTradecontract(String id_1, Tradecontract related_tradecontract);
}