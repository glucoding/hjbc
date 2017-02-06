package com.hejiascm.service;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Contractgoods entities
 * 
 */
public interface ContractgoodsService {

	/**
	 * Return a count of all Contractgoods entity
	 * 
	 */
	public Integer countContractgoodss();

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public Contractgoods saveContractgoodsTradecontract(String id, Tradecontract related_tradecontract);

	/**
	 */
	public Contractgoods findContractgoodsByPrimaryKey(String id_1);

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	public void deleteContractgoods(Contractgoods contractgoods);

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public Contractgoods deleteContractgoodsTradecontract(String contractgoods_id, String related_tradecontract_id);

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	public void saveContractgoods(Contractgoods contractgoods_1);

	/**
	 * Load an existing Contractgoods entity
	 * 
	 */
	public Set<Contractgoods> loadContractgoodss();

	/**
	 * Return all Contractgoods entity
	 * 
	 */
	public List<Contractgoods> findAllContractgoodss(Integer startResult, Integer maxRows);
}