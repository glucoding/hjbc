package com.hejiascm.service;

import com.hejiascm.dao.ParticipantDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Participant entities
 * 
 */

@Service("ParticipantService")
@Transactional
public class ParticipantServiceImpl implements ParticipantService {

	/**
	 * DAO injected by Spring that manages Participant entities
	 * 
	 */
	@Autowired
	private ParticipantDAO participantDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Instantiates a new ParticipantServiceImpl.
	 *
	 */
	public ParticipantServiceImpl() {
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@Transactional
	public void deleteParticipant(Participant participant) {
		participantDAO.remove(participant);
		participantDAO.flush();
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@Transactional
	public void saveParticipant(Participant participant) {
		Participant existingParticipant = participantDAO.findParticipantByPrimaryKey(participant.getId());

		if (existingParticipant != null) {
			if (existingParticipant != participant) {
				existingParticipant.setId(participant.getId());
				existingParticipant.setName(participant.getName());
				existingParticipant.setRole(participant.getRole());
				existingParticipant.setPermission(participant.getPermission());
				existingParticipant.setStatus(participant.getStatus());
				existingParticipant.setSignedTime(participant.getSignedTime());
			}
			participant = participantDAO.store(existingParticipant);
		} else {
			participant = participantDAO.store(participant);
		}
		participantDAO.flush();
	}

	/**
	 * Return a count of all Participant entity
	 * 
	 */
	@Transactional
	public Integer countParticipants() {
		return ((Long) participantDAO.createQuerySingleResult("select count(o) from Participant o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Participant saveParticipantTradecontract(String id, Tradecontract related_tradecontract) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(id, -1, -1);
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

		participant.setTradecontract(related_tradecontract);
		related_tradecontract.getParticipants().add(participant);
		participant = participantDAO.store(participant);
		participantDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		return participant;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Participant deleteParticipantTradecontract(String participant_id, String related_tradecontract_id) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(participant_id, -1, -1);
		Tradecontract related_tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		participant.setTradecontract(null);
		related_tradecontract.getParticipants().remove(participant);
		participant = participantDAO.store(participant);
		participantDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		tradecontractDAO.remove(related_tradecontract);
		tradecontractDAO.flush();

		return participant;
	}

	/**
	 * Return all Participant entity
	 * 
	 */
	@Transactional
	public List<Participant> findAllParticipants(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Participant>(participantDAO.findAllParticipants(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Participant findParticipantByPrimaryKey(String id) {
		return participantDAO.findParticipantByPrimaryKey(id);
	}

	/**
	 * Load an existing Participant entity
	 * 
	 */
	@Transactional
	public Set<Participant> loadParticipants() {
		return participantDAO.findAllParticipants();
	}
}
