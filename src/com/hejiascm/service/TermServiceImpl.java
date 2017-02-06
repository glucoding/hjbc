package com.hejiascm.service;

import com.hejiascm.dao.TermDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Term entities
 * 
 */

@Service("TermService")
@Transactional
public class TermServiceImpl implements TermService {

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
	 * Instantiates a new TermServiceImpl.
	 *
	 */
	public TermServiceImpl() {
	}

	/**
	 * Return a count of all Term entity
	 * 
	 */
	@Transactional
	public Integer countTerms() {
		return ((Long) termDAO.createQuerySingleResult("select count(o) from Term o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@Transactional
	public void saveTerm(Term term) {
		Term existingTerm = termDAO.findTermByPrimaryKey(term.getId());

		if (existingTerm != null) {
			if (existingTerm != term) {
				existingTerm.setId(term.getId());
				existingTerm.setName(term.getName());
				existingTerm.setDescription(term.getDescription());
				existingTerm.setContent(term.getContent());
				existingTerm.setType(term.getType());
			}
			term = termDAO.store(existingTerm);
		} else {
			term = termDAO.store(term);
		}
		termDAO.flush();
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Term saveTermTradecontract(String id, Tradecontract related_tradecontract) {
		Term term = termDAO.findTermByPrimaryKey(id, -1, -1);
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

		term.setTradecontract(related_tradecontract);
		related_tradecontract.getTerms().add(term);
		term = termDAO.store(term);
		termDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		return term;
	}

	/**
	 */
	@Transactional
	public Term findTermByPrimaryKey(String id) {
		return termDAO.findTermByPrimaryKey(id);
	}

	/**
	 * Return all Term entity
	 * 
	 */
	@Transactional
	public List<Term> findAllTerms(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Term>(termDAO.findAllTerms(startResult, maxRows));
	}

	/**
	 * Load an existing Term entity
	 * 
	 */
	@Transactional
	public Set<Term> loadTerms() {
		return termDAO.findAllTerms();
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Term deleteTermTradecontract(String term_id, String related_tradecontract_id) {
		Term term = termDAO.findTermByPrimaryKey(term_id, -1, -1);
		Tradecontract related_tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		term.setTradecontract(null);
		related_tradecontract.getTerms().remove(term);
		term = termDAO.store(term);
		termDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		tradecontractDAO.remove(related_tradecontract);
		tradecontractDAO.flush();

		return term;
	}

	/**
	 * Delete an existing Term entity
	 * 
	 */
	@Transactional
	public void deleteTerm(Term term) {
		termDAO.remove(term);
		termDAO.flush();
	}
}
