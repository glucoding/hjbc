package com.hejiascm.dao;

import com.hejiascm.domain.Bankaccountentry;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Bankaccountentry entities.
 * 
 */
public interface BankaccountentryDAO extends JpaDao<Bankaccountentry> {

	/**
	 * JPQL Query - findBankaccountentryByPrimaryKey
	 *
	 */
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByPrimaryKey
	 *
	 */
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryById
	 *
	 */
	public Bankaccountentry findBankaccountentryById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryById
	 *
	 */
	public Bankaccountentry findBankaccountentryById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfoContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfoContaining(String bankAccountInfo) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfoContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfoContaining(String bankAccountInfo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByTypeContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByTypeContaining(String type) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByTypeContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByFiendlyName
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByFiendlyName(String fiendlyName) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByFiendlyName
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByFiendlyName(String fiendlyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfo
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfo(String bankAccountInfo_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfo
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfo(String bankAccountInfo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBankaccountentrys
	 *
	 */
	public Set<Bankaccountentry> findAllBankaccountentrys() throws DataAccessException;

	/**
	 * JPQL Query - findAllBankaccountentrys
	 *
	 */
	public Set<Bankaccountentry> findAllBankaccountentrys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByFiendlyNameContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByFiendlyNameContaining(String fiendlyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByFiendlyNameContaining
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByFiendlyNameContaining(String fiendlyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByType
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByType(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankaccountentryByType
	 *
	 */
	public Set<Bankaccountentry> findBankaccountentryByType(String type_1, int startResult, int maxRows) throws DataAccessException;

}