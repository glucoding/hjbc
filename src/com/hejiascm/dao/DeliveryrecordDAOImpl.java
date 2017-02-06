package com.hejiascm.dao;

import com.hejiascm.domain.Deliveryrecord;

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
 * DAO to manage Deliveryrecord entities.
 * 
 */
@Repository("DeliveryrecordDAO")
@Transactional
public class DeliveryrecordDAOImpl extends AbstractJpaDao<Deliveryrecord>
		implements DeliveryrecordDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Deliveryrecord.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DeliveryrecordDAOImpl
	 *
	 */
	public DeliveryrecordDAOImpl() {
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
	 * JPQL Query - findDeliveryrecordByConsigneeAddressContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddressContaining(String consigneeAddress) throws DataAccessException {

		return findDeliveryrecordByConsigneeAddressContaining(consigneeAddress, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddressContaining(String consigneeAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsigneeAddressContaining", startResult, maxRows, consigneeAddress);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrgId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrgId(String orgId) throws DataAccessException {

		return findDeliveryrecordByOrgId(orgId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrgId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrgId(String orgId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByOrgId", startResult, maxRows, orgId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDescriptionContaining(String description) throws DataAccessException {

		return findDeliveryrecordByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByDriverContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDriverContaining(String driver) throws DataAccessException {

		return findDeliveryrecordByDriverContaining(driver, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDriverContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDriverContaining(String driver, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDriverContaining", startResult, maxRows, driver);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTimeContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTimeContaining(String submitTime) throws DataAccessException {

		return findDeliveryrecordBySubmitTimeContaining(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTimeContaining(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordBySubmitTimeContaining", startResult, maxRows, submitTime);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByIdContaining(String id) throws DataAccessException {

		return findDeliveryrecordByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByNameContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNameContaining(String name) throws DataAccessException {

		return findDeliveryrecordByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByTruckNumContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByTruckNumContaining(String truckNum) throws DataAccessException {

		return findDeliveryrecordByTruckNumContaining(truckNum, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByTruckNumContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByTruckNumContaining(String truckNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByTruckNumContaining", startResult, maxRows, truckNum);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByNotesContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNotesContaining(String notes) throws DataAccessException {

		return findDeliveryrecordByNotesContaining(notes, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByNotesContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByNotesContaining", startResult, maxRows, notes);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTime
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTime(String lastUpdateTime) throws DataAccessException {

		return findDeliveryrecordByLastUpdateTime(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByLastUpdateTime", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractId(String contractId) throws DataAccessException {

		return findDeliveryrecordByContractId(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractId(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByContractId", startResult, maxRows, contractId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordById
	 *
	 */
	@Transactional
	public Deliveryrecord findDeliveryrecordById(String id) throws DataAccessException {

		return findDeliveryrecordById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordById
	 *
	 */

	@Transactional
	public Deliveryrecord findDeliveryrecordById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliveryrecordById", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliveryrecord) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliveryrecordByDriver
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDriver(String driver) throws DataAccessException {

		return findDeliveryrecordByDriver(driver, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDriver
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDriver(String driver, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDriver", startResult, maxRows, driver);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByPrimaryKey
	 *
	 */
	@Transactional
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id) throws DataAccessException {

		return findDeliveryrecordByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByPrimaryKey
	 *
	 */

	@Transactional
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDeliveryrecordByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Deliveryrecord) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterIdContaining(String submitterId) throws DataAccessException {

		return findDeliveryrecordBySubmitterIdContaining(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordBySubmitterIdContaining", startResult, maxRows, submitterId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormIdContaining(String deliveryFormId) throws DataAccessException {

		return findDeliveryrecordByDeliveryFormIdContaining(deliveryFormId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormIdContaining(String deliveryFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDeliveryFormIdContaining", startResult, maxRows, deliveryFormId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerIdContaining(String consignerId) throws DataAccessException {

		return findDeliveryrecordByConsignerIdContaining(consignerId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerIdContaining(String consignerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsignerIdContaining", startResult, maxRows, consignerId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerId(String consignerId) throws DataAccessException {

		return findDeliveryrecordByConsignerId(consignerId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerId(String consignerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsignerId", startResult, maxRows, consignerId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddress
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddress(String consignerAddress) throws DataAccessException {

		return findDeliveryrecordByConsignerAddress(consignerAddress, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddress(String consignerAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsignerAddress", startResult, maxRows, consignerAddress);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrderIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrderIdContaining(String orderId) throws DataAccessException {

		return findDeliveryrecordByOrderIdContaining(orderId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrderIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrderIdContaining(String orderId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByOrderIdContaining", startResult, maxRows, orderId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeIdContaining(String buyeeId) throws DataAccessException {

		return findDeliveryrecordByBuyeeIdContaining(buyeeId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeIdContaining(String buyeeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByBuyeeIdContaining", startResult, maxRows, buyeeId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyerId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyerId(String buyerId) throws DataAccessException {

		return findDeliveryrecordByBuyerId(buyerId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyerId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyerId(String buyerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByBuyerId", startResult, maxRows, buyerId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByTruckNum
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByTruckNum(String truckNum) throws DataAccessException {

		return findDeliveryrecordByTruckNum(truckNum, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByTruckNum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByTruckNum(String truckNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByTruckNum", startResult, maxRows, truckNum);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeIdContaining(String consigneeId) throws DataAccessException {

		return findDeliveryrecordByConsigneeIdContaining(consigneeId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeIdContaining(String consigneeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsigneeIdContaining", startResult, maxRows, consigneeId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractIdContaining(String contractId) throws DataAccessException {

		return findDeliveryrecordByContractIdContaining(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractIdContaining(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByContractIdContaining", startResult, maxRows, contractId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByNotes
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNotes(String notes) throws DataAccessException {

		return findDeliveryrecordByNotes(notes, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByNotes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByNotes(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByNotes", startResult, maxRows, notes);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByStatus
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByStatus(Integer status) throws DataAccessException {

		return findDeliveryrecordByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByStatus(Integer status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByStatus", startResult, maxRows, status);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddressContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddressContaining(String consignerAddress) throws DataAccessException {

		return findDeliveryrecordByConsignerAddressContaining(consignerAddress, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddressContaining(String consignerAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsignerAddressContaining", startResult, maxRows, consignerAddress);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeId(String buyeeId) throws DataAccessException {

		return findDeliveryrecordByBuyeeId(buyeeId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeId(String buyeeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByBuyeeId", startResult, maxRows, buyeeId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormId(String deliveryFormId) throws DataAccessException {

		return findDeliveryrecordByDeliveryFormId(deliveryFormId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormId(String deliveryFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDeliveryFormId", startResult, maxRows, deliveryFormId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTimeContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTimeContaining(String lastUpdateTime) throws DataAccessException {

		return findDeliveryrecordByLastUpdateTimeContaining(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTimeContaining(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByLastUpdateTimeContaining", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByName
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByName(String name) throws DataAccessException {

		return findDeliveryrecordByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByName", startResult, maxRows, name);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByDescription
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDescription(String description) throws DataAccessException {

		return findDeliveryrecordByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrderId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrderId(String orderId) throws DataAccessException {

		return findDeliveryrecordByOrderId(orderId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrderId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrderId(String orderId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByOrderId", startResult, maxRows, orderId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDeliveryrecords
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findAllDeliveryrecords() throws DataAccessException {

		return findAllDeliveryrecords(-1, -1);
	}

	/**
	 * JPQL Query - findAllDeliveryrecords
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findAllDeliveryrecords(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDeliveryrecords", startResult, maxRows);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByAmount
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByAmount(java.math.BigDecimal amount) throws DataAccessException {

		return findDeliveryrecordByAmount(amount, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByAmount(java.math.BigDecimal amount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByAmount", startResult, maxRows, amount);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTime
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTime(String submitTime) throws DataAccessException {

		return findDeliveryrecordBySubmitTime(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTime(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordBySubmitTime", startResult, maxRows, submitTime);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddress
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddress(String consigneeAddress) throws DataAccessException {

		return findDeliveryrecordByConsigneeAddress(consigneeAddress, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddress(String consigneeAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsigneeAddress", startResult, maxRows, consigneeAddress);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyerIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyerIdContaining(String buyerId) throws DataAccessException {

		return findDeliveryrecordByBuyerIdContaining(buyerId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByBuyerIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByBuyerIdContaining(String buyerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByBuyerIdContaining", startResult, maxRows, buyerId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterId(String submitterId) throws DataAccessException {

		return findDeliveryrecordBySubmitterId(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterId(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordBySubmitterId", startResult, maxRows, submitterId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractVersionContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractVersionContaining(String contractVersion) throws DataAccessException {

		return findDeliveryrecordByContractVersionContaining(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByContractVersionContaining", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrgIdContaining
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrgIdContaining(String orgId) throws DataAccessException {

		return findDeliveryrecordByOrgIdContaining(orgId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByOrgIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByOrgIdContaining(String orgId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByOrgIdContaining", startResult, maxRows, orgId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractVersion
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractVersion(String contractVersion) throws DataAccessException {

		return findDeliveryrecordByContractVersion(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByContractVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByContractVersion(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByContractVersion", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeId
	 *
	 */
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeId(String consigneeId) throws DataAccessException {

		return findDeliveryrecordByConsigneeId(consigneeId, -1, -1);
	}

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeId(String consigneeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDeliveryrecordByConsigneeId", startResult, maxRows, consigneeId);
		return new LinkedHashSet<Deliveryrecord>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Deliveryrecord entity) {
		return true;
	}
}
