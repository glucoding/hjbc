package com.hejiascm.dao;

import com.hejiascm.domain.Tradecontractattachment;

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
 * DAO to manage Tradecontractattachment entities.
 * 
 */
@Repository("TradecontractattachmentDAO")
@Transactional
public class TradecontractattachmentDAOImpl extends AbstractJpaDao<Tradecontractattachment>
		implements TradecontractattachmentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Tradecontractattachment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TradecontractattachmentDAOImpl
	 *
	 */
	public TradecontractattachmentDAOImpl() {
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
	 * JPQL Query - findTradecontractattachmentByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByDescriptionContaining(String description) throws DataAccessException {

		return findTradecontractattachmentByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractattachmentByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTradecontractattachments
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findAllTradecontractattachments() throws DataAccessException {

		return findAllTradecontractattachments(-1, -1);
	}

	/**
	 * JPQL Query - findAllTradecontractattachments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findAllTradecontractattachments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTradecontractattachments", startResult, maxRows);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractattachmentByDescription
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByDescription(String description) throws DataAccessException {

		return findTradecontractattachmentByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractattachmentByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractattachmentByPrimaryKey
	 *
	 */
	@Transactional
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id) throws DataAccessException {

		return findTradecontractattachmentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByPrimaryKey
	 *
	 */

	@Transactional
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTradecontractattachmentByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Tradecontractattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTradecontractattachmentByContentContaining
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByContentContaining(String content) throws DataAccessException {

		return findTradecontractattachmentByContentContaining(content, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByContentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByContentContaining(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractattachmentByContentContaining", startResult, maxRows, content);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractattachmentById
	 *
	 */
	@Transactional
	public Tradecontractattachment findTradecontractattachmentById(String id) throws DataAccessException {

		return findTradecontractattachmentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentById
	 *
	 */

	@Transactional
	public Tradecontractattachment findTradecontractattachmentById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTradecontractattachmentById", startResult, maxRows, id);
			return (com.hejiascm.domain.Tradecontractattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTradecontractattachmentByIdContaining
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByIdContaining(String id) throws DataAccessException {

		return findTradecontractattachmentByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractattachmentByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractattachmentByContent
	 *
	 */
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByContent(String content) throws DataAccessException {

		return findTradecontractattachmentByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractattachmentByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontractattachment> findTradecontractattachmentByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractattachmentByContent", startResult, maxRows, content);
		return new LinkedHashSet<Tradecontractattachment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Tradecontractattachment entity) {
		return true;
	}
}
