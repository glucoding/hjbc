package com.hejiascm.service;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Tradecontract entities
 * 
 */
public interface TradecontractService {

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	public Tradecontract deleteTradecontractContractgoodses(String tradecontract_id, String related_contractgoodses_id);

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	public Tradecontract saveTradecontractContractgoodses(String id, Contractgoods related_contractgoodses);

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	public Tradecontract saveTradecontractTradecontractattachments(String id_1, Tradecontractattachment related_tradecontractattachments);

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	public Tradecontract deleteTradecontractOperations(String tradecontract_id_1, String related_operations_id);

	/**
	 * Save an existing Participant entity
	 * 
	 */
	public Tradecontract saveTradecontractParticipants(String id_2, Participant related_participants);

	/**
	 * Save an existing Operation entity
	 * 
	 */
	public Tradecontract saveTradecontractOperations(String id_3, Operation related_operations);

	/**
	 * Load an existing Tradecontract entity
	 * 
	 */
	public Set<Tradecontract> loadTradecontracts();

	/**
	 * Return all Tradecontract entity
	 * 
	 */
	public List<Tradecontract> findAllTradecontracts(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	public Tradecontract deleteTradecontractTradecontractattachments(String tradecontract_id_2, String related_tradecontractattachments_id);

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public void saveTradecontract(Tradecontract tradecontract);

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	public Tradecontract deleteTradecontractParticipants(String tradecontract_id_3, String related_participants_id);

	/**
	 * Save an existing Term entity
	 * 
	 */
	public Tradecontract saveTradecontractTerms(String id_4, Term related_terms);

	/**
	 */
	public Tradecontract findTradecontractByPrimaryKey(String id_5);

	/**
	 * Delete an existing Term entity
	 * 
	 */
	public Tradecontract deleteTradecontractTerms(String tradecontract_id_4, String related_terms_id);

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public void deleteTradecontract(Tradecontract tradecontract_1);

	/**
	 * Return a count of all Tradecontract entity
	 * 
	 */
	public Integer countTradecontracts();
}