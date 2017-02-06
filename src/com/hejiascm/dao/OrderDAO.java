package com.hejiascm.dao;

import com.hejiascm.domain.Order;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Order entities.
 * 
 */
public interface OrderDAO extends JpaDao<Order> {

	/**
	 * JPQL Query - findOrderByStatus
	 *
	 */
	public Set<Order> findOrderByStatus(Integer status) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByStatus
	 *
	 */
	public Set<Order> findOrderByStatus(Integer status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractIdContaining
	 *
	 */
	public Set<Order> findOrderByContractIdContaining(String contractId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractIdContaining
	 *
	 */
	public Set<Order> findOrderByContractIdContaining(String contractId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNotesContaining
	 *
	 */
	public Set<Order> findOrderByNotesContaining(String notes) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNotesContaining
	 *
	 */
	public Set<Order> findOrderByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractId
	 *
	 */
	public Set<Order> findOrderByContractId(String contractId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractId
	 *
	 */
	public Set<Order> findOrderByContractId(String contractId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDescriptionContaining
	 *
	 */
	public Set<Order> findOrderByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDescriptionContaining
	 *
	 */
	public Set<Order> findOrderByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractVersionContaining
	 *
	 */
	public Set<Order> findOrderByContractVersionContaining(String contractVersion) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractVersionContaining
	 *
	 */
	public Set<Order> findOrderByContractVersionContaining(String contractVersion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByType
	 *
	 */
	public Set<Order> findOrderByType(String type) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByType
	 *
	 */
	public Set<Order> findOrderByType(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDescription
	 *
	 */
	public Set<Order> findOrderByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDescription
	 *
	 */
	public Set<Order> findOrderByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitterIdContaining
	 *
	 */
	public Set<Order> findOrderBySubmitterIdContaining(String submitterId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitterIdContaining
	 *
	 */
	public Set<Order> findOrderBySubmitterIdContaining(String submitterId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitTime
	 *
	 */
	public Set<Order> findOrderBySubmitTime(String submitTime) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitTime
	 *
	 */
	public Set<Order> findOrderBySubmitTime(String submitTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractVersion
	 *
	 */
	public Set<Order> findOrderByContractVersion(String contractVersion_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByContractVersion
	 *
	 */
	public Set<Order> findOrderByContractVersion(String contractVersion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDelivertyEndTimeContaining
	 *
	 */
	public Set<Order> findOrderByDelivertyEndTimeContaining(String delivertyEndTime) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDelivertyEndTimeContaining
	 *
	 */
	public Set<Order> findOrderByDelivertyEndTimeContaining(String delivertyEndTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderFormIdContaining
	 *
	 */
	public Set<Order> findOrderByOrderFormIdContaining(String orderFormId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderFormIdContaining
	 *
	 */
	public Set<Order> findOrderByOrderFormIdContaining(String orderFormId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrgid
	 *
	 */
	public Set<Order> findOrderByOrgid(String orgid) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrgid
	 *
	 */
	public Set<Order> findOrderByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNotes
	 *
	 */
	public Set<Order> findOrderByNotes(String notes_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNotes
	 *
	 */
	public Set<Order> findOrderByNotes(String notes_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDelivertyEndTime
	 *
	 */
	public Set<Order> findOrderByDelivertyEndTime(String delivertyEndTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDelivertyEndTime
	 *
	 */
	public Set<Order> findOrderByDelivertyEndTime(String delivertyEndTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryTypeContaining
	 *
	 */
	public Set<Order> findOrderByDeliveryTypeContaining(String deliveryType) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryTypeContaining
	 *
	 */
	public Set<Order> findOrderByDeliveryTypeContaining(String deliveryType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitterId
	 *
	 */
	public Set<Order> findOrderBySubmitterId(String submitterId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitterId
	 *
	 */
	public Set<Order> findOrderBySubmitterId(String submitterId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	public Set<Order> findOrderByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	public Set<Order> findOrderByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	public Set<Order> findOrderByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	public Set<Order> findOrderByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitTimeContaining
	 *
	 */
	public Set<Order> findOrderBySubmitTimeContaining(String submitTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySubmitTimeContaining
	 *
	 */
	public Set<Order> findOrderBySubmitTimeContaining(String submitTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTypeContaining
	 *
	 */
	public Set<Order> findOrderByTypeContaining(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTypeContaining
	 *
	 */
	public Set<Order> findOrderByTypeContaining(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryStartTime
	 *
	 */
	public Set<Order> findOrderByDeliveryStartTime(String deliveryStartTime) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryStartTime
	 *
	 */
	public Set<Order> findOrderByDeliveryStartTime(String deliveryStartTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByLastUpdateTime
	 *
	 */
	public Set<Order> findOrderByLastUpdateTime(String lastUpdateTime) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByLastUpdateTime
	 *
	 */
	public Set<Order> findOrderByLastUpdateTime(String lastUpdateTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderFormId
	 *
	 */
	public Set<Order> findOrderByOrderFormId(String orderFormId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderFormId
	 *
	 */
	public Set<Order> findOrderByOrderFormId(String orderFormId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryType
	 *
	 */
	public Set<Order> findOrderByDeliveryType(String deliveryType_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryType
	 *
	 */
	public Set<Order> findOrderByDeliveryType(String deliveryType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByIdContaining
	 *
	 */
	public Set<Order> findOrderByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByIdContaining
	 *
	 */
	public Set<Order> findOrderByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryStartTimeContaining
	 *
	 */
	public Set<Order> findOrderByDeliveryStartTimeContaining(String deliveryStartTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDeliveryStartTimeContaining
	 *
	 */
	public Set<Order> findOrderByDeliveryStartTimeContaining(String deliveryStartTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrgidContaining
	 *
	 */
	public Set<Order> findOrderByOrgidContaining(String orgid_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrgidContaining
	 *
	 */
	public Set<Order> findOrderByOrgidContaining(String orgid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByLastUpdateTimeContaining
	 *
	 */
	public Set<Order> findOrderByLastUpdateTimeContaining(String lastUpdateTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByLastUpdateTimeContaining
	 *
	 */
	public Set<Order> findOrderByLastUpdateTimeContaining(String lastUpdateTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

}