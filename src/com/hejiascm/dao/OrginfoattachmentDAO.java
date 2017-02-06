package com.hejiascm.dao;

import com.hejiascm.domain.Orginfoattachment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Orginfoattachment entities.
 * 
 */
public interface OrginfoattachmentDAO extends JpaDao<Orginfoattachment> {

	/**
	 * JPQL Query - findOrginfoattachmentByAddress
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByAddress
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentById
	 *
	 */
	public Orginfoattachment findOrginfoattachmentById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentById
	 *
	 */
	public Orginfoattachment findOrginfoattachmentById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByAddressContaining
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByAddressContaining
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByPrimaryKey
	 *
	 */
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByPrimaryKey
	 *
	 */
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrginfoattachments
	 *
	 */
	public Set<Orginfoattachment> findAllOrginfoattachments() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrginfoattachments
	 *
	 */
	public Set<Orginfoattachment> findAllOrginfoattachments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByIdContaining
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoattachmentByIdContaining
	 *
	 */
	public Set<Orginfoattachment> findOrginfoattachmentByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

}