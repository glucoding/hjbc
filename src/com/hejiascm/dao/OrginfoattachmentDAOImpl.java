package com.hejiascm.dao;

import com.hejiascm.domain.Orginfoattachment;

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
 * DAO to manage Orginfoattachment entities.
 * 
 */
@Repository("OrginfoattachmentDAO")
@Transactional
public class OrginfoattachmentDAOImpl extends AbstractJpaDao<Orginfoattachment>
		implements OrginfoattachmentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Orginfoattachment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrginfoattachmentDAOImpl
	 *
	 */
	public OrginfoattachmentDAOImpl() {
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
	 * JPQL Query - findOrginfoattachmentByAddress
	 *
	 */
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByAddress(String address) throws DataAccessException {

		return findOrginfoattachmentByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoattachmentByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoattachmentByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Orginfoattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoattachmentById
	 *
	 */
	@Transactional
	public Orginfoattachment findOrginfoattachmentById(String id) throws DataAccessException {

		return findOrginfoattachmentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoattachmentById
	 *
	 */

	@Transactional
	public Orginfoattachment findOrginfoattachmentById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrginfoattachmentById", startResult, maxRows, id);
			return (com.hejiascm.domain.Orginfoattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrginfoattachmentByAddressContaining
	 *
	 */
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByAddressContaining(String address) throws DataAccessException {

		return findOrginfoattachmentByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoattachmentByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoattachmentByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Orginfoattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoattachmentByPrimaryKey
	 *
	 */
	@Transactional
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id) throws DataAccessException {

		return findOrginfoattachmentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoattachmentByPrimaryKey
	 *
	 */

	@Transactional
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrginfoattachmentByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Orginfoattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllOrginfoattachments
	 *
	 */
	@Transactional
	public Set<Orginfoattachment> findAllOrginfoattachments() throws DataAccessException {

		return findAllOrginfoattachments(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrginfoattachments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfoattachment> findAllOrginfoattachments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrginfoattachments", startResult, maxRows);
		return new LinkedHashSet<Orginfoattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoattachmentByIdContaining
	 *
	 */
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByIdContaining(String id) throws DataAccessException {

		return findOrginfoattachmentByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoattachmentByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfoattachment> findOrginfoattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoattachmentByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Orginfoattachment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Orginfoattachment entity) {
		return true;
	}
}
