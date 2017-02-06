package com.hejiascm.dao;

import com.hejiascm.domain.Receivingattachment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Receivingattachment entities.
 * 
 */
public interface ReceivingattachmentDAO extends JpaDao<Receivingattachment> {

	/**
	 * JPQL Query - findAllReceivingattachments
	 *
	 */
	public Set<Receivingattachment> findAllReceivingattachments() throws DataAccessException;

	/**
	 * JPQL Query - findAllReceivingattachments
	 *
	 */
	public Set<Receivingattachment> findAllReceivingattachments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByDescription
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByDescription
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByAddress
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByAddress
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByDescriptionContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByDescriptionContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByIdContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByIdContaining(String id) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByIdContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByIdContaining(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByPrimaryKey
	 *
	 */
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByPrimaryKey
	 *
	 */
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentById
	 *
	 */
	public Receivingattachment findReceivingattachmentById(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentById
	 *
	 */
	public Receivingattachment findReceivingattachmentById(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByAddressContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivingattachmentByAddressContaining
	 *
	 */
	public Set<Receivingattachment> findReceivingattachmentByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

}