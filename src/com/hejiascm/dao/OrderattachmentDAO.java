package com.hejiascm.dao;

import com.hejiascm.domain.Orderattachment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Orderattachment entities.
 * 
 */
public interface OrderattachmentDAO extends JpaDao<Orderattachment> {

	/**
	 * JPQL Query - findOrderattachmentByAddressContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByAddressContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByPrimaryKey
	 *
	 */
	public Orderattachment findOrderattachmentByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByPrimaryKey
	 *
	 */
	public Orderattachment findOrderattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentById
	 *
	 */
	public Orderattachment findOrderattachmentById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentById
	 *
	 */
	public Orderattachment findOrderattachmentById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByIdContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByIdContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderattachments
	 *
	 */
	public Set<Orderattachment> findAllOrderattachments() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderattachments
	 *
	 */
	public Set<Orderattachment> findAllOrderattachments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByDescriptionContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByDescriptionContaining
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByDescription
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByDescription
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByAddress
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderattachmentByAddress
	 *
	 */
	public Set<Orderattachment> findOrderattachmentByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

}