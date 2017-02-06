package com.hejiascm.dao;

import com.hejiascm.domain.Deliverygoods;

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
 * DAO to manage Deliverygoods entities.
 * 
 */
@Repository("DeliverygoodsDAO")
@Transactional
public class DeliverygoodsDAOImpl extends AbstractJpaDao<Deliverygoods>
		implements DeliverygoodsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Deliverygoods.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DeliverygoodsDAOImpl
	 *
	 */
	public DeliverygoodsDAOImpl() {
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
	 * JPQL Query - findDeliverygoodsById
	 *
	 */
	@Transactional
	public Deliverygoods findDeliverygoodsById(String id) throws DataAccessException {

		return findDeliverygoodsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsById
	 *
	 */

	@Transactional
	public Deliverygoods findDeliverygoodsById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliverygoodsById", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliverygoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliverygoodsBySpecs
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySpecs(String specs) throws DataAccessException {

		return findDeliverygoodsBySpecs(specs, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsBySpecs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySpecs(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsBySpecs", startResult, maxRows, specs);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByTaxRate
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException {

		return findDeliverygoodsByTaxRate(taxRate, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByTaxRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByTaxRate(java.math.BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByTaxRate", startResult, maxRows, taxRate);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByTotalAmount
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException {

		return findDeliverygoodsByTotalAmount(totalAmount, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByTotalAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByTotalAmount(java.math.BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByTotalAmount", startResult, maxRows, totalAmount);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnitContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnitContaining(String unit) throws DataAccessException {

		return findDeliverygoodsByUnitContaining(unit, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnitContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByUnitContaining", startResult, maxRows, unit);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByProducer
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByProducer(String producer) throws DataAccessException {

		return findDeliverygoodsByProducer(producer, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByProducer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByProducer", startResult, maxRows, producer);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByQuantity
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByQuantity(Integer quantity) throws DataAccessException {

		return findDeliverygoodsByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByDescriptionContaining(String description) throws DataAccessException {

		return findDeliverygoodsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByDescription
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByDescription(String description) throws DataAccessException {

		return findDeliverygoodsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsBySerial
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySerial(String serial) throws DataAccessException {

		return findDeliverygoodsBySerial(serial, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsBySerial
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsBySerial", startResult, maxRows, serial);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByProducerContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByProducerContaining(String producer) throws DataAccessException {

		return findDeliverygoodsByProducerContaining(producer, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByProducerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByProducerContaining(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByProducerContaining", startResult, maxRows, producer);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsBySpecsContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySpecsContaining(String specs) throws DataAccessException {

		return findDeliverygoodsBySpecsContaining(specs, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsBySpecsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySpecsContaining(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsBySpecsContaining", startResult, maxRows, specs);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnit
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnit(String unit) throws DataAccessException {

		return findDeliverygoodsByUnit(unit, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnit(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByUnit", startResult, maxRows, unit);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByNameContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByNameContaining(String name) throws DataAccessException {

		return findDeliverygoodsByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsBySerialContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySerialContaining(String serial) throws DataAccessException {

		return findDeliverygoodsBySerialContaining(serial, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsBySerialContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsBySerialContaining", startResult, maxRows, serial);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDeliverygoodss
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findAllDeliverygoodss() throws DataAccessException {

		return findAllDeliverygoodss(-1, -1);
	}

	/**
	 * JPQL Query - findAllDeliverygoodss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findAllDeliverygoodss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDeliverygoodss", startResult, maxRows);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByPrimaryKey
	 *
	 */
	@Transactional
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id) throws DataAccessException {

		return findDeliverygoodsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByPrimaryKey
	 *
	 */

	@Transactional
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliverygoodsByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliverygoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliverygoodsByIdContaining
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByIdContaining(String id) throws DataAccessException {

		return findDeliverygoodsByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByName
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByName(String name) throws DataAccessException {

		return findDeliverygoodsByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByName", startResult, maxRows, name);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnitPrice
	 *
	 */
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException {

		return findDeliverygoodsByUnitPrice(unitPrice, -1, -1);
	}

	/**
	 * JPQL Query - findDeliverygoodsByUnitPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliverygoods> findDeliverygoodsByUnitPrice(java.math.BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliverygoodsByUnitPrice", startResult, maxRows, unitPrice);
		return new LinkedHashSet<Deliverygoods>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Deliverygoods entity) {
		return true;
	}
}
