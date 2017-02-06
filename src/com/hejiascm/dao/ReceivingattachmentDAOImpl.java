package com.hejiascm.dao;

import com.hejiascm.domain.Receivingattachment;

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
 * DAO to manage Receivingattachment entities.
 * 
 */
@Repository("ReceivingattachmentDAO")
@Transactional
public class ReceivingattachmentDAOImpl extends AbstractJpaDao<Receivingattachment>
		implements ReceivingattachmentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Receivingattachment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ReceivingattachmentDAOImpl
	 *
	 */
	public ReceivingattachmentDAOImpl() {
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
	 * JPQL Query - findAllReceivingattachments
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findAllReceivingattachments() throws DataAccessException {

		return findAllReceivingattachments(-1, -1);
	}

	/**
	 * JPQL Query - findAllReceivingattachments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findAllReceivingattachments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllReceivingattachments", startResult, maxRows);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingattachmentByDescription
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByDescription(String description) throws DataAccessException {

		return findReceivingattachmentByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingattachmentByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingattachmentByAddress
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByAddress(String address) throws DataAccessException {

		return findReceivingattachmentByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingattachmentByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingattachmentByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByDescriptionContaining(String description) throws DataAccessException {

		return findReceivingattachmentByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingattachmentByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingattachmentByIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByIdContaining(String id) throws DataAccessException {

		return findReceivingattachmentByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingattachmentByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingattachmentByPrimaryKey
	 *
	 */
	@Transactional
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id) throws DataAccessException {

		return findReceivingattachmentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByPrimaryKey
	 *
	 */

	@Transactional
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivingattachmentByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivingattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivingattachmentById
	 *
	 */
	@Transactional
	public Receivingattachment findReceivingattachmentById(String id) throws DataAccessException {

		return findReceivingattachmentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentById
	 *
	 */

	@Transactional
	public Receivingattachment findReceivingattachmentById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivingattachmentById", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivingattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivingattachmentByAddressContaining
	 *
	 */
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByAddressContaining(String address) throws DataAccessException {

		return findReceivingattachmentByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingattachmentByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingattachment> findReceivingattachmentByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingattachmentByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Receivingattachment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Receivingattachment entity) {
		return true;
	}
}
