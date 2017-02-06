package com.hejiascm.dao;

import com.hejiascm.domain.Operation;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Operation entities.
 * 
 */
public interface OperationDAO extends JpaDao<Operation> {

	/**
	 * JPQL Query - findOperationByPrimaryKey
	 *
	 */
	public Operation findOperationByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByPrimaryKey
	 *
	 */
	public Operation findOperationByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOperations
	 *
	 */
	public Set<Operation> findAllOperations() throws DataAccessException;

	/**
	 * JPQL Query - findAllOperations
	 *
	 */
	public Set<Operation> findAllOperations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByOperatorIdContaining
	 *
	 */
	public Set<Operation> findOperationByOperatorIdContaining(String operatorId) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByOperatorIdContaining
	 *
	 */
	public Set<Operation> findOperationByOperatorIdContaining(String operatorId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByTime
	 *
	 */
	public Set<Operation> findOperationByTime(String time) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByTime
	 *
	 */
	public Set<Operation> findOperationByTime(String time, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationById
	 *
	 */
	public Operation findOperationById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOperationById
	 *
	 */
	public Operation findOperationById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByType
	 *
	 */
	public Set<Operation> findOperationByType(Integer type) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByType
	 *
	 */
	public Set<Operation> findOperationByType(Integer type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByOperatorId
	 *
	 */
	public Set<Operation> findOperationByOperatorId(String operatorId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByOperatorId
	 *
	 */
	public Set<Operation> findOperationByOperatorId(String operatorId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByIdContaining
	 *
	 */
	public Set<Operation> findOperationByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByIdContaining
	 *
	 */
	public Set<Operation> findOperationByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByTimeContaining
	 *
	 */
	public Set<Operation> findOperationByTimeContaining(String time_1) throws DataAccessException;

	/**
	 * JPQL Query - findOperationByTimeContaining
	 *
	 */
	public Set<Operation> findOperationByTimeContaining(String time_1, int startResult, int maxRows) throws DataAccessException;

}