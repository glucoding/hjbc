package com.hejiascm.service;

import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Term entities
 * 
 */
public interface TermService {

	/**
	 * Return a count of all Term entity
	 * 
	 */
	public Integer countTerms();

	/**
	 * Save an existing Term entity
	 * 
	 */
	public void saveTerm(Term term);

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public Term saveTermTradecontract(String id, Tradecontract related_tradecontract);

	/**
	 */
	public Term findTermByPrimaryKey(String id_1);

	/**
	 * Return all Term entity
	 * 
	 */
	public List<Term> findAllTerms(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Term entity
	 * 
	 */
	public Set<Term> loadTerms();

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public Term deleteTermTradecontract(String term_id, String related_tradecontract_id);

	/**
	 * Delete an existing Term entity
	 * 
	 */
	public void deleteTerm(Term term_1);
}