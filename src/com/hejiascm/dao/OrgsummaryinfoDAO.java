package com.hejiascm.dao;

import com.hejiascm.domain.Orgsummaryinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Orgsummaryinfo entities.
 * 
 */
public interface OrgsummaryinfoDAO extends JpaDao<Orgsummaryinfo> {

	/**
	 * JPQL Query - findOrgsummaryinfoById
	 *
	 */
	public Orgsummaryinfo findOrgsummaryinfoById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoById
	 *
	 */
	public Orgsummaryinfo findOrgsummaryinfoById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByNameContaining
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByNameContaining
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByPrimaryKey
	 *
	 */
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByPrimaryKey
	 *
	 */
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByName
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByName
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByRole
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByRole(Integer role) throws DataAccessException;

	/**
	 * JPQL Query - findOrgsummaryinfoByRole
	 *
	 */
	public Set<Orgsummaryinfo> findOrgsummaryinfoByRole(Integer role, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrgsummaryinfos
	 *
	 */
	public Set<Orgsummaryinfo> findAllOrgsummaryinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrgsummaryinfos
	 *
	 */
	public Set<Orgsummaryinfo> findAllOrgsummaryinfos(int startResult, int maxRows) throws DataAccessException;

}