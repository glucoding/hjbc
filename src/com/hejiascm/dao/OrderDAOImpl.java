package com.hejiascm.dao;

import com.hejiascm.domain.Order;

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
 * DAO to manage Order entities.
 * 
 */
@Repository("OrderDAO")
@Transactional
public class OrderDAOImpl extends AbstractJpaDao<Order> implements OrderDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Order.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderDAOImpl
	 *
	 */
	public OrderDAOImpl() {
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
	 * JPQL Query - findOrderByStatus
	 *
	 */
	@Transactional
	public Set<Order> findOrderByStatus(Integer status) throws DataAccessException {

		return findOrderByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByStatus(Integer status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByStatus", startResult, maxRows, status);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByContractIdContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByContractIdContaining(String contractId) throws DataAccessException {

		return findOrderByContractIdContaining(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByContractIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByContractIdContaining(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByContractIdContaining", startResult, maxRows, contractId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException {

		return findOrderByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByNotesContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNotesContaining(String notes) throws DataAccessException {

		return findOrderByNotesContaining(notes, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNotesContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNotesContaining", startResult, maxRows, notes);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByContractId
	 *
	 */
	@Transactional
	public Set<Order> findOrderByContractId(String contractId) throws DataAccessException {

		return findOrderByContractId(contractId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByContractId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByContractId(String contractId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByContractId", startResult, maxRows, contractId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	@Transactional
	public Order findOrderByPrimaryKey(String id) throws DataAccessException {

		return findOrderByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */

	@Transactional
	public Order findOrderByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDescriptionContaining(String description) throws DataAccessException {

		return findOrderByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByContractVersionContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByContractVersionContaining(String contractVersion) throws DataAccessException {

		return findOrderByContractVersionContaining(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByContractVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByContractVersionContaining", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByType
	 *
	 */
	@Transactional
	public Set<Order> findOrderByType(String type) throws DataAccessException {

		return findOrderByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByType", startResult, maxRows, type);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDescription
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDescription(String description) throws DataAccessException {

		return findOrderByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderBySubmitterIdContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderBySubmitterIdContaining(String submitterId) throws DataAccessException {

		return findOrderBySubmitterIdContaining(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderBySubmitterIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderBySubmitterIdContaining", startResult, maxRows, submitterId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderBySubmitTime
	 *
	 */
	@Transactional
	public Set<Order> findOrderBySubmitTime(String submitTime) throws DataAccessException {

		return findOrderBySubmitTime(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderBySubmitTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderBySubmitTime(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderBySubmitTime", startResult, maxRows, submitTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByContractVersion
	 *
	 */
	@Transactional
	public Set<Order> findOrderByContractVersion(String contractVersion) throws DataAccessException {

		return findOrderByContractVersion(contractVersion, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByContractVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByContractVersion(String contractVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByContractVersion", startResult, maxRows, contractVersion);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDelivertyEndTimeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDelivertyEndTimeContaining(String delivertyEndTime) throws DataAccessException {

		return findOrderByDelivertyEndTimeContaining(delivertyEndTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDelivertyEndTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDelivertyEndTimeContaining(String delivertyEndTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDelivertyEndTimeContaining", startResult, maxRows, delivertyEndTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderFormIdContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOrderFormIdContaining(String orderFormId) throws DataAccessException {

		return findOrderByOrderFormIdContaining(orderFormId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderFormIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderFormIdContaining(String orderFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderFormIdContaining", startResult, maxRows, orderFormId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	@Transactional
	public Order findOrderById(String id) throws DataAccessException {

		return findOrderById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */

	@Transactional
	public Order findOrderById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderById", startResult, maxRows, id);
			return (com.hejiascm.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByOrgid
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOrgid(String orgid) throws DataAccessException {

		return findOrderByOrgid(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrgid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrgid", startResult, maxRows, orgid);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByNotes
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNotes(String notes) throws DataAccessException {

		return findOrderByNotes(notes, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNotes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNotes(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNotes", startResult, maxRows, notes);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDelivertyEndTime
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDelivertyEndTime(String delivertyEndTime) throws DataAccessException {

		return findOrderByDelivertyEndTime(delivertyEndTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDelivertyEndTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDelivertyEndTime(String delivertyEndTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDelivertyEndTime", startResult, maxRows, delivertyEndTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDeliveryTypeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDeliveryTypeContaining(String deliveryType) throws DataAccessException {

		return findOrderByDeliveryTypeContaining(deliveryType, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDeliveryTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDeliveryTypeContaining(String deliveryType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDeliveryTypeContaining", startResult, maxRows, deliveryType);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	@Transactional
	public Set<Order> findAllOrders() throws DataAccessException {

		return findAllOrders(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrders", startResult, maxRows);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderBySubmitterId
	 *
	 */
	@Transactional
	public Set<Order> findOrderBySubmitterId(String submitterId) throws DataAccessException {

		return findOrderBySubmitterId(submitterId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderBySubmitterId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderBySubmitterId(String submitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderBySubmitterId", startResult, maxRows, submitterId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNameContaining(String name) throws DataAccessException {

		return findOrderByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	@Transactional
	public Set<Order> findOrderByName(String name) throws DataAccessException {

		return findOrderByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByName", startResult, maxRows, name);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderBySubmitTimeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderBySubmitTimeContaining(String submitTime) throws DataAccessException {

		return findOrderBySubmitTimeContaining(submitTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderBySubmitTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderBySubmitTimeContaining(String submitTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderBySubmitTimeContaining", startResult, maxRows, submitTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByTypeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByTypeContaining(String type) throws DataAccessException {

		return findOrderByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDeliveryStartTime
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDeliveryStartTime(String deliveryStartTime) throws DataAccessException {

		return findOrderByDeliveryStartTime(deliveryStartTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDeliveryStartTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDeliveryStartTime(String deliveryStartTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDeliveryStartTime", startResult, maxRows, deliveryStartTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByLastUpdateTime
	 *
	 */
	@Transactional
	public Set<Order> findOrderByLastUpdateTime(String lastUpdateTime) throws DataAccessException {

		return findOrderByLastUpdateTime(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByLastUpdateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByLastUpdateTime", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderFormId
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOrderFormId(String orderFormId) throws DataAccessException {

		return findOrderByOrderFormId(orderFormId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderFormId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderFormId(String orderFormId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderFormId", startResult, maxRows, orderFormId);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDeliveryType
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDeliveryType(String deliveryType) throws DataAccessException {

		return findOrderByDeliveryType(deliveryType, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDeliveryType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDeliveryType(String deliveryType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDeliveryType", startResult, maxRows, deliveryType);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByIdContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByIdContaining(String id) throws DataAccessException {

		return findOrderByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDeliveryStartTimeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDeliveryStartTimeContaining(String deliveryStartTime) throws DataAccessException {

		return findOrderByDeliveryStartTimeContaining(deliveryStartTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDeliveryStartTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDeliveryStartTimeContaining(String deliveryStartTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDeliveryStartTimeContaining", startResult, maxRows, deliveryStartTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrgidContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOrgidContaining(String orgid) throws DataAccessException {

		return findOrderByOrgidContaining(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrgidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrgidContaining(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrgidContaining", startResult, maxRows, orgid);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByLastUpdateTimeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByLastUpdateTimeContaining(String lastUpdateTime) throws DataAccessException {

		return findOrderByLastUpdateTimeContaining(lastUpdateTime, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByLastUpdateTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByLastUpdateTimeContaining(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByLastUpdateTimeContaining", startResult, maxRows, lastUpdateTime);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddress(String address) throws DataAccessException {

		return findOrderByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Order entity) {
		return true;
	}
}
