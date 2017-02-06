package com.hejiascm.dao;

import com.hejiascm.domain.Receivinggoods;

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
 * DAO to manage Receivinggoods entities.
 * 
 */
@Repository("ReceivinggoodsDAO")
@Transactional
public class ReceivinggoodsDAOImpl extends AbstractJpaDao<Receivinggoods>
		implements ReceivinggoodsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Receivinggoods.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ReceivinggoodsDAOImpl
	 *
	 */
	public ReceivinggoodsDAOImpl() {
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
	 * JPQL Query - findReceivinggoodsByNameContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByNameContaining(String name) throws DataAccessException {

		return findReceivinggoodsByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByTotalAmount
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException {

		return findReceivinggoodsByTotalAmount(totalAmount, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByTotalAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByTotalAmount(java.math.BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByTotalAmount", startResult, maxRows, totalAmount);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsBySerial
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySerial(String serial) throws DataAccessException {

		return findReceivinggoodsBySerial(serial, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsBySerial
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsBySerial", startResult, maxRows, serial);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnitContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnitContaining(String unit) throws DataAccessException {

		return findReceivinggoodsByUnitContaining(unit, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnitContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByUnitContaining", startResult, maxRows, unit);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByName
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByName(String name) throws DataAccessException {

		return findReceivinggoodsByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByName", startResult, maxRows, name);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsBySpecsContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySpecsContaining(String specs) throws DataAccessException {

		return findReceivinggoodsBySpecsContaining(specs, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsBySpecsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySpecsContaining(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsBySpecsContaining", startResult, maxRows, specs);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllReceivinggoodss
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findAllReceivinggoodss() throws DataAccessException {

		return findAllReceivinggoodss(-1, -1);
	}

	/**
	 * JPQL Query - findAllReceivinggoodss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findAllReceivinggoodss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllReceivinggoodss", startResult, maxRows);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnit
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnit(String unit) throws DataAccessException {

		return findReceivinggoodsByUnit(unit, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnit(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByUnit", startResult, maxRows, unit);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnitPrice
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException {

		return findReceivinggoodsByUnitPrice(unitPrice, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByUnitPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByUnitPrice(java.math.BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByUnitPrice", startResult, maxRows, unitPrice);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsBySpecs
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySpecs(String specs) throws DataAccessException {

		return findReceivinggoodsBySpecs(specs, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsBySpecs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySpecs(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsBySpecs", startResult, maxRows, specs);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByProducerContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByProducerContaining(String producer) throws DataAccessException {

		return findReceivinggoodsByProducerContaining(producer, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByProducerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByProducerContaining(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByProducerContaining", startResult, maxRows, producer);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByDescriptionContaining(String description) throws DataAccessException {

		return findReceivinggoodsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsById
	 *
	 */
	@Transactional
	public Receivinggoods findReceivinggoodsById(String id) throws DataAccessException {

		return findReceivinggoodsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsById
	 *
	 */

	@Transactional
	public Receivinggoods findReceivinggoodsById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivinggoodsById", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivinggoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivinggoodsByPrimaryKey
	 *
	 */
	@Transactional
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id) throws DataAccessException {

		return findReceivinggoodsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByPrimaryKey
	 *
	 */

	@Transactional
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivinggoodsByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivinggoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivinggoodsByDescription
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByDescription(String description) throws DataAccessException {

		return findReceivinggoodsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByTaxRate
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException {

		return findReceivinggoodsByTaxRate(taxRate, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByTaxRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByTaxRate(java.math.BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByTaxRate", startResult, maxRows, taxRate);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByProducer
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByProducer(String producer) throws DataAccessException {

		return findReceivinggoodsByProducer(producer, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByProducer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByProducer", startResult, maxRows, producer);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByIdContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByIdContaining(String id) throws DataAccessException {

		return findReceivinggoodsByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsBySerialContaining
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySerialContaining(String serial) throws DataAccessException {

		return findReceivinggoodsBySerialContaining(serial, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsBySerialContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsBySerialContaining", startResult, maxRows, serial);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivinggoodsByQuantity
	 *
	 */
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByQuantity(Integer quantity) throws DataAccessException {

		return findReceivinggoodsByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findReceivinggoodsByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivinggoods> findReceivinggoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivinggoodsByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<Receivinggoods>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Receivinggoods entity) {
		return true;
	}
}
