package com.hejiascm.dao;

import com.hejiascm.domain.Deliveryrecord;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Deliveryrecord entities.
 * 
 */
public interface DeliveryrecordDAO extends JpaDao<Deliveryrecord> {

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddressContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddressContaining(String consigneeAddress) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddressContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddressContaining(String consigneeAddress, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrgId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrgId(String orgId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrgId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrgId(String orgId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDescriptionContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDescriptionContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDriverContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDriverContaining(String driver) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDriverContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDriverContaining(String driver, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTimeContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTimeContaining(String submitTime) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTimeContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTimeContaining(String submitTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByIdContaining(String id) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByIdContaining(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNameContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNameContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByTruckNumContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByTruckNumContaining(String truckNum) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByTruckNumContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByTruckNumContaining(String truckNum, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNotesContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNotesContaining(String notes) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNotesContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTime
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTime(String lastUpdateTime) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTime
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractId(String contractId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractId(String contractId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordById
	 *
	 */
	public Deliveryrecord findDeliveryrecordById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordById
	 *
	 */
	public Deliveryrecord findDeliveryrecordById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDriver
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDriver(String driver_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDriver
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDriver(String driver_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByPrimaryKey
	 *
	 */
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByPrimaryKey
	 *
	 */
	public Deliveryrecord findDeliveryrecordByPrimaryKey(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterIdContaining(String submitterId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormIdContaining(String deliveryFormId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormIdContaining(String deliveryFormId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerIdContaining(String consignerId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerIdContaining(String consignerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerId(String consignerId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerId(String consignerId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddress
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddress(String consignerAddress) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddress
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddress(String consignerAddress, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrderIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrderIdContaining(String orderId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrderIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrderIdContaining(String orderId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeIdContaining(String buyeeId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeIdContaining(String buyeeId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyerId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyerId(String buyerId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyerId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyerId(String buyerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByTruckNum
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByTruckNum(String truckNum_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByTruckNum
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByTruckNum(String truckNum_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeIdContaining(String consigneeId) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeIdContaining(String consigneeId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractIdContaining(String contractId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractIdContaining(String contractId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNotes
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNotes(String notes_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByNotes
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByNotes(String notes_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByStatus
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByStatus(Integer status) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByStatus
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByStatus(Integer status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddressContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddressContaining(String consignerAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsignerAddressContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsignerAddressContaining(String consignerAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeId(String buyeeId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyeeId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyeeId(String buyeeId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormId(String deliveryFormId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDeliveryFormId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDeliveryFormId(String deliveryFormId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTimeContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTimeContaining(String lastUpdateTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByLastUpdateTimeContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByLastUpdateTimeContaining(String lastUpdateTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByName
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByName
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDescription
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByDescription
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrderId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrderId(String orderId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrderId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrderId(String orderId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliveryrecords
	 *
	 */
	public Set<Deliveryrecord> findAllDeliveryrecords() throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliveryrecords
	 *
	 */
	public Set<Deliveryrecord> findAllDeliveryrecords(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByAmount
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByAmount(java.math.BigDecimal amount) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByAmount
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByAmount(BigDecimal amount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTime
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTime(String submitTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitTime
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitTime(String submitTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddress
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddress(String consigneeAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeAddress
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeAddress(String consigneeAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyerIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyerIdContaining(String buyerId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByBuyerIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByBuyerIdContaining(String buyerId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterId(String submitterId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordBySubmitterId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordBySubmitterId(String submitterId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractVersionContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractVersionContaining(String contractVersion) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractVersionContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrgIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrgIdContaining(String orgId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByOrgIdContaining
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByOrgIdContaining(String orgId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractVersion
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractVersion(String contractVersion_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByContractVersion
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByContractVersion(String contractVersion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeId(String consigneeId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryrecordByConsigneeId
	 *
	 */
	public Set<Deliveryrecord> findDeliveryrecordByConsigneeId(String consigneeId_1, int startResult, int maxRows) throws DataAccessException;

}