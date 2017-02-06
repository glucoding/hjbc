package com.hejiascm.service;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Orginfo entities
 * 
 */
public interface OrginfoService {

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	public Orginfo saveOrginfoBankaccountinfos(String id, Bankaccountinfo related_bankaccountinfos);

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	public void saveOrginfo(Orginfo orginfo);

	/**
	 * Return all Orginfo entity
	 * 
	 */
	public List<Orginfo> findAllOrginfos(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	public void deleteOrginfo(Orginfo orginfo_1);

	/**
	 */
	public Orginfo findOrginfoByPrimaryKey(String id_1);

	/**
	 * Load an existing Orginfo entity
	 * 
	 */
	public Set<Orginfo> loadOrginfos();

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	public Orginfo deleteOrginfoBankaccountinfos(String orginfo_id, String related_bankaccountinfos_id);

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	public Orginfo deleteOrginfoOrginfoattachments(String orginfo_id_1, String related_orginfoattachments_id);

	/**
	 * Return a count of all Orginfo entity
	 * 
	 */
	public Integer countOrginfos();

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	public Orginfo saveOrginfoOrginfoattachments(String id_2, Orginfoattachment related_orginfoattachments);
	
	/**
	 * Block Chain Method
	 * @return Orginfo list
	 */
	public List<Orginfo> loadBcOrginfos();
	
	/**
	 * @return void
	 * @param Orginfo
	 */
	public void registerBcOrginfo(Orginfo orginfo);
}