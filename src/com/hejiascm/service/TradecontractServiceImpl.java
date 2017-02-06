package com.hejiascm.service;

import com.hejiascm.dao.ContractgoodsDAO;
import com.hejiascm.dao.OperationDAO;
import com.hejiascm.dao.ParticipantDAO;
import com.hejiascm.dao.TermDAO;
import com.hejiascm.dao.TradecontractDAO;
import com.hejiascm.dao.TradecontractattachmentDAO;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Tradecontract entities
 * 
 */

@Service("TradecontractService")
@Transactional
public class TradecontractServiceImpl implements TradecontractService {

	/**
	 * DAO injected by Spring that manages Contractgoods entities
	 * 
	 */
	@Autowired
	private ContractgoodsDAO contractgoodsDAO;

	/**
	 * DAO injected by Spring that manages Operation entities
	 * 
	 */
	@Autowired
	private OperationDAO operationDAO;

	/**
	 * DAO injected by Spring that manages Participant entities
	 * 
	 */
	@Autowired
	private ParticipantDAO participantDAO;

	/**
	 * DAO injected by Spring that manages Term entities
	 * 
	 */
	@Autowired
	private TermDAO termDAO;

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
	 * Instantiates a new TradecontractServiceImpl.
	 *
	 */
	public TradecontractServiceImpl() {
	}

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@Transactional
	public Tradecontract deleteTradecontractContractgoodses(String tradecontract_id, String related_contractgoodses_id) {
		Contractgoods related_contractgoodses = contractgoodsDAO.findContractgoodsByPrimaryKey(related_contractgoodses_id, -1, -1);

		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		related_contractgoodses.setTradecontract(null);
		tradecontract.getContractgoodses().remove(related_contractgoodses);

		contractgoodsDAO.remove(related_contractgoodses);
		contractgoodsDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@Transactional
	public Tradecontract saveTradecontractContractgoodses(String id, Contractgoods related_contractgoodses) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(id, -1, -1);
		Contractgoods existingcontractgoodses = contractgoodsDAO.findContractgoodsByPrimaryKey(related_contractgoodses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcontractgoodses != null) {
			existingcontractgoodses.setId(related_contractgoodses.getId());
			existingcontractgoodses.setSerial(related_contractgoodses.getSerial());
			existingcontractgoodses.setName(related_contractgoodses.getName());
			existingcontractgoodses.setDescription(related_contractgoodses.getDescription());
			existingcontractgoodses.setSpecs(related_contractgoodses.getSpecs());
			existingcontractgoodses.setUnit(related_contractgoodses.getUnit());
			existingcontractgoodses.setQuantity(related_contractgoodses.getQuantity());
			existingcontractgoodses.setProducer(related_contractgoodses.getProducer());
			existingcontractgoodses.setUnitPrice(related_contractgoodses.getUnitPrice());
			existingcontractgoodses.setTaxRate(related_contractgoodses.getTaxRate());
			existingcontractgoodses.setTotalAmount(related_contractgoodses.getTotalAmount());
			related_contractgoodses = existingcontractgoodses;
		} else {
			related_contractgoodses = contractgoodsDAO.store(related_contractgoodses);
			contractgoodsDAO.flush();
		}

		related_contractgoodses.setTradecontract(tradecontract);
		tradecontract.getContractgoodses().add(related_contractgoodses);
		related_contractgoodses = contractgoodsDAO.store(related_contractgoodses);
		contractgoodsDAO.flush();

		tradecontract = tradecontractDAO.store(tradecontract);
		tradecontractDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public Tradecontract saveTradecontractTradecontractattachments(String id, Tradecontractattachment related_tradecontractattachments) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(id, -1, -1);
		Tradecontractattachment existingtradecontractattachments = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(related_tradecontractattachments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtradecontractattachments != null) {
			existingtradecontractattachments.setId(related_tradecontractattachments.getId());
			existingtradecontractattachments.setContent(related_tradecontractattachments.getContent());
			existingtradecontractattachments.setDescription(related_tradecontractattachments.getDescription());
			related_tradecontractattachments = existingtradecontractattachments;
		} else {
			related_tradecontractattachments = tradecontractattachmentDAO.store(related_tradecontractattachments);
			tradecontractattachmentDAO.flush();
		}

		related_tradecontractattachments.setTradecontract(tradecontract);
		tradecontract.getTradecontractattachments().add(related_tradecontractattachments);
		related_tradecontractattachments = tradecontractattachmentDAO.store(related_tradecontractattachments);
		tradecontractattachmentDAO.flush();

		tradecontract = tradecontractDAO.store(tradecontract);
		tradecontractDAO.flush();

		return tradecontract;
	}

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	@Transactional
	public Tradecontract deleteTradecontractOperations(String tradecontract_id, String related_operations_id) {
		Operation related_operations = operationDAO.findOperationByPrimaryKey(related_operations_id, -1, -1);

		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		related_operations.setTradecontract(null);
		tradecontract.getOperations().remove(related_operations);

		operationDAO.remove(related_operations);
		operationDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@Transactional
	public Tradecontract saveTradecontractParticipants(String id, Participant related_participants) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(id, -1, -1);
		Participant existingparticipants = participantDAO.findParticipantByPrimaryKey(related_participants.getId());

		// copy into the existing record to preserve existing relationships
		if (existingparticipants != null) {
			existingparticipants.setId(related_participants.getId());
			existingparticipants.setName(related_participants.getName());
			existingparticipants.setRole(related_participants.getRole());
			existingparticipants.setPermission(related_participants.getPermission());
			existingparticipants.setStatus(related_participants.getStatus());
			existingparticipants.setSignedTime(related_participants.getSignedTime());
			related_participants = existingparticipants;
		} else {
			related_participants = participantDAO.store(related_participants);
			participantDAO.flush();
		}

		related_participants.setTradecontract(tradecontract);
		tradecontract.getParticipants().add(related_participants);
		related_participants = participantDAO.store(related_participants);
		participantDAO.flush();

		tradecontract = tradecontractDAO.store(tradecontract);
		tradecontractDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@Transactional
	public Tradecontract saveTradecontractOperations(String id, Operation related_operations) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(id, -1, -1);
		Operation existingoperations = operationDAO.findOperationByPrimaryKey(related_operations.getId());

		// copy into the existing record to preserve existing relationships
		if (existingoperations != null) {
			existingoperations.setId(related_operations.getId());
			existingoperations.setOperatorId(related_operations.getOperatorId());
			existingoperations.setTime(related_operations.getTime());
			existingoperations.setType(related_operations.getType());
			related_operations = existingoperations;
		} else {
			related_operations = operationDAO.store(related_operations);
			operationDAO.flush();
		}

		related_operations.setTradecontract(tradecontract);
		tradecontract.getOperations().add(related_operations);
		related_operations = operationDAO.store(related_operations);
		operationDAO.flush();

		tradecontract = tradecontractDAO.store(tradecontract);
		tradecontractDAO.flush();

		return tradecontract;
	}

