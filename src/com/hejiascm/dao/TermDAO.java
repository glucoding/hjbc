package com.hejiascm.dao;

import com.hejiascm.domain.Term;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Term entities.
 * 
 */
public interface TermDAO extends JpaDao<Term> {

	/**
	 * JPQL Query - findTermByTypeContaining
	 *
	 */
	public Set<Term> findTermByTypeContaining(String type) throws DataAccessException;

	/**
	 * JPQL Query - findTermByTypeContaining
	 *
	 */
	public Set<Term> findTermByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByDescriptionContaining
	 *
	 */
	public Set<Term> findTermByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTermByDescriptionContaining
	 *
	 */
	public Set<Term> findTermByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTerms
	 *
	 */
	public Set<Term> findAllTerms() throws DataAccessException;

	/**
	 * JPQL Query - findAllTerms
	 *
	 */
	public Set<Term> findAllTerms(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByPrimaryKey
	 *
	 */
	public Term findTermByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findTermByPrimaryKey
	 *
	 */
	public Term findTermByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByName
	 *
	 */
	public Set<Term> findTermByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTermByName
	 *
	 */
	public Set<Term> findTermByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByType
	 *
	 */
	public Set<Term> findTermByType(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findTermByType
	 *
	 */
	public Set<Term> findTermByType(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermById
	 *
	 */
	public Term findTermById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTermById
	 *
	 */
	public Term findTermById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByContent
	 *
	 */
	public Set<Term> findTermByContent(String content) throws DataAccessException;

	/**
	 * JPQL Query - findTermByContent
	 *
	 */
	public Set<Term> findTermByContent(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByIdContaining
	 *
	 */
	public Set<Term> findTermByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findTermByIdContaining
	 *
	 */
	public Set<Term> findTermByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByNameContaining
	 *
	 */
	public Set<Term> findTermByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTermByNameContaining
	 *
	 */
	public Set<Term> findTermByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByDescription
	 *
	 */
	public Set<Term> findTermByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTermByDescription
	 *
	 */
	public Set<Term> findTermByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTermByContentContaining
	 *
	 */
	public Set<Term> findTermByContentContaining(String content_1) throws DataAccessException;

	/**
	 * JPQL Query - findTermByContentContaining
	 *
	 */
	public Set<Term> findTermByContentContaining(String content_1, int startResult, int maxRows) throws DataAccessException;

}