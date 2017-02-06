package com.hejiascm.dao;

import com.hejiascm.domain.Receivingrecord;

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
 * DAO to manage Receivingrecord entities.
 * 
 */
@Repository("ReceivingrecordDAO")
@Transactional
public class ReceivingrecordDAOImpl extends AbstractJpaDao<Receivingrecord>
		implements ReceivingrecordDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Receivingrecord.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ReceivingrecordDAOImpl
	 *
	 */
	public ReceivingrecordDAOImpl() {
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
	 * JPQL Query - findReceivingrecordById
	 *
	 */
	@Transactional
	public Receivingrecord findReceivingrecordById(String id) throws DataAccessException {

		return findReceivingrecordById(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordById
	 *
	 */

	@Transactional
	public Receivingrecord findReceivingrecordById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivingrecordById", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivingrecord) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivingrecordByContractIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractIdContaining(String contractId) throws DataAccessException {

		return findReceivingrecordByContractIdContaining(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByContractIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractIdContaining(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByContractIdContaining", startResult, maxRows, contractId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordIdContaining(String deliveryRecordId) throws DataAccessException {

		return findReceivingrecordByDeliveryRecordIdContaining(deliveryRecordId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordIdContaining(String deliveryRecordId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDeliveryRecordIdContaining", startResult, maxRows, deliveryRecordId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormId
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByReceivingFormId(String receivingFormId) throws DataAccessException {

		return findReceivingrecordByReceivingFormId(receivingFormId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByReceivingFormId(String receivingFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByReceivingFormId", startResult, maxRows, receivingFormId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDescription
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDescription(String description) throws DataAccessException {

		return findReceivingrecordByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByNotesContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNotesContaining(String notes) throws DataAccessException {

		return findReceivingrecordByNotesContaining(notes, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByNotesContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByNotesContaining", startResult, maxRows, notes);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTime
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTime(String lastUpdateTime) throws DataAccessException {

		return findReceivingrecordByLastUpdateTime(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByLastUpdateTime", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByStatus
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByStatus(Integer status) throws DataAccessException {

		return findReceivingrecordByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByStatus(Integer status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByStatus", startResult, maxRows, status);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDescriptionContaining(String description) throws DataAccessException {

		return findReceivingrecordByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIds
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIds(String qualityRecordIds) throws DataAccessException {

		return findReceivingrecordByQualityRecordIds(qualityRecordIds, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIds
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIds(String qualityRecordIds, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByQualityRecordIds", startResult, maxRows, qualityRecordIds);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllReceivingrecords
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findAllReceivingrecords() throws DataAccessException {

		return findAllReceivingrecords(-1, -1);
	}

	/**
	 * JPQL Query - findAllReceivingrecords
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findAllReceivingrecords(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllReceivingrecords", startResult, maxRows);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByContractVersionContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractVersionContaining(String contractVersion) throws DataAccessException {

		return findReceivingrecordByContractVersionContaining(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByContractVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByContractVersionContaining", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitTimeContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitTimeContaining(String submitTime) throws DataAccessException {

		return findReceivingrecordBySubmitTimeContaining(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitTimeContaining(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordBySubmitTimeContaining", startResult, maxRows, submitTime);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByTruckNumContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByTruckNumContaining(String truckNum) throws DataAccessException {

		return findReceivingrecordByTruckNumContaining(truckNum, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByTruckNumContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByTruckNumContaining(String truckNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByTruckNumContaining", startResult, maxRows, truckNum);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByNameContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNameContaining(String name) throws DataAccessException {

		return findReceivingrecordByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByName
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByName(String name) throws DataAccessException {

		return findReceivingrecordByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByName", startResult, maxRows, name);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTimeContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTimeContaining(String lastUpdateTime) throws DataAccessException {

		return findReceivingrecordByLastUpdateTimeContaining(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTimeContaining(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByLastUpdateTimeContaining", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordId
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordId(String deliveryRecordId) throws DataAccessException {

		return findReceivingrecordByDeliveryRecordId(deliveryRecordId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordId(String deliveryRecordId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDeliveryRecordId", startResult, maxRows, deliveryRecordId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByTruckNum
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByTruckNum(String truckNum) throws DataAccessException {

		return findReceivingrecordByTruckNum(truckNum, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByTruckNum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByTruckNum(String truckNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByTruckNum", startResult, maxRows, truckNum);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByOrgid
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrgid(String orgid) throws DataAccessException {

		return findReceivingrecordByOrgid(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByOrgid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByOrgid", startResult, maxRows, orgid);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByPrimaryKey
	 *
	 */
	@Transactional
	public Receivingrecord findReceivingrecordByPrimaryKey(String id) throws DataAccessException {

		return findReceivingrecordByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByPrimaryKey
	 *
	 */

	@Transactional
	public Receivingrecord findReceivingrecordByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReceivingrecordByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Receivingrecord) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByReceivingFormIdContaining(String receivingFormId) throws DataAccessException {

		return findReceivingrecordByReceivingFormIdContaining(receivingFormId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByReceivingFormIdContaining(String receivingFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByReceivingFormIdContaining", startResult, maxRows, receivingFormId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIdsContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIdsContaining(String qualityRecordIds) throws DataAccessException {

		return findReceivingrecordByQualityRecordIdsContaining(qualityRecordIds, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIdsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIdsContaining(String qualityRecordIds, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByQualityRecordIdsContaining", startResult, maxRows, qualityRecordIds);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDriver
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDriver(String driver) throws DataAccessException {

		return findReceivingrecordByDriver(driver, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDriver
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDriver(String driver, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDriver", startResult, maxRows, driver);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByContractId
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractId(String contractId) throws DataAccessException {

		return findReceivingrecordByContractId(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByContractId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractId(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByContractId", startResult, maxRows, contractId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByOrderIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrderIdContaining(String orderId) throws DataAccessException {

		return findReceivingrecordByOrderIdContaining(orderId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByOrderIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrderIdContaining(String orderId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByOrderIdContaining", startResult, maxRows, orderId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByOrgidContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrgidContaining(String orgid) throws DataAccessException {

		return findReceivingrecordByOrgidContaining(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByOrgidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrgidContaining(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByOrgidContaining", startResult, maxRows, orgid);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByOrderId
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrderId(String orderId) throws DataAccessException {

		return findReceivingrecordByOrderId(orderId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByOrderId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByOrderId(String orderId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByOrderId", startResult, maxRows, orderId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByDriverContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDriverContaining(String driver) throws DataAccessException {

		return findReceivingrecordByDriverContaining(driver, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByDriverContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByDriverContaining(String driver, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByDriverContaining", startResult, maxRows, driver);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitterIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitterIdContaining(String submitterId) throws DataAccessException {

		return findReceivingrecordBySubmitterIdContaining(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitterIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordBySubmitterIdContaining", startResult, maxRows, submitterId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByAmount
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByAmount(java.math.BigDecimal amount) throws DataAccessException {

		return findReceivingrecordByAmount(amount, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByAmount(java.math.BigDecimal amount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByAmount", startResult, maxRows, amount);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByIdContaining
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByIdContaining(String id) throws DataAccessException {

		return findReceivingrecordByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitterId
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitterId(String submitterId) throws DataAccessException {

		return findReceivingrecordBySubmitterId(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitterId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitterId(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordBySubmitterId", startResult, maxRows, submitterId);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByNotes
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNotes(String notes) throws DataAccessException {

		return findReceivingrecordByNotes(notes, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByNotes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByNotes(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByNotes", startResult, maxRows, notes);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordByContractVersion
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractVersion(String contractVersion) throws DataAccessException {

		return findReceivingrecordByContractVersion(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordByContractVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordByContractVersion(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordByContractVersion", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitTime
	 *
	 */
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitTime(String submitTime) throws DataAccessException {

		return findReceivingrecordBySubmitTime(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findReceivingrecordBySubmitTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Receivingrecord> findReceivingrecordBySubmitTime(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReceivingrecordBySubmitTime", startResult, maxRows, submitTime);
		return new LinkedHashSet<Receivingrecord>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Receivingrecord entity) {
		return true;
	}
}
