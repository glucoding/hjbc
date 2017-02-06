package com.hejiascm.dao;

import com.hejiascm.domain.Orderattachment;

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
 * DAO to manage Orderattachment entities.
 * 
 */
@Repository("OrderattachmentDAO")
@Transactional
public class OrderattachmentDAOImpl extends AbstractJpaDao<Orderattachment>
		implements OrderattachmentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Orderattachment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderattachmentDAOImpl
	 *
	 */
	public OrderattachmentDAOImpl() {
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
	 * JPQL Query - findOrderattachmentByAddressContaining
	 *
	 */
	@Transactional
	public Set<Orderattachment> findOrderattachmentByAddressContaining(String address) throws DataAccessException {

		return findOrderattachmentByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findOrderattachmentByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderattachmentByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderattachmentByPrimaryKey
	 *
	 */
	@Transactional
	public Orderattachment findOrderattachmentByPrimaryKey(String id) throws DataAccessException {

		return findOrderattachmentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByPrimaryKey
	 *
	 */

	@Transactional
	public Orderattachment findOrderattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderattachmentByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Orderattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderattachmentById
	 *
	 */
	@Transactional
	public Orderattachment findOrderattachmentById(String id) throws DataAccessException {

		return findOrderattachmentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentById
	 *
	 */

	@Transactional
	public Orderattachment findOrderattachmentById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderattachmentById", startResult, maxRows, id);
			return (com.hejiascm.domain.Orderattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderattachmentByIdContaining
	 *
	 */
	@Transactional
	public Set<Orderattachment> findOrderattachmentByIdContaining(String id) throws DataAccessException {

		return findOrderattachmentByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findOrderattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderattachmentByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrderattachments
	 *
	 */
	@Transactional
	public Set<Orderattachment> findAllOrderattachments() throws DataAccessException {

		return findAllOrderattachments(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderattachments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findAllOrderattachments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderattachments", startResult, maxRows);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderattachmentByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Orderattachment> findOrderattachmentByDescriptionContaining(String description) throws DataAccessException {

		return findOrderattachmentByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findOrderattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderattachmentByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderattachmentByDescription
	 *
	 */
	@Transactional
	public Set<Orderattachment> findOrderattachmentByDescription(String description) throws DataAccessException {

		return findOrderattachmentByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findOrderattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderattachmentByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderattachmentByAddress
	 *
	 */
	@Transactional
	public Set<Orderattachment> findOrderattachmentByAddress(String address) throws DataAccessException {

		return findOrderattachmentByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderattachmentByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orderattachment> findOrderattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderattachmentByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Orderattachment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Orderattachment entity) {
		return true;
	}
}
