package com.hejiascm.dao;

import com.hejiascm.domain.Ordergoods;

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
 * DAO to manage Ordergoods entities.
 * 
 */
@Repository("OrdergoodsDAO")
@Transactional
public class OrdergoodsDAOImpl extends AbstractJpaDao<Ordergoods> implements
		OrdergoodsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Ordergoods.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrdergoodsDAOImpl
	 *
	 */
	public OrdergoodsDAOImpl() {
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
	 * JPQL Query - findOrdergoodsBySerialContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySerialContaining(String serial) throws DataAccessException {

		return findOrdergoodsBySerialContaining(serial, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsBySerialContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsBySerialContaining", startResult, maxRows, serial);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByDescription
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByDescription(String description) throws DataAccessException {

		return findOrdergoodsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrdergoodss
	 *
	 */
	@Transactional
	public Set<Ordergoods> findAllOrdergoodss() throws DataAccessException {

		return findAllOrdergoodss(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrdergoodss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findAllOrdergoodss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrdergoodss", startResult, maxRows);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsBySerial
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySerial(String serial) throws DataAccessException {

		return findOrdergoodsBySerial(serial, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsBySerial
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsBySerial", startResult, maxRows, serial);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByProducer
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByProducer(String producer) throws DataAccessException {

		return findOrdergoodsByProducer(producer, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByProducer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByProducer", startResult, maxRows, producer);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByNameContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByNameContaining(String name) throws DataAccessException {

		return findOrdergoodsByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByUnit
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnit(String unit) throws DataAccessException {

		return findOrdergoodsByUnit(unit, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByUnit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnit(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByUnit", startResult, maxRows, unit);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByTaxRate
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException {

		return findOrdergoodsByTaxRate(taxRate, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByTaxRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByTaxRate(java.math.BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByTaxRate", startResult, maxRows, taxRate);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByIdContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByIdContaining(String id) throws DataAccessException {

		return findOrdergoodsByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByUnitPrice
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException {

		return findOrdergoodsByUnitPrice(unitPrice, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByUnitPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnitPrice(java.math.BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByUnitPrice", startResult, maxRows, unitPrice);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsBySpecContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySpecContaining(String spec) throws DataAccessException {

		return findOrdergoodsBySpecContaining(spec, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsBySpecContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySpecContaining(String spec, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsBySpecContaining", startResult, maxRows, spec);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsBySpec
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySpec(String spec) throws DataAccessException {

		return findOrdergoodsBySpec(spec, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsBySpec
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsBySpec(String spec, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsBySpec", startResult, maxRows, spec);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsById
	 *
	 */
	@Transactional
	public Ordergoods findOrdergoodsById(String id) throws DataAccessException {

		return findOrdergoodsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsById
	 *
	 */

	@Transactional
	public Ordergoods findOrdergoodsById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrdergoodsById", startResult, maxRows, id);
			return (com.hejiascm.domain.Ordergoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrdergoodsByTotalAmount
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException {

		return findOrdergoodsByTotalAmount(totalAmount, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByTotalAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByTotalAmount(java.math.BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByTotalAmount", startResult, maxRows, totalAmount);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByName
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByName(String name) throws DataAccessException {

		return findOrdergoodsByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByName", startResult, maxRows, name);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByQuantity
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByQuantity(Integer quantity) throws DataAccessException {

		return findOrdergoodsByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByDescriptionContaining(String description) throws DataAccessException {

		return findOrdergoodsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByProducerContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByProducerContaining(String producer) throws DataAccessException {

		return findOrdergoodsByProducerContaining(producer, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByProducerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByProducerContaining(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByProducerContaining", startResult, maxRows, producer);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByUnitContaining
	 *
	 */
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnitContaining(String unit) throws DataAccessException {

		return findOrdergoodsByUnitContaining(unit, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByUnitContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ordergoods> findOrdergoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrdergoodsByUnitContaining", startResult, maxRows, unit);
		return new LinkedHashSet<Ordergoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrdergoodsByPrimaryKey
	 *
	 */
	@Transactional
	public Ordergoods findOrdergoodsByPrimaryKey(String id) throws DataAccessException {

		return findOrdergoodsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrdergoodsByPrimaryKey
	 *
	 */

	@Transactional
	public Ordergoods findOrdergoodsByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrdergoodsByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Ordergoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Ordergoods entity) {
		return true;
	}
}
