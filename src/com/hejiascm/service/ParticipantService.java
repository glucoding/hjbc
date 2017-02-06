package com.hejiascm.service;

import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Participant entities
 * 
 */
public interface ParticipantService {

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	public void deleteParticipant(Participant participant);

	/**
	 * Save an existing Participant entity
	 * 
	 */
	public void saveParticipant(Participant participant_1);

	/**
	 * Return a count of all Participant entity
	 * 
	 */
	public Integer countParticipants();

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public Participant saveParticipantTradecontract(String id, Tradecontract related_tradecontract);

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public Participant deleteParticipantTradecontract(String participant_id, String related_tradecontract_id);

	/**
	 * Return all Participant entity
	 * 
	 */
	public List<Participant> findAllParticipants(Integer startResult, Integer maxRows);

	/**
	 */
	public Participant findParticipantByPrimaryKey(String id_1);

	/**
	 * Load an existing Participant entity
	 * 
	 */
	public Set<Participant> loadParticipants();
}