	/**
	 * Load an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Set<Tradecontract> loadTradecontracts() {
		return tradecontractDAO.findAllTradecontracts();
	}

	/**
	 * Return all Tradecontract entity
	 * 
	 */
	@Transactional
	public List<Tradecontract> findAllTradecontracts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Tradecontract>(tradecontractDAO.findAllTradecontracts(startResult, maxRows));
	}

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@Transactional
	public Tradecontract deleteTradecontractTradecontractattachments(String tradecontract_id, String related_tradecontractattachments_id) {
		Tradecontractattachment related_tradecontractattachments = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(related_tradecontractattachments_id, -1, -1);

		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		related_tradecontractattachments.setTradecontract(null);
		tradecontract.getTradecontractattachments().remove(related_tradecontractattachments);

		tradecontractattachmentDAO.remove(related_tradecontractattachments);
		tradecontractattachmentDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public void saveTradecontract(Tradecontract tradecontract) {
		Tradecontract existingTradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());

		if (existingTradecontract != null) {
			if (existingTradecontract != tradecontract) {
				existingTradecontract.setId(tradecontract.getId());
				existingTradecontract.setVersion(tradecontract.getVersion());
				existingTradecontract.setSerial(tradecontract.getSerial());
				existingTradecontract.setContractType(tradecontract.getContractType());
				existingTradecontract.setServiceType(tradecontract.getServiceType());
				existingTradecontract.setEffectiveTime(tradecontract.getEffectiveTime());
				existingTradecontract.setExpirationTime(tradecontract.getExpirationTime());
				existingTradecontract.setCurrency(tradecontract.getCurrency());
				existingTradecontract.setDataEffectivePaticipant(tradecontract.getDataEffectivePaticipant());
				existingTradecontract.setOrderSubmitterId(tradecontract.getOrderSubmitterId());
				existingTradecontract.setMeansOfTransportation(tradecontract.getMeansOfTransportation());
				existingTradecontract.setExecutionStatus(tradecontract.getExecutionStatus());
				existingTradecontract.setChangeStatus(tradecontract.getChangeStatus());
				existingTradecontract.setPreviousVersion(tradecontract.getPreviousVersion());
				existingTradecontract.setCurrentEffectiveVersion(tradecontract.getCurrentEffectiveVersion());
				existingTradecontract.setRemarks(tradecontract.getRemarks());
				existingTradecontract.setDescription(tradecontract.getDescription());
				existingTradecontract.setOrgid(tradecontract.getOrgid());
			}
			tradecontract = tradecontractDAO.store(existingTradecontract);
		} else {
			tradecontract = tradecontractDAO.store(tradecontract);
		}
		tradecontractDAO.flush();
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@Transactional
	public Tradecontract deleteTradecontractParticipants(String tradecontract_id, String related_participants_id) {
		Participant related_participants = participantDAO.findParticipantByPrimaryKey(related_participants_id, -1, -1);

		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		related_participants.setTradecontract(null);
		tradecontract.getParticipants().remove(related_participants);

		participantDAO.remove(related_participants);
		participantDAO.flush();

		return tradecontract;
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@Transactional
	public Tradecontract saveTradecontractTerms(String id, Term related_terms) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(id, -1, -1);
		Term existingterms = termDAO.findTermByPrimaryKey(related_terms.getId());

		// copy into the existing record to preserve existing relationships
		if (existingterms != null) {
			existingterms.setId(related_terms.getId());
			existingterms.setName(related_terms.getName());
			existingterms.setDescription(related_terms.getDescription());
			existingterms.setContent(related_terms.getContent());
			existingterms.setType(related_terms.getType());
			related_terms = existingterms;
		} else {
			related_terms = termDAO.store(related_terms);
			termDAO.flush();
		}

		related_terms.setTradecontract(tradecontract);
		tradecontract.getTerms().add(related_terms);
		related_terms = termDAO.store(related_terms);
		termDAO.flush();

		tradecontract = tradecontractDAO.store(tradecontract);
		tradecontractDAO.flush();

		return tradecontract;
	}

	/**
	 */
	@Transactional
	public Tradecontract findTradecontractByPrimaryKey(String id) {
		return tradecontractDAO.findTradecontractByPrimaryKey(id);
	}

	/**
	 * Delete an existing Term entity
	 * 
	 */
	@Transactional
	public Tradecontract deleteTradecontractTerms(String tradecontract_id, String related_terms_id) {
		Term related_terms = termDAO.findTermByPrimaryKey(related_terms_id, -1, -1);

		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		related_terms.setTradecontract(null);
		tradecontract.getTerms().remove(related_terms);

		termDAO.remove(related_terms);
		termDAO.flush();

		return tradecontract;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public void deleteTradecontract(Tradecontract tradecontract) {
		tradecontractDAO.remove(tradecontract);
		tradecontractDAO.flush();
	}

	/**
	 * Return a count of all Tradecontract entity
	 * 
	 */
	@Transactional
	public Integer countTradecontracts() {
		return ((Long) tradecontractDAO.createQuerySingleResult("select count(o) from Tradecontract o").getSingleResult()).intValue();
	}
}
