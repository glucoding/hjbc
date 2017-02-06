package com.hejiascm.service;

import com.hejiascm.dao.OperationDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Operation entities
 * 
 */

@Service("OperationService")
@Transactional
public class OperationServiceImpl implements OperationService {

	/**
	 * DAO injected by Spring that manages Operation entities
	 * 
	 */
	@Autowired
	private OperationDAO operationDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Instantiates a new OperationServiceImpl.
	 *
	 */
	public OperationServiceImpl() {
	}

	/**
	 * Load an existing Operation entity
	 * 
	 */
	@Transactional
	public Set<Operation> loadOperations() {
		return operationDAO.findAllOperations();
	}

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@Transactional
	public void saveOperation(Operation operation) {
		Operation existingOperation = operationDAO.findOperationByPrimaryKey(operation.getId());

		if (existingOperation != null) {
			if (existingOperation != operation) {
				existingOperation.setId(operation.getId());
				existingOperation.setOperatorId(operation.getOperatorId());
				existingOperation.setTime(operation.getTime());
				existingOperation.setType(operation.getType());
			}
			operation = operationDAO.store(existingOperation);
		} else {
			operation = operationDAO.store(operation);
		}
		operationDAO.flush();
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Operation deleteOperationTradecontract(String operation_id, String related_tradecontract_id) {
		Operation operation = operationDAO.findOperationByPrimaryKey(operation_id, -1, -1);
		Tradecontract related_tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		operation.setTradecontract(null);
		related_tradecontract.getOperations().remove(operation);
		operation = operationDAO.store(operation);
		operationDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		tradecontractDAO.remove(related_tradecontract);
		tradecontractDAO.flush();

		return operation;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Operation saveOperationTradecontract(String id, Tradecontract related_tradecontract) {
		Operation operation = operationDAO.findOperationByPrimaryKey(id, -1, -1);
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

		operation.setTradecontract(related_tradecontract);
		related_tradecontract.getOperations().add(operation);
		operation = operationDAO.store(operation);
		operationDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		return operation;
	}

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	@Transactional
	public void deleteOperation(Operation operation) {
		operationDAO.remove(operation);
		operationDAO.flush();
	}

	/**
	 * Return all Operation entity
	 * 
	 */
	@Transactional
	public List<Operation> findAllOperations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Operation>(operationDAO.findAllOperations(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Operation findOperationByPrimaryKey(String id) {
		return operationDAO.findOperationByPrimaryKey(id);
	}

	/**
	 * Return a count of all Operation entity
	 * 
	 */
	@Transactional
	public Integer countOperations() {
		return ((Long) operationDAO.createQuerySingleResult("select count(o) from Operation o").getSingleResult()).intValue();
	}
}
