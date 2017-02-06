package com.hejiascm.dao;

import com.hejiascm.domain.Deliveryattachment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Deliveryattachment entities.
 * 
 */
public interface DeliveryattachmentDAO extends JpaDao<Deliveryattachment> {

	/**
	 * JPQL Query - findDeliveryattachmentByAddress
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByAddress
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentById
	 *
	 */
	public Deliveryattachment findDeliveryattachmentById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentById
	 *
	 */
	public Deliveryattachment findDeliveryattachmentById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByDescription
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByDescription
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliveryattachments
	 *
	 */
	public Set<Deliveryattachment> findAllDeliveryattachments() throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliveryattachments
	 *
	 */
	public Set<Deliveryattachment> findAllDeliveryattachments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByPrimaryKey
	 *
	 */
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByPrimaryKey
	 *
	 */
	public Deliveryattachment findDeliveryattachmentByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByDescriptionContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByDescriptionContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByIdContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByIdContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByAddressContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliveryattachmentByAddressContaining
	 *
	 */
	public Set<Deliveryattachment> findDeliveryattachmentByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

}