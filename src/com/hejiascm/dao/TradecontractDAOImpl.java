package com.hejiascm.dao;

import com.hejiascm.domain.Tradecontract;

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
 * DAO to manage Tradecontract entities.
 * 
 */
@Repository("TradecontractDAO")
@Transactional
public class TradecontractDAOImpl extends AbstractJpaDao<Tradecontract>
		implements TradecontractDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Tradecontract.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TradecontractDAOImpl
	 *
	 */
	public TradecontractDAOImpl() {
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
	 * JPQL Query - findTradecontractByOrderSubmitterIdContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByOrderSubmitterIdContaining(String orderSubmitterId) throws DataAccessException {

		return findTradecontractByOrderSubmitterIdContaining(orderSubmitterId, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByOrderSubmitterIdContaining(String orderSubmitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByOrderSubmitterIdContaining", startResult, maxRows, orderSubmitterId);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractBySerial
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractBySerial(String serial) throws DataAccessException {

		return findTradecontractBySerial(serial, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractBySerial
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractBySerial(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractBySerial", startResult, maxRows, serial);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByCurrency
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrency(String currency) throws DataAccessException {

		return findTradecontractByCurrency(currency, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrency(String currency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByCurrency", startResult, maxRows, currency);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByPrimaryKey
	 *
	 */
	@Transactional
	public Tradecontract findTradecontractByPrimaryKey(String id) throws DataAccessException {

		return findTradecontractByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByPrimaryKey
	 *
	 */

	@Transactional
	public Tradecontract findTradecontractByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTradecontractByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Tradecontract) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTradecontractByOrgid
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByOrgid(String orgid) throws DataAccessException {

		return findTradecontractByOrgid(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByOrgid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByOrgid", startResult, maxRows, orgid);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByExpirationTime
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByExpirationTime(String expirationTime) throws DataAccessException {

		return findTradecontractByExpirationTime(expirationTime, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByExpirationTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByExpirationTime(String expirationTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByExpirationTime", startResult, maxRows, expirationTime);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTradecontracts
	 *
	 */
	@Transactional
	public Set<Tradecontract> findAllTradecontracts() throws DataAccessException {

		return findAllTradecontracts(-1, -1);
	}

	/**
	 * JPQL Query - findAllTradecontracts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findAllTradecontracts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTradecontracts", startResult, maxRows);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByDescriptionContaining(String description) throws DataAccessException {

		return findTradecontractByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportationContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByMeansOfTransportationContaining(String meansOfTransportation) throws DataAccessException {

		return findTradecontractByMeansOfTransportationContaining(meansOfTransportation, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByMeansOfTransportationContaining(String meansOfTransportation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByMeansOfTransportationContaining", startResult, maxRows, meansOfTransportation);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractById
	 *
	 */
	@Transactional
	public Tradecontract findTradecontractById(String id) throws DataAccessException {

		return findTradecontractById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractById
	 *
	 */

	@Transactional
	public Tradecontract findTradecontractById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTradecontractById", startResult, maxRows, id);
			return (com.hejiascm.domain.Tradecontract) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTradecontractByServiceType
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByServiceType(Integer serviceType) throws DataAccessException {

		return findTradecontractByServiceType(serviceType, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByServiceType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByServiceType(Integer serviceType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByServiceType", startResult, maxRows, serviceType);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByEffectiveTimeContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByEffectiveTimeContaining(String effectiveTime) throws DataAccessException {

		return findTradecontractByEffectiveTimeContaining(effectiveTime, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByEffectiveTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByEffectiveTimeContaining(String effectiveTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByEffectiveTimeContaining", startResult, maxRows, effectiveTime);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersion
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersion(String currentEffectiveVersion) throws DataAccessException {

		return findTradecontractByCurrentEffectiveVersion(currentEffectiveVersion, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersion(String currentEffectiveVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByCurrentEffectiveVersion", startResult, maxRows, currentEffectiveVersion);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByRemarks
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByRemarks(String remarks) throws DataAccessException {

		return findTradecontractByRemarks(remarks, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByRemarks
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByRemarks(String remarks, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByRemarks", startResult, maxRows, remarks);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByPreviousVersion
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByPreviousVersion(String previousVersion) throws DataAccessException {

		return findTradecontractByPreviousVersion(previousVersion, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByPreviousVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByPreviousVersion(String previousVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByPreviousVersion", startResult, maxRows, previousVersion);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportation
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByMeansOfTransportation(String meansOfTransportation) throws DataAccessException {

		return findTradecontractByMeansOfTransportation(meansOfTransportation, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByMeansOfTransportation(String meansOfTransportation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByMeansOfTransportation", startResult, maxRows, meansOfTransportation);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterId
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByOrderSubmitterId(String orderSubmitterId) throws DataAccessException {

		return findTradecontractByOrderSubmitterId(orderSubmitterId, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByOrderSubmitterId(String orderSubmitterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByOrderSubmitterId", startResult, maxRows, orderSubmitterId);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByExpirationTimeContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByExpirationTimeContaining(String expirationTime) throws DataAccessException {

		return findTradecontractByExpirationTimeContaining(expirationTime, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByExpirationTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByExpirationTimeContaining(String expirationTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByExpirationTimeContaining", startResult, maxRows, expirationTime);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByPreviousVersionContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByPreviousVersionContaining(String previousVersion) throws DataAccessException {

		return findTradecontractByPreviousVersionContaining(previousVersion, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByPreviousVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByPreviousVersionContaining(String previousVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByPreviousVersionContaining", startResult, maxRows, previousVersion);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipantContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipantContaining(String dataEffectivePaticipant) throws DataAccessException {

		return findTradecontractByDataEffectivePaticipantContaining(dataEffectivePaticipant, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipantContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipantContaining(String dataEffectivePaticipant, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByDataEffectivePaticipantContaining", startResult, maxRows, dataEffectivePaticipant);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByContractType
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByContractType(Integer contractType) throws DataAccessException {

		return findTradecontractByContractType(contractType, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByContractType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByContractType(Integer contractType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByContractType", startResult, maxRows, contractType);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByChangeStatus
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByChangeStatus(Integer changeStatus) throws DataAccessException {

		return findTradecontractByChangeStatus(changeStatus, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByChangeStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByChangeStatus(Integer changeStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByChangeStatus", startResult, maxRows, changeStatus);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractBySerialContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractBySerialContaining(String serial) throws DataAccessException {

		return findTradecontractBySerialContaining(serial, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractBySerialContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractBySerialContaining", startResult, maxRows, serial);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByVersionContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByVersionContaining(String version) throws DataAccessException {

		return findTradecontractByVersionContaining(version, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByVersionContaining(String version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByVersionContaining", startResult, maxRows, version);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByExecutionStatus
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByExecutionStatus(Integer executionStatus) throws DataAccessException {

		return findTradecontractByExecutionStatus(executionStatus, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByExecutionStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByExecutionStatus(Integer executionStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByExecutionStatus", startResult, maxRows, executionStatus);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByEffectiveTime
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByEffectiveTime(String effectiveTime) throws DataAccessException {

		return findTradecontractByEffectiveTime(effectiveTime, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByEffectiveTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByEffectiveTime(String effectiveTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByEffectiveTime", startResult, maxRows, effectiveTime);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByIdContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByIdContaining(String id) throws DataAccessException {

		return findTradecontractByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByOrgidContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByOrgidContaining(String orgid) throws DataAccessException {

		return findTradecontractByOrgidContaining(orgid, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByOrgidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByOrgidContaining(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByOrgidContaining", startResult, maxRows, orgid);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByDescription
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByDescription(String description) throws DataAccessException {

		return findTradecontractByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByRemarksContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByRemarksContaining(String remarks) throws DataAccessException {

		return findTradecontractByRemarksContaining(remarks, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByRemarksContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByRemarksContaining(String remarks, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByRemarksContaining", startResult, maxRows, remarks);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByVersion
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByVersion(String version) throws DataAccessException {

		return findTradecontractByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByVersion(String version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipant
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipant(String dataEffectivePaticipant) throws DataAccessException {

		return findTradecontractByDataEffectivePaticipant(dataEffectivePaticipant, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipant
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipant(String dataEffectivePaticipant, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByDataEffectivePaticipant", startResult, maxRows, dataEffectivePaticipant);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersionContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersionContaining(String currentEffectiveVersion) throws DataAccessException {

		return findTradecontractByCurrentEffectiveVersionContaining(currentEffectiveVersion, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersionContaining(String currentEffectiveVersion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByCurrentEffectiveVersionContaining", startResult, maxRows, currentEffectiveVersion);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * JPQL Query - findTradecontractByCurrencyContaining
	 *
	 */
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrencyContaining(String currency) throws DataAccessException {

		return findTradecontractByCurrencyContaining(currency, -1, -1);
	}

	/**
	 * JPQL Query - findTradecontractByCurrencyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Tradecontract> findTradecontractByCurrencyContaining(String currency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTradecontractByCurrencyContaining", startResult, maxRows, currency);
		return new LinkedHashSet<Tradecontract>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Tradecontract entity) {
		return true;
	}
}
