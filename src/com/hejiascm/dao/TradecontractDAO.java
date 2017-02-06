package com.hejiascm.dao;

import com.hejiascm.domain.Tradecontract;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Tradecontract entities.
 * 
 */
public interface TradecontractDAO extends JpaDao<Tradecontract> {

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterIdContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrderSubmitterIdContaining(String orderSubmitterId) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterIdContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrderSubmitterIdContaining(String orderSubmitterId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractBySerial
	 *
	 */
	public Set<Tradecontract> findTradecontractBySerial(String serial) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractBySerial
	 *
	 */
	public Set<Tradecontract> findTradecontractBySerial(String serial, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrency
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrency(String currency) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrency
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrency(String currency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPrimaryKey
	 *
	 */
	public Tradecontract findTradecontractByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPrimaryKey
	 *
	 */
	public Tradecontract findTradecontractByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrgid
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrgid(String orgid) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrgid
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExpirationTime
	 *
	 */
	public Set<Tradecontract> findTradecontractByExpirationTime(String expirationTime) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExpirationTime
	 *
	 */
	public Set<Tradecontract> findTradecontractByExpirationTime(String expirationTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTradecontracts
	 *
	 */
	public Set<Tradecontract> findAllTradecontracts() throws DataAccessException;

	/**
	 * JPQL Query - findAllTradecontracts
	 *
	 */
	public Set<Tradecontract> findAllTradecontracts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDescriptionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDescriptionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportationContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByMeansOfTransportationContaining(String meansOfTransportation) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportationContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByMeansOfTransportationContaining(String meansOfTransportation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractById
	 *
	 */
	public Tradecontract findTradecontractById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractById
	 *
	 */
	public Tradecontract findTradecontractById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByServiceType
	 *
	 */
	public Set<Tradecontract> findTradecontractByServiceType(Integer serviceType) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByServiceType
	 *
	 */
	public Set<Tradecontract> findTradecontractByServiceType(Integer serviceType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByEffectiveTimeContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByEffectiveTimeContaining(String effectiveTime) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByEffectiveTimeContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByEffectiveTimeContaining(String effectiveTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersion(String currentEffectiveVersion) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersion(String currentEffectiveVersion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByRemarks
	 *
	 */
	public Set<Tradecontract> findTradecontractByRemarks(String remarks) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByRemarks
	 *
	 */
	public Set<Tradecontract> findTradecontractByRemarks(String remarks, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPreviousVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByPreviousVersion(String previousVersion) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPreviousVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByPreviousVersion(String previousVersion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportation
	 *
	 */
	public Set<Tradecontract> findTradecontractByMeansOfTransportation(String meansOfTransportation_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByMeansOfTransportation
	 *
	 */
	public Set<Tradecontract> findTradecontractByMeansOfTransportation(String meansOfTransportation_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterId
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrderSubmitterId(String orderSubmitterId_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrderSubmitterId
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrderSubmitterId(String orderSubmitterId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExpirationTimeContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByExpirationTimeContaining(String expirationTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExpirationTimeContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByExpirationTimeContaining(String expirationTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPreviousVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByPreviousVersionContaining(String previousVersion_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByPreviousVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByPreviousVersionContaining(String previousVersion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipantContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipantContaining(String dataEffectivePaticipant) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipantContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipantContaining(String dataEffectivePaticipant, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByContractType
	 *
	 */
	public Set<Tradecontract> findTradecontractByContractType(Integer contractType) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByContractType
	 *
	 */
	public Set<Tradecontract> findTradecontractByContractType(Integer contractType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByChangeStatus
	 *
	 */
	public Set<Tradecontract> findTradecontractByChangeStatus(Integer changeStatus) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByChangeStatus
	 *
	 */
	public Set<Tradecontract> findTradecontractByChangeStatus(Integer changeStatus, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractBySerialContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractBySerialContaining(String serial_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractBySerialContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractBySerialContaining(String serial_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByVersionContaining(String version) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByVersionContaining(String version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExecutionStatus
	 *
	 */
	public Set<Tradecontract> findTradecontractByExecutionStatus(Integer executionStatus) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByExecutionStatus
	 *
	 */
	public Set<Tradecontract> findTradecontractByExecutionStatus(Integer executionStatus, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByEffectiveTime
	 *
	 */
	public Set<Tradecontract> findTradecontractByEffectiveTime(String effectiveTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByEffectiveTime
	 *
	 */
	public Set<Tradecontract> findTradecontractByEffectiveTime(String effectiveTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByIdContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByIdContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrgidContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrgidContaining(String orgid_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByOrgidContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByOrgidContaining(String orgid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDescription
	 *
	 */
	public Set<Tradecontract> findTradecontractByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDescription
	 *
	 */
	public Set<Tradecontract> findTradecontractByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByRemarksContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByRemarksContaining(String remarks_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByRemarksContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByRemarksContaining(String remarks_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByVersion(String version_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByVersion
	 *
	 */
	public Set<Tradecontract> findTradecontractByVersion(String version_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipant
	 *
	 */
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipant(String dataEffectivePaticipant_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByDataEffectivePaticipant
	 *
	 */
	public Set<Tradecontract> findTradecontractByDataEffectivePaticipant(String dataEffectivePaticipant_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersionContaining(String currentEffectiveVersion_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrentEffectiveVersionContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrentEffectiveVersionContaining(String currentEffectiveVersion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrencyContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrencyContaining(String currency_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractByCurrencyContaining
	 *
	 */
	public Set<Tradecontract> findTradecontractByCurrencyContaining(String currency_1, int startResult, int maxRows) throws DataAccessException;

}