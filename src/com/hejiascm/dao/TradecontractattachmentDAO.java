package com.hejiascm.dao;

import com.hejiascm.domain.Tradecontractattachment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Tradecontractattachment entities.
 * 
 */
public interface TradecontractattachmentDAO extends
		JpaDao<Tradecontractattachment> {

	/**
	 * JPQL Query - findTradecontractattachmentByDescriptionContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByDescriptionContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTradecontractattachments
	 *
	 */
	public Set<Tradecontractattachment> findAllTradecontractattachments() throws DataAccessException;

	/**
	 * JPQL Query - findAllTradecontractattachments
	 *
	 */
	public Set<Tradecontractattachment> findAllTradecontractattachments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByDescription
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByDescription
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByPrimaryKey
	 *
	 */
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByPrimaryKey
	 *
	 */
	public Tradecontractattachment findTradecontractattachmentByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByContentContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByContentContaining(String content) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByContentContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByContentContaining(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentById
	 *
	 */
	public Tradecontractattachment findTradecontractattachmentById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentById
	 *
	 */
	public Tradecontractattachment findTradecontractattachmentById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByIdContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByIdContaining
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByContent
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByContent(String content_1) throws DataAccessException;

	/**
	 * JPQL Query - findTradecontractattachmentByContent
	 *
	 */
	public Set<Tradecontractattachment> findTradecontractattachmentByContent(String content_1, int startResult, int maxRows) throws DataAccessException;

}