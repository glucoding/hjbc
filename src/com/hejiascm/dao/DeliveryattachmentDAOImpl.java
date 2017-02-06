package com.hejiascm.dao;

import com.hejiascm.domain.Deliveryattachment;

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
 * DAO to manage Deliveryattachment entities.
 * 
 */
@Repository("DeliveryattachmentDAO")
@Transactional
public class DeliveryattachmentDAOImpl extends AbstractJpaDao<Deliveryattachment>
		implements DeliveryattachmentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Deliveryattachment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DeliveryattachmentDAOImpl
	 *
	 */
	public DeliveryattachmentDAOImpl() {
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
	 * JPQL Query - findDeliveryattachmentByAddress
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByAddress(String address) throws DataAccessException {

		return findDeliveryattachmentByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryattachmentByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryattachmentById
	 *
	 */
	@Transactional
	public Deliveryattachment findDeliveryattachmentById(String id) throws DataAccessException {

		return findDeliveryattachmentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentById
	 *
	 */

	@Transactional
	public Deliveryattachment findDeliveryattachmentById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliveryattachmentById", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliveryattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliveryattachmentByDescription
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByDescription(String description) throws DataAccessException {

		return findDeliveryattachmentByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryattachmentByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDeliveryattachments
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findAllDeliveryattachments() throws DataAccessException {

		return findAllDeliveryattachments(-1, -1);
	}

	/**
	 * JPQL Query - findAllDeliveryattachments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findAllDeliveryattachments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDeliveryattachments", startResult, maxRows);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryattachmentByPrimaryKey
	 *
	 */
	@Transactional
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id) throws DataAccessException {

		return findDeliveryattachmentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByPrimaryKey
	 *
	 */

	@Transactional
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliveryattachmentByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliveryattachment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliveryattachmentByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByDescriptionContaining(String description) throws DataAccessException {

		return findDeliveryattachmentByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryattachmentByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryattachmentByIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByIdContaining(String id) throws DataAccessException {

		return findDeliveryattachmentByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryattachmentByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryattachmentByAddressContaining
	 *
	 */
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByAddressContaining(String address) throws DataAccessException {

		return findDeliveryattachmentByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryattachmentByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryattachment> findDeliveryattachmentByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryattachmentByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Deliveryattachment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Deliveryattachment entity) {
		return true;
	}
}
