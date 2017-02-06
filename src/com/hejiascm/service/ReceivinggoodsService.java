package com.hejiascm.service;

import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Receivinggoods entities
 * 
 */
public interface ReceivinggoodsService {

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	public Receivinggoods deleteReceivinggoodsReceivingrecord(String receivinggoods_id, String related_receivingrecord_id);

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	public Receivinggoods saveReceivinggoodsReceivingrecord(String id, Receivingrecord related_receivingrecord);

	/**
	 * Load an existing Receivinggoods entity
	 * 
	 */
	public Set<Receivinggoods> loadReceivinggoodss();

	/**
	 * Return a count of all Receivinggoods entity
	 * 
	 */
	public Integer countReceivinggoodss();

	/**
	 * Return all Receivinggoods entity
	 * 
	 */
	public List<Receivinggoods> findAllReceivinggoodss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	public void deleteReceivinggoods(Receivinggoods receivinggoods);

	/**
	 */
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id_1);

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	public void saveReceivinggoods(Receivinggoods receivinggoods_1);
}