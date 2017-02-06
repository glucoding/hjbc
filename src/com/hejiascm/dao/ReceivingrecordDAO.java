package com.hejiascm.dao;

import com.hejiascm.domain.Receivingrecord;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Receivingrecord entities.
 * 
 */
public interface ReceivingrecordDAO extends JpaDao<Receivingrecord> {

	/**
	 * JPQL Query - findReceivingrecordById
	 *
	 */
	public Receivingrecord findReceivingrecordById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordById
	 *
	 */
	public Receivingrecord findReceivingrecordById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractIdContaining(String contractId) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractIdContaining(String contractId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordIdContaining(String deliveryRecordId) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordIdContaining(String deliveryRecordId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByReceivingFormId(String receivingFormId) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByReceivingFormId(String receivingFormId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDescription
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDescription
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNotesContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNotesContaining(String notes) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNotesContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTime
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTime(String lastUpdateTime) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTime
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByStatus
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByStatus(Integer status) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByStatus
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByStatus(Integer status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDescriptionContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDescriptionContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIds
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIds(String qualityRecordIds) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIds
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIds(String qualityRecordIds, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllReceivingrecords
	 *
	 */
	public Set<Receivingrecord> findAllReceivingrecords() throws DataAccessException;

	/**
	 * JPQL Query - findAllReceivingrecords
	 *
	 */
	public Set<Receivingrecord> findAllReceivingrecords(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractVersionContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractVersionContaining(String contractVersion) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractVersionContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitTimeContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitTimeContaining(String submitTime) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitTimeContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitTimeContaining(String submitTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByTruckNumContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByTruckNumContaining(String truckNum) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByTruckNumContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByTruckNumContaining(String truckNum, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNameContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNameContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByName
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByName
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTimeContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTimeContaining(String lastUpdateTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByLastUpdateTimeContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByLastUpdateTimeContaining(String lastUpdateTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordId(String deliveryRecordId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDeliveryRecordId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDeliveryRecordId(String deliveryRecordId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByTruckNum
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByTruckNum(String truckNum_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByTruckNum
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByTruckNum(String truckNum_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrgid
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrgid(String orgid) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrgid
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByPrimaryKey
	 *
	 */
	public Receivingrecord findReceivingrecordByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByPrimaryKey
	 *
	 */
	public Receivingrecord findReceivingrecordByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByReceivingFormIdContaining(String receivingFormId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByReceivingFormIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByReceivingFormIdContaining(String receivingFormId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIdsContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIdsContaining(String qualityRecordIds_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByQualityRecordIdsContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByQualityRecordIdsContaining(String qualityRecordIds_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDriver
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDriver(String driver) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDriver
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDriver(String driver, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractId(String contractId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractId(String contractId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrderIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrderIdContaining(String orderId) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrderIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrderIdContaining(String orderId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrgidContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrgidContaining(String orgid_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrgidContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrgidContaining(String orgid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrderId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrderId(String orderId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByOrderId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByOrderId(String orderId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDriverContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDriverContaining(String driver_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByDriverContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByDriverContaining(String driver_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitterIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitterIdContaining(String submitterId) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitterIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByAmount
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByAmount(java.math.BigDecimal amount) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByAmount
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByAmount(BigDecimal amount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByIdContaining
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitterId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitterId(String submitterId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitterId
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitterId(String submitterId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNotes
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNotes(String notes_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByNotes
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByNotes(String notes_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractVersion
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractVersion(String contractVersion_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordByContractVersion
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordByContractVersion(String contractVersion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitTime
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitTime(String submitTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingrecordBySubmitTime
	 *
	 */
	public Set<Receivingrecord> findReceivingrecordBySubmitTime(String submitTime_1, int startResult, int maxRows) throws DataAccessException;

}