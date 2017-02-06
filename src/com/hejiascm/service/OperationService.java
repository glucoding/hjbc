package com.hejiascm.service;

import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Operation entities
 * 
 */
public interface OperationService {

	/**
	 * Load an existing Operation entity
	 * 
	 */
	public Set<Operation> loadOperations();

	/**
	 * Save an existing Operation entity
	 * 
	 */
	public void saveOperation(Operation operation);

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	public Operation deleteOperationTradecontract(String operation_id, String related_tradecontract_id);

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	public Operation saveOperationTradecontract(String id, Tradecontract related_tradecontract);

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	public void deleteOperation(Operation operation_1);

	/**
	 * Return all Operation entity
	 * 
	 */
	public List<Operation> findAllOperations(Integer startResult, Integer maxRows);

	/**
	 */
	public Operation findOperationByPrimaryKey(String id_1);

	/**
	 * Return a count of all Operation entity
	 * 
	 */
	public Integer countOperations();
}