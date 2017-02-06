package com.hejiascm.dao;

import com.hejiascm.domain.Contractgoods;

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
 * DAO to manage Contractgoods entities.
 * 
 */
@Repository("ContractgoodsDAO")
@Transactional
public class ContractgoodsDAOImpl extends AbstractJpaDao<Contractgoods>
		implements ContractgoodsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Contractgoods.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ContractgoodsDAOImpl
	 *
	 */
	public ContractgoodsDAOImpl() {
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
	 * JPQL Query - findContractgoodsById
	 *
	 */
	@Transactional
	public Contractgoods findContractgoodsById(String id) throws DataAccessException {

		return findContractgoodsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsById
	 *
	 */

	@Transactional
	public Contractgoods findContractgoodsById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findContractgoodsById", startResult, maxRows, id);
			return (com.hejiascm.domain.Contractgoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findContractgoodsByName
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByName(String name) throws DataAccessException {

		return findContractgoodsByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByName", startResult, maxRows, name);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByUnitPrice
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException {

		return findContractgoodsByUnitPrice(unitPrice, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByUnitPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnitPrice(java.math.BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByUnitPrice", startResult, maxRows, unitPrice);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsBySerial
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsBySerial(String serial) throws DataAccessException {

		return findContractgoodsBySerial(serial, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsBySerial
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsBySerial", startResult, maxRows, serial);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsBySpecs
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsBySpecs(String specs) throws DataAccessException {

		return findContractgoodsBySpecs(specs, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsBySpecs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsBySpecs(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsBySpecs", startResult, maxRows, specs);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByDescriptionContaining(String description) throws DataAccessException {

		return findContractgoodsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByTaxRate
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException {

		return findContractgoodsByTaxRate(taxRate, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByTaxRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByTaxRate(java.math.BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByTaxRate", startResult, maxRows, taxRate);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsBySerialContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsBySerialContaining(String serial) throws DataAccessException {

		return findContractgoodsBySerialContaining(serial, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsBySerialContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsBySerialContaining", startResult, maxRows, serial);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByUnitContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnitContaining(String unit) throws DataAccessException {

		return findContractgoodsByUnitContaining(unit, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByUnitContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByUnitContaining", startResult, maxRows, unit);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllContractgoodss
	 *
	 */
	@Transactional
	public Set<Contractgoods> findAllContractgoodss() throws DataAccessException {

		return findAllContractgoodss(-1, -1);
	}

	/**
	 * JPQL Query - findAllContractgoodss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findAllContractgoodss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllContractgoodss", startResult, maxRows);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByNameContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByNameContaining(String name) throws DataAccessException {

		return findContractgoodsByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByUnit
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnit(String unit) throws DataAccessException {

		return findContractgoodsByUnit(unit, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByUnit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByUnit(String unit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByUnit", startResult, maxRows, unit);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByDescription
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByDescription(String description) throws DataAccessException {

		return findContractgoodsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsBySpecsContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsBySpecsContaining(String specs) throws DataAccessException {

		return findContractgoodsBySpecsContaining(specs, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsBySpecsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsBySpecsContaining(String specs, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsBySpecsContaining", startResult, maxRows, specs);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByQuantity
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByQuantity(java.math.BigDecimal quantity) throws DataAccessException {

		return findContractgoodsByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByQuantity(java.math.BigDecimal quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByTotalAmount
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException {

		return findContractgoodsByTotalAmount(totalAmount, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByTotalAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByTotalAmount(java.math.BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByTotalAmount", startResult, maxRows, totalAmount);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByPrimaryKey
	 *
	 */
	@Transactional
	public Contractgoods findContractgoodsByPrimaryKey(String id) throws DataAccessException {

		return findContractgoodsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByPrimaryKey
	 *
	 */

	@Transactional
	public Contractgoods findContractgoodsByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findContractgoodsByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Contractgoods) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findContractgoodsByIdContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByIdContaining(String id) throws DataAccessException {

		return findContractgoodsByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByProducer
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByProducer(String producer) throws DataAccessException {

		return findContractgoodsByProducer(producer, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByProducer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByProducer", startResult, maxRows, producer);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * JPQL Query - findContractgoodsByProducerContaining
	 *
	 */
	@Transactional
	public Set<Contractgoods> findContractgoodsByProducerContaining(String producer) throws DataAccessException {

		return findContractgoodsByProducerContaining(producer, -1, -1);
	}

	/**
	 * JPQL Query - findContractgoodsByProducerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Contractgoods> findContractgoodsByProducerContaining(String producer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContractgoodsByProducerContaining", startResult, maxRows, producer);
		return new LinkedHashSet<Contractgoods>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Contractgoods entity) {
		return true;
	}
}
