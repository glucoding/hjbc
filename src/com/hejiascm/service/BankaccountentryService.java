package com.hejiascm.service;

import com.hejiascm.domain.Bankaccountentry;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Bankaccountentry entities
 * 
 */
public interface BankaccountentryService {

	/**
	 * Return a count of all Bankaccountentry entity
	 * 
	 */
	public Integer countBankaccountentrys();

	/**
	 * Return all Bankaccountentry entity
	 * 
	 */
	public List<Bankaccountentry> findAllBankaccountentrys(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Bankaccountentry entity
	 * 
	 */
	public void saveBankaccountentry(Bankaccountentry bankaccountentry);

	/**
	 */
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id);

	/**
	 * Delete an existing Bankaccountentry entity
	 * 
	 */
	public void deleteBankaccountentry(Bankaccountentry bankaccountentry_1);

	/**
	 * Load an existing Bankaccountentry entity
	 * 
	 */
	public Set<Bankaccountentry> loadBankaccountentrys();
}