package com.hejiascm.dao;

import com.hejiascm.domain.Bankaccountinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Bankaccountinfo entities.
 * 
 */
public interface BankaccountinfoDAO extends JpaDao<Bankaccountinfo> {

	/**
	 * JPQL Query - findBankaccountinfoByBankAccount
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccount(String bankAccount) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankAccount
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccount(String bankAccount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBankaccountinfos
	 *
	 */
	public Set<Bankaccountinfo> findAllBankaccountinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllBankaccountinfos
	 *
	 */
	public Set<Bankaccountinfo> findAllBankaccountinfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankNameContaining(String bankName) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankNameContaining(String bankName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByPrimaryKey
	 *
	 */
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByPrimaryKey
	 *
	 */
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankId
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankId(String bankId) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankId
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankId(String bankId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByType
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByType(String type) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByType
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByType(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankAccountContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccountContaining(String bankAccount_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankAccountContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccountContaining(String bankAccount_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByTypeContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByTypeContaining(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByTypeContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByTypeContaining(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankIdContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankIdContaining(String bankId_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankIdContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankIdContaining(String bankId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyNameContaining(String friendlyName) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyNameContaining(String friendlyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoById
	 *
	 */
	public Bankaccountinfo findBankaccountinfoById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoById
	 *
	 */
	public Bankaccountinfo findBankaccountinfoById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyName(String friendlyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyName(String friendlyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankName(String bankName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByBankName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByBankName(String bankName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullName(String orgFullName) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullName
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullName(String orgFullName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByIdContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByIdContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullNameContaining(String orgFullName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullNameContaining
	 *
	 */
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullNameContaining(String orgFullName_1, int startResult, int maxRows) throws DataAccessException;

}