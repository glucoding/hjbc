package com.hejiascm.dao;

import com.hejiascm.domain.Operation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Operation entities.
 * 
 */
@Repository("OperationDAO")
@Transactional
public class OperationDAOImpl extends AbstractJpaDao<Operation> implements
		OperationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Operation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OperationDAOImpl
	 *
	 */
	public OperationDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findOperationByPrimaryKey
	 *
	 */
	@Transactional
	public Operation findOperationByPrimaryKey(String id) throws DataAccessException {

		return findOperationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByPrimaryKey
	 *
	 */

	@Transactional
	public Operation findOperationByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOperationByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Operation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllOperations
	 *
	 */
	@Transactional
	public Set<Operation> findAllOperations() throws DataAccessException {

		return findAllOperations(-1, -1);
	}

	/**
	 * JPQL Query - findAllOperations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findAllOperations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOperations", startResult, maxRows);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationByOperatorIdContaining
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByOperatorIdContaining(String operatorId) throws DataAccessException {

		return findOperationByOperatorIdContaining(operatorId, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByOperatorIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByOperatorIdContaining(String operatorId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByOperatorIdContaining", startResult, maxRows, operatorId);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationByTime
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByTime(String time) throws DataAccessException {

		return findOperationByTime(time, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByTime(String time, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByTime", startResult, maxRows, time);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationById
	 *
	 */
	@Transactional
	public Operation findOperationById(String id) throws DataAccessException {

		return findOperationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOperationById
	 *
	 */

	@Transactional
	public Operation findOperationById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOperationById", startResult, maxRows, id);
			return (com.hejiascm.domain.Operation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOperationByType
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByType(Integer type) throws DataAccessException {

		return findOperationByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByType(Integer type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByType", startResult, maxRows, type);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationByOperatorId
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByOperatorId(String operatorId) throws DataAccessException {

		return findOperationByOperatorId(operatorId, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByOperatorId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByOperatorId(String operatorId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByOperatorId", startResult, maxRows, operatorId);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationByIdContaining
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByIdContaining(String id) throws DataAccessException {

		return findOperationByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * JPQL Query - findOperationByTimeContaining
	 *
	 */
	@Transactional
	public Set<Operation> findOperationByTimeContaining(String time) throws DataAccessException {

		return findOperationByTimeContaining(time, -1, -1);
	}

	/**
	 * JPQL Query - findOperationByTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Operation> findOperationByTimeContaining(String time, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOperationByTimeContaining", startResult, maxRows, time);
		return new LinkedHashSet<Operation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Operation entity) {
		return true;
	}
}
