package com.hejiascm.service;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Bankaccountinfo entities
 * 
 */
public interface BankaccountinfoService {

	/**
	 * Return all Bankaccountinfo entity
	 * 
	 */
	public List<Bankaccountinfo> findAllBankaccountinfos(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	public Bankaccountinfo saveBankaccountinfoOrginfo(String id, Orginfo related_orginfo);

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	public Bankaccountinfo deleteBankaccountinfoOrginfo(String bankaccountinfo_id, String related_orginfo_id);

	/**
	 * Load an existing Bankaccountinfo entity
	 * 
	 */
	public Set<Bankaccountinfo> loadBankaccountinfos();

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	public void deleteBankaccountinfo(Bankaccountinfo bankaccountinfo);

	/**
	 * Return a count of all Bankaccountinfo entity
	 * 
	 */
	public Integer countBankaccountinfos();

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	public void saveBankaccountinfo(Bankaccountinfo bankaccountinfo_1);

	/**
	 */
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id_1);
